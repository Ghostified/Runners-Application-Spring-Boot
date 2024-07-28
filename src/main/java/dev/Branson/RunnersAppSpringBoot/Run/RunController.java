package dev.Branson.RunnersAppSpringBoot.Run;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

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
    //The method uses a dynamic path variable using the @PathVariable annotation
    @GetMapping("/{id}")
    Run findById(@PathVariable Integer id) {
        Optional<Run> run = runRepository.findById(id);
        if(run.isEmpty()) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
        return run.get();
    }

    //mapping from the base uri that will return the run id
    //The method uses a hard coded id -> 1 to return runs using the method findById(1
    //@GetMapping("/1")
   // Run findById() {
    //    return runRepository.findById(1);
    //}

    //Post
    //Create a method to create a run
    //controller need to receive the request in JSON matching with the run record with the @Request annotation
    //to test a post request , use post man
    //@Postmapping defines the raw data to be posted
    @PostMapping("")
    void  create (@RequestBody Run run) {
        runRepository.create(run);
    }

    //PUT

    //Delete
}
