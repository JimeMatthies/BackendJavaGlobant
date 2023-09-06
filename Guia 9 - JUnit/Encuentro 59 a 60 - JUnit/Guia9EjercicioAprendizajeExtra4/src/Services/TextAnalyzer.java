/*
Analizador de Texto:
Crea una clase TextAnalyzer que analice un texto y proporcione estadísticas sobre él (por
ejemplo, número de palabras, número de frases, frecuencia de palabras, etc.).
Escribe pruebas unitarias para asegurarte de que el analizador de texto proporcione los
resultados correctos y maneje diferentes escenarios, como texto vacío o texto con caracteres
especiales.
@author JimeM
 */
package Services;

import java.util.*;
import java.util.stream.Collectors;

public class TextAnalyzer {

    public int wordCounter(String text) {
        text = normalizeText(text);
        return text.split(" ").length;
    }

    public int phraseCounter(String text) {
        text = normalizeText(text);
        return text.split("\\.").length;
    }

    public Map<String, Integer> wordFrequency(String text) {
        text = normalizeText(text).replaceAll("\\.", "");
        List<String> words = Arrays.stream(text.split(" ")).collect(Collectors.toList());
        Set<String> unique = new HashSet<>(words);
        Map<String, Integer> frequency = new HashMap<>();
        for (String only : unique) {
            frequency.put(only, 0);
            for (String word : words) {
                if (word.equals(only)) {
                    frequency.put(only, frequency.get(only) + 1);
                }
            }
        }
        return frequency;
    }

    private String normalizeText(String text) {
        return text
            .trim()
            .toLowerCase()
            .replaceAll("á", "a")
            .replaceAll("é", "e")
            .replaceAll("í", "i")
            .replaceAll("ó", "o")
            .replaceAll("ú", "u")
            .replaceAll(";", "")
            .replaceAll(",", "");
    }
}
