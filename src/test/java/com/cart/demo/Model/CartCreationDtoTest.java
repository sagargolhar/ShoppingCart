package com.cart.demo.Model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CartCreationDtoTest {

    CartCreationDto cartCreationDto;
    List<Item> listItem;
    Item item;

    @BeforeEach
    void setUp(){

        item = new Item(1,"Dove Soap", 39.99, 12.50, 1, 39.99);
        listItem = new ArrayList<>();
        listItem.add(item);

        cartCreationDto = new CartCreationDto(listItem);

    }

    @Test
    void testCartCreationDto(){

        assertEquals(item, cartCreationDto.getItems().get(0));
    }





}