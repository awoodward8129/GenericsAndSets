/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listandsetslab;

import common.Employee;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Alex
 */
public class Lab2 {
      public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        Employee emp1 = new Employee("Woodward", "Alex", "555-55-5555");
        Employee emp2 = new Employee("VerBrugge", "Maggie", "333-33-3333");
        Employee emp3 = new Employee("Smith", "John", "111-11-1111");
        employeeList.add(emp1);
        employeeList.add(emp2);
        employeeList.add(emp3);
        
        for (Employee emp : employeeList){
            System.out.println(emp.getLastName() + ", " + emp.getFirstName());
        }
    }
}
