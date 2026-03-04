

import java.util.Random;

public class principal {

    public static void main(String[] args) {

        Random r = new Random();

    contenedor[][] matriz = new contenedor[10][10];

        String[] paises = {"EstadosUnidos", "China", "Canada", "Rusia"};

        // Rango para ID
        int minId = 100;
        int maxId = 999;

        // Rango para peso
        int minPeso = 500;
        int maxPeso = 5000;

        // Generar 10 contenedores
        for (int i = 1; i <= 10; i++) {

            // ID aleatorio como en la imagen
            int id = r.nextInt((maxId - minId) + 1) + minId;

            // Peso aleatorio como en la imagen
            int peso = r.nextInt((maxPeso - minPeso) + 1) + minPeso;

            // País aleatorio (0 a 3)
            int posPais = r.nextInt((3 - 0) + 1) + 0;
            String pais = paises[posPais];

            contenedor c = new contenedor(id, pais, peso);

            // Posición aleatoria en matriz
            int fila = r.nextInt((9 - 0) + 1) + 0;
            int col = r.nextInt((9 - 0) + 1) + 0;

            matriz[fila][col] = c;

            System.out.println("Ubicado en fila " + fila + " columna " + col);
            System.out.println(c);
            System.out.println();
        }

        // Mostrar estado simple de la matriz
        System.out.println("Estado de la matriz:");

        for (int f = 0; f < 10; f++) {
            for (int c = 0; c < 10; c++) {

                if (matriz[f][c] == null) {
                    System.out.print("[ ] ");
                } else {
                    System.out.print("[X] ");
                }
            }
            System.out.println();
        }
    }
}