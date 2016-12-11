package hw;
import java.util.Random;
import java.util.Scanner;
public class hw02 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		Random rnd=new Random();
		int s=0;
		int data[] = new int [5];
		for(int i = 1 ; i < data.length ; i++){
		data[i] = scn.nextInt();
		
		}
		if(data[1]==data[2]||data[2]==data[3]||data[3]==data[4]||data[4]==data[1]||
		   data[2]==data[4]||data[1]==data[3]){
			while(true){ 
		 if(data[1]==data[2]&&data[3]==data[4]&&data[2]==data[3]&&data[1]==data[4]){
				while(true){
				System.out.print("通殺!");
				break;
				
				}
				break;
			}else if(data[1]==data[2]){
				
				s=data[3]+data[4];
				break;
			}else if(data[1]==data[3]){
				
				s=data[2]+data[4];
				break;
			}else if(data[1]==data[4]){
				
				s=data[2]+data[3];
				break;
			}else if(data[2]==data[3]){
				
				s=data[1]+data[4];
				break;
			}else if(data[2]==data[4]){
				
				s=data[1]+data[3];
				break;
			}else if(data[3]==data[4]){
				
				s=data[1]+data[2];
				break;
			}
			}
		
		 System.out.print(s);
		 
			}else{
				System.out.print("無意義!");
			}
			
				
				
				
				
				
			/*	if(data[1]==data[2]&&data[2]==data[3]){
				
			}else if(data[1]==data[2]&&data[2]==data[4]){
				
			}else if(data[1]==data[3]&&data[3]==data[4]){
			
			}else if(data[2]==data[3]&&data[3]==data[4]){
				
				
			}else{
				
			}*/
			
				
			
		}
		
		
		
	
}

