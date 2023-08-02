package win.ben2.springinactionMVC;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import win.ben2.springinactionMVC.data.Spittler;
import win.ben2.springinactionMVC.data.SpittlerRepository;

import static org.springframework.web.bind.annotation.RequestMethod.*;

@Controller
@RequestMapping("/spittler")
public class SpittlerController {
    private SpittlerRepository spittlerRepository;
    @RequestMapping(value = "/register", method = GET)
    public String showRegistrationForm(){
        return "registerForm";
    }
    @Autowired
    public SpittlerController(SpittlerRepository spittlerRepository){
        this.spittlerRepository = spittlerRepository;
    }


    @RequestMapping(value = "/register",method = POST)
    public String processRegistration(Spittler spittler){
        spittlerRepository.save(spittler);
        return "redirect:/spittler/" + spittler.getUsername();
    }

    @RequestMapping(value = "/{username}",method = GET)
    public String showSpittlerProfile(){
        return "profile";
    }

}
