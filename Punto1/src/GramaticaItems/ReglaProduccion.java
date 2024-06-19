package GramaticaItems;

import java.util.Scanner;

public class ReglaProduccion {
    //Vocabulario
    Vocabulario vocabularioRegla;
    //Caracteres Terminales
    Terminales terminalesRegla;
    //Caracter que establece la entrada de la regla
    char intoRule;
    //Caracter que establece la salida de la regla
    String outRule;

    public ReglaProduccion(Vocabulario vocabulario, Terminales terminales){
        this.vocabularioRegla = vocabulario;
        this.terminalesRegla = terminales;
    }

    public String getintoRule() {
        return intoRule + "";
    }

    public String getOutRule() {
        return outRule;
    }

    public void setOutRule() {
        while (true) {
            try{
                System.out.println("---------------------------------------------------------");
                System.out.println("Vocabulario :" + vocabularioRegla.getConjuntoVocabulario());
                System.out.println("Caracteres terminales: " + terminalesRegla.getConjuntoTerminales());

                System.out.println("Escribe el valor de entrada de la regla (Letra mayuscula)");
                Scanner scanner = new Scanner(System.in);
                String letra = scanner.next();
                char charletra = letra.charAt(0);
                if((vocabularioRegla.getConjuntoVocabulario()).contains(charletra) && Character.isUpperCase(charletra)){
                    intoRule = charletra;
                }else{
                    throw new Exception();
                }
                System.out.println("==========================================================");
                System.out.println("Vocabulario :" + vocabularioRegla.getConjuntoVocabulario());
                System.out.println("Caracteres terminales: " + terminalesRegla.getConjuntoTerminales());

                System.out.println("Escribe el valor de salida de la regla (letras y/o numeros)");
                String salidaRule = scanner.next();

                if(salidaRule.equals("NULL")){
                    salidaRule = "";
                }

                for (int i = 0; i < salidaRule.length(); i++) {
                    char salidaChar = salidaRule.charAt(i);
                    if(!(vocabularioRegla.getConjuntoVocabulario().contains(salidaChar))){
                        throw new Exception();
                    }
                }


                outRule = salidaRule;
                break;
            }catch(Exception e){
                System.out.println("Ingresa un valor valido");
            }
        }
    }
}
