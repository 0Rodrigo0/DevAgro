package com.devAgro.devAgro.repository;

import com.devAgro.devAgro.Dto.FazendaModDto;
import com.devAgro.devAgro.model.Empresa;
import com.devAgro.devAgro.model.Fazenda;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface FazendaRepository extends JpaRepository <Fazenda, Long> {

    List<Fazenda> findAllByEmpresa(Empresa empresa);

    long countByEmpresa(Empresa empresa);

    @Query("SELECT NEW com.devAgro.devAgro.Dto.FazendaModDto(f.id, f.nomeFa, f.enderecoFa, f.estoqueIFa," +
            " f.ultimaCFa, f.grao, f.empresa, f.dataProximaColheita) FROM Fazenda f WHERE f.empresa = :empresa")
    List<FazendaModDto> findAllEmpresaMod(Empresa empresa);

}
