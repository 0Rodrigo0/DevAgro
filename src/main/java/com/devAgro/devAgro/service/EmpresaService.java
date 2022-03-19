package com.devAgro.devAgro.service;

import com.devAgro.devAgro.model.Empresa;
import com.devAgro.devAgro.model.Fazenda;
import com.devAgro.devAgro.repository.EmpresaRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class EmpresaService {

    private final EmpresaRepository repository;

    public EmpresaService(EmpresaRepository repository) {
        this.repository = repository;
    }

    public Empresa adicionarEmpresa(Empresa empresa) {
        return repository.save(empresa);
    }

    public List<Empresa> listaEmpresa(){
        return repository.findAll();
    }

    public Empresa atualizaEmpresa(Long id, Empresa empresa) {
        Empresa empresaAltera = repository.findById(id).get();
        empresaAltera.setNome(empresa.getNome());
        empresaAltera.setCnpj(empresa.getCnpj());
        empresaAltera.setEndereco(empresa.getEndereco());
        return repository.save(empresaAltera);
    }

    public void deletaEmpresa(Long id){
        repository.deleteById(id);
    }

}
