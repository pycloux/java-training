package com.example5;

public class Sample{
    public static void main(String args[]){
        try{
            //Capturer l'entrée du clavier d'un utilisateur
            System.out.println("\nResultat = "+(getValueFromUser("A")+getValueFromUser("B")));
        }catch(Exception e){
            //On expliquera plus tard
            e.printStackTrace();
        }
    }

    /**
     * Une fonction pour réutiliser les mêmes commandes
     */
    public static Integer getValueFromUser(String label) throws Exception{
        byte[] input=new byte[10];
        System.out.print("Valeur "+label+" : ");
        System.in.read(input);
        String valueAsString=new String(input);
        return Integer.parseInt(valueAsString.trim());
    }
}