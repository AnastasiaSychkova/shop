package com.pro.sky.shop;

import org.springframework.web.context.annotation.SessionScope;

@SessionScope

public class Shop {
    private int id;
    public Shop(int id){
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}
