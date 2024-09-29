class pamu{
	public static void main(String[]args){
		int a=1;
		for(int i=1;i<=4;i++){
			for(int j=1;j<=4;j++){
				if(j<=i){
				System.out.print(a*a+" ");
				a++;
				}else{
					System.out.print("  ");
				}
			}
		System.out.println();
		}
	}
}
=>
1
4 9
16 25 36
49 64 81 100