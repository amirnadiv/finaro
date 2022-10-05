package com.amirnadiv.mabaya;


import com.amirnadiv.mabaya.controller.MabayaController;
import com.amirnadiv.mabaya.dto.Product;
import com.amirnadiv.mabaya.main.MabayaApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.assertj.core.api.Assertions.assertThat;
import static org.hamcrest.core.StringContains.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = MabayaApplication.class)
@AutoConfigureMockMvc
@TestPropertySource(
        locations = "classpath:application-integrationtest.properties")
public class ProductRestControllerIntegrationTest {

    @Autowired
    private MockMvc mvc;

    @Autowired
    private MabayaController controller;

    @Test
    public void contextLoads() {
        assertThat(controller).isNotNull();
    }


    @Test
    public void upAndRunningTest()
            throws Exception {

        this.mvc.perform(get("/")).andDo(print()).andExpect(status().isOk())
                .andExpect(content().string(containsString("Mabaya Application is Up and Running")));

    }

    @Test
    public void serveAdTest() {

        Product product = controller.serveAd(1);
        System.out.println(product);

    }

}