package PhoneNumberSort;

import java.util.Arrays;    
import java.util.Collections;    
import java.util.HashSet;    
import java.util.Iterator;    
import java.util.Set;    
import java.util.TreeSet;      
    
public class PhoneNumberSort {    
   public static void main(String[] argus){    
//         
//     String[] a=new String[]{"13333332313","13455554444","13111111111","13323332313"};    
//     Arrays.sort(a);    
//     for(int i=0;i<a.length;i++){    
//         System.out.println(a[i]);    
//     }    
       Set set=new TreeSet<String>();    
       //插入的时候，已经去重和排序，所以很方便    
       set.add("13855555555");    
       set.add("13455555555");    
       set.add("13845555555");    
       set.add("13455555555");    
       set.add("13844555555");    
       set.add("13288888888");    
       System.out.println(set.size());    
       Iterator it=set.iterator();    
       while(it.hasNext()){    
           System.out.println(it.next());    
       }                    
   }     
}   
