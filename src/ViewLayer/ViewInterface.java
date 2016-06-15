/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ViewLayer;

/**
 *
 * @author Daniel
 */
public interface ViewInterface {
    
    public void display();
    public String getInput();
    public boolean doAction(String value);
}
