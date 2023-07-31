package win.ben2.springinactionMVC;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import win.ben2.springinactionMVC.data.SpittleRepository;
import static org.springframework.web.bind.annotation.RequestMethod.GET;

@Controller
@RequestMapping("/spittles")
public class SpittleController {
    private SpittleRepository spittleRepository;
    @Autowired
    public SpittleController(SpittleRepository spittleRepository){
        this.spittleRepository = spittleRepository;
    }
    @RequestMapping(method = GET)
    public String spittles(
            @RequestParam(value = "max", defaultValue = Long.MAX_VALUE + "") long max,
            @RequestParam(value = "count", defaultValue = "20") int count,
            Model model){
        model.addAttribute(
                spittleRepository.findSpittles(max,count));
        return "spittles";
    }
}
