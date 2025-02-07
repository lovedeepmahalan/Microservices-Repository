package Searching;
class MyThread extends Thread{
	@Override
	public void run(){
		for (int i=1;i<=10000 ;i++ ){
		System.out.println("I am lazy thread : "+i);
		}
		System.out.println("I am entering into sleeping state");
		try
		{
		Thread.sleep(2000);
		}
		catch (InterruptedException ie){
		ie.printStackTrace();
		}
	}
}
public class test {
	public static void main(String[] args)throws InterruptedException {
		MyThread t=new MyThread();
		t.start();
		t.interrupt();//line-n1
		System.out.println("main thread");
	}
}