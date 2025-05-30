package modelo;

import java.io.Serializable;

public class Funcionario implements Serializable {
    private static final long serialVersionUID = 1L;

    private String nome;
    private char sexo;
    private double salario;
    private int dependentes;

    public Funcionario(String nome, char sexo, double salario, int dependentes) {
        this.nome = nome;
        this.sexo = sexo;
        this.salario = salario;
        this.dependentes = dependentes;
    }

    public String getNome() {
        return nome;
    }

    public char getSexo() {
        return sexo;
    }

    public double getSalario() {
        return salario;
    }

    public int getDependentes() {
        return dependentes;
    }

    public double impostoRenda() {
        double reducaoDep = 189.59 * dependentes;
        if (salario <= 1903.98)
            return 0;
        else if (salario <= 2826.65)
            return (salario * 7.5 / 100 - 142.80) - reducaoDep;
        else if (salario <= 3751.05)
            return (salario * 15 / 100 - 354.80) - reducaoDep;
        else if (salario <= 4664.68)
            return (salario * 22.5 / 100 - 636.13) - reducaoDep;
        else
            return ((salario * 27.5 / 100) - 869.36) - reducaoDep;
    }

    public String mostraFuncionario() {
        return getNome() + " " + getSexo() + " " + getSalario() + " " + getDependentes() + " " + impostoRenda();
    }
}