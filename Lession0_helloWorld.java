public class Lession0_helloWorld
{
	public static void main(String[] args)
	{
		/**
		��һ��Java����
		1��Java��classΪ��Ԫ��֯�ļ�
		2���ļ�������������һ���ļ����԰�������࣬��ֻ����һ�����ࣩ
		3����������������ڣ�
		4��JVM
		5���������˼�루˳�����ϡ�������ϵ�����������ĵ�������ѧ��
		**/
		//��ӡ���
		System.out.println("��ӭѧϰJava��");
		
		
		
		
		/**
		�����븳ֵ
		1������4Ҫ�أ��������͡�������������ֵ��������ַ�ռ䣩
		2���������ͺ��壿��ΪʲôҪ�б������ͣ�
		3��������С��
		**/
		//1.1 ����(short 16bit;int 32bit; long 64bit)
		
		int a=10;
		long b=10000000l;
		short c=100;
		
		//1.2 ������(float 32bit;double 64bit)(������&˫����)
		float d0=1/3;
		float d1=1f/3f;
		double d2=1.0/3.0;
		double d3=0.3d;
		
		//1.3 �ַ���(char 16bit)
		char e='A';
		
		//1.4 �ֽ���(byte 8bit)
		byte b0=128;
		
		//1.5 ��������(boolean 1bit)
		boolean f=true;
		
		//1.6 �ַ�������
		String s="����";
		System.out.println("s="+s);
		
		//1.7 ����ת��
		//todo:
		
		//�ַ�����������ת��
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
		
		//�ַ�����
		String encoding="";
		encoding=System.getProperty("file.encoding");
		System.out.println("encoding="+encoding);
		
		//1.7 ����
		int[] array={1,2,3,4,5};
		String b="abc";
		char[] charArray=b.toCharArray();
		String[] c1= {"dog","cat","pig"};
		System.out.println("charArray="+charArray[1]); 
		
		System.out.println("-------------"); 		
		System.out.println("c1="+c1[0]+" "+c1[1]+" "+c1[2]);		
		System.out.println("-------------"); 
		//String[] �ַ������飻int[]��������
		String[] s1=new String[]{"������","����","����","����","�ɶ�","����"};
		System.out.println("s1="+s1[0]);

		//2.�߼��жϡ�==��
		/**
		== != && || 
		**/
		boolean br=true;//1,0
		br=(a==10 || b=="�й�2" && 1>=0);
		System.out.println("br="+br); 
		
		//3.��������
		/**
		1)�������̣�˳��ѭ������֧�ж�����Ⱥ�������������֧�����У�
		for while/break continue
		if elseif else/switch
		**/
		for(int i=0;i<3;i++)
		{
			System.out.println("i="+i);
		}		
		while(true)
		{
			System.out.println("��������һ�����֣�");
			//import java.util.*;
			Scanner out = new Scanner(System.in);
			int a= out.nextInt();//out.next() �ַ�����ȡ
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