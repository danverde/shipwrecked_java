/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ViewLayer;

/**
 *
 * @author Jack
 */
public class CollectResourceView extends View {

        
    public CollectResourceView() {
              super("\n"
                  + "\n----------------------------------" 
                  + "\n| Collect Resource Menu"
                  + "\n----------------------------------"
                  + "\nF – Fruit"
                  + "\nW – Wood"
                  + "\nV – Vines"
                  + "\nC- Continue On"
                  + "\n----------------------------------");
}
    
    @Override
    public boolean doAction(String addIteam) {
        addIteam = addIteam.toUpperCase();
        switch (addIteam){
            case "F": 
                this.addTime();
                this.checkInventory("F");
                this.addIteam();
                break;
            case "W":
                this.addTime();
                this.checkInventory("W");
                this.addIteam();
                break;
            case "V":
                this.addTime();
                this.checkInventory("V");
                this.addIteam();
                break;
            default:
                System.out.println("Please Enter a valid Entry");
                break;
                
        }
        return true;
    }

    private void addTime() {
    System.out.println("\n*** addTime function called ***");
    }

    private void checkInventory() {
        System.out.println("\n*** checkInventory function called ***");
    }

    private void addIteam() {
        System.out.println("\n*** addIteam function called ***");
    }

    private void checkInventory(String f) {
        System.out.println("\n*** checkInventory function called for fruit***");
    }
    
}
