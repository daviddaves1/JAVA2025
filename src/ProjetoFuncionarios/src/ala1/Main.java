package ala1;

import modelo.Funcionario; // IMPORTANTE!
import ala2.SerializarFuncionarios;
import ala2.DesserializarFuncionarios;
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Funcionario> funcionarios = new ArrayList<>();
        double totalImpostoFeminino = 0, totalImpostoMasculino = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader(System.getProperty("user.dir") + "/src/funcionarios/funcionarios.txt"))) {
            String linha;
            while ((linha = reader.readLine()) != null) {
                String[] campos = linha.split("#");
                Funcionario func = new Funcionario(campos[0], campos[1].charAt(0), 
                                                   Double.parseDouble(campos[2]), 
                                                   Integer.parseInt(campos[3]));
                funcionarios.add(func);
                System.out.println(func.mostraFuncionario());

                if (func.getSexo() == 'F') totalImpostoFeminino += func.impostoRenda();
                else totalImpostoMasculino += func.impostoRenda();
            }
        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
        }

        System.out.println("\nTotal de imposto pago por funcionários do sexo feminino: " + totalImpostoFeminino);
        System.out.println("Total de imposto pago por funcionários do sexo masculino: " + totalImpostoMasculino);
        System.out.println("Total de imposto pago por todos os funcionários: " + (totalImpostoFeminino + totalImpostoMasculino));
    }
}