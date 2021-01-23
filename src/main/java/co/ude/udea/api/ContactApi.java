package co.ude.udea.api;

import co.ude.udea.dto.Contact;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@ResponseBody
public class ContactApi {

    @GetMapping(value = "/contact")
    public Contact conctac(){
        return new Contact(10L,"robin","CGarcia","+57 310 891 71 02", "robin.coronado@gmail");
    }
}
