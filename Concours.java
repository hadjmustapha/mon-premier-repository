/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concours;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

/**
 *
 * @author Lahnechem
 */
public class Concours {

    /**
     * @param args the command line arguments
     */
  
    
        
    
    public static void main(String[] args) {
        System.out.println("Hello world !");
        System.out.println("Hello world 2!");
        System.out.println("Hello world 3!");
        System.out.println("Hello world 4!");
        String  line=null;
        int nb;
        String Tab[];
        System.out.println("entrer le nombre entre 3 et 10000");
        Scanner sc = new Scanner(System.in);
        nb=sc.nextInt();
        String tableauCouleurs[] = new String[nb];
        System.out.println(tableauCouleurs.length);
          for (int i =0 ; i<= tableauCouleurs.length; i++)
          {
           Scanner sc2 = new Scanner(System.in);
		//while(sc2.hasNextLine()) {
		line = sc.nextLine();
                        
                //}
                //System.out.println(line);
                if (i<tableauCouleurs.length)
                tableauCouleurs[i]=line;
          }
          occurence(tableauCouleurs);
          
          
		
                
    }
      public static void  occurence (String Tableau[])
    {
       Map<String, int[]> map = new HashMap<String, int[]>();
	for (String item : Tableau) {
		int[] nombre = map.get(item);
		if (nombre == null) {
			nombre = new int[] { 0 };
		        map.put(item, nombre);
		}
		nombre[0]++;
	}
 
	// Affichage
         
           
	for (String key : map.keySet()) {
		int[] nombre = map.get(key);
		System.out.println("[" + key + "] --> " + nombre[0]);
	}
        
        
          boolean conditiondemmarage=true;
          int max1=0;
          for (String key : map.keySet()) {
                
                
		int[] nombre = map.get(key);
		//System.out.println("[" + key + "] --> " + nombre[0]);
                
                if(conditiondemmarage==true)
                {
                 max1=nombre[0];
                conditiondemmarage=false;
                }
                
                if (max1<=nombre[0])
                {
                    max1=nombre[0];
                }
	  }
         System.err.println("max "+max1);
         
         for (String key : map.keySet()) {
		int[] nombre = map.get(key);
                if (nombre[0]==max1)
                {
                    System.out.println(""+key+"");
                    //map.remove(key);
                    map.remove(key, max1);
                    
                }		
//System.out.println("[" + key + "] --> " + nombre[0]);
	}      
       Map<String, int[]> map2 = map;
              boolean conditiondemmarage2=true;
          int max2=0;
          for (String key : map2.keySet()) {
                
             int[] nombre = map.get(key);
		//System.out.println("[" + key + "] --> " + nombre[0]);
                
                if(conditiondemmarage==true)
                {
                 max2=nombre[0];
                conditiondemmarage=false;
                }
                
                if (max2<=nombre[0])
                {
                    max2=nombre[0];
                }
            
	  }
             // System.err.println("max "+max2);
         
            for (String key2 : map2.keySet()) {
		int[] nombre = map2.get(key2);
                if (nombre[0]==max2)
                {
                    System.out.println(""+key2+"");
                    //map.remove(key);
                }		
//System.out.println("[" + key + "] --> " + nombre[0]);
	}  

        
}

}
    

