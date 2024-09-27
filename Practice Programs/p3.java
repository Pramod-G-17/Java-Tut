class pamu{
	public static void main(String[]args){
		int weeks=3;
		int days=7;
		for(int i=1;i<=weeks;i++){
			System.out.println("week"+i);
			for(int j=1;j<=days;j++){
				if(i%2==1){
					break;
				}
				System.out.print("day"+j);
			}
			System.out.println();
		}
	}
}
=>
week1

week2
day1day2day3day4day5day6day7
week3