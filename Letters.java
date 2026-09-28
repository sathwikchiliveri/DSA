import java.util.*;
public class Letters
{
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n=sc.nextInt();
	for(int i=0;i<n;i++){
	    for(int j=0;j<n;j++){
	        if((i==0||j==0||j==n-1||i==n/2)&&(i+j>0)&&(i-j)>-4){
	        System.out.print("*");
	        }
	        else{
	        System.out.print(" ");
	        }
	    }
	    System.out.print(" ");
	    for(int j=0;j<n;j++){
	        if((i==0||j==0||j==n-1||i==n/2||i==n-1)&&(i-j>-4)&&(i+j)<8){
	        System.out.print("*");
	        }
	        else{
	        System.out.print(" ");
	        }
	    }
	    System.out.print(" ");
	    for(int j=0;j<n;j++){
	        if((i==0||j==0||i==n-1)&&!(j==0&&(i==0||i==n-1))){
	        System.out.print("*");
	        }
	        else{
	        System.out.print(" ");
	        }
	    }
	    System.out.print(" ");
	    for(int j=0;j<n;j++){
	        if((i==0||j==0||i==n-1||j==n-1)&&(i-j>-4)&&(i+j)<8){
	        System.out.print("*");
	        }
	        else{
	        System.out.print(" ");
	        }
	    }
	    System.out.print(" ");
	    for(int j=0;j<n;j++){
	        if((i==0||j==0||i==n-1||i==n/2)){
	        System.out.print("*");
	        }
	        else{
	        System.out.print(" ");
	        }
	    }
	    System.out.print(" ");
	    for(int j=0;j<n;j++){
	        if((i==0||j==0||i==n/2)){
	        System.out.print("*");
	        }
	        else{
	        System.out.print(" ");
	        }
	    }
	    System.out.print(" ");
	    for(int j=0;j<n;j++){
	        if((i==0||j==0||i==n-1||j==n/2||i==n/2||j==n-1)&&(i+j<6)){
	        System.out.print("*");
	        }
	        else{
	        System.out.print(" ");
	        }
	    }
	    System.out.print(" ");
	    for(int j=0;j<n;j++){
	        if((j==0||i==n/2||j==n-1)){
	        System.out.print("*");
	        }
	        else{
	        System.out.print(" ");
	        }
	    }
	    System.out.print(" ");
	    for(int j=0;j<n;j++){
	        if((i==0||j==n/2||i==n-1)){
	        System.out.print("*");
	        }
	        else{
	        System.out.print(" ");
	        }
	    }
	     System.out.print(" ");
	    for(int j=0;j<n;j++){
	        if((i==0||j==n/2||i==n-1)&&(i+j<6)){
	        System.out.print("*");
	        }
	        else{
	        System.out.print(" ");
	        }
	    }
	     System.out.print(" ");
	    for(int j=0;j<n;j++){
	        if((j==0)||(i+j==3)||(i-j==1)){
	        System.out.print("*");
	        }
	        else{
	        System.out.print(" ");
	        }
	    }
	    System.out.print(" ");
	    for(int j=0;j<n;j++){
	        if((j==0)||(i==n-1)){
	        System.out.print("*");
	        }
	        else{
	        System.out.print(" ");
	        }
	    }
	    System.out.print(" ");
	    for(int j=0;j<n;j++){
	        if((j==0)||(j==n-1)||(i+j==3)&&(i==n/4)){
	        System.out.print("*");
	        }
	        else{
	        System.out.print(" ");
	        }
	    }
	    System.out.print(" ");
	    for(int j=0;j<n;j++){
	        if((j==0)||(j==n-1)||(i-j==0)){
	        System.out.print("*");
	        }
	        else{
	        System.out.print(" ");
	        }
	    }
	    System.out.print(" ");
	    for(int j=0;j<n;j++){
	        if((j==0||j==n-1||i==0||i==n-1)&&(i+j>0)&&(i-j>-4)&&(i-j<4)&&(i+j<8)){
	        System.out.print("*");
	        }
	        else{
	        System.out.print(" ");
	        }
	    }
	    System.out.print(" ");
	    for(int j=0;j<n;j++){
	        if((j==0||i==n/2||i==0||j==n-1)&&(i-j>-4)&&(i+j)<6){
	        System.out.print("*");
	        }
	        else{
	        System.out.print(" ");
	        }
	    }
	    System.out.print(" ");
	    for(int j=0;j<n;j++){
	        if((j==0||j==n-1||i==0||i==n/2||i==n-1&&i+j>0&&i-j>-4)){
	        System.out.print("*");
	        }
	        else{
	        System.out.print(" ");
	        }
	    }
	    System.out.print(" ");
	    //r
	    for(int j=0;j<n;j++){
	        if(i==0||j==0||i==n-1||i==n/2&&(i+j>0)&&(i-j<6)&&(i-j>-1)){
	        System.out.print("*");
	        }
	        else{
	        System.out.print(" ");
	        }
	    }
	    //s
	    System.out.print(" ");
	    for(int j=0;j<n;j++){
	        if((j==0||i==0||i==n/2||j==n-1||i==n-1)&&((i-j>-4)&&(i+j<8))){
	        System.out.print("*");
	        }
	        else{
	        System.out.print(" ");
	        }
	    }
		//T
		System.out.print(" ");
	    for(int j=0;j<n;j++){
	        if((j==n/2||i==0)){
	        System.out.print("*");
	        }
	        else{
	        System.out.print(" ");
	        }
	    }
		
	    System.out.println(" ");
	}
	}
}