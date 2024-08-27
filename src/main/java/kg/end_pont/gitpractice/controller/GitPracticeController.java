package kg.end_pont.gitpractice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/git")
public class GitPracticeController {

    @GetMapping(value = "/sum")
    public String sum(
            @RequestParam Integer a,
            @RequestParam Integer b
    ) {
        return String.valueOf("Sum of " + a + " and " + b + " = " + (a + b));
    }
}
