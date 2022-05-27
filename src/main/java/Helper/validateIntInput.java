/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Helper;

/**
 *
 * @author MyPC
 */
public class validateIntInput {
    public static void ValidateInputInt(String num, String msg ,StringBuilder sbError){
        try {
            Integer.parseInt(num);
        } catch (Exception e) {
            sbError.append("\n" + msg);
        }
    }
}
