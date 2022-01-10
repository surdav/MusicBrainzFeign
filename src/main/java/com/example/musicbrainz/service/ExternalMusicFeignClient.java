package com.example.musicbrainz.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "musicFeignClient",url = "https://musicbrainz.org")
public interface ExternalMusicFeignClient {

    @GetMapping("/ws/2/artist/5b11f4ce-a62d-471e-81fc-a69a8278c7da?fmt=json")
    ResponseEntity<String> getMusicBrainzData();

}
