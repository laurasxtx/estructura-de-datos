import java.util.Random;

public class ejecutar {
    
    public static void main (String[] args) {

        int[] energiaContenedores = new int[30];
        int [][] mapaCarga = new int[3][3];
        Random r = new Random();

        int min = 50;
        int max = 150;

         for(int i = 1; i < energiaContenedores.length; i++){
            energiaContenedores[i] = (int) r.nextInt((max - min + 1)) + min;
         }

        

        for( int i = 0; i < energiaContenedores.length; i ++){
            if(energiaContenedores[i]%10== 0){
                for (int j = 0; j < mapaCarga.length; j++) {
                    for (int k = 0; k < mapaCarga[0].length; k++) {
                        mapaCarga[k][j] = energiaContenedores[i];
                    }
                }
            }  
        }

        for (int k = 0; k < mapaCarga.length; k++) {
            for (int k2 = 0; k2 < mapaCarga[0].length; k2++) {
                System.out.println(mapaCarga[k][k2]);
            }
        }





    }


    
}
