package cellboxowasp.corsmisconfig;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

   // @RequestMapping(value = {"/{a}"}, method = RequestMethod.GET)
    @RequestMapping("/")
     public String all(){
        System.out.println("aaaaaaaaaaaaa");
        return "cellbox";
    }



}

