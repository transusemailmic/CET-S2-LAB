class Multi implements Runnable{
    int threadNum;
    Multi(int threadNum){
        this.threadNum=threadNum;
    }
    public void run(){
        for (int i=1;i<10;i++){
            System.out.println(i+" from thread "+threadNum);
            try{
                Thread.sleep(1000);
            }
            catch(InterruptedException e){

            }
        }
    }
}
public class Prog18 {
    public static void main(String args[]){
        Multi myThread1=new Multi(1);
        Multi myThread2=new Multi(2);
        Multi myThread3=new Multi(3);
        new Thread(myThread1).start();
        new Thread(myThread2).start();
        new Thread(myThread3).start();
    }
}
