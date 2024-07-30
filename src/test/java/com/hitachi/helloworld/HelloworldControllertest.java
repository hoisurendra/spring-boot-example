
package com.hitachi.helloworld;
 
import org.springframework.test.web.servlet.MockMvc;
 


@ExtendWith(SpringExtension.class)
@WebMvcTest(HelloWorldController.class)
public class HelloworldControllertest {

  
 
    @Autowired
    private MockMvc mockMvc;
 
    // @MockBean
    // private AdminService adminService;
  
     @Testpublic
    void testPrintHello() throwsException {        
      mockMvc.perform(get("/hello")).andExpect(status().isOk()).andExpect(content().string("Hi Hello, Welcome to Web Page deployed using Jenkins Pipeline & Docker")); }
