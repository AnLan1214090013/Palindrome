package Palindrome;


import java.util.Scanner;

public class Palindrome {


public static void main(String[] args)  
{
	Scanner huiwen=new Scanner(System.in);
	System.out.println("����������Ҫ�ж������֣�");
String str=huiwen.nextLine();

int a=str.length();

int middle=a/2,i=3;

//char c1=(char) a,c2=(char) a;

for(i=0;i<middle&&str.charAt(i)==str.charAt(a-1-i);
		i++)

{}

if(i<middle)

System.out.println(str+"���ǻ���");

else

System.out.println(str+"�ǻ���");}
}