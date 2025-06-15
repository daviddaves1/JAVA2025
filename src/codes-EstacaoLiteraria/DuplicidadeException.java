import java.io.Serializable;

public class DuplicidadeException extends RuntimeException implements Serializable {
    private static final long serialVersionUID = 1L; // Necessário para serialização

    public DuplicidadeException(String message) {
        super(message);
    }
}