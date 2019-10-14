package com.enigma.controllers;

import com.enigma.entities.Store;
import com.enigma.repositories.StoreRepositories;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class StoreControllerTest {
    @Autowired
    StoreRepositories storeRepositories;

    @Autowired
    MockMvc mockMvc;

    @Test
    public void saveStore_should_Return_OK_Status() throws Exception {
        ObjectMapper mapper= new ObjectMapper();
        Store newStore= new Store("Toko Ngkoh","Jakarta","Jual apa aja","098765433456");
        mockMvc.perform(post("/store")
                .contentType(MediaType.APPLICATION_JSON)
                .content(mapper.writeValueAsString(newStore))).andExpect(status().isOk());

    }
    @Test
    public void SaveStoreShoudlBeExistInDb()throws Exception{
        ObjectMapper mapper= new ObjectMapper();
        Store newStore= new Store("Toko Ngkoh","Jakarta","Jual apa aja","098765433456");
         String response = mockMvc.perform(post("/store")
                 .contentType(MediaType.APPLICATION_JSON)
                 .content(mapper.writeValueAsString(newStore))).andReturn().getResponse().getContentAsString();

         newStore =new ObjectMapper().readValue(response, Store.class);
        Assert.assertEquals(newStore,storeRepositories.findById(newStore.getId()).get());

    }
}