package com.devAgro.devAgro.Dto;

import com.devAgro.devAgro.model.Empresa;
import com.devAgro.devAgro.model.Fazenda;
import com.devAgro.devAgro.model.Grao;
import lombok.Getter;
import lombok.Setter;
import javax.validation.constraints.NotBlank;


@Getter
@Setter
public class NovaFazendaDto {

    @NotBlank
    private String nomeFa;
    @NotBlank
    private String enderecoFa;
    @NotBlank
    private Double estoqueIFa;
    @NotBlank
    private String ultimaCFa;
    @NotBlank
    private String dataProximaColheita;
    @NotBlank
    private Grao grao;
    @NotBlank
    private Empresa empresa;


    public Fazenda converte() {
        Fazenda fazenda = new Fazenda();
        fazenda.setNomeFa(nomeFa);
        fazenda.setEnderecoFa(enderecoFa);
        fazenda.setEstoqueIFa(estoqueIFa);
        fazenda.setUltimaCFa(ultimaCFa);
        fazenda.setDataProximaColheita(dataProximaColheita);
        fazenda.setEmpresa(empresa);
        fazenda.setGrao(grao);
        return fazenda;
    }

}
