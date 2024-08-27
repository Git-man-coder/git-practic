package kg.end_pont.gitpractice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Task6Controller {
    @GetMapping("/divide")
    public Integer divideByModule(@RequestParam Integer a, @RequestParam Integer b) {
        return a%b;
    }
}
