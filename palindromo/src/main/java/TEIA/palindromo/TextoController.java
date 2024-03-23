package TEIA.palindromo;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TextoController {

    @Autowired
    private TextoService textoService;

    @GetMapping("/verificar")
    public Map<String, Object> PalindromoApplication(@RequestParam String texto) {
        return textoService.analisarString(texto);
    }
}
