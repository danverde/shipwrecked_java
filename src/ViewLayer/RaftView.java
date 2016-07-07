/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ViewLayer;

import ControlLayer.FloatingConrtol;
import Exceptions.FloatControlException;

/**
 *
 * @author Jack
 */
public class RaftView extends View{
    
    public RaftView(){
        super ("How many Logs do you have?");
        }
    @Override 
    public boolean doAction(String logAmountN){
        try{ 
            
            int logAmount = Integer.parseInt(logAmountN);
            
            boolean raftSuccess = FloatingConrtol.verifyBouyency(100, logAmount);
            this.console.println(raftSuccess);
            return true; 
        }
        catch (FloatControlException fce){
            this.console.println(fce.getMessage());
            return false;
        }
        catch (NumberFormatException nfm){
            this.console.println(nfm.getMessage());
            return false;
        }
    
    }
    
    
}
