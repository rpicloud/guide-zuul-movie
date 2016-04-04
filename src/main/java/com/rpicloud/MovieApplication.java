package com.rpicloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
@RestController
public class MovieApplication {

    @RequestMapping(value = "/ghostbusters")
    public List<String> available() {
        List<String> movies = new ArrayList<>();
        movies.add("Ghostbusters (1984)");
        movies.add("Ghostbusters (2016)");
        return movies;
    }

	public static void main(String[] args) {
		SpringApplication.run(MovieApplication.class, args);
	}
}
