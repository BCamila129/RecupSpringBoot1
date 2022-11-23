package com.example.ApplicationProgrammingInterface.funcionarios;

import javax.persistence.*;
import java.util.List;

@Entity
public class Salario {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Double salario;
    private Integer mesesTrabalhadosNoAno;
    private Double bonusPorIdade;
    private Double decimoTerceiro;
    private Double salarioTotal;
    private List<FuncionarioApi> funcionarios;


    public Salario(){

    }
    public Salario(Double salario, Integer mesesTrabalhadosNoAno, Double bonusPorIdade, Double decimoTerceiro, Double salarioTotal) {
        this.salario = salario;
        this.mesesTrabalhadosNoAno = mesesTrabalhadosNoAno;
        this.bonusPorIdade = bonusPorIdade;
        this.decimoTerceiro = decimoTerceiro;
        this.salarioTotal = salarioTotal;
    }
    public Long getId() {

        return id;
    }
    public Double getSalario() {

        return salario;
    }
    public void setSalario(Double salario) {
        this.salario = salario;
    }
    public Integer getMesesTrabalhadosNoAno() {

        return mesesTrabalhadosNoAno;
    }
    public void setMesesTrabalhadosNoAno(Integer mesesTrabalhadosNoAno) {
        this.mesesTrabalhadosNoAno = mesesTrabalhadosNoAno;
    }
    public Double getBonusPorIdade() {

        return bonusPorIdade;
    }
    public void setBonusPorIdade(Double bonusPorIdade) {

        this.bonusPorIdade = bonusPorIdade;
    }
    public Double getDecimoTerceiro() {

        return decimoTerceiro;
    }
    public void setDecimoTerceiro(Double decimoTerceiro) {

        this.decimoTerceiro = decimoTerceiro;
    }
    public Double getSalarioTotal() {

        return salarioTotal;
    }
    public void setSalarioTotal(Double salarioTotal) {

        this.salarioTotal = salarioTotal;
    }

}
