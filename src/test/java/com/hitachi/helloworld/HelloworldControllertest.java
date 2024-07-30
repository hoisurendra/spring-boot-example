
package com.hitachi.helloworld;
 
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc; 

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;



// @SpringBootTest
// @AutoConfigureMockMvc
@ExtendWith(SpringExtension.class)
@WebMvcTest(HelloWorldController.class)
public class HelloworldControllertest { 
 
    @Autowired
    private MockMvc mockMvc;
 
    // @MockBean
    // private AdminService adminService;
  
     @Test
     public void testPrintHello() throws Exception {        
      mockMvc.perform(get("/welcome"))
       .andExpect(status().isOk())
       .andExpect(content().string("Hi Hello, Welcome to Web Page deployed using Jenkins Pipeline & Docker")); 
    }
}
