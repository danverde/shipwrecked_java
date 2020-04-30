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
public class SignalFireView extends View {
    private String menu;
    
    public SignalFireView() {
        super ("\n"
                  + "\n----------------------------------" 
                  + "\n| Signal Fire"
                  + "\n----------------------------------"
                  + "\nA - Start Fire OR Add Wood"
                  + "\nS - Check Fire Status"
                  + "\nB - Board Ship"
                  + "\nX - Return to Game Menu"
                  + "\n----------------------------------");
}

 
    @Override
    public boolean doAction(String menuOption) {
        menuOption = menuOption.toUpperCase();
        switch (menuOption){
            case "A":
                this.startAddFire();
                break;
            case "S":
                this.fireStatus();
                break;
            case "B":
                this.boardShip();
                break;
            case "X":
                return true;
            default:
                ErrorView.display(this.getClass().getName(),"\n*** Recheck your keys & enter a valid letter ***");
                break;
        }
        return true;
    }

    private void startAddFire() {
        StartAddFireView startAddFire = new StartAddFireView();
        startAddFire.display();
    }

    private void fireStatus() {
        this.console.println("*** fireStatus function called***");
    }

    private void boardShip() {
        this.console.println("*** boardShip function called***");
    }

}