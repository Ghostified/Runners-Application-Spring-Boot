package dev.Branson.RunnersAppSpringBoot.Run;

import java.time.LocalDateTime;

//Record details for each run
public record Run(
        Integer id,
        String title,
        LocalDateTime startedOn,
        LocalDateTime completedOn,
        Integer miles,
        Location location
) {
}
