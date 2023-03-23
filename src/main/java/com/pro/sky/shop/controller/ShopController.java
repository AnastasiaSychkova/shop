package com.pro.sky.shop.controller;

import com.pro.sky.shop.Shop;
import com.pro.sky.shop.service.ShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.annotation.SessionScope;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/order")
@SessionScope

public class ShopController {
    private ShopService shopService;

    @Autowired
    public ShopController(ShopService shopService) {
        this.shopService = shopService;
    }

    @RequestMapping(path = "/add")
    public List<Shop> add(@RequestParam List<Integer> id) {
        return shopService.add(id);
    }

    @RequestMapping(path = "/get")
    public List<Shop> get() {
        return shopService.get();
    }
}
