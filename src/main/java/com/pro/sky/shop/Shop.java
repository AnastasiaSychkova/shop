package com.pro.sky.shop;

import org.springframework.context.annotation.Scope;
import org.springframework.web.context.WebApplicationContext;
@Scope(WebApplicationContext.SCOPE_SESSION)

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
