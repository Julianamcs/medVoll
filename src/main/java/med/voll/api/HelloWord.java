package med.voll.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloWord {

    @GetMapping
    public String olaMundo(){
        return "Olá Mundo Spring!";
    }
}
