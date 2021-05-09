import java.util.*;
class Passengers implements Runnable{//passenger thread
  private int id;
  private String name;
public Passengers(int id){
  this.id=id;
  new Thread(this).start();
}
 public void setName(String n){
    name=n;
  }
  public String getName(){
    return name;
  }
  public static long time = System.currentTimeMillis();
 public void msg(String m) {
 System.out.println("["+(System.currentTimeMillis()-time)+"] "+getName()+": "+m);
 }
simulation s = new simulation();
  public void run(){
    //passengers keep coming until plane is booked
     try
           { 
           s.arrive(); 
           s.waitForboarding();
           s.Boarding();
           s.exit();
           
           } 
           catch(InterruptedException e) 
           { 
            e.printStackTrace(); 
           } 
    }
}