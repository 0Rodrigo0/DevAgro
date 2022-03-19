package com.devAgro.devAgro.Dto;

import com.devAgro.devAgro.model.Empresa;
import com.devAgro.devAgro.model.Fazenda;
import com.devAgro.devAgro.model.Grao;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class GraoEmpresaModDto {

    @JsonIgnore
    private Long id;
    @JsonIgnore
    private String nomeFa;
    @JsonIgnore
    private String enderecoFa;

    private Double estoqueIFa;
    @JsonIgnore
    private String ultimaCFa;
    @JsonIgnore
    private Grao grao;
    @JsonIgnore
    private Empresa empresa;
    @JsonIgnore
    private String dataProximaColheita;
    private String nomeGr;

    public GraoEmpresaModDto(Long id, String nomeFa, String enderecoFa, Double estoqueIFa, String ultimaCFa, Grao grao, Empresa empresa, String dataProximaColheita, String nomeGr) {
        this.id = id;
        this.nomeFa = nomeFa;
        this.enderecoFa = enderecoFa;
        this.estoqueIFa = estoqueIFa;
        this.ultimaCFa = ultimaCFa;
        this.grao = grao;
        this.empresa = empresa;
        this.dataProximaColheita = dataProximaColheita;
        this.nomeGr = nomeGr;
    }
}
