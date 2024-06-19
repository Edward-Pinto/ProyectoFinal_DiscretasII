package GramaticaItems;

import java.util.*;

public class Grammar {
    private List<ReglaProduccion> reglas;
    private Terminales terminales;

    public Grammar(List<ReglaProduccion> reglas, Terminales terminales) {
        this.reglas = reglas;
        this.terminales = terminales;
    }

    public HashSet<String> generateAll(String start, int limit) {
        HashSet<String> results = new HashSet<>();
        Queue<String> queue = new LinkedList<>();
        queue.add(start);
        
        while (!queue.isEmpty() && results.size() < limit) {
            String current = queue.poll();
            
            if (isTerminal(current)) {
                results.add(current);
            } else {
                for (ReglaProduccion regla : reglas) {
                    if (current.contains(regla.getintoRule())) {
                        queue.add(current.replace(regla.getintoRule(), regla.getOutRule()));
                    }
                }
            }
        
            
        }
        return results;
    }

    private boolean isTerminal(String str) {
        for (char ch : str.toCharArray()) {
            if (!terminales.getConjuntoTerminales().contains(ch)) {
                return false;
            }
        }
        return true;
    }
}