package br.com.integrator.exemplo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class StatusController {

    @GetMapping("/api/status")
    public Map<String, String> status() {
        return Map.of(
                "status", "online",
                "aplicativo", "Aplicativo de Exemplo - Integrator Host"
        );
    }
}
