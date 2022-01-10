package com.example.musicbrainz.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;

public class Root{
    public String country;
    public Object gender;
    public String disambiguation;
    public Object end_area;
    public BeginArea begin_area;
    
    @JsonProperty("type-id")
    public String typeId;
    
    public ArrayList<String> isnis;
    
    @JsonProperty("end-area")
    public Object endArea;
    
    @JsonProperty("gender-id") 
    public Object genderId;
    
    public String id;
    
    @JsonProperty("sort-name") 
    public String sortName;
    
    @JsonProperty("begin-area") 
    public BeginArea beginArea;
    
    public Area area;
    public String name;
    public ArrayList<Object> ipis;
    
    @JsonProperty("life-span") 
    public LifeSpan lifeSpan;
    
    public String type;
}