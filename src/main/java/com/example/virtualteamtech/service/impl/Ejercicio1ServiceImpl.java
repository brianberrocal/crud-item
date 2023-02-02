package com.example.virtualteamtech.service.impl;
import com.example.virtualteamtech.service.Ejercicio1Service;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@Service
public class Ejercicio1ServiceImpl implements Ejercicio1Service {

    @Override
    public List<String> multiplosthreeAndfive() {

        List<String> lista = new ArrayList<>();
        IntStream stream = IntStream.range(1, 100);
        lista = stream.mapToObj(a -> parseMultiploThreeAndFive(a))
                .collect(Collectors.toList());
        return lista;
    }

    private String parseMultiploThreeAndFive(Integer num){
        String cod = num.toString();
        if(num % 3 == 0) {
            cod = "VIN";
        } else if(num % 5 == 0) {
            cod = "CLE";
        } if(num % 3 == 0 && num % 5 == 0) {
            cod = "VINCLE";
        }
        return cod;
    }
}
