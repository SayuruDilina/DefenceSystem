/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package main;

/**
 *
 * @author HP
 */
public interface Observer {
    	public void updateArea(boolean status);
        //public void SendMainmessge(String message); 
       public void btnEnable(int Value);
       public void SendMessagePrivatelyFromMain(String MainSelected, boolean MainStatus, String privateMessage);  
        //public void setDetails( int spinnerValue );
        public int[] getDetails();
}
