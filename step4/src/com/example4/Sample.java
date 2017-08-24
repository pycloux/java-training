package com.example4;

public class Sample{
    public static void main(String args[]){
        try{
            //Capturer l'entrée du clavier d'un utilisateur
            byte[] input=new byte[10];
            
            System.out.print("Valeur A : ");
            System.in.read(input);
            String valueAAsString=new String(input);
            Integer valueA=Integer.parseInt(valueAAsString.trim());

            System.out.print("Valeur B : ");
            System.in.read(input);
            String valueBAsString=new String(input);
            Integer valueB=Integer.parseInt(valueBAsString.trim());

            System.out.println("\nResultat = "+(valueA+valueB));
        }catch(Exception e){
            //On expliquera plus tard
            e.printStackTrace();
        }
    }
}