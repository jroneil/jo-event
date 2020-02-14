package com.happy.events.joevent.service;

import com.happy.events.joevent.web.model.EventDto;

import java.util.UUID;

public interface EventService {
   EventDto getEventById(UUID eventId);
}
