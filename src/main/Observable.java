/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import java.util.ArrayList;

/**
 *
 * @author HP
 */
public class Observable {
    private boolean status;
  //  private String message;
    private int Value;
    private String PMessage;
    private boolean MainStatus;
    private String MainSelected;
        private  int spinnerValue;
    
    
	private ArrayList<Observer>observerList=new ArrayList<>();
	
	public void addWaterLevelObserver(Observer ob){
		observerList.add(ob);
	}	
	
	public void setArea(boolean status){
		if(this.status!=status){
			this.status=status;
			notifyArea();
		}
	}
      /*  public void  SetMainmessge(String message,boolean MainStatus){
		if(this.message!=message){
			this.message=message;
			notifyObject();
		}
	}*/
         public void  SetBtnEnable(int Value){
		if(this.Value!=Value){
			this.Value=Value;
			notifyBtnEnable();
		}
	}
         /*public void setDetails( int spinnerValue ){
         if(this. spinnerValue!= spinnerValue){
			this.spinnerValue=spinnerValue;
			notifyObject();
		}
         
         }*/
         public void  SetPrivateMessage (String PMessage,boolean MainStatus,String MainSelected){
		if(this.PMessage!=PMessage){
			this.PMessage=PMessage;
                        this.MainStatus=MainStatus;
                        this.MainSelected=MainSelected;
			notifyMsg();
		}
	}
        public int[] setDetails(String item){
            if(item=="Helicopter"){
                return observerList.get(0).getDetails();
            }
            if(item=="Submarine"){
                return observerList.get(1).getDetails();
            }
             if(item=="Tank"){
                return observerList.get(2).getDetails();
            }
            return null;
        
        }
	public void notifyArea(){
		for(Observer ob : observerList){
			ob.updateArea(status);
                      // ob.SendMainmessge(message);
                       }
                
	}
        public void notifyBtnEnable(){
		for(Observer ob : observerList){
			
                      // ob.SendMainmessge(message);
                        ob.btnEnable(Value);
                        //ob.SendMessagePrivatelyFromMain(MainSelected,MainStatus,PMessage);
		}
                
	}
        public void notifyMsg(){
		for(Observer ob : observerList){
			
                        ob.SendMessagePrivatelyFromMain(MainSelected,MainStatus,PMessage);
		}
                
	}

    

   
}
