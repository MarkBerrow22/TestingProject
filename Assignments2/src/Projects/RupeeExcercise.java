package Projects;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class RupeeExcercise {

	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));        
		 
		
		
		int Rs[]= {2000,500,100,50,20,10,5,2,1};
		
		System.out.println("Enter the amount :");
        int amount=Integer.parseInt(br.readLine()); 

        int copy=amount;
        int totalNotes=0, count=0;
	
        System.out.println("\nRs Declaration  : \n");
	
        for(int i = 0;i<9;i++);
        {
        int i = 0;
		//count the number of notes
        count=amount/Rs[i];
        if(count!=0);
        {
        System.out.println(Rs[i]+"\tx\t"+count+"\t= "+Rs[i]*count);
        }
        totalNotes=totalNotes+count;
        amount=amount%Rs[i];
        
        System.out.println("--------------------------------");
        
        // printing the total amount
        System.out.println("TOTAL\t\t\t= "+copy); 
        System.out.println("--------------------------------");
 
        // printing the total number of notes
        System.out.println("Total Number of Notes\t= "+totalNotes); 
        
        
        
        }
	}

	private static Reader newInputStreamReader(InputStream in) {
		// TODO Auto-generated method stub
		return null;
	}

}
