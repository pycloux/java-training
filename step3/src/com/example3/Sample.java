package com.example3;

public class Sample{
    public static void main(String args[]){
        try{
            //Capturer l'entrée du clavier d'un utilisateur
            byte[] input=new byte[10];
            int readBytes=System.in.read(input);
            System.out.println("On a lu "+readBytes+" octets");
            System.out.println("Ce qui a été entré : "+input);//ne marche pas comme on l'attendrait
            System.out.println("Ce qui a été entré : "+new String(input));//Mieux mais attention : on coupe si l'entrée est trop longue
        }catch(Exception e){
            //On expliquera plus tard
            e.printStackTrace();
        }
    }
}