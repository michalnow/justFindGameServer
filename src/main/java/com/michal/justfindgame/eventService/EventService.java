package com.michal.justfindgame.eventService;

import com.michal.justfindgame.eventCatalog.Event;
import com.michal.justfindgame.eventRepository.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EventService {

    @Autowired
    private EventRepository eventRepository;

    public Iterable<Event> findAll() {
        return eventRepository.findAll();
    }

    public Event saveOrUpdate(Event event) {
        try {
            return eventRepository.save(event);
        } catch (Exception ex) {
            throw new RuntimeException();
        }


    }
}