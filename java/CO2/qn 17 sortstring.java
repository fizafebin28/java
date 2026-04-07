  1 import java.util.*;
  2 class sortstring
  3 {
  4     String arr[];
  5     void input()
  6     {
  7         Scanner sc=new Scanner(System.in);
  8         System.out.print("Enter no of strings: ");
  9         int n=sc.nextInt();
 10         sc.nextLine();
 11         arr=new String[n];
 12         System.out.println("Enter Strings: ");
 13         for(int i=0;i<n;i++)
 14             arr[i]=sc.nextLine();
 15     }
 16     void sort()
 17     {
 18
 19          for(int i=0;i<arr.length-1;i++)
 20              {
 21         for(int j=0;j<arr.length-i-1;j++)
 22         {
 23             if(arr[j].compareTo(arr[j+1])>0)
 24             {
 25                 String temp=arr[j];
 26                 arr[j]=arr[j+1];
 27                 arr[j+1]=temp;
 28             }
 29         }
 30     }
 31 }
 32 void display()
 33 {
 34     for(String s:arr)
 35     {
 36         System.out.println(s);
 37     }
 38 }
 39 public static void main(String args[])
 40 {
 41     sortstring s=new sortstring();
 42     s.input();
 43     s.sort();
 44     System.out.println("Sorted Strings: ");
 45     s.display();
 46 }
 47 }
        