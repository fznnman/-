package demo;

import java.util.Scanner;

public class Paixu {

	@SuppressWarnings({ "unused", "resource" })
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入第一个数据");
		int a = sc.nextInt();
		
		System.out.println("请输入第二个数据");
		int b = sc.nextInt();
		
		System.out.println("请输入第三个数据");
		int c = sc.nextInt();
		
		String info = "";
		if(a>b) {
			if(b>c) {
				info = a+">"+b+">"+c;
			}else {
				if(a>c) {
					 info = a+">"+c+">"+b;
				}else {
						info = c+">"+a+">"+b;
				} 
			}
		}else {
			if(a>c) {
				info = b+">"+a+">"+c;
			}else {
				if(b>c) {
					info = b+">"+c+">"+a;
				}else {
					info = c+">"+b+">"+a;
				}
			}
		}
		System.out.println("依次排序："+info);
	}
}

