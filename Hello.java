package com.vier.text;

public class Hello{
	public static void main(String[] args){
		forText();
		forTextInt();
		System.out.println(forTextInt());
		System.out.println(getInt());
		
		int temp = getInt(100);
		System.out.println(temp);
		
		System.out.println(getInt(getInt()));
		
		Number obj = new Number();
		obj.forText();
	}
	
	// 获取函数的返回值，并运算
	private static int getInt(){
		int a = 50;
		return forTextInt() + a;
	}
	
	private static int getInt(int i){
		return forTextInt() * i;
	}
	
	/*
		overLoad 重载,同一个类的同一个方法名，由于参数不同，返回值不同，有不同的结果
		overWrite 重写
	*/
	
	private static void forText(){
		int sum = 0;
		for(int i = 0; i < 101; i++){
			sum += i;
		}
		System.out.println(sum);
	}	
	
	private static int forTextInt(){
		int sum = 0;
		for(int i = 0; i < 101; i++){
			sum = sum + i;
		}
		return sum;
	}
	
}