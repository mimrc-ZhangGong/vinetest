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
	
	// ��ȡ�����ķ���ֵ��������
	private static int getInt(){
		int a = 50;
		return forTextInt() + a;
	}
	
	private static int getInt(int i){
		return forTextInt() * i;
	}
	
	/*
		overLoad ����,ͬһ�����ͬһ�������������ڲ�����ͬ������ֵ��ͬ���в�ͬ�Ľ��
		overWrite ��д
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