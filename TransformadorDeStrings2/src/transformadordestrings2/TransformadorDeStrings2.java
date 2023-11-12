package transformadordestrings2;

/**
 *
 * @author Elio Herrera
 */
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TransformadorDeStrings2 {

    // Método que toma una lista de strings y transforma los strings a mayúsculas
  private List<String> transformarAMayusculas(List<String> strings) {
    return strings.stream()
            .map(String::toUpperCase)
            .collect(Collectors.toList());
}

    // Método que concatena las palabras con más de "n" caracteres, separadas por coma y espacio
    private String concatenarPalabrasMasLargas(List<String> strings, int n) {
        return strings.stream()
                .filter(str -> str.length() > n)
                .collect(Collectors.joining(", "));

    }

    public static void main(String[] args) {
        
        List<String> listaStrings = new ArrayList<>();

        //Añadir Strings a la lista
        listaStrings.add("rosario");
        listaStrings.add("es");
        listaStrings.add("de");
        listaStrings.add("central");
        listaStrings.add("!!!");

        System.out.println("Lista original: " + listaStrings);
        
        // Crear una instancia de la clase TransformadorDeStrings
        TransformadorDeStrings2 transformador = new TransformadorDeStrings2();

        // Llamar al método transformarAMayusculas
        List<String> cadenaMayusculas = transformador.transformarAMayusculas(listaStrings);

        System.out.print("\nEjercicio 1:\n\nCadena convertida a mayuscula: ");

        // Recorrido e impresion de la lista cadenaMayusculas
        for (String palabraMayusculas : cadenaMayusculas) {
            System.out.print(palabraMayusculas + " ");
        }

        System.out.println("\n\nEjercicio 2:\n ");
        
        // Llamar al método concatenarPalabrasMasLargas
        int longitudMinima = 4;
        String resultadoConcatenado = transformador.concatenarPalabrasMasLargas(listaStrings, longitudMinima);

        // Impresión del resultadoConcatenado
        System.out.println("Palabras con más de " + longitudMinima + " caracteres: " + resultadoConcatenado);

    }
}
