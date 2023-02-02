package com.example.virtualteamtech.service;
import com.example.virtualteamtech.models.entity.Item;
import com.example.virtualteamtech.models.api.request.ItemPutRequest;
import com.example.virtualteamtech.models.api.request.ItemRequest;

public interface Ejercicio2Service {

    Item save(ItemRequest item);

    void delete(Item item);

    Item findByCode(Long code);

    Item update(ItemPutRequest item, Item itemEntity);

    Iterable<Item> findAll();
}
