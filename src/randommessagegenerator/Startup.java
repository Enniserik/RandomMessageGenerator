/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package randommessagegenerator;

/**
 *
 * @author Erik
 */
public class Startup {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        MessageGenerator rmg = new RandomMessageGenerator();
        
        rmg.addMessage("Red");
        rmg.addMessage("Blue");
        rmg.addMessage("Green");
        rmg.addMessage("Yellow");
        rmg.addMessage("Red");
        
        System.out.println(rmg.toString());
        
        rmg.removeMessage("Blue");
        
        System.out.println(rmg.toString());
        
    }
    
}
