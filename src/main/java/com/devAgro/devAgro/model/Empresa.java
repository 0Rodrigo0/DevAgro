package com.devAgro.devAgro.model;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.br.CNPJ;
import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "empresa")
public class Empresa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "nome")
    private String nome;
    @Column(name = "cnpj")
    @CNPJ
    private String cnpj;
    @Column(name = "endereco")
    private String endereco;

}
