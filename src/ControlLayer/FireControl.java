
package ControlLayer;

import Exceptions.FireControlException;

/**
 *
 * @author Daniel
 */
public class FireControl {

    public static float calculateBurnTime(int woodAmount) throws FireControlException{
        float burnTime = 0;
        if (woodAmount > 0){
            burnTime = (float)(woodAmount * 3.0 / 2.0);
        } else{
            throw new FireControlException("You can't burn nothing silly! "
                    + "\nWood amount must be greater than 0.");
        }
        if (burnTime <= 0){
            throw new FireControlException ("Something went wrong. The fire just won't start."
                    + "\nBurn time was less than or eual to 0");
        }
        return burnTime;
    }
}
