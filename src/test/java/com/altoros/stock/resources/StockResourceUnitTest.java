package com.altoros.stock.resources;

import org.junit.Test;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

/**
 * Created by uladzimir.ziankevich on 12/21/2015.
 */
public class StockResourceUnitTest {

    private MockMvc mockMvc = MockMvcBuilders.standaloneSetup(new StockResource()).build();

    @Test
    public void testPing() throws Exception {

        mockMvc.perform(MockMvcRequestBuilders.get("/stock/ping"))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().string("Ping"));

    }
}