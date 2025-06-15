import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Util {
    public static <T extends Serializable> void salvarDados(List<T> lista, String nomeArquivo) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("data/" + nomeArquivo))) {
            oos.writeObject(lista);
            System.out.println("Dados salvos com sucesso em: " + "data/" + nomeArquivo);
        } catch (IOException e) {
            System.err.println("Erro ao salvar dados em " + nomeArquivo + ": " + e.getMessage());
            // e.printStackTrace(); // Para depuração
        }
    }

    @SuppressWarnings("unchecked")
    public static <T extends Serializable> List<T> carregarDados(String nomeArquivo) {
        File file = new File("data/" + nomeArquivo);
        if (!file.exists()) {
            System.out.println("Arquivo " + nomeArquivo + " não encontrado. Criando nova lista.");
            return new ArrayList<>();
        }

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
            List<T> lista = (List<T>) ois.readObject();
            System.out.println("Dados carregados com sucesso de: " + "data/" + nomeArquivo);
            return lista;
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Erro ao carregar dados de " + nomeArquivo + ": " + e.getMessage());
            // e.printStackTrace(); // Para depuração
            System.out.println("Retornando lista vazia devido ao erro.");
            return new ArrayList<>();
        }
    }
}