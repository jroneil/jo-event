package com.happy.events.joevent.web.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.util.Date;
import java.util.UUID;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class EventDto {
    private UUID id;
    private String title;
    private String description;
    private Integer attendieLimit;
    private Integer attendieCount;
    private Integer attendieRemaining;
    private Date startDate;
    private Date stopDate;
    private Integer startHour;
    private Integer startMin;
    private Integer stopHour;
    private Integer stopMin;
    private String amPmStart;
    private String amPmStop;
    private String leader;
    private boolean allowGuest;


}
