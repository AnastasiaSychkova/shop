package com.pro.sky.shop.service;

import com.pro.sky.shop.Shop;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service

@SessionScope

public class ShopService {

    private static List<Shop> shop = new ArrayList<>();

    public List<Shop> add(List<Integer> ids) {
        List<Shop> newShop = ids.stream()
                .map(id -> new Shop(id))
                .collect(Collectors.toList());

        shop.addAll(newShop);
        return newShop;
    }

    public List<Shop> get() {
        return shop;
    }
}
