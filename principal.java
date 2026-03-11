import java.util.Random;

public class principal {

    public static void main(String[] args) {

        Random r = new Random();

        Contenedor[][] matriz = new Contenedor[10][10];

        String[] paises = { "EstadosUnidos", "China", "Canada", "Rusia" };

        
        String[] buques = { "Titanic", "Poseidon", "Neptuno", "Atlantico", "Pacifico" };

        int minId = 100;
        int maxId = 999;

        int minPeso = 500;
        int maxPeso = 5000;

        System.out.println("===== REGISTRO DE CONTENEDORES =====\n");

        for (int i = 1; i <= 10; i++) {

            int id = r.nextInt((maxId - minId) + 1) + minId;

            int peso = r.nextInt((maxPeso - minPeso) + 1) + minPeso;

            int posPais = r.nextInt(paises.length);
            String pais = paises[posPais];

           
            int posBuque = r.nextInt(buques.length);
            String buque = buques[posBuque];

            Contenedor c = new Contenedor(id, pais, peso);

            int fila = r.nextInt(10);
            int col = r.nextInt(10);

            matriz[fila][col] = c;

            System.out.println("Buque: " + buque);
            System.out.println("Ubicado en fila " + fila + " columna " + col);
            System.out.println(c);
            System.out.println();
        }

        System.out.println("Estado de la matriz:");

        for (int f = 0; f < matriz.length; f++) {
            for (int c = 0; c < matriz.length; c++) {

                if (matriz[f][c] == null) {
                    System.out.print("[ ] ");
                } else {
                    System.out.print("[X] ");
                }
            }
            System.out.println();
        }

        int pesoTotal = 0;

        for (int f = 0; f < matriz.length; f++) {
            for (int c = 0; c < matriz[f].length; c++) {

                if (matriz[f][c] != null) {
                    pesoTotal += matriz[f][c].getPeso();
                }
            }
        }

        System.out.println("\nPeso total de los contenedores: " + pesoTotal);

        System.out.println("\n===== LISTA DE PAISES DE ORIGEN =====");
        System.out.println("Estados Unidos");
        System.out.println("China");
        System.out.println("Canada");
        System.out.println("Rusia");

        
        System.out.println("\n===== LISTA DE BUQUES =====");
        for (String b : buques) {
            System.out.println(b);
        }
    }
}