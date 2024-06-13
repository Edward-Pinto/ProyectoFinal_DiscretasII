package GramaticaItems;

import java.util.HashSet;
import java.util.Iterator;

public class Terminales {
    
    //conjunto de terminos terminales
    HashSet<Character> conjuntoTerminales;

    //Constructor
    public Terminales(Vocabulario vocabulario){
        conjuntoTerminales = new HashSet<Character>();

        //Conjunto con los terminos del vocabulario
        HashSet<Character> vocabularioTerminal = vocabulario.getConjuntoVocabulario();

        //Iterador para recorrer el conjunto del vocabulario
        Iterator<Character> iterator = vocabularioTerminal.iterator();
        while (iterator.hasNext()) {
            char caracter = iterator.next();       

            //Si hay un caracter en el vocabulario que sea: un numero o una letra minuscula lo adciona a conjuntoTerminales
            if(Character.isDigit(caracter) || Character.isLowerCase(caracter)){
                conjuntoTerminales.add(caracter);
            }
        }
    }

    //metodo para devolver el conjunto de terminos terminales
    public HashSet<Character> getConjuntoTerminales() {
        return conjuntoTerminales;
    }
}
