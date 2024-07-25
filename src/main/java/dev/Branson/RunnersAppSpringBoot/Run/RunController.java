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
//Rest controller
@RestController

/***
 * This annotation at the controller level ensures that the get mapping, post mapping and put mapping falls under
 * the base uri ("/api/runs")
 */
@RequestMapping ("/api/runs")
public class RunController {

//    //CRUD operations controller to manage the runs to return response
//    private List<Run> runs = new ArrayList<>();
//
//    //Controller for get
//    //This endpoint will return a string hello
//    @GetMapping("/hello")
//    String home() {
//        return "Hello, Runners";
//    }

    //Constructor for the run repository
    private final RunRepository runRepository;

    public RunController(RunRepository runRepository){ //dependency injection of the runcontroller into the constructor
        this.runRepository = runRepository;
    }
    //method to return a list of all stored runs in the uri
    //@GetMapping("/api/runs") -> initial uri before defining the @RequestMapping annotation
    @GetMapping("")
    List<Run> findAll () {
        return runRepository.findAll();
    }

    //mapping from the base uri that will return the run id
    @GetMapping("/1")
    Run findById() {
       return runRepository.findById(1);
    }
}
