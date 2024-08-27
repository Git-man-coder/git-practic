package kg.end_pont.gitpractice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/git")
public class GitPracticeController {
    @GetMapping("/multiplication")
    public Integer multiplication(@RequestParam Integer a, @RequestParam Integer b) {
        return a * b;
    }

}
