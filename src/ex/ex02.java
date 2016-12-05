package ex;
/*
 * Topic: 輸入所使用的度數，換算夏月及非夏月之電費金額。

 * Date: 2016/12/05
 * Author: 105021059  王俊鑌
 */
import java.util.Scanner;
public class ex02 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n =scn.nextInt();
		
		if(n<120){
		
			System.out.println( n*2.10);
		System.out.println( n*2.10);
		}else if(n>=121&&n<=330){
			System.out.println( (n-120)*3.02+120*2.10);
			System.out.println( (n-120)*2.68+120*2.10);
					
		
			
		}else if(n>=331&&n<=500){
			System.out.println( (n-330)*4.39+210*3.02+120*2.10);
			System.out.println( (n-330)*3.61+210*2.68+120*2.10);
			
		}else if(n>=501&&n<=700){
			System.out.println( (n-500)*4.97+170*4.39+210*3.02+120*2.10);
			System.out.println( (n-500)*4.01+170*3.61+210*2.68+120*2.10);
			
		}else if(n>=701){
			System.out.println( (n-700)*5.63+200*4.97+170*4.39+210*3.02+120*2.10);
			System.out.println( (n-700)*4.50+200*4.01+170*3.61+210*2.68+120*2.10);
			
		}
		
				
		
		

	}

}
