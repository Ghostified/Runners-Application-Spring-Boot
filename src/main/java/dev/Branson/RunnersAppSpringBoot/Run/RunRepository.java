package dev.Branson.RunnersAppSpringBoot.Run;


//This class stores all the data from the diffrent runs made
//It encapsulates all the data access and records of the run
//It is an In memory database

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class RunRepository {

    //Method to get all the runs and store them in an array
    private List<Run> runs = new ArrayList<>();

    //Calling the findAll() method returns all the runs stored in the system
    List<Run> findAll () {
        return  runs;
    }

    /*
    *Using Optionals to handle exceptions dynamically
    *
     */
    Optional<Run> findById(Integer id){
        return runs.stream()
                .filter(run -> run.id() == id)
                .findFirst();
    }

    //Method to create a run in the run repository to the List
    void create (Run run) {
        runs.add(run);
    }

    //Method that returns a run by ID
    //It takes in run ID
//    Run findById(Integer id) {
//        return runs.stream()
//                .filter(run -> run.id() == id)
//                .findFirst()
//                .get();
//    }

    //Annotation for initialization of a run
    //All records of the run are created here
    @PostConstruct
    private  void init () {
        runs.add(new Run(
                1,
                "Monday Morning Run",
                LocalDateTime.now(),
                LocalDateTime.now().plus(30, ChronoUnit.MINUTES),
                5,
                Location.INDOOR
        ));

        runs.add(new Run(
                2,
                "Tuesday Evening Run",
                LocalDateTime.now(),
                LocalDateTime.now().plus(45,ChronoUnit.MINUTES),
                7,
                Location.OUTDOOR
        ));
    }

}
