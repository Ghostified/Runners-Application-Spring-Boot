package dev.Branson.RunnersAppSpringBoot.Run;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * This is the rest controller class
 * the response body would be in JSOn
 *
 */

@RestController

public class RunController {

    //CRUD operations controller to manage the runs to return response
    private List<Run> runs = new ArrayList<>();

    //Controller for get
    //This endpoint will return a string hello
    @GetMapping("/hello")
    String home() {
        return "Hello, Runners";
    }
}
