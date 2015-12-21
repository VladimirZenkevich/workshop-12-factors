package com.altoros.stock.resources;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.core.env.Environment;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

/**
 * Created by uladzimir.ziankevich on 12/21/2015.
 */
@RunWith(MockitoJUnitRunner.class)
public class StockResourceUnitTest {

    @Mock
    private Environment environmentMock;
    @InjectMocks
    private StockResource stockResource = new StockResource();

    private MockMvc mockMvc = MockMvcBuilders.standaloneSetup(stockResource).build();

    @Test
    public void testPing() throws Exception {

        Mockito.when(environmentMock.getProperty("environment.variable")).thenReturn("test");

        mockMvc.perform(MockMvcRequestBuilders.get("/stock/ping"))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().string("Ping test"));

    }
}