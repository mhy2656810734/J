import java.util.Scanner;
public class text {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int i=0;
		int flag=0;
		// for(i=2;i<n;i++){
		// 	if(n%i==0){
		// 		System.out.println(n+"不是素数");
		// 		flag=1;
		// 		break;
		// 	}
		// }
		// if(flag==0)
		// {
		// 	System.out.println(n+"是素数");
		// }
// 		for(i=2;i<=n/2;i++){
// 			if(n%i==0){
// 				System.out.println(n+"不是素数");
// 				flag=1;
// 				break;
// 	}
// }
// 	if(flag==0)
// 		{
// 			System.out.println(n+"是素数");
// 		}
		for(i=2;i<=(int)Math.sqrt(n);i++){
			if(n%i==0){
				System.out.println(n+"不是素数");
				flag=1;
				break;
	}
}
	if(flag==0)
		{
			System.out.println(n+"是素数");
		}
 }   
}
