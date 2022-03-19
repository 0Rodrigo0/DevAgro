package com.devAgro.devAgro.controller;

import com.devAgro.devAgro.Dto.NovoFuncionarioDto;
import com.devAgro.devAgro.model.Empresa;
import com.devAgro.devAgro.model.Funcionario;
import com.devAgro.devAgro.service.FuncionarioService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/funcionario")
public class FuncionarioCotroller {

    private FuncionarioService service;

    public FuncionarioCotroller(FuncionarioService service) {
        this.service = service;
    }

    //localhost:8080/funcionario/
    @GetMapping
    public String funcionario(){
        return "Funcionario";
    }

    //localhost:8080/funcionario/todos
    @GetMapping("/todos")
    public List<Funcionario> listaFuncionario(){
        return service.listaFuncionario();
    }

    //localhost:8080/funcionario/addFuncionario
    @PostMapping("/addFuncionario")
    public Funcionario adicionarFuncionario(@RequestBody NovoFuncionarioDto funcionarioDto){
        return service.adicionarFuncionario(funcionarioDto.converte());
    }

    //localhost:8080/funcionario/<colocar aqui o id do funcionario>
    @PutMapping("/{id}")
    public Funcionario atualizaFuncionario(@PathVariable Long id, @RequestBody NovoFuncionarioDto funcionarioDto){
        return service.atualizaFuncionario(id, funcionarioDto.converte());
    }

    //localhost:8080/funcionario/<colocar aqui o id do funcionario>
    @DeleteMapping("/{id}")
    public void deletaFuncionario(@PathVariable Long id){
        service.deletaFuncionario(id);
    }

    //localhost:8080/funcionario/todosFuncionariosEmpresa/<colocar aqui o id da empresa>
    @GetMapping("/todosFuncionariosEmpresa/{empresa}")
    public List<Funcionario> funcionario(@PathVariable Empresa empresa){
        return service.funcionario(empresa);
    }

    //localhost:8080/funcionario/quantosFuncionariosEmpresa/<colocar aqui o id da empresa>
    @GetMapping("/quantosFuncionariosEmpresa/{empresa}")
    public long quantosfuncionario(@PathVariable Empresa empresa){
        return service.quantosfuncionario(empresa);
    }
}
