package com.devAgro.devAgro.model;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.br.CPF;

import javax.persistence.*;
import java.math.BigInteger;
import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table(name = "funcionario")
public class Funcionario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "nome")
    private String nomeFu;
    @Column(name = "sobrenome")
    private String sobrenomeFu;
    @Column(name = "cpf")
    @CPF
    private String cpfFu;
    @Column(name = "endereco")
    private String enderecoFu;
    @Column(name = "telefone")
    private String foneFu;
    @Column(name = "sexo")
    private String sexoFu;
    @Column(name = "data_nascimento")
    private LocalDate nascimentoFu;

    @ManyToOne
    private Empresa empresa;

}
