package com.devAgro.devAgro.controller;

import com.devAgro.devAgro.Dto.NovaEmpresaDto;
import com.devAgro.devAgro.model.Empresa;
import com.devAgro.devAgro.model.Fazenda;
import com.devAgro.devAgro.service.EmpresaService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/empresa")
public class EmpresaController {

    private EmpresaService service;

    public EmpresaController(EmpresaService service) {
        this.service = service;
    }

    //localhost:8080/empresa/
    @GetMapping
    public String empresa(){
        return "Empresa";
    }

    //localhost:8080/empresa/todas
    @GetMapping("/todas")
    public List<Empresa> listaEmpresa(){
        return service.listaEmpresa();
    }

    //localhost:8080/empresa/addEmpresa
    @PostMapping("/addEmpresa")
    public Empresa adicionarEmpresa(@RequestBody NovaEmpresaDto empresaDto){
        return service.adicionarEmpresa(empresaDto.converte());
    }

    //localhost:8080/empresa/<colocar aqui o id da empresa>
    @PutMapping("/{id}")
    public Empresa atualizaEmpresa(@PathVariable Long id, @RequestBody NovaEmpresaDto empresaDto){
        return service.atualizaEmpresa(id, empresaDto.converte());
    }

    //localhost:8080/empresa/<colocar aqui o id da empresa>
    @DeleteMapping("/{id}")
    public void deletaEmpresa(@PathVariable Long id){
        service.deletaEmpresa(id);
    }

}
