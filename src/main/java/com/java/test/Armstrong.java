package com.java.test;
//Program to check whether a number is Armstrong or not
import java.io.*;
class Armstrong
{
    public static void main(String ar[])
{
int n=0,sum=0;
DataInputStream obj= new DataInputStream(System.in);
System.out.println("Enter any integer:");
try
{
	n=Integer.parseInt(obj.readLine());
}
catch(IOException e)
{
	System.out.println("you have given wrong input");
}
int q,r;
q=n;
while(q>0)
{
	r=q%10;
sum=sum+r*r*r;
q=q/10;
}
if(n==sum)
System.out.println(n+":is an armstrong number");
else
System.out.println(n+":is not an armstrong number");
}
}
