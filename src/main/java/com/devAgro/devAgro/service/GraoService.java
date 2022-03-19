package com.devAgro.devAgro.service;

import com.devAgro.devAgro.Dto.GraoEmpresaModDto;
import com.devAgro.devAgro.model.Empresa;
import com.devAgro.devAgro.model.Grao;
import com.devAgro.devAgro.repository.GraoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GraoService {

    private final GraoRepository repository;

    public GraoService(GraoRepository repository) {
        this.repository = repository;
    }

    public Grao adicionarGrao(Grao grao) {
        return repository.save(grao);
    }

    public List<Grao> listaGrao() {
        return repository.findAll();
    }

    public Grao atualizaGrao(Long id, Grao grao) {
        Grao alteraGrao = repository.findById(id).get();
        alteraGrao.setNomeGr(grao.getNomeGr());
        alteraGrao.setTempoMGr(grao.getTempoMGr());
        alteraGrao.setEmpresa(grao.getEmpresa());
        return alteraGrao;
    }

    public void deletaGrao(Long id) {
        repository.deleteById(id);
    }

    public List<Grao> listaGraoEmpresa(Empresa empresa) {
        return repository.findAllByEmpresa(empresa);
    }

    public List<GraoEmpresaModDto> graoEmpresaModDto(Empresa empresa) {
        return repository.findAllByGraoEmpresaMod(empresa);
    }
}
