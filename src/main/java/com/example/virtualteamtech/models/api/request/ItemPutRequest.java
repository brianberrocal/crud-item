package com.example.virtualteamtech.models.api.request;
import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ItemPutRequest {

    private Long itemCode;
    private String nombre;
    private String caracteristicas;
    private String capacidad;
    private String envase;
    private String clienteModificacion;
    private String tipo;

}
