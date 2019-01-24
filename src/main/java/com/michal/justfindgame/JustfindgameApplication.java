package com.michal.justfindgame;

import com.michal.justfindgame.eventCatalog.Event;
import com.michal.justfindgame.eventRepository.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JustfindgameApplication implements CommandLineRunner {

    @Autowired
    public EventRepository repo;

    public static void main(String[] args) {
        SpringApplication.run(JustfindgameApplication.class, args);
    }


    @Override
    public void run(String... args) throws Exception {
        repo.save(Event.builder().missing(4).adress("os.Kurdwanow 25")
                .difficulty("medium").type("football").when("6pm 24.01.1r").build());
        repo.save(Event.builder().missing(1).adress("os. Złotego wieku 24")
                .difficulty("easy").type("volleyball").when("6pm 24.01.1r").build());
        repo.save(Event.builder().missing(3).adress("os.Kombatantów 9")
                .difficulty("hard").type("football").when("6pm 24.01.1r").build());
        repo.save(Event.builder().missing(2).adress("os. Kalinowe 1")
                .difficulty("easy").type("football").when("6pm 24.01.1r").build());
        repo.save(Event.builder().missing(5).adress("os. Tysiąlecia 6")
                .difficulty("medium").type("football").when("6pm 24.01.1r").build());
        repo.save(Event.builder().missing(4).adress("os.Podgórskie 24")
                .difficulty("hard").type("football").when("6pm 24.01.1r").build());
    }
}

