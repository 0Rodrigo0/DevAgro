package com.devAgro.devAgro.Dto;

import com.devAgro.devAgro.model.Empresa;
import com.devAgro.devAgro.model.Grao;
import lombok.Getter;
import lombok.Setter;
import javax.validation.constraints.NotBlank;

@Getter
@Setter
public class NovoGraoDto {

    @NotBlank
    private String nomeGr;
    @NotBlank
    private String tempoMGr;
    @NotBlank
    private Empresa empresa;

    public Grao converte(){
        Grao grao = new Grao();
        grao.setNomeGr(nomeGr);
        grao.setTempoMGr(tempoMGr);
        grao.setEmpresa(empresa);
        return grao;
    }
}
