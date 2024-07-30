
package com.hitachi.helloworld;

// import com.hitachi.helloworld.HellowWorldController;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;



// @SpringBootTest
// @AutoConfigureMockMvc
@ExtendWith(SpringExtension.class)
@WebMvcTest(HeloWorldController.class)
public class HelloworldControllertest { 
 
    @Autowired
    private MockMvc mockMvc;
 
    // @MockBean
    // private AdminService adminService;
  @Test
    public void testPrintHello() throws Exception {        
        mockMvc.perform(get("/welcome")
                .contentType(MediaType.TEXT_PLAIN))
               .andExpect(status().isOk())
               .andExpect(content().string("Hi Hello, Welcome to Web Page deployed using Jenkins Pipeline & Docker")); 
    }
}
