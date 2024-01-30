import java.util.Scanner;
public class element5{
	public static void main(String[] arg){
		Scanner s=new Scanner(System.in);
		int [] a=new int[4];
		a[0]=9;
		a[1]=8;
		a[2]=5;
		a[3]=4;
	 	int b=4;
		for (int i=0; i<a.length; i++){
			if(a[i]==b){
				System.out.println("There is such a number. Found in the" +" "  + (i+1)+"th"+  " "+ "element.");
				break;
			}
		}
		
			
	}
}