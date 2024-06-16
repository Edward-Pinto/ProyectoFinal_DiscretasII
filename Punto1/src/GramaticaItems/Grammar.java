package GramaticaItems;

import java.util.*;

public class Grammar {
    private List<ReglaProduccion> reglas;
    private Terminales terminales;
    private Set<String> generadas;

    public Grammar(List<ReglaProduccion> reglas, Terminales terminales) {
        this.reglas = reglas;
        this.terminales = terminales;
        this.generadas = new HashSet<>();
    }

    public String generate(String symbol) {
        // Si el símbolo es terminal, retornarlo como está
        if (terminales.getConjuntoTerminales().contains(symbol.charAt(0))) {
            return symbol;
        }

        // Si la frase ya ha sido generada, retornarla
        if (generadas.contains(symbol)) {
            return "";
        }

        // Agregar la frase generada al conjunto de frases
        generadas.add(symbol);

        // Lista para almacenar todas las frases generadas por esta regla
        List<String> generatedSentences = new ArrayList<>();

        // Buscar reglas de producción que coincidan con el símbolo
        for (ReglaProduccion regla : reglas) {
            if (regla.getintoRule() == symbol.charAt(0)) {
                String output = regla.getOutRule();
                StringBuilder result = new StringBuilder();
                boolean isTerminal = true;
                for (char c : output.toCharArray()) {
                    String generatedSymbol = generate(String.valueOf(c));
                    if (!generatedSymbol.isEmpty()) {
                        result.append(generatedSymbol).append(" ");
                    } else {
                        isTerminal = false;
                        break;
                    }
                }
                if (isTerminal) {
                    generatedSentences.add(result.toString().trim());
                }
            }
        }

        // Si se han generado frases, retornar una de ellas aleatoriamente
        if (!generatedSentences.isEmpty()) {
            return generatedSentences.get(new Random().nextInt(generatedSentences.size()));
        }

        // Si no hay reglas coincidentes o todas las expansiones fallan, retornar el símbolo como está
        return symbol;
    }
}