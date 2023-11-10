package com.qortmdcks.crud5.controller;

import com.qortmdcks.crud5.payload.TwoDto;
import com.qortmdcks.crud5.service.TwoService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/two")
public class TwoController {
    private TwoService twoService;

    public TwoController(TwoService twoService){
        this.twoService = twoService;
    }

    @PostMapping
    public ResponseEntity<TwoDto> createTwo(@Valid @RequestBody TwoDto twoDto){
        return new ResponseEntity<>(twoService.createTwo(twoDto), HttpStatus.OK);
    }
}
