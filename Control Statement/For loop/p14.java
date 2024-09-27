import java.util.*;
class pamu{
	public static void main(String[]args){
        Scanner sc = new Scanner (System.in);
	System.out.print("enter the number for table ");
	int c= sc.nextInt();
		int a;
		int b;
		for(a=1;a<=10;a++){
			b=c*a;
			System.out.println(b);
		}
	}
}