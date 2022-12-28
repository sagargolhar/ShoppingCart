package com.cart.demo.controller;

import com.cart.demo.Model.CartCreationDto;
import com.cart.demo.SecurityConfig;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.context.annotation.Import;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;


import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@Import(SecurityConfig.class)
@WebMvcTest(ShoppingCartController.class)
class ShoppingCartControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void homePageTest() throws Exception {
        this.mockMvc
                .perform(MockMvcRequestBuilders.get("/"))
                .andExpect(status().isOk())
                .andExpect(view().name("home"))
                .andExpect(model().attributeExists("appName"))
                .andExpect(model().attributeExists("form"))
        .andExpect(model().attributeExists("items"));
    }

//    @Test
//    void addToCartForm() throws Exception {
//        this.mockMvc
//        .perform(MockMvcRequestBuilders.post("/addtocart")
//                .andExpect(status().is3xxRedirection());
//
//
//    }

}