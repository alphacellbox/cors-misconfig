package cellboxowasp.corsmisconfig;

import org.springframework.web.bind.annotation.*;

@RestController
public class Controller {

   // @RequestMapping(value = {"/{a}"}, method = RequestMethod.GET)

    @CrossOrigin(value ="*")
    @RequestMapping("/")
     public String all(){
        System.out.println("aaaaaaaaaaaaa");
        return "cellbox22222";
    }



}

