package com.devAgro.devAgro.Dto;

import com.devAgro.devAgro.model.Empresa;
import com.devAgro.devAgro.model.Grao;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ListaGraoEmpresa {

    private String nomeGr;
    private String tempoMGr;
    private Empresa empresa;

    public Grao converte(){
        Grao grao = new Grao();
        grao.setNomeGr(nomeGr);
        grao.setTempoMGr(tempoMGr);
        grao.setEmpresa(empresa);
        return grao;
    }

}
