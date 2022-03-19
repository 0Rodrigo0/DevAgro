package com.devAgro.devAgro.model;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "grao")
public class Grao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "nome")
    private String nomeGr;
    @Column(name = "tempo_colheita")
    private String tempoMGr;

    @ManyToOne
    private Empresa empresa;
}
