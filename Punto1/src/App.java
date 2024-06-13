import java.util.HashSet;

import GramaticaItems.ReglaProduccion;
import GramaticaItems.Terminales;
import GramaticaItems.Vocabulario;

public class App {
    public static void main(String[] args) throws Exception {
        
        //VOCABULARIO
        Vocabulario vocabulario = new Vocabulario();
        vocabulario.setConjuntoVocabulario();
        System.out.println(vocabulario.getConjuntoVocabulario());

        vocabulario.deleteConjuntoVocabulario();
        System.out.println(vocabulario.getConjuntoVocabulario());


        //TERMINALES
        Terminales terminales = new Terminales(vocabulario);
        System.out.println(terminales.getConjuntoTerminales());

        //REGLAS DE PRODUCCION
        HashSet<ReglaProduccion> conjuntoReglas = new HashSet<ReglaProduccion>();
        for(int i = 0; i < 5; i++){
            ReglaProduccion regla = new ReglaProduccion(vocabulario, terminales);
            regla.setOutRule();
            conjuntoReglas.add(regla);
        }

        byte numero = 0;
        for(ReglaProduccion reglamuestra : conjuntoReglas){
            System.out.println("Regla #" + ++numero);
            System.out.println(reglamuestra.getintoRule() + " --> " + reglamuestra.getOutRule());
        }
    }
}
