package com.example.groom.domain.tag.dto;

import lombok.Data;

@Data
public class TagDto {
    private Long id;

    private String name;

    public TagDto(Long id, String name) {
        this.id = id;
        this.name = name;
    }
}
