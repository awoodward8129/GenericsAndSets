/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listandsetslab;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Alex
 */
public class Lab1 {

   
 public static void main(String[] args) {
        List hobbyList = new ArrayList();
        hobbyList.add("Biking");
        hobbyList.add("Disc Golf");
        hobbyList.add("Reading");
        
        for(int i = 0; i < hobbyList.size(); i++){
            String answer = (String)hobbyList.get(i);
            System.out.println(answer);
        }
        System.out.println("****************8");
     hobbyList.add("Coding") ;
      for(int i = 0; i < hobbyList.size(); i++){
            String answer = (String)hobbyList.get(i);
            System.out.println(answer);
        }
      System.out.println("*********");
      hobbyList.remove("Disc Golf");
        for(int i = 0; i < hobbyList.size(); i++){
            String answer = (String)hobbyList.get(i);
            System.out.println(answer);
        }
     
    }
    
}
