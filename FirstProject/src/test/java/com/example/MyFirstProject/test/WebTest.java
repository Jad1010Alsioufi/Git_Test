package com.example.MyFirstProject.test;

import com.example.MyFirstProject.MyFirstProjectApplication;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import static javax.swing.UIManager.get;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@WebMvcTest()
public class WebTest {

    @Autowired
    MockMvc mvc;

    @Test
    @DisplayName("The Start Page accessible under /start")
    void test() throws Exception {
//        mvc.perform(MockMvcRequestBuilders.get("/start"));
//        mvc.perform(MockMvcRequestBuilders.get("/start"));

        mvc.perform(MockMvcRequestBuilders.get("/start")).andExpect(status().isOk())
                .andExpect(view().name("name"));

        MockHttpServletRequestBuilder req = MockMvcRequestBuilders.get("/start").param("id", "123");
        ResultActions result = mvc.perform(req);
//        result.andExpect(MockMvcResultMatchers.status().is(200));
//        result.andExpect(MockMvcResultMatchers.model().attributeExists("name"));
//        result.andExpect(MockMvcResultMatchers.view().name("/app/WebPage.html"));
//        result.andExpect(MockMvcResultMatchers.content().string(containsString("<h1>Hello my Friend ..</h1>")));

        ResultActions a = mvc.perform(MockMvcRequestBuilders.get("/find").param("name", "something"));

        result.andExpect(view().name("product")).andExpect(model().attribute("name", "something"));


        MvcResult mvcResult = result.andExpect(MockMvcResultMatchers.status().is(200)).andReturn();

        String id = mvcResult.getRequest().getParameter("id");
        assertThat(id).isEqualTo("123");
    }
}
