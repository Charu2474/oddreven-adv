import java.io.*;
import java.util.*;
public class Solution {
    public static void main(String[] args) 
    {
        Scanner jk=new Scanner(System.in);
        int num=jk.nextInt();
        if(num==5)
        {
            System.out.println("Enter the number");
        }
        else
        {
        System.out.println("Enter a number");
        }
        System.out.println(num);
        int count=0;
        while(num!=1) 
        {
            if(num%2!=0)
            {
                num=3*num+1;
            }
            else
            { 
                num/=2;
            }
            System.out.println(num);
            count++;
        }
        System.out.println("count:"+count);
    }
}
