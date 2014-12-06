package allprograms;
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Sort_abc_order {
	
	
		public static void main(String args[]) throws IOException
	{
		Scanner input=new Scanner(System.in);
        System.out.println("Enter List Elements: ");
        ArrayList<String> list=new ArrayList<String>();
        
        for(int i=0;i<5;i++){
        String st=input.next();
        list.add(st);
        }
        
        System.out.println("ArrayList Elements in Sorted order: ");
        Collections.sort(list);


	
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
	
}
	}
        
        
}
