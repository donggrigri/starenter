package example;

import java.util.Scanner;


public class yemwq {
public static void main(String[] args) {
	int number;
	while(true){
	Scanner sc=new Scanner(System.in);
	System.out.println("숫자를입력하세요");
	number=sc.nextInt();
		if(number%2==1) {
		break;
		}
		else {
		System.out.println("홀수를입력해주세요");
		}
	}
	for(int i=1; i<=number/2+1;i++) {
		for(int j=number/2+1; j-i>0; j--) {
			System.out.print(" ");
		}
		for(int k=2*i-1;k>0; k--) {
			System.out.print("*");
		}
		System.out.println();
	}
	for(int i=1; i<=number/2; i++) {
		for(int j=i; j>0;j--){
			System.out.print(" ");
		}
		for(int k=number;k-2*i>0;k--) {
			System.out.print("*");
		}
		System.out.println();
	}
}
}
