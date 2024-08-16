package dev.Branson.RunnersAppSpringBoot.Run;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Positive;

import java.time.LocalDateTime;

//Record details for each run
public record Run(
        Integer id,
        @NotEmpty //The id should not be empty
        String title,
        LocalDateTime startedOn,
        LocalDateTime completedOn,
        @Positive //constraint to prevent negative integer input for miles
        Integer miles,
        Location location
) {
    public  Run {
        if(!completedOn.isAfter(startedOn)) {
            throw  new IllegalArgumentException("Completed On must be after started on");
        }
        if(title.isEmpty()){
            System.out.println("The created run does not have a title");
        }
    }
}


