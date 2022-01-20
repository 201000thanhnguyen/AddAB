package com.example.controllers;

import com.example.models.AddAB;
import com.example.repository.IAddABRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sum-ab")
public class AddABController {
    @Autowired
    IAddABRepository iAddABRepository;

    @PostMapping("/add")
    public ResponseEntity<AddAB> postSumAB(@RequestBody AddAB sumAB){
        this.iAddABRepository.save(sumAB);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
