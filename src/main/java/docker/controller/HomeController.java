package docker.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/get")
public class HomeController {

    @GetMapping
    public String getMessage(){
        return "Dockerfile Example";
    }


}
