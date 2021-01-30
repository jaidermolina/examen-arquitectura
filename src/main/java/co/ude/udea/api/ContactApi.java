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
        return new Contact(21L,"Jaider","Molina","+57 3207509755", "jaider.molina@udea.edu.co");
    }
}
