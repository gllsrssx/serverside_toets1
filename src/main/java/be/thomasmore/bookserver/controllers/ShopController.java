package be.thomasmore.bookserver.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import be.thomasmore.bookserver.services.ShopService;
import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/api/shop")
@Slf4j
public class ShopController {

    @Autowired
    private ShopService shopService;

    
    
}
