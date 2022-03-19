package com.devAgro.devAgro.model;

import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "fazenda")
public class Fazenda {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome")
    private String nomeFa;
    @Column(name = "endereco_fazenda")
    private String enderecoFa;
    @Column(name = "estoque_inicial")
    private Double estoqueIFa;
    @Column(name = "ultima_colheita")
    private String ultimaCFa;
    @Column(name = "data_proxima_colheita")
    private String dataProximaColheita;

    @ManyToOne
    private Empresa empresa;

    @OneToOne
    private Grao grao;

}
