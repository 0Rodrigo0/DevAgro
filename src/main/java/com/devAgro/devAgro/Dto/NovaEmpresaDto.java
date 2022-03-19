package com.devAgro.devAgro.Dto;

import com.devAgro.devAgro.model.Empresa;
import com.devAgro.devAgro.model.Fazenda;
import com.devAgro.devAgro.model.Funcionario;
import com.devAgro.devAgro.model.Grao;
import lombok.Getter;
import lombok.Setter;
import javax.validation.constraints.NotBlank;

@Getter
@Setter
public class NovaEmpresaDto {

    @NotBlank
    private String nome;
    @org.hibernate.validator.constraints.br.CNPJ
    private String cnpj;
    @NotBlank
    private String endereco;
    private Fazenda fazenda;
    private Funcionario funcionario;
    private Grao grao;

    public Empresa converte(){
        Empresa empresa = new Empresa();
        empresa.setNome(nome);
        empresa.setCnpj(cnpj);
        empresa.setEndereco(endereco);
        return empresa;
    }
}
