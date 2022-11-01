package cellboxowasp.corsmisconfig;

import org.springframework.web.bind.annotation.*;

@RestController
public class Controller {

   // @RequestMapping(value = {"/{a}"}, method = RequestMethod.GET)

    @CrossOrigin(value ="http://127.0.0.1:5500")
    @RequestMapping("/")
     public String all(){
        System.out.println("aaaaaaaaaaaaa");
        return "cellbox3333333";
    }



}

