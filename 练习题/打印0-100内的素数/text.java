public class text {
	public static void main(String[] args) {
		int i=0;
		int j=0;
		for(i=1;i<=100;i++)
		{
			for(j=2;j<=(int)Math.sqrt(i);j++){
				if(i%j==0){
					break;
				}
			}
			if(j>(int)Math.sqrt(i)){
				System.out.println(i+"是素数");
			}
		}
	}
}