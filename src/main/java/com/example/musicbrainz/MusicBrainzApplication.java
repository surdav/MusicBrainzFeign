package com.example.musicbrainz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class MusicBrainzApplication {

    public static void main(String[] args) {
        SpringApplication.run(MusicBrainzApplication.class, args);
    }

}
