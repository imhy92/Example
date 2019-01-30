
package exercises;

import java.util.*;

public class Exercises {

    
    public static void main(String[] args) {
       ArrayList<Integer>intList = new ArrayList<>();
       Scanner input = new Scanner (System.in);
       for (int i = 0; i < 10; i++){
           System.out.print ("Enter an integer: ");
           intList.add(input.nextInt());
       }
       
       System.out.println ("The list is " + intList);
       
       removeDuplicate(intList);
       System.out.println ("The list NOW is " + intList);
       
    }
    
    
    public static void removeDuplicate (ArrayList<Integer>list){
        ArrayList<Integer>temp = new ArrayList<>();
        
        for (int i = 0; i<list.size();i++){
            if (!temp.contains(list.get(i)))
                temp.add(list.get(i));
        }    
        list.clear();
        for (int i = 0; i < temp.size();i++){
            list.add(temp.get(i));
        }
    }
    
}
