package GramaticaItems;

import java.util.HashSet;
import java.util.Scanner;

public class Vocabulario {

    //conjunto de caracteres del vocabulario
    HashSet<Character> conjuntoVocabulario;

    //constructor
    public Vocabulario(char inicial){
        conjuntoVocabulario = new HashSet<Character>();
        conjuntoVocabulario.add(inicial);
    }

    //metodo get para retornar el vocabulario
    public HashSet<Character> getConjuntoVocabulario() {
        return conjuntoVocabulario;
    }

    //metodo set para ingresar caracteres al vocabulario
    public void setConjuntoVocabulario() {

        while (true) {
            try{
                if(conjuntoVocabulario.size() == 8){
                    System.out.println("Cantidad de caracteres en el vocabulario muy alta");
                    System.out.println("Pueden ocurrir problemas más adelante");
                }
            
                System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
                System.out.println("Ingrese un solo caracter (letra o numero)");
                System.out.println("Ingrese un asterisco (*) para terminar");
                Scanner scanner = new Scanner(System.in);
                String letra = scanner.next();

                if(letra.equals("*")){
                    break;
                }

                char charletra = letra.charAt(0);
                this.conjuntoVocabulario.add(charletra);
                System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
            
            }catch(Exception e){
                System.out.println("No se pudo ingresar el caracter");
            }
        }
    }
    

    //metodo para borrar caracteres del vocabulario
    public void deleteConjuntoVocabulario(){

        while (true) {
            try{

                if(conjuntoVocabulario.size() == 0){
                    System.out.println("No hay caracteres en tu vocabulario ");
                    break;
                }
                System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
                System.out.println("Ingrese el caracter (letra o numero) para eliminar");
                System.out.println("Ingrese un asterisco (*) para terminar");
                Scanner scanner = new Scanner(System.in);
                String letra = scanner.next();

                if(letra.equals("*")){
                    break;
                }
                if(letra.equals("S")){
                    System.out.println("No se puede eliminar el termino inicial");
                    throw new Exception();
                }

                char charletra = letra.charAt(0);

                boolean letraEliminada = conjuntoVocabulario.remove(charletra);

                if (letraEliminada) {
                    System.out.println("Caracter eliminada con exito");
                }else{
                    System.out.println("Caracter no encontrado");
                }
                System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");        

            }catch(Exception e){
                //
            }
        }
    }
}
