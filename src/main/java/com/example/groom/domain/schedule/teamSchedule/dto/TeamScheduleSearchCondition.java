package com.example.groom.domain.schedule.teamSchedule.dto;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class TeamScheduleSearchCondition {
    private Long userId;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
}
