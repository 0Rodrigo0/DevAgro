package com.devAgro.devAgro.Dto;

import com.devAgro.devAgro.model.Empresa;
import com.devAgro.devAgro.model.Grao;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Data
@Getter
@Setter
public class FazendaModDto {

    private Long id;
    private String nomeFa;
    @JsonIgnore
    private String enderecoFa;
    @JsonIgnore
    private Double estoqueIFa;
    @JsonIgnore
    private String ultimaCFa;
    @JsonIgnore
    private Grao grao;
    @JsonIgnore
    private Empresa empresa;
    private String dataProximaColheita;

    public FazendaModDto(Long id, String nomeFa, String enderecoFa, Double estoqueIFa, String ultimaCFa, Grao grao, Empresa empresa, String dataProximaColheita) {
        this.id = id;
        this.nomeFa = nomeFa;
        this.enderecoFa = enderecoFa;
        this.estoqueIFa = estoqueIFa;
        this.ultimaCFa = ultimaCFa;
        this.grao = grao;
        this.empresa = empresa;
        this.dataProximaColheita = dataProximaColheita;
    }
}
