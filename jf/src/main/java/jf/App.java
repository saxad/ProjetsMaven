package jf;

import java.io.FileReader;
import java.io.IOException;
import java.util.List;

import com.opencsv.CSVReader;

/**
 * Hello world!
 *
 */
public class App 
{
	public int max(int a,int b)
	{
		//return a;
		return a>b?a:b;
	}
	
    public static void main( String[] args )
    {
        /*System.out.println( "Hello World!" );
        
        
        
        System.out.println("ma modification sous eclipse");
        App a = new App();
        System.out.print(a.max(5, 4));*/
       
		try {
			
	    	App m = new App();
	    	 System.out.println("coucou");
	    	int monmax = 0;
			CSVReader reader = new CSVReader(new FileReader("data.csv"));
			

			List<String[]> myEntries;
			myEntries = reader.readAll();
			for (int i = 0; i < myEntries.size(); i++){
				
				String[] strings = myEntries.get(i);
				for (int j = 0; j < strings.length; j++){
				 monmax = m.max(Integer.parseInt(strings[j]), Integer.parseInt(strings[j+1])) ; 
				 System.out.println(strings[j]); // parcours
					}
					
				}
				System.out.println("le maximum est : " + monmax);
			}
	        
		 catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
        
        		
    }
}
