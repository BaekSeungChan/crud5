package com.qortmdcks.crud5.controller;

import com.qortmdcks.crud5.payload.OneDto;
import com.qortmdcks.crud5.service.OneService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/one")
public class OneController {
    private OneService oneService;

    public OneController(OneService oneService){
        this.oneService = oneService;
    }

    @PostMapping
    public ResponseEntity<OneDto> createOne(@Valid @RequestBody OneDto oneDto){
        return new ResponseEntity<>(oneService.createOne(oneDto), HttpStatus.OK);
    }
}
