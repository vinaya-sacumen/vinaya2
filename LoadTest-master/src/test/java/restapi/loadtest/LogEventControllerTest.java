package restapi.loadtest;

import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultMatcher;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;
import restapi.loadtest.cloudflare.LogEventController;
import restapi.loadtest.cloudflare.zone.ZoneController;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;

//@ContextConfiguration(classes = ZoneController.class)

@RunWith(SpringRunner.class)
public class LogEventControllerTest  {
//    @Autowired
//    private WebApplicationContext webApplicationContext;

    private MockMvc mockMvc;

 @Before
  public void setup()
 {
     mockMvc = MockMvcBuilders.standaloneSetup().build();  }

    @Test
    public void testEmployee() throws Exception {
        mockMvc.perform(get("/client/v4/zones?page=1"))
                .andDo(print()).andReturn();


    }


}
