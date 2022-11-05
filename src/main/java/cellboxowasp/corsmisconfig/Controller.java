package cellboxowasp.corsmisconfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.web.HttpRequestHandler;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;

@RestController
public class Controller {
    @Autowired
    private RequestServiceImpl requestService;
   // @RequestMapping(value = {"/{a}"}, method = RequestMethod.GET)

    @CrossOrigin(value ="*")
    @RequestMapping("/")
     public String all(HttpServletRequest httpServletRequest){
        System.out.println("///////////////////////");
        OffsetDateTime offsetdatetime
                = OffsetDateTime.now();
        System.out.println(">>>>> ip = "+requestService.getClientIp(httpServletRequest));
        System.out.println(offsetdatetime);
        System.out.println("*********************");
        return "sabzi polo ba mahi22222222222";
    }
}

