package com.michal.justfindgame;

import com.michal.justfindgame.eventCatalog.Event;
import com.michal.justfindgame.eventRepository.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.text.SimpleDateFormat;
import java.util.Date;

@SpringBootApplication
public class JustfindgameApplication implements CommandLineRunner {

    @Autowired
    public EventRepository repo;
    String pattern = "dd.MM.yyyy";
    String pattern2 = "HH:mm";
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
    SimpleDateFormat simpleHourFormat = new SimpleDateFormat(pattern2);

    public static void main(String[] args) {
        SpringApplication.run(JustfindgameApplication.class, args);
    }


    @Override
    public void run(String... args) throws Exception {
        repo.save(Event.builder().missing(4).address("os.Kurdwanow 25")
                .difficulty("medium").type("football").date(simpleDateFormat.parse("24.01.2019")).
                        hour(simpleHourFormat.parse("17:40")).description("Please bring a ball").build());
        repo.save(Event.builder().missing(1).address("os. Złotego wieku 24")
                .difficulty("easy").type("volleyball").date(simpleDateFormat.parse("25.01.2019")).
                        hour(simpleHourFormat.parse("18:00")).build());
        repo.save(Event.builder().missing(3).address("os.Kombatantów 9")
                .difficulty("hard").type("football").date(simpleDateFormat.parse("26.01.2019")).
                        hour(simpleHourFormat.parse("20:00")).build());
        repo.save(Event.builder().missing(2).address("os. Kalinowe 1")
                .difficulty("easy").type("football").date(simpleDateFormat.parse("27.01.2019")).
                        hour(simpleHourFormat.parse("21:30")).build());
        repo.save(Event.builder().missing(5).address("os. Tysiąlecia 6")
                .difficulty("medium").type("football").date(simpleDateFormat.parse("28.01.2019")).
                        hour(simpleHourFormat.parse("15:30")).build());
        repo.save(Event.builder().missing(4).address("os.Podgórskie 24")
                .difficulty("hard").type("football").date(simpleDateFormat.parse("29.01.2019")).
                        hour(simpleHourFormat.parse("14:45")).build());
    }
}

