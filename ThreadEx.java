package threadprogram;

public class ThreadEx implements Runnable {

	public static void main(String[] args) throws InterruptedException {
		ThreadEx ob1 = new ThreadEx();
		ThreadEx ob2=new ThreadEx();
		Thread t1=new Thread(ob1);
		Thread t2=new Thread(ob2);
		t2.setPriority(Thread.MAX_PRIORITY);
		t1.setName("T1");
		t2.setName("T2");
		t1.start();
		t2.start();
	}
       void call()
       {
    	   for(int i=0;i<10;i++) {
    		   System.out.print(i+",");
    	   }
       }
	@Override
	public void run() {
		call();
	}
	

}