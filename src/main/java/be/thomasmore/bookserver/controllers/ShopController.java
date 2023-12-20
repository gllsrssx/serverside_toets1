package be.thomasmore.bookserver.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import be.thomasmore.bookserver.model.dto.SerieDTO;
import be.thomasmore.bookserver.model.dto.SerieDetailedDTO;
import be.thomasmore.bookserver.model.dto.ShopDTO;
import be.thomasmore.bookserver.model.dto.ShopDetailedDTO;
import be.thomasmore.bookserver.services.ShopService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
@RequestMapping("/api/shops")
@Slf4j
public class ShopController {

    @Autowired
    private ShopService shopService;

    @GetMapping("")
    public Iterable<ShopDTO> findAll() {
        log.info("##### findAll shops");
        return shopService.findAll(null);
    }

    @GetMapping("/search")
    public Iterable<ShopDTO> search(@RequestParam String name) {
        log.info(String.format("##### search shops %s", name));
        return shopService.search(name);
    }

    @GetMapping("{id}")
    public ShopDetailedDTO findOne(@PathVariable int id) {
        log.info(String.format("##### findOne shop %d", id));
        return shopService.findOne(id);
    }
}
