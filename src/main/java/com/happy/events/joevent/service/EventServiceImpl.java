package com.happy.events.joevent.service;

import com.happy.events.joevent.web.model.EventDto;

import java.util.Date;
import java.util.UUID;
import org.springframework.stereotype.Service;
@Service
public class EventServiceImpl implements EventService {
    @Override
    public EventDto getEventById(UUID eventId) {
        return EventDto.builder().id(UUID.randomUUID())
        .allowGuest(true).attendieCount(1)
                .attendieLimit(20)
                .description("This is a test event")
                .leader("Joe")
                .startDate(new Date())
                .title("TEST Event To the Moon").build();

    }
}
