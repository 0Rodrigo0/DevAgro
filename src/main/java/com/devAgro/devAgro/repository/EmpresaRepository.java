package com.devAgro.devAgro.repository;


import com.devAgro.devAgro.model.Empresa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpresaRepository extends JpaRepository <Empresa, Long>{
}
