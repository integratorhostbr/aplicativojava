package br.com.integrator.exemplo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("titulo", "Exemplo Java com GiTHUB 8");
        model.addAttribute("empresa", "Integrator Host do Brasil");
        model.addAttribute("mensagem", "Aplicação Java com Spring Boot 4 e Thymeleaf funcionando com sucesso.");
        model.addAttribute("dataHora", LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss")));

        return "index";

    }
}
