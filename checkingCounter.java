class checkingCounter implements Runnable{
  private int id;
  private String name;
  public checkingCounter(int i){
    id =i;
    new Thread(this).start();
  }
  public int getId(){
    return id;
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
          s.assign();
        }
        catch(InterruptedException e)
        {
          e.printStackTrace();
        }
      }
}