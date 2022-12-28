package com.cart.demo.Model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ItemTest {

    Item item;



    @BeforeEach
    void setUp(){
        item = new Item(1,"Dove Soap", 39.99, 12.50, 1, 39.99);

    }

    @Test
    public void testItem() {
        assertEquals(1, item.getId());
        assertEquals("Dove Soap", item.getItemName());
        assertEquals(39.99, item.getPrice());
        assertEquals(12.50, item.getSaleTax());
        assertEquals(1, item.getNoofItem());
        assertEquals(39.99, item.getGrossTotal());

    }

    @Test
    void testTostring(){
        assertTrue(item.toString().contains("Item [id="));
    }

}