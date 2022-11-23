package com.example.ApplicationProgrammingInterface.controller;


import com.example.ApplicationProgrammingInterface.funcionarios.FuncionarioApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/funcionario-api/v1/")

public class Controller {

    @Autowired
    private Repository repository;

    @PostMapping
    @ResponseBody
    public FuncionarioApi create(@ResponseBody FuncionarioApi funcionarioApi){
        FuncionarioApi funcionarioSave = repository.save(funcionarioApi);
        return funcionarioSave;
    }
    @GetMapping("{id}")
    public

}
