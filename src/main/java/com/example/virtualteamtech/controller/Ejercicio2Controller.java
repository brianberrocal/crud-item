package com.example.virtualteamtech.controller;

import com.example.virtualteamtech.models.entity.Item;
import com.example.virtualteamtech.models.api.request.ItemPutRequest;
import com.example.virtualteamtech.models.api.request.ItemRequest;
import com.example.virtualteamtech.service.Ejercicio2Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class Ejercicio2Controller {

    @Autowired
    private Ejercicio2Service ejercicio2Service;

    /**
     * Ejercicio 2   -> Obtener Lista de  Item.
     *
     * @return ResponseEntity --> Item
     */
    @GetMapping(value = "/item")
    public ResponseEntity<Iterable<Item>> findAll() {
        return new ResponseEntity<>(ejercicio2Service.findAll(), HttpStatus.OK);
    }

    /**
     * Ejercicio 2   -> Registrar Item.
     *
     * @return ResponseEntity --> Item
     */
    @PostMapping(value = "/item")
    public ResponseEntity<Item> save(@RequestBody(required = true) ItemRequest item) {
        return new ResponseEntity<>(ejercicio2Service.save(item), HttpStatus.CREATED);
    }

    /**
     * Ejercicio 2   -> Actualiza Item.
     *
     * @return ResponseEntity --> Item
     */
    @PutMapping(value = "/item")
    public ResponseEntity<Item> update(@RequestBody(required = true) ItemPutRequest item) {
        Item itemEntity = ejercicio2Service.findByCode(item.getItemCode());
        if (itemEntity == null) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
        return new ResponseEntity<>(ejercicio2Service.update(item, itemEntity), HttpStatus.OK);
    }

    /**
     * Ejercicio 2   -> Elimina Item.
     *
     * @return ResponseEntity -->
     */
    @DeleteMapping(value = "/item/{code}")
    public ResponseEntity<HttpStatus> delete(@PathVariable Long code) {
        Item item = ejercicio2Service.findByCode(code);
        if (item == null) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
        ejercicio2Service.delete(item);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }
}
