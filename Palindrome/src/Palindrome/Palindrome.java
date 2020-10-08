package Palindrome;


import java.util.Scanner;

public class Palindrome {


public static void main(String[] args)  
{
	Scanner huiwen=new Scanner(System.in);
	System.out.println("请输入你需要判定的文字：");
String str=huiwen.nextLine();

int a=str.length();

int middle=a/2,i=3;

//char c1=(char) a,c2=(char) a;

for(i=0;i<middle&&str.charAt(i)==str.charAt(a-1-i);
		i++)

{}

if(i<middle)

System.out.println(str+"不是回文");

else

System.out.println(str+"是回文");}
}