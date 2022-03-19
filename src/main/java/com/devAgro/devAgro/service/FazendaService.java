package com.devAgro.devAgro.service;

import com.devAgro.devAgro.Dto.FazendaModDto;
import com.devAgro.devAgro.model.Empresa;
import com.devAgro.devAgro.model.Fazenda;
import com.devAgro.devAgro.repository.FazendaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FazendaService {

    private final FazendaRepository repository;

    public FazendaService(FazendaRepository repository) {
        this.repository = repository;
    }

    public Fazenda adicionarFazenda(Fazenda fazenda) {
        return repository.save(fazenda);
    }

    public List<Fazenda> listaFazenda() {
        return repository.findAll();
    }

    public Fazenda atualizaFazenda(Long id, Fazenda fazenda) {
        Fazenda alteraFazenda = repository.findById(id).get();
        alteraFazenda.setNomeFa(fazenda.getNomeFa());
        alteraFazenda.setEnderecoFa(fazenda.getEnderecoFa());
        alteraFazenda.setEstoqueIFa(fazenda.getEstoqueIFa());
        alteraFazenda.setUltimaCFa(fazenda.getUltimaCFa());
        alteraFazenda.setDataProximaColheita(fazenda.getDataProximaColheita());
        alteraFazenda.setEmpresa(fazenda.getEmpresa());
        alteraFazenda.setGrao(fazenda.getGrao());
        return repository.save(alteraFazenda);
    }

    public void deletaFazenda(Long id) {
        repository.deleteById(id);
    }

    public List<Fazenda> fazendasEmpresa(Empresa empresa) {
        return repository.findAllByEmpresa(empresa);
    }

    public long quantasfazendasEmpresa(Empresa empresa) {
        return repository.countByEmpresa(empresa);
    }

    public List<FazendaModDto> fazendasEmpresaMod(Empresa empresa) {
        return repository.findAllEmpresaMod(empresa);
    }

    public Fazenda aumentaGrao(Long id, Fazenda fazenda) {
        Fazenda alteraFazenda = repository.findById(id).get();
        alteraFazenda.setEstoqueIFa(fazenda.getEstoqueIFa() + alteraFazenda.getEstoqueIFa());
        return repository.save(alteraFazenda);
    }

    public Fazenda diminuiGrao(Long id, Fazenda fazenda) {
        Fazenda alteraFazenda = repository.findById(id).get();
        alteraFazenda.setEstoqueIFa(alteraFazenda.getEstoqueIFa() - fazenda.getEstoqueIFa());
        return repository.save(alteraFazenda);
    }
}

