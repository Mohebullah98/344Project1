class FlightAttendant implements Runnable{//Flight attendant thread
  private String name;
  private int id;

  public FlightAttendant(int i){
    id=i;
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
   public void run() {
        try{
          s.notifyBoarding();
          s.exiting();
        }
        catch(InterruptedException e)
        {
          e.printStackTrace();
        }
      }
}