package TEIA.palindromo;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class TextoService {

    public Map<String, Object> analisarString(String str) {
        // Verifica palíndromo
        String strSemEspacos = str.replaceAll("\\s+", "").toLowerCase();
        String invertido = new StringBuilder(strSemEspacos).reverse().toString();
        boolean ehPalindromo = strSemEspacos.equals(invertido);
        
        // Conta ocorrências de caracteres
        Map<Character, Integer> contador = new HashMap<>();
        for (char letra : strSemEspacos.toCharArray()) {
            contador.put(letra, contador.getOrDefault(letra, 0) + 1);
        }
        
        // Prepara o resultado
        Map<String, Object> resultado = new HashMap<>();
        resultado.put("palíndromo", ehPalindromo);
        resultado.put("ocorrencias_caracteres", contador);
        
        return resultado;
    }
}
