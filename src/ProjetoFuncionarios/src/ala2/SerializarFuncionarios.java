package ala2;

import modelo.Funcionario; // IMP!
import java.io.*;
import java.util.*;

public class SerializarFuncionarios {
    public static void main(String[] args) {
        List<Funcionario> funcionarios = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(System.getProperty("user.dir") + "/src/funcionarios/funcionarios.txt"))) {
            String linha;
            while ((linha = reader.readLine()) != null) {
                String[] campos = linha.split("#");
                funcionarios.add(new Funcionario(campos[0], campos[1].charAt(0), 
                                                 Double.parseDouble(campos[2]), 
                                                 Integer.parseInt(campos[3])));
            }
        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
        }

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(System.getProperty("user.dir") + "/src/funcionarios/funcionarios.dat"))) {
            oos.writeObject(funcionarios);
            System.out.println("Funcionários foram serializados com sucesso!");
        } catch (IOException e) {
            System.out.println("Erro ao serializar: " + e.getMessage());
        }
    }
}