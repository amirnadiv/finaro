package com.amirnadiv.finaro;


import com.amirnadiv.finaro.controller.FinaroController;
import com.amirnadiv.finaro.dao.CardHolderRepository;
import com.amirnadiv.finaro.main.FinaroApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.modelmapper.ModelMapper;
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
@SpringBootTest(classes = {FinaroApplication.class})
@AutoConfigureMockMvc
@TestPropertySource(
        locations = "classpath:application-integrationtest.properties")
public class FinaroRestControllerIntegrationTest {

    @Autowired
    private MockMvc mvc;

    @Autowired
    private FinaroController controller;

    @Autowired
    ModelMapper modelMapper;
    @Autowired
    private CardHolderRepository cardHolderRepository;


    @Test
    public void contextLoads() {
        assertThat(controller).isNotNull();
    }


    @Test
    public void upAndRunningTest()
            throws Exception {

        this.mvc.perform(get("/")).andDo(print()).andExpect(status().isOk())
                .andExpect(content().string(containsString("Finaro Application is Up and Running")));

    }

    @Test
    public void submitTest() {


    }

    @Test
    public void retrieveTest() {


    }


}