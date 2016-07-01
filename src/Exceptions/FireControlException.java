/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exceptions;

/**
 *
 * @author Daniel
 */
public class FireControlException extends Exception{

    public FireControlException() {
    }

    public FireControlException(String message) {
        super(message);
    }

    public FireControlException(String message, Throwable cause) {
        super(message, cause);
    }

    public FireControlException(Throwable cause) {
        super(cause);
    }

    public FireControlException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    
}
