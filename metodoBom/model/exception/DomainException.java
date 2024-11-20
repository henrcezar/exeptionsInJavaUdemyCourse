package excecoes.metodoBom.model.exception;

public class DomainException extends RuntimeException {

    private static final long seralVersionUID = 1L;

    public DomainException(String msg){
        super(msg);
    }
}
