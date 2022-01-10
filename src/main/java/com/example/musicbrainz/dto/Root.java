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

    public static class Area{
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

    // import com.fasterxml.jackson.databind.ObjectMapper; // version 2.11.1
    // import com.fasterxml.jackson.annotation.JsonProperty; // version 2.11.1
    /* ObjectMapper om = new ObjectMapper();
    Root root = om.readValue(myJsonString), Root.class); */
    public static class BeginArea{
        @JsonProperty("sort-name")
        public String sortName;

        public Object type;
        public String name;
        public String disambiguation;

        @JsonProperty("type-id")
        public Object typeId;

        public String id;
    }

    public static class BeginArea2{
        @JsonProperty("sort-name")
        public String sortName;

        public Object type;
        public String name;
        public String disambiguation;

        @JsonProperty("type-id")
        public Object typeId;

        public String id;
    }

    public static class LifeSpan{
        public boolean ended;
        public String end;
        public String begin;
    }
}