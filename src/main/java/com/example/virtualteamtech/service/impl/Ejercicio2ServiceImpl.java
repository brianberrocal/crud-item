package com.example.virtualteamtech.service.impl;
import com.example.virtualteamtech.models.entity.Item;
import com.example.virtualteamtech.models.api.request.ItemPutRequest;
import com.example.virtualteamtech.models.api.request.ItemRequest;
import com.example.virtualteamtech.repository.ItemRepository;
import com.example.virtualteamtech.service.Ejercicio2Service;
import com.example.virtualteamtech.util.Constants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class Ejercicio2ServiceImpl implements Ejercicio2Service {

    @Autowired
    private ItemRepository itemRepository;

    @Override
    public Item save(ItemRequest item) {

        return itemRepository.save(Item.builder()
                .nombre(item.getNombre())
                .caracteristicas(item.getCaracteristicas())
                .capacidad(item.getCapacidad())
                .envase(item.getEnvase())
                .tipo(item.getTipo())
                .fechaCreacion(new Date())
                .cliente(item.getCliente())
                .estado(Constants.STATUS_CREATED)
                .build()
        );
    }

    @Override
    public void delete(Item item) {
        itemRepository.delete(item);
    }

    @Override
    public Item findByCode(Long code) {
        return itemRepository.findByCode(code);
    }

    @Override
    public Item update(ItemPutRequest item, Item itemEntity) {
        itemEntity.setNombre(item.getNombre());
        itemEntity.setCaracteristicas(item.getCaracteristicas());
        itemEntity.setCapacidad(item.getCapacidad());
        itemEntity.setEnvase(item.getEnvase());
        itemEntity.setFechaModificacion(new Date());
        itemEntity.setClienteModificacion(item.getClienteModificacion());
        itemEntity.setTipo(item.getTipo());
        itemEntity.setEstado(Constants.STATUS_OK);
        return itemRepository.save(itemEntity);
    }

    @Override
    public Iterable<Item> findAll() {
        return itemRepository.findAll();
    }
}
