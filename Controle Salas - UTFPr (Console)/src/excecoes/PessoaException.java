/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package excecoes;

/**
 *
 * @author giovanna
 */
public class PessoaException extends Exception {

    public PessoaException() {
        super();
    }

    public PessoaException(String message) {
        super(message);
    }

    public PessoaException(String message, Throwable cause) {
        super(message, cause);
    }

    public PessoaException(Throwable cause) {
        super(cause);
    }       
    
}
