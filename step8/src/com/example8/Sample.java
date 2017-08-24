package com.example8;

import java.util.*;

public class Sample{
    public static void main(String args[]){
        try{
            //List
            List<String> list=new ArrayList<String>();
            list.add("A");
            list.add("B");
            list.add("B");
            list.add("C");
            System.out.println(list);

            //Set
            Set<String> set=new HashSet<String>();
            set.add("A");
            set.add("B");
            set.add("B");
            set.add("C");
            System.out.println(set);

            //Map
            Map<String,String> map=new HashMap<String,String>();
            map.put("A","Alberto");
            map.put("B","Begnini");
            map.put("B","Tropist");
            map.put("C","James");
            System.out.println(map);
        }catch(Exception e){
            //On expliquera plus tard
            e.printStackTrace();
        }
    }
}