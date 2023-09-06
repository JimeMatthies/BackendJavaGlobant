/*
Analizador de Texto:
Crea una clase TextAnalyzer que analice un texto y proporcione estadísticas sobre él (por
ejemplo, número de palabras, número de frases, frecuencia de palabras, etc.).
Escribe pruebas unitarias para asegurarte de que el analizador de texto proporcione los
resultados correctos y maneje diferentes escenarios, como texto vacío o texto con caracteres
especiales.
@author JimeM
 */
package guia9ejercicioaprendizajeextra4;

import Services.TextAnalyzer;

public class Guia9EjercicioAprendizajeExtra4 {

    public static void main(String[] args) {
        TextAnalyzer ta = new TextAnalyzer();
        String XGLeftRight = "Want your body swervin' left, right, left, right "
                + "I want your body movin' left, right, left, right "
                + "You keep me up, my heart is beating up and down "
                + "Spinnin' round and round round and round "
                + "Just like my Pirellis, burning on the ground";
        int numWords = ta.wordCounter(XGLeftRight);
        int numPhrases = ta.phraseCounter(XGLeftRight);
        System.out.println("XG - Left Right: \n" + XGLeftRight);
        System.out.println("Number of words: " + numWords);
        System.out.println("Number of phrases: " + numPhrases);
        System.out.println("Frequency of words: " + ta.wordFrequency(XGLeftRight));
    }

}
