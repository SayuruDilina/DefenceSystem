/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

/**
 *
 * @author HP
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        	Observable observable=new Observable();

//             MainController maincontrol = new MainController(observable);
//            observable.addWaterLevelObserver(new Helicopter(maincontrol));

//                 Helicopter helicopter=new Helicopter();
//                  observable.addWaterLevelObserver(helicopter);
//                   helicopter.setVisible(true);
        MainController mainController = new MainController(observable);
       Helicopter helicopter = new Helicopter(mainController);
               observable.addObserver(helicopter);
                        
                
                helicopter.setVisible(true);
       
               Submarine   submarine  = new  Submarine (mainController);
               observable.addObserver( submarine );
                        
                
//                helicopter.setVisible(true);
//             Submarine  submarine=new  Submarine(); 
//                  observable.addWaterLevelObserver(submarine);
                    submarine.setVisible(true);
                 
                      Tank  tank  = new  Tank (mainController);
               observable.addObserver(tank);
               
//                 Tank  tank=new  Tank(); 
//               observable.addWaterLevelObserver(tank);
                   tank.setVisible(true);
                    
                new MainController(observable).setVisible(true);
    }
    
}
