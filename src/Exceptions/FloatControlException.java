/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exceptions;

/**
 *
 * @author Jack
 */
public class FloatControlException extends Exception {
    
    public FloatControlException() {
    }
     public FloatControlException(String message) {
        super(message);
    }
     public FloatControlException(String message, Throwable cause) {
        super(message, cause);
    }
     public FloatControlException(Throwable cause) {
        super(cause);
    }
     public FloatControlException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    
}
