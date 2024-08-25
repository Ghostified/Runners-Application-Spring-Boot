package dev.Branson.RunnersAppSpringBoot;

import dev.Branson.RunnersAppSpringBoot.Run.Location;
import dev.Branson.RunnersAppSpringBoot.Run.Run;
import dev.Branson.RunnersAppSpringBoot.Run.RunRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

import static org.slf4j.LoggerFactory.getLogger;

@SpringBootApplication
public class RunnersAppSpringBootApplication {

	private static final Logger log = LoggerFactory.getLogger(RunnersAppSpringBootApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(RunnersAppSpringBootApplication.class, args);

	}
//Command line logger to test runs
//	@Bean
//	CommandLineRunner runner(RunRepository runRepository) {
//		return args -> {
//			Run run = new Run(1,
//					"First Run",
//					LocalDateTime.now(),
//					LocalDateTime.now().plus(1, ChronoUnit.HOURS),
//					3,
//					Location.OUTDOOR);
//			RunRepository.create(run);
//		};
//	}




}
