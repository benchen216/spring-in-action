package win.ben2.springinactionMVC;

import org.junit.jupiter.api.Test;
import org.springframework.test.web.servlet.MockMvc;
import win.ben2.springinactionMVC.data.Spittler;
import win.ben2.springinactionMVC.data.SpittlerRepository;


import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.standaloneSetup;

public class SpittlerControllerTest {
    @Test
    public void shouldShowRegistration() throws Exception{
        SpittlerRepository mockRepository = mock(SpittlerRepository.class);
        SpittlerController controller = new SpittlerController(mockRepository);
        MockMvc mockMvc = standaloneSetup(controller).build();
        mockMvc.perform(get("/spittler/register"))
                .andExpect(view().name("registerForm"));
    }

    @Test
    public void shouldProcessRegistration() throws Exception{
        SpittlerRepository mockRepository = mock(SpittlerRepository.class);
        Spittler unsaved = new Spittler("jbauer","24hours","Jack","Bauer");
        Spittler saved = new Spittler(24L,"jbauer","24hours","Jack","Bauer");
        when(mockRepository.save(unsaved)).thenReturn(saved);
        SpittlerController controller = new SpittlerController(mockRepository);
        MockMvc mockMvc = standaloneSetup(controller).build();
        mockMvc.perform(get("/spittler/register")
                .param("firstName","Jack")
                .param("lastName","Bauer")
                .param("username","jbauer")
                .param("password","24hours"))
                .andExpect(redirectedUrl("/spittler/jbauer"));

        verify(mockRepository,atLeastOnce()).save(unsaved);

    }


}
