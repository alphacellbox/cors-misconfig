package cellboxowasp.corsmisconfig;

import org.springframework.web.bind.annotation.*;

@RestController
public class Controller {

   // @RequestMapping(value = {"/{a}"}, method = RequestMethod.GET)

    @CrossOrigin(value ="http://127.0.0.2:550")
    @RequestMapping("/")
     public String all(){
        System.out.println("aaaaaaaaaaaaa");
        return "cellbox111111111111";
    }



}

