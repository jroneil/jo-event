package com.happy.events.joevent.web.controller;
import com.happy.events.joevent.service.EventService;
import com.happy.events.joevent.web.model.EventDto;
import com.happy.events.joevent.service.EventService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RequestMapping("/api/v1/event")
@RestController
public class  EventController {
    private final EventService eventService;

    public EventController(EventService eventService) {
        this.eventService = eventService;
    }

    @GetMapping({"/{eventId}"})
    public ResponseEntity<EventDto> getEvent(@PathVariable("eventId") UUID eventId){
    	   return new ResponseEntity<EventDto>(eventService.getEventById(eventId), HttpStatus.OK);
    }
    
    @PostMapping
    public ResponseEntity<EventDto> saveNewEvent(@RequestBody EventDto eventDto){
    	   return new ResponseEntity<EventDto>(HttpStatus.CREATED);
    }
    @PutMapping({"/{eventId}"})
    public ResponseEntity<EventDto> updateEvent(@PathVariable("eventId") UUID eventId,@RequestBody EventDto eventDto){
    	   return new ResponseEntity<EventDto>(HttpStatus.NO_CONTENT);
    }
}
