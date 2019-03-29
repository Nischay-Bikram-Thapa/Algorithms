package org.nischay.main;

import java.util.Scanner;
import org.nischay.main.util.DynamicList;

public class Program {

    public static void main(String[] args) {
           DynamicList list = new DynamicList();
           int [] data = {6,4,2,3,8,12,17,16,14,23,19};
           for(int i = 0; i< data.length;i++){
               list.add(data[i]);
           }
           list.bubbleSort();
           while(list.next()){
               System.out.println(list.getValue());
           }    
    }

        }
  
