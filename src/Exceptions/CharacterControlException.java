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
public class CharacterControlException extends Exception{

    public CharacterControlException() {
    }

    public CharacterControlException(String message) {
        super(message);
    }

    public CharacterControlException(String message, Throwable cause) {
        super(message, cause);
    }

    public CharacterControlException(Throwable cause) {
        super(cause);
    }

    public CharacterControlException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    
}
