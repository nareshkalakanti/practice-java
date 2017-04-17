package com.java.test;
public class Bubblesort {
	public static void main(String[] args) {
		int k[]={26,21,5,3,87,65,1};
		int temp=0,j,i;
		for(i=0;i<k.length;i++)
		{
			for(j=0;j<(k.length-1)-i;j++)
			{
				if(k[j]<k[j+1])
				{
				temp=k[j];
				k[j]=k[j+1];
				k[j+1]=temp;
				}
			}
			System.out.println(k[j]);
		}
		}
}
