/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package josephofegypt;

import byui.cit260.josephOfEgypt.model.Player;

/**
 *
 * @author User
 */
public class JosephOfEgypt {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Player playerOne = new Player();
        
        
        playerOne.setName("Ruben");
        playerOne.setBestHarvest(100000);
       
        String playerInfo = playerOne.toString();
        System.out.println(playerInfo);
        
    }
    
}
