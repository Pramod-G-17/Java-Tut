// A b C d

class pamu{
	public static void main(String[]args){
		char ch='A';
		char ch1='a';
		for(int a=1;a<=4;a++){
			if(ch%2==1){
				System.out.print(ch+" ");
			}else{
				System.out.print(ch1+" ");
			}
			ch++;
			ch1++;
		}
	}
}
O/P:-
A b C d