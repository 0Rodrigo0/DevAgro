package com.devAgro.devAgro.controller;

import com.devAgro.devAgro.Dto.GraoEmpresaModDto;
import com.devAgro.devAgro.Dto.NovoGraoDto;
import com.devAgro.devAgro.model.Empresa;
import com.devAgro.devAgro.model.Grao;
import com.devAgro.devAgro.service.GraoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/grao")
public class GraoController {

    private GraoService service;

    public GraoController(GraoService service) {
        this.service = service;
    }

    //localhost:8080/grao/
    @GetMapping
    public String grao(){
        return "Grao";
    }

    //localhost:8080/grao/todas
    @GetMapping("/todas")
    public List<Grao> listaGrao(){
        return service.listaGrao();
    }

    //localhost:8080/grao/addGrao
    @PostMapping("/addGrao")
    public Grao adicionarGrao(@RequestBody NovoGraoDto graoDto){
        return service.adicionarGrao(graoDto.converte());
    }

    //localhost:8080/grao/<colocar aqui o id do grao>
    @PutMapping("/{id}")
    public Grao atualizaEmpresa(@PathVariable Long id, @RequestBody NovoGraoDto graoDto){
        return service.atualizaGrao(id, graoDto.converte());
    }

    //localhost:8080/grao/<colocar aqui o id do grao>
    @DeleteMapping("/{id}")
    public void deletaGrao(@PathVariable Long id){
        service.deletaGrao(id);
    }

    //localhost:8080/grao/listaGraoEmpresa/<colocar aqui o id da empresa>
    @GetMapping("/listaGraoEmpresa/{empresa}")
    public List<Grao> listaGraoEmpresa(@PathVariable Empresa empresa){
        return service.listaGraoEmpresa(empresa);
    }

    //localhost:8080/grao/graoEmpresaModDto/<colocar aqui o id da empresa>
    @GetMapping("/graoEmpresaModDto/{empresa}")
    public List<GraoEmpresaModDto> graoEmpresaModDto(@PathVariable Empresa empresa){
        return service.graoEmpresaModDto(empresa);
    }
}
