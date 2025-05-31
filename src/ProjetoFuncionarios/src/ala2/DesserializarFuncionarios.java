package ala2;

import modelo.Funcionario; // IMPORTANTE!
import java.io.*;
import java.util.*;

public class DesserializarFuncionarios {
    public static void main(String[] args) {
        List<Funcionario> funcionarios = new ArrayList<>();
        double totalImpostoFeminino = 0, totalImpostoMasculino = 0;

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("src/funcionarios/funcionarios.dat"))) {
            funcionarios = (List<Funcionario>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Erro ao desserializar: " + e.getMessage());
        }

        for (Funcionario func : funcionarios) {
            System.out.println(func.mostraFuncionario());
            if (func.getSexo() == 'F') totalImpostoFeminino += func.impostoRenda();
            else totalImpostoMasculino += func.impostoRenda();
        }

        System.out.println("\nTotal de imposto pago por funcionários do sexo feminino: " + totalImpostoFeminino);
        System.out.println("Total de imposto pago por funcionários do sexo masculino: " + totalImpostoMasculino);
        System.out.println("Total de imposto pago por todos os funcionários: " + (totalImpostoFeminino + totalImpostoMasculino));
    }
}