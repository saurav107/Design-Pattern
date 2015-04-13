/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ObjectSorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author saurav
 */
public class JavaObjectSorting {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //sort primitives array like int array
        int[] intArray = {5,10,9,3};
        Arrays.sort(intArray);
        System.out.println(Arrays.toString(intArray));
        //sorting String array
        String [] strArray={"A","B","F","Z","H"};
        Arrays.sort(strArray);
        System.out.println(Arrays.toString(strArray));
       
        
//sorting list of objects of Wrapper classes
        List<String> strList = new ArrayList();
        strList.add("A");
        strList.add("D");
        strList.add("E");
        strList.add("B");
        strList.add("I");
        Collections.sort(strList);
        
        for(String str : strList){
        System.out.println(str);
        }
        
        
    }
    
}
