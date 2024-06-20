import java.util.Scanner;

public class App1 {
    public static void main(String[] args) throws Exception {
        MaquinaTintos maquina = new MaquinaTintos();
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Bienvenido a la máquina expendedora de tinto.");
       
        
        boolean pedidoTinto = false;
        while (!pedidoTinto) {
            System.out.println("Ingrese el valor que desea insertar (100, 200, 500, 1000, 2000, 5000, 10000), 'y' para obtener el tinto, 'z' para obtener el estado actual");
            String entrada = scanner.nextLine();
            if(entrada.equals("z")){
                System.out.println(maquina.getEstadoActual());
            }else{
                maquina.procesarEntrada(entrada);
            

                if (entrada.equals("y") && maquina.getEstadoActual() == Estados.ESalida) {
                pedidoTinto = true;
                }
            }
        }
        
        scanner.close();
    }
}

