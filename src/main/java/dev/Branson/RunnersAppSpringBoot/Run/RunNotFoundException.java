package dev.Branson.RunnersAppSpringBoot.Run;

/*
* This class handles exception for  api calls with invalid ID's
 */

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class RunNotFoundException extends  RuntimeException{
    public  RunNotFoundException () {
        super("Run Not Found");
    }
}
