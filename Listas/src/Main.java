import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		int soma=0;
		int i=0;
		ArrayList<Integer> nomes = new ArrayList<Integer>(Arrays.asList(2,3,4,5,6,7));
		HashSet<Integer> conjunto = new HashSet<Integer>(Arrays.asList(1,2,3,4,5,6,7));
		HashMap<Integer,Integer> dict = new HashMap<Integer , Integer>();
		
		dict.put(10, 12);
		dict.put(25, 65);
		dict.put(26, 67);
		dict.put(27, 68);
		//Iterator it = dict.values().iterator();
		
		
		
		//Iterator it = conjunto.iterator(); 
		Iterator it = nomes.iterator();
		
		while (i<15) {
			if(!it.hasNext()) {
				it = nomes.iterator();
				
			}
			
			System.out.println( it.next());
			i++;	
			
			
		}
	

	}

}
