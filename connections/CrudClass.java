package connections;
import java.util.Scanner;



import java.lang.*;
public class CrudClass {

	public static void main(String[] args) {
		
      Scanner sc =new Scanner(System.in);
      int no;
      do {
    	  System.out.println("1.show data"+'\n'+"2.insert data"+'\n'+"3.delete data"+'\n'+"4.updata data"+'\n'+"5.exit");
        	 
      
    	 no =sc.nextInt();
    	 switch(no) {
    	 case 1:
    		 new connectio();
    	 case 2:
    		 new InsertData();
    	 case 3:
    		 new DeleteData();
    	 case 4:
    		 new UpdateData();
    	 default:
    		 break;
    	 }
    	
      }
      while(no>5);
	   System.out.println("you are exited");
	}

}
