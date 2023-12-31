package win.ben2.springinactionMVC;

import org.junit.Test;


import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.*;


import org.springframework.test.web.servlet.MockMvc;
import win.ben2.springinactionMVC.HomeController;

public class HomeControllerTest {
    @Test
    public void testHomePage() throws Exception{
    HomeController controller = new HomeController();
    MockMvc mockMvc = standaloneSetup(controller).build();
    mockMvc.perform(get("/")).andExpect(view().name("home"));
}
}
