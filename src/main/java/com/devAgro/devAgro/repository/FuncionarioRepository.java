package com.devAgro.devAgro.repository;

import com.devAgro.devAgro.Dto.NovoFuncionarioDto;
import com.devAgro.devAgro.model.Empresa;
import com.devAgro.devAgro.model.Funcionario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FuncionarioRepository extends JpaRepository <Funcionario, Long> {

    List<Funcionario> findAllByEmpresa(Empresa empresa);

    long countByEmpresa(Empresa empresa);
}
