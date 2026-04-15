import java.util.Scanner;

public class Puerto {

    
    Contenedor[] manifiesto = new Contenedor[10];

    
    Contenedor[][] patio = new Contenedor[5][5];

    
    Contenedor[] cola = new Contenedor[10];
    int inicio = 0;
    int fin = 0;

   
    Contenedor[] pila = new Contenedor[10];
    int tope = -1;

    Scanner sc = new Scanner(System.in);

    
    public void cargarManifiesto() {

        for (int i = 0; i < manifiesto.length; i++) {

            System.out.println("\nContenedor #" + (i + 1));

            System.out.print("ID: ");
            String id = sc.next();

            System.out.print("Peso: ");
            double peso = sc.nextDouble();

            System.out.print("Prioridad (0,1,2): ");
            int prioridad = sc.nextInt();

            
            while (prioridad < 0 || prioridad > 2) {
                System.out.print("Prioridad inválida. Ingrese 0,1 o 2: ");
                prioridad = sc.nextInt();
            }

            manifiesto[i] = new Contenedor(id, peso, prioridad);
        }
    }

    public void mostrarPesoTotal() {
        double total = 0;
        for (int i = 0; i < manifiesto.length; i++) {
            total += manifiesto[i].getPeso();
        }
        System.out.println("\nPeso total de carga: " + total);
    }

    
    public void llenarPatio() {

        int k = 0;

        for (int i = 0; i < patio.length; i++) {
            for (int j = 0; j < patio[i].length; j++) {

                if (k < manifiesto.length) {
                    patio[i][j] = manifiesto[k];
                    k++;
                }
            }
        }
    }

    public void mostrarPatio() {

        System.out.println("\nPatio:");

        for (int i = 0; i < patio.length; i++) {
            for (int j = 0; j < patio[i].length; j++) {

                if (patio[i][j] != null) {
                    System.out.print(patio[i][j].getId() + "\t");
                } else {
                    System.out.print("[ ]\t");
                }
            }
            System.out.println();
        }
    }

    
    public void encolar(Contenedor c) {
        if (fin < cola.length) {
            cola[fin] = c;
            fin++;
        }
    }

    public Contenedor desencolar() {
        if (inicio < fin) {
            Contenedor temp = cola[inicio];
            inicio++;
            return temp;
        }
        return null;
    }

    public void enviarAInspeccion() {

        for (int i = 0; i < manifiesto.length; i++) {
            if (manifiesto[i].getPrioridad() == 2) {
                encolar(manifiesto[i]);
            }
        }
    }

    public void procesarInspeccion() {

        System.out.println("\nZona de inspección:");

        while (inicio < fin) {
            System.out.println("Revisando: " + desencolar());
        }
    }

    
    public void push(Contenedor c) {
        if (tope < pila.length - 1) {
            tope++;
            pila[tope] = c;
        }
    }

    public Contenedor pop() {
        if (tope >= 0) {
            Contenedor temp = pila[tope];
            tope--;
            return temp;
        }
        return null;
    }

    public void cargarBuque() {

        for (int i = 0; i < manifiesto.length; i++) {
            push(manifiesto[i]);
        }
    }

    public void mostrarBuque() {

        System.out.println("\nBuque (Pila):");

        for (int i = tope; i >= 0; i--) {
            System.out.println(pila[i]);
        }
    }

    
    public void eliminarFondo() {

        Contenedor[] auxiliar = new Contenedor[10];
        int topeAux = -1;

        
        while (tope > 0) {
            auxiliar[++topeAux] = pop();
        }

        
        System.out.println("\nContenedor dañado eliminado: " + pop());

        
        while (topeAux >= 0) {
            push(auxiliar[topeAux--]);
        }
    }
}