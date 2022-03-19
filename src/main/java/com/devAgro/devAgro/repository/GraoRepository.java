package com.devAgro.devAgro.repository;

import com.devAgro.devAgro.Dto.GraoEmpresaModDto;
import com.devAgro.devAgro.model.Empresa;
import com.devAgro.devAgro.model.Grao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GraoRepository extends JpaRepository <Grao, Long> {


    List<Grao> findAllByEmpresa(Empresa empresa);

    @Query("SELECT NEW com.devAgro.devAgro.Dto.GraoEmpresaModDto(f.id, f.nomeFa, f.enderecoFa, f.estoqueIFa," +
            " f.ultimaCFa, f.grao, f.empresa, f.dataProximaColheita, g.nomeGr) FROM Fazenda f, Grao g WHERE " +
            " f.empresa = :empresa and f.grao = g.id ORDER BY f.estoqueIFa")
    List<GraoEmpresaModDto> findAllByGraoEmpresaMod(Empresa empresa);
}
