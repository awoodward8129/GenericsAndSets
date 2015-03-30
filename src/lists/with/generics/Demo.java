/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lists.with.generics;

import common.Employee;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author Alex
 */
public class Demo {
    public static void main(String[] args) {
       List<Employee> employees = new ArrayList<>();
       
       employees.add(new Employee("Smith","Sally","333-33-3333"));
       employees.add(new Employee("Doe","John","444-44-4444"));
       employees.add(new Employee("Walker","Scott","444-44-4444"));
       
//       String favoriteBeatle = beatles.get(1);
//       
//       beatles.add(1,"Ringo");
//       
//       //can also remove by name
//       beatles.remove("George");
//       
//       
       Set<Employee> noDupes = new HashSet<>(employees);
       employees = new ArrayList<>(noDupes);
       
       
       for(Employee e: employees){
           System.out.println(e.getLastName());
       }
       
//       Employee e1 = employees.get(1);
//       Employee e2 = employees.get(2);
//       
//       if(e1.equals(e2)){
//           System.out.println("they are equal");
//       }else{
//           System.out.println("they are not equal");
//       }
//       
//       
//       List records = new ArrayList();
//       
//       records.add("Avett Brothers");
//       records.add("Foo Fighters");
//       records.add("Bob Dylan");
//       
//       //String item1 = (String)records.get(2);
//       
//       records.add(2, "Counting Crows");
//       
//       //System.out.println(item1);
//        
//        for(int i=0; i < records.size(); i++) {
//            String s = (String)records.get(i);
//            System.out.println(s);
//           
//        }
//        
//         List<String> moreRecords = new ArrayList<>();
//    
//    moreRecords.add("Thao and the Get Down");
//    moreRecords.add("Neko Case");
//    moreRecords.add("Ivan and Aliosha");
//    moreRecords.add("The Lone Bellow");
////    
////     for(String s : moreRecords) {
////            System.out.println(s);
////        }
//    
//       // List<String> subList = new ArrayList<>();
//                
//            List  subList =   moreRecords.subList(1, 3);
//        System.out.println(subList);
//        
//        for(Object s : subList) {
//            System.out.println(s);
//        }
        
    }
    
   
    
}
