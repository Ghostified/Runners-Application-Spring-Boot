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
        Integer miles,
        @Positive //prevent negative integer input for miles
        Location location
) {
    public  Run {
        if(!completedOn.isAfter(startedOn)) {
            throw  new IllegalArgumentException("Completed On must be after started on");
        }
    }
}


