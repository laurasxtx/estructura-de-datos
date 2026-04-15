public class Main {

    public static void main(String[] args) {

        Puerto puerto = new Puerto();

        
        puerto.cargarManifiesto();

        
        puerto.mostrarPesoTotal();

        
        puerto.llenarPatio();
        puerto.mostrarPatio();

        
        puerto.enviarAInspeccion();
        puerto.procesarInspeccion();

        
        puerto.cargarBuque();
        puerto.mostrarBuque();

        
        puerto.eliminarFondo();

        System.out.println("\nDespués de reorganizar:");
        puerto.mostrarBuque();
    }
}