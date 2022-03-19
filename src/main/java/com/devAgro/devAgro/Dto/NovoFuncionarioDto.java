package com.devAgro.devAgro.Dto;

import com.devAgro.devAgro.model.Empresa;
import com.devAgro.devAgro.model.Funcionario;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.br.CPF;
import javax.validation.constraints.NotBlank;
import java.time.LocalDate;


@Getter
@Setter
public class NovoFuncionarioDto {

    @NotBlank
    private String nomeFu;
    @NotBlank
    private String sobrenomeFu;
    @org.hibernate.validator.constraints.br.CPF
    private String cpfFu;
    @NotBlank
    private String enderecoFu;
    @NotBlank
    private String foneFu;
    @NotBlank
    private String sexoFu;
    @NotBlank
    private LocalDate nascimentoFu;
    @NotBlank
    private Empresa empresa;

    public Funcionario converte(){
        Funcionario funcionario = new Funcionario();
        funcionario.setNomeFu(nomeFu);
        funcionario.setSobrenomeFu(sobrenomeFu);
        funcionario.setCpfFu(cpfFu);
        funcionario.setEnderecoFu(enderecoFu);
        funcionario.setFoneFu(foneFu);
        funcionario.setSexoFu(sexoFu);
        funcionario.setNascimentoFu(nascimentoFu);
        funcionario.setEmpresa(empresa);
        return funcionario;
    }
}
