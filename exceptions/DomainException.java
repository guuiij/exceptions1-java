package model.exceptions;

// DomainException é uma classe que vai ser uma exceção lançada
// por algum erro na entidade de dominio que é  a " Reservation"
public class DomainException extends Exception {
    // Pode ser extends Exception == o compilador obriga você a tratar - Try-catch();
    // Pode ser extends RuntimeException == Tipo de exceção que o compilador não obriga a tratar
    private static final long seriaLversionUID = 1L;

    public DomainException(String msg) { // craido para instanciar exceção personalizada passando uma mensagem
        super(msg);
    }
}


