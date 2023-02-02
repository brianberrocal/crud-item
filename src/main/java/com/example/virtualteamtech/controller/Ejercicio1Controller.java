package com.example.virtualteamtech.controller;

import com.example.virtualteamtech.service.Ejercicio1Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class Ejercicio1Controller {

    @Autowired
    private Ejercicio1Service ejercicio1Service;

    /**
     * Ejercicio 1.
     *
     * @return ResponseEntity --> List<String>
     */
    @GetMapping(value = "/multiplos")
    public ResponseEntity<List<String>> multiplosthreeAndfive() {
        return new ResponseEntity<>(ejercicio1Service.multiplosthreeAndfive(), HttpStatus.OK);
    }
}
