/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listandsetslab;

import common.Employee;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author Alex
 */
public class Lab4 {
 
       public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        
        Employee emp1 = new Employee("Woodward", "Alex", "555-55-5555");
       Employee emp2 = new Employee("Woodward", "Alex", "555-55-5555");
       Employee emp3 = new Employee("Maggie", "VerBruggee", "444-44-4444");
        
        list.add(emp1);
        list.add(emp2);
        list.add(emp3);
        
        //This loop shows the List holds three employees
        for (Employee employee : list){
            System.out.println(employee.getLastName());
        }
        
        // Convert List to Set
        Set<Employee> set = new HashSet<>(list);
        
        /* This loop shows that with overridden .equals and .hashSet, the 
           duplicates ssn in emp1 and emp2 make them duplicates and the 
           duplicate object is deleted.
        */
        for (Employee employee : set){
            System.out.println(employee.getLastName() + " " + employee.getSsn());
        }
    }
}
