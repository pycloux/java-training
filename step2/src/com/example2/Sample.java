package com.example2;

import java.util.Arrays;//On en a besoin 

public class Sample{
    public static void main(String args[]){
        //On utilise une variable
        String name="John Doe";
        System.out.println("Hello world : "+name+" !");

        //On utilise un paramètre d'entrée du programme
        /*
        Le "if" ci-dessous sert à éviter l'erreur qui se produirait si on exécute le programme sans paramètre:
            Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 0
            at com.example2.Sample.main(Sample.java:10)
        */
        if(args.length==1){
            System.out.println("Hello world : "+args[0]+" !");
        }

        //Jouons avec d'autres variables
        Integer anInteger=2147483647;
        Long aLong=171787171871789L;
        Float aFloat=1.234322f;
        Double aDouble=878978779789789789878.5657667;
        Boolean aBoolean=true;
        System.out.println("Integer\t : " + anInteger);
        System.out.println("Long\t    : " + aLong);
        System.out.println("Float\t   : " + aFloat);
        System.out.println("Double\t  : " + aDouble);
        System.out.println("Boolean\t  : " + aBoolean);
        System.out.println(anInteger+1);//Attention les variables on des limites
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);

        System.out.println();//On passe une ligne

        //Il y a aussi des tableaux
        Integer[] anIntegerArray=new Integer[10];
        anIntegerArray[5]=10;
        System.out.println(anIntegerArray);//Pas beau du tout (affiche )
        System.out.println(anIntegerArray[5]);
        System.out.println(Arrays.toString(anIntegerArray));//On remarquera que l'index d'un tableau commnce
    }
}