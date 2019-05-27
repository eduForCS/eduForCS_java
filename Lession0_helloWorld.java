public class Lession0_helloWorld
{
	public static void main(String[] args)
	{
		/**
		第一个Java程序：
		1、Java以class为单元组织文件
		2、文件名、主类名（一个文件可以包含多个类，但只能有一个主类）
		3、主函数（函数入口）
		4、JVM
		5、面向对象思想（顺藤摸瓜、隶属关系清晰、借助文档可以自学）
		**/
		//打印输出
		System.out.println("欢迎学习Java！");
		
		
		
		
		/**
		变量与赋值
		1、变量4要素：变量类型、变量名、变量值、变量地址空间）
		2、变量类型含义？（为什么要有变量类型）
		3、整数与小数
		**/
		//1.1 整型(short 16bit;int 32bit; long 64bit)
		
		int a=10;
		long b=10000000l;
		short c=100;
		
		//1.2 浮点型(float 32bit;double 64bit)(单精度&双精度)
		float d0=1/3;
		float d1=1f/3f;
		double d2=1.0/3.0;
		double d3=0.3d;
		
		//1.3 字符型(char 16bit)
		char e='A';
		
		//1.4 字节型(byte 8bit)
		byte b0=128;
		
		//1.5 布尔类型(boolean 1bit)
		boolean f=true;
		
		//1.6 字符串类型
		String s="北京";
		System.out.println("s="+s);
		
		//1.7 类型转换
		//todo:
		
		//字符串与整数的转换
		Integer int1=new Integer(19);
		int int2=Integer.valueOf(19);
		String str1=Integer.toString(19);
		String tmp1="2008";
		int int3=Integer.parseInt(tmp1);
		
		//
		System.out.println("Integer: " + Integer.SIZE/8);           // 4  
        System.out.println("Short: " + Short.SIZE/8);               // 2      
        System.out.println("Long: " + Long.SIZE/8);                 // 8  
        System.out.println("Byte: " + Byte.SIZE/8);                 // 1  
        System.out.println("Character: " + Character.SIZE/8);       // 2  
        System.out.println("Float: " + Float.SIZE/8);               // 4  
        System.out.println("Double: " + Double.SIZE/8);             // 8 
		
		//字符编码
		String encoding="";
		encoding=System.getProperty("file.encoding");
		System.out.println("encoding="+encoding);
		
		//1.7 数组
		int[] array={1,2,3,4,5};
		String b="abc";
		char[] charArray=b.toCharArray();
		String[] c1= {"dog","cat","pig"};
		System.out.println("charArray="+charArray[1]); 
		
		System.out.println("-------------"); 		
		System.out.println("c1="+c1[0]+" "+c1[1]+" "+c1[2]);		
		System.out.println("-------------"); 
		//String[] 字符串数组；int[]整数数组
		String[] s1=new String[]{"哈尔滨","长春","沈阳","广州","成都","兰州"};
		System.out.println("s1="+s1[0]);

		//2.逻辑判断“==”
		/**
		== != && || 
		**/
		boolean br=true;//1,0
		br=(a==10 || b=="中国2" && 1>=0);
		System.out.println("br="+br); 
		
		//3.基本流程
		/**
		1)三大流程：顺序；循环；分支判读（类比河流的流动、分支、旋涡）
		for while/break continue
		if elseif else/switch
		**/
		for(int i=0;i<3;i++)
		{
			System.out.println("i="+i);
		}		
		while(true)
		{
			System.out.println("请你输入一个数字！");
			//import java.util.*;
			Scanner out = new Scanner(System.in);
			int a= out.nextInt();//out.next() 字符串读取
			if(a==-1)
				break;
			else
				System.out.println(a);
		}
		int i=100;
        switch(i)
        {
		  case 1:
		   System.out.println("one");
		   break;
		  case 10:
		   System.out.println("ten");
		   break;
		  case 5:
		   System.out.println("five"); 
		   break;
		  case 3:
		   System.out.println("three");
		   break;
		  default:
		   System.out.println("other");			  
        }
		
		
		
	}
}