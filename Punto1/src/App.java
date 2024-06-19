import java.util.ArrayList;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import GramaticaItems.Grammar;
import GramaticaItems.ReglaProduccion;
import GramaticaItems.Terminales;
import GramaticaItems.Vocabulario;

public class App {

    static String caracter = "S";
    static char inicial = caracter.charAt(0);
    static Vocabulario vocabulario;
    static Terminales terminales;
    static ArrayList<ReglaProduccion> conjuntoReglas;
    


    public static void crearFrases(int cantidad) {
        Grammar grammar = new Grammar(conjuntoReglas, terminales);
        HashSet<String> frases = grammar.generateAll("S", cantidad);
        for (String frase : frases) {
            System.out.println("Frase generada: " + frase);
        }
    }

    
    public static boolean revisarFrase(String frase) {
        HashSet<String> visited = new HashSet<>();
        return revisarFraseHelper(frase, visited);
    }

    private static boolean revisarFraseHelper(String frase, HashSet<String> visited) {
        if (visited.contains(frase)) {
            return false;
        }
        visited.add(frase);

        // Caso base: si la frase es solo terminales y coincide con una regla de producción
        if (isTerminal(frase)) {
            for (ReglaProduccion regla : conjuntoReglas) {
                if (regla.getOutRule().equals(frase) && regla.getintoRule().equals("S")) {
                    return true;
                }
            }
            return false;
        }

        // Recursivamente intentar aplicar reglas de producción
        for (ReglaProduccion regla : conjuntoReglas) {
            if (frase.contains(regla.getintoRule())) {
                String nuevaFrase = frase.replaceFirst(regla.getintoRule(), regla.getOutRule());
                if (revisarFraseHelper(nuevaFrase, visited)) {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean isTerminal(String frase) {
        for (char ch : frase.toCharArray()) {
            if (!terminales.getConjuntoTerminales().contains(ch)) {
                return false;
            }
        }
        return true;
    }

    // Método para ingresar y revisar la frase desde el menú
    public static void revisarMenu() {
        try {
            System.out.println("Ingrese una frase (solo terminales)");
            Scanner scanner = new Scanner(System.in);
            String frase = scanner.nextLine();
            for (int i = 0; i < frase.length(); i++) {
                char salidaChar = frase.charAt(i);
                if (!terminales.getConjuntoTerminales().contains(salidaChar)) {
                    System.out.println("La frase contiene caracteres no terminales");
                    throw new Exception();
                }
            }
            if (revisarFrase(frase)) {
                System.out.println("La frase sí pertenece a esa gramática");
            } else {
                System.out.println("La frase no pertenece a esa gramática");
            }
        } catch (Exception e) {
            System.out.println("Ocurrió un error: " + e.getMessage());
        }
    }
    //----------------------------------------------------------------------------------

    //MOSTRAR GRAMATICA--------------------------------------------------------------------
    public static void mostrar(){
        System.out.println("GRAMATICA");
        System.out.println("VOCABULARIO: " + vocabulario.getConjuntoVocabulario());
        System.out.println("CARACTERES TERMINALES: " + terminales.getConjuntoTerminales());
        System.out.println("TERMINO INICIAL: [S]");
        System.out.println("REGLAS DE PRODUCCION: ");
        for(ReglaProduccion regla: conjuntoReglas){
            System.out.println(regla.getintoRule() + " --> " + regla.getOutRule());
        }
    }
    //-------------------------------------------------------------------------------------

    public static void bubbleSort() {
        int n =conjuntoReglas.size();
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - 1 - i; j++) {
                if (conjuntoReglas.get(j).getOutRule().length() < conjuntoReglas.get(j + 1).getOutRule().length()) {
                    // IntercambiarconjuntoReglas[j] yconjuntoReglas[j + 1]
                    ReglaProduccion temp =conjuntoReglas.get(j);
                   conjuntoReglas.set(j,conjuntoReglas.get(j + 1));
                   conjuntoReglas.set(j + 1, temp);
                    swapped = true;
                }
            }
            // Si no hubo intercambio en la pasada, laconjuntoReglasa está ordenada
            if (!swapped) break;
        }
    }


    //REGLAS DE PRODUCCION------------------------------------------------------------
    public static void rules(){
        conjuntoReglas = new ArrayList<>();
        String opc = "";
        while(true){
            try{
                
                System.out.println("Ingrese un asterisco para terminar (*)");
                Scanner scanner = new Scanner(System.in);
                opc = scanner.nextLine();
                if(opc.equals("*")){
                    break;
                }

                ReglaProduccion regla = new ReglaProduccion(vocabulario, terminales);
                regla.setOutRule();
                conjuntoReglas.add(regla);


            }catch(InputMismatchException e){

            }
        }
        bubbleSort();
    }
    //---------------------------------------------------------------------------------

    //VOCABULARIO-----------------------------------------------------------------------------------------
    public static void vocabulario(){
        vocabulario = new Vocabulario(inicial);
        System.out.println("Los caracteres en minusculas y/o numeros seran interpretados como terminales");
        vocabulario.setConjuntoVocabulario();
        vocabulario.deleteConjuntoVocabulario();
        terminales = new Terminales(vocabulario);
        rules();
    }
    //----------------------------------------------------------------------------------------------------

    //MENU ------------------------------------------------------------------
    public static void menu(){

        byte opc = 1;
        while (opc != 0) {
            try{
                System.out.println("1. Vocabulario");
                System.out.println("2. Reglas de producción");
                System.out.println("3. Revisar frase");
                System.out.println("4. Generar frases");
                System.out.println("5. mostrar gramatica");
                System.out.println("0. Salir");

                Scanner scanner = new Scanner(System.in);
                opc = scanner.nextByte();

                switch (opc) {
                    case 1: vocabulario(); break;
                    case 2: rules();       break;
                    case 3: revisarMenu(); break;
                    case 4: crearFrases(10); break;
                    case 5: mostrar();     break;
                    default:
                        break;
                }



            }catch(InputMismatchException e){
                System.out.println("Ingrese un numero valido");
            }
        }
    }
    //-----------------------------------------------------------------------

    //MAIN----------------------------------------------------
    public static void main(String[] args) throws Exception {
        menu();
    }
    //--------------------------------------------------------
}
