package com.devAgro.devAgro.service;

import com.devAgro.devAgro.Dto.NovoFuncionarioDto;
import com.devAgro.devAgro.model.Empresa;
import com.devAgro.devAgro.model.Funcionario;
import com.devAgro.devAgro.repository.FuncionarioRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FuncionarioService {

    private final FuncionarioRepository repository;

    public FuncionarioService(FuncionarioRepository repository) {
        this.repository = repository;
    }

    public Funcionario adicionarFuncionario(Funcionario funcionario) {
        return repository.save(funcionario);
    }

    public List<Funcionario> listaFuncionario() {
        return repository.findAll();
    }

    public Funcionario atualizaFuncionario(Long id, Funcionario funcionario) {
        Funcionario alteraFuncionario = repository.findById(id).get();
        alteraFuncionario.setNomeFu(funcionario.getNomeFu());
        alteraFuncionario.setSobrenomeFu(funcionario.getSobrenomeFu());
        alteraFuncionario.setCpfFu(funcionario.getCpfFu());
        alteraFuncionario.setEnderecoFu(funcionario.getEnderecoFu());
        alteraFuncionario.setFoneFu(funcionario.getFoneFu());
        alteraFuncionario.setSexoFu(funcionario.getSexoFu());
        alteraFuncionario.setNascimentoFu(funcionario.getNascimentoFu());
        alteraFuncionario.setEmpresa(funcionario.getEmpresa());
        return alteraFuncionario;
    }

    public void deletaFuncionario(Long id) {
        repository.deleteById(id);
    }

    public List<Funcionario> funcionario(Empresa empresa) {
        return repository.findAllByEmpresa(empresa);
    }

    public long quantosfuncionario(Empresa empresa) {
        return repository.countByEmpresa(empresa);
    }
}
