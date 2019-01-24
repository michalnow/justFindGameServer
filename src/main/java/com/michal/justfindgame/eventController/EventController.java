package com.michal.justfindgame.eventController;


import com.michal.justfindgame.eventCatalog.Event;
import com.michal.justfindgame.eventService.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/event")
public class EventController {

    @Autowired
    private EventService eventService;

    @GetMapping("/all")
    public Iterable<Event> getAllCars(){
        return eventService.findAll();
    }

    @PostMapping
    public ResponseEntity<?> createCar(@Valid @RequestBody Event event) {

        eventService.saveOrUpdate(event);
        return new ResponseEntity<Event>(event, HttpStatus.CREATED);
    }
}
