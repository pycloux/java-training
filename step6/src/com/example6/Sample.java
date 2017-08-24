package com.example6;

public class Sample{
    public static void main(String args[]){
        try{
            //Quelques tests
            Integer a=getValueFromUser("A");
            Integer b=getValueFromUser("B");
            if(a>b){
                System.out.println("a est plus grand que b");
            }else{
                System.out.println("b est plus grand que a");
            }

            Boolean resultat=(a>b);
            System.out.println("Un boolean peut être le résultat d'un test : "+resultat);
            if(resultat){
                System.out.println("a est toujours plus grand que b");
            }else{
                System.out.println("b est toujours plus grand que a");
            }

            //Iterations basée sur un index (i++ est équivalent à i=i+1)
            for(Integer i=0;i<=10;i++){
                System.out.println("Ligne "+i);
            }

            //Faire ... tant que
            Integer i=0;
            do{
                System.out.println("Ligne "+i);
                i++;
            }while(i<=10);//Un de plus sinon on sort de la boucle trop tôt

            //Tant que ... faire
            i=0;
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