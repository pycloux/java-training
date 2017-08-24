package com.example7;

public class Sample{
    public static void main(String args[]){
        try{
            String question=null;
            do{
                Integer valueA=Integer.parseInt(getValueFromUser("A"));
                Integer valueB=Integer.parseInt(getValueFromUser("B"));
                System.out.println("Somme : "+(valueA+valueB));
                question=getValueFromUser("\nEst-ce que je continue ? (Y/N)");
            }while(!question.equals("N"));
            System.out.println("OK on arrête !");
        }catch(Exception e){
            //On expliquera plus tard
            e.printStackTrace();
        }
    }

    /**
     * Donne la chaine de caractère entrée
     */
    public static String getValueFromUser(String label) throws Exception{
        byte[] input=new byte[10];
        System.out.print(label+" : ");
        System.in.read(input);
        String valueAsString=new String(input);
        return valueAsString.trim();
    }
}