package com.example.musicbrainz.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;

public class Area{
    public Object type;
    
    @JsonProperty("sort-name")
    public String sortName;
    
    public String name;
    
    @JsonProperty("iso-3166-1-codes") 
    public ArrayList<String> iso31661Codes;
    
    public String disambiguation;
    public String id;
    
    @JsonProperty("type-id") 
    public Object typeId;
}