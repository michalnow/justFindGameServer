package com.michal.justfindgame.eventRepository;

import com.michal.justfindgame.eventCatalog.Event;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface EventRepository extends MongoRepository<Event, String> {


}
