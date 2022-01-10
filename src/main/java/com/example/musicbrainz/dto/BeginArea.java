package com.example.musicbrainz.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

// import com.fasterxml.jackson.databind.ObjectMapper; // version 2.11.1
// import com.fasterxml.jackson.annotation.JsonProperty; // version 2.11.1
/* ObjectMapper om = new ObjectMapper();
Root root = om.readValue(myJsonString), Root.class); */
public class BeginArea{
    @JsonProperty("sort-name")
    public String sortName;

    public Object type;
    public String name;
    public String disambiguation;

    @JsonProperty("type-id") 
    public Object typeId;

    public String id;
}


