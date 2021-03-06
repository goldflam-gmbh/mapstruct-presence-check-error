package org.example.mapstruct.dto;

import com.fasterxml.jackson.annotation.JsonProperty;


public class PlaneDto {

    @JsonProperty("id")
    private long id;

    @JsonProperty("name")
    private String name;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
