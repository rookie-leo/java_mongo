package com.course.mongodb.entities;

import org.springframework.data.mongodb.core.mapping.Field;

public class Profissao {

    private String nome;

    private Double salario;

    @Field(name = "esta_empregado")
    private boolean estaEmpregado;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public boolean isEstaEmpregado() {
        return estaEmpregado;
    }

    public void setEstaEmpregado(boolean estaEmpregado) {
        this.estaEmpregado = estaEmpregado;
    }
}
