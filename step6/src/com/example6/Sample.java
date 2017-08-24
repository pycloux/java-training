package com.example6;

public class Sample{
    public static void main(String args[]){
        try{
            //Iterations basée sur un index (i++ est équivalent à i=i+1)
            for(Integer i=0;i<=10;i++){
                System.out.println("Ligne "+i);
            }

            //Faire ... tant que
            i=0;
            do{
                System.out.println("Ligne "+i);
                i++;
            }while(i<=10);//Un de plus sinon on sort de la boucle trop tôt

            //Tant que ... faire
            Integer i=0;
            while(i<10){
                System.out.println("Ligne "+i);
                i++;
            }
            

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