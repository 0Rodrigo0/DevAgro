package com.devAgro.devAgro.controller;

import com.devAgro.devAgro.Dto.FazendaModDto;
import com.devAgro.devAgro.Dto.NovaFazendaDto;
import com.devAgro.devAgro.model.Empresa;
import com.devAgro.devAgro.model.Fazenda;
import com.devAgro.devAgro.service.FazendaService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/fazenda")
public class FazendaController {

    private FazendaService service;

    public FazendaController(FazendaService service) {
        this.service = service;
    }

    //localhost:8080/fazenda/
    @GetMapping
    public String fazenda(){
        return "Fazenda";
    }

    //localhost:8080/fazenda/todas
    @GetMapping("/todas")
    public List<Fazenda> listaFazenda(){
        return service.listaFazenda();
    }

    //localhost:8080/fazenda/addFazenda
    @PostMapping("/addFazenda")
    public Fazenda adicionarFazenda(@RequestBody NovaFazendaDto fazendaDto){
        return service.adicionarFazenda(fazendaDto.converte());
    }

    //localhost:8080/fazenda/<colocar aqui o id da fazenda>
    @PutMapping("/{id}")
    public Fazenda atualizaFazenda(@PathVariable Long id, @RequestBody NovaFazendaDto fazendaDto){
        return service.atualizaFazenda(id, fazendaDto.converte());
    }

    //localhost:8080/fazenda/<colocar aqui o id da fazenda>
    @DeleteMapping("/{id}")
    public void deletaFazenda(@PathVariable Long id){
        service.deletaFazenda(id);
    }

    //localhost:8080/fazenda/listaFazendaEmpresa/<colocar aqui o id da EMPRESA>
    @GetMapping("/listaFazendaEmpresa/{empresa}")
    public List<Fazenda> fazendasEmpresa(@PathVariable Empresa empresa ){
        return service.fazendasEmpresa(empresa);
    }

    //localhost:8080/fazenda/quantasFazendaEmpresa/<colocar aqui o id da EMPRESA>
    @GetMapping("/quantasFazendaEmpresa/{empresa}")
    public long quantasfazendasEmpresa(@PathVariable Empresa empresa){
        return service.quantasfazendasEmpresa(empresa);
    }

    //localhost:8080/fazenda/listaFazendaEmpresaMod/<colocar aqui o id da EMPRESA>
    @GetMapping("/listaFazendaEmpresaMod/{empresa}")
    public List<FazendaModDto> fazendasEmpresaMod(@PathVariable Empresa empresa){
        return service.fazendasEmpresaMod(empresa);
    }

    //localhost:8080/fazenda/aumentaEstoqueGrao/<colocar aqui o id da FAZENDA>
    //colocar no body "estoqueIFa" : "e aqui o valor da colheita"
    @PutMapping("/aumentaEstoqueGrao/{id}")
    public Fazenda aumentaGrao(@PathVariable Long id, @RequestBody NovaFazendaDto fazendaDto){
        return service.aumentaGrao(id, fazendaDto.converte());
    }

    //localhost:8080/fazenda/diminuiEstoqueGrao/<colocar aqui o id da FAZENDA>
    //colocar no body "estoqueIFa" : "e aqui o valor da retirada"
    @PutMapping("/diminuiEstoqueGrao/{id}")
    public Fazenda diminuiGrao(@PathVariable Long id, @RequestBody NovaFazendaDto fazendaDto){
        return service.diminuiGrao(id, fazendaDto.converte());
    }


}
