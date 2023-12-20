package be.thomasmore.bookserver.model.converters;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import be.thomasmore.bookserver.model.dto.Shop;
import be.thomasmore.bookserver.model.dto.ShopDTO;

@Component
public class ShopDTOConverter {
    
    @Autowired
    private ModelMapper modelMapper;

    /**
     * @param shop the entity from the db
     * @return ShopDTO object to send to the client.
     */
    public ShopDTO convertToDto(Shop shop) {
        return modelMapper.map(shop, ShopDTO.class);

    }
}
