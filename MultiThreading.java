/*

JAVA MULTI THREADING

*/
import java.util.*;
class two implements Runnable{
    public void run(){
        //second task
        for(int j=0;j<5;j++){
            System.out.println("second : "+j);
        }
    }
}
class Main
{
	public static void main(String[] args) {
	    //first task
	    two t =new two();
        Thread th=new Thread(t);
    
        th.start();
		for(int i=0;i<5;i++){
		    System.out.println("first : "+i);
		}
	}
}
