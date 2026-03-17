package by.pasha.ru.cicdexample;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/api")
public class MyController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello from CI/CD";
    }

    @GetMapping("/health")
    public String health() {
        return "OK";
    }


}
