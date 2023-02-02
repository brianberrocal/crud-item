package com.example.virtualteamtech.models.entity;
import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Data
@Builder
@Setter
@Getter
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "item")
public class Item {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "item_id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "item_nombre")
    private String nombre;

    @Column(name = "item_caracteristicas")
    private String caracteristicas;

    @Column(name = "item_capacidad")
    private String  capacidad;

    @Column(name = "item_envase")
    private String  envase;

    @Column(name = "item_tipo")
    private String  tipo;

    @Column(name = "item_fecha_creacion")
    private Date fechaCreacion;

    @Column(name = "user_create")
    private String cliente;

    @Column(name = "fecha_modificacion")
    private Date fechaModificacion;

    @Column(name = "user_modificacion")
    private String clienteModificacion;

    @Column(name = "item_estado")
    private String estado;
}
