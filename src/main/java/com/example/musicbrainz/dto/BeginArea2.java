package com.example.musicbrainz.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class BeginArea2{
    @JsonProperty("sort-name")
    public String sortName;
    
    public Object type;
    public String name;
    public String disambiguation;
    
    @JsonProperty("type-id") 
    public Object typeId;
    
    public String id;
}