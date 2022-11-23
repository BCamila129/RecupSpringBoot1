package com.example.ApplicationProgrammingInterface.funcionarios;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

    @Entity
    public class FuncionarioApi {

        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private Long id;
        private String nome;
        private String cpf;
        private Integer idade;

        public FuncionarioApi(){

        }
        public FuncionarioApi(String nome, String cpf, Integer idade) {
            this.nome = nome;
            this.cpf = cpf;
            this.idade = idade;
        }

        public Long getId() {

            return id;
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public String getCpf() {
            return cpf;
        }

        public void setCpf(String cpf) {
            this.cpf = cpf;
        }

        public Integer getIdade() {
            return idade;
        }

        public void setIdade(Integer idade) {
            this.idade = idade;
        }
    }

