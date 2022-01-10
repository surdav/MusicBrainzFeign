package com.example.musicbrainz.controller;

import com.example.musicbrainz.dto.Root;
import com.example.musicbrainz.service.ExternalMusicFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MusicController {

   @Autowired
   private ExternalMusicFeignClient externalMusicFeignClient;

    public MusicController(ExternalMusicFeignClient externalMusicFeignClient) {
        this.externalMusicFeignClient = externalMusicFeignClient;
    }

    @GetMapping("/")
    public ResponseEntity<Root> welcome2(){
        return this.externalMusicFeignClient.getMusicBrainzData();
    }
}
