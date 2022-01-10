package com.example.musicbrainz.service;

import com.example.musicbrainz.dto.Root;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "musicFeignClient",url = "https://musicbrainz.org")
public interface ExternalMusicFeignClient {

    @RequestMapping(method = RequestMethod.GET, value ="/ws/2/artist/5b11f4ce-a62d-471e-81fc-a69a8278c7da?fmt=json")
    ResponseEntity<Root> getMusicBrainzData();

}
