package be.thomasmore.bookserver.services;

import java.util.*;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import be.thomasmore.bookserver.model.Shop;
import be.thomasmore.bookserver.model.converters.ShopDTOConverter;
import be.thomasmore.bookserver.model.converters.ShopDetailedDTOConverter;
import be.thomasmore.bookserver.model.dto.ShopDTO;
import be.thomasmore.bookserver.model.dto.ShopDetailedDTO;
import be.thomasmore.bookserver.repositories.ShopRepository;

@Service
public class ShopService {
    
    @Autowired
    private ShopRepository shopRepository;

    @Autowired
    private ShopDTOConverter shopDTOConverter;

    @Autowired
    private ShopDetailedDTOConverter shopDetailedDTOConverter;

    public List<ShopDTO> findAll(String nameKeyWord) {
        final List<Shop> shops = nameKeyWord == null ?
                shopRepository.findAll() :
                shopRepository.findByNameContainingIgnoreCase(nameKeyWord);

        return shops.stream()
                .map(b -> shopDTOConverter.convertToDto(b))
                .collect(Collectors.toList());
    }

    public ShopDetailedDTO findOne(int id) {
        final Optional<Shop> shop = shopRepository.findById(id);
        if (shop.isEmpty())
            throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR,
                    String.format("Shop with id %d does not exist.", id));

        return shopDetailedDTOConverter.convertToDto(shop.get());
    }

    public Iterable<ShopDTO> search(String name) {
        return shopRepository.findByNameContainingIgnoreCase(name).stream()
                .map(s -> shopDTOConverter.convertToDto(s))
                .collect(Collectors.toList());
    }
}
