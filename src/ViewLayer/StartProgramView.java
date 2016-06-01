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
public class StartProgramView {

    private String promptMessage;
    
    public StartProgramView() {
    //prompt user for name
    //call display banner function
    
    this.promptMessage = "\nPlease enter your name: ";
    this.displayBanner();
    }

    private void displayBanner() {
        System.out.println(
        "hello!!! hopefully this works..."
        );
    }

    public void DisplayStartProgramView() {
        System.out.println("\n *** displayStartProgramView works ***\n");
    }
    
}
