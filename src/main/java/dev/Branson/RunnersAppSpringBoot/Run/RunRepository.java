package dev.Branson.RunnersAppSpringBoot.Run;


//This class stores all the data from the diffrent runs made
//It encapsulates all the data access and records of the run
//Its an In memory database

import jakarta.annotation.PostConstruct;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

public class RunRepository {

    //Method to get all the runs and store them in an array
    private List<Run> runs = new ArrayList<>();

    //Calling the findAll() method returns all the runs stored in the system
    List<Run> findAll () {
        return  runs;
    }

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
