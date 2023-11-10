package com.qortmdcks.crud5.controller;

import com.qortmdcks.crud5.payload.OneDto;
import com.qortmdcks.crud5.service.Impl.OneServiceImpl;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/one")
public class OneController {
    private OneServiceImpl oneServiceImpl;

    public OneController(OneServiceImpl oneServiceImpl){
        this.oneServiceImpl = oneServiceImpl;
    }

    @PostMapping
    public ResponseEntity<OneDto> createOne(@Valid @RequestBody OneDto oneDto){
        return new ResponseEntity<>(oneServiceImpl.createOne(oneDto), HttpStatus.OK);
    }

    @GetMapping("/all")
    public ResponseEntity<List<OneDto>> getAllOne(){
        return ResponseEntity.ok(oneServiceImpl.getAllOne());
    }


    @GetMapping("/{id}")
    public ResponseEntity<OneDto> getOneById(@PathVariable(name = "id") long id){
        return ResponseEntity.ok(oneServiceImpl.getOneById(id));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteOneById(@PathVariable(name = "id") long id){
        oneServiceImpl.deleteOneById(id);
        return new ResponseEntity<>("deleted post", HttpStatus.OK);
    }
}
