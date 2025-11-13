package br.com.fiap.gsmicroservices.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class TemaController {

    @GetMapping("/info")
    public Map<String, String> getInfo() {
        return Map.of(
                "tema", "Ferramentas de monitoramento de bem-estar e saúde mental",
                "membro1", "Lucas de Lima Bezerra",
                "membro2", "Martin Hilst",
                "descricao", "Explora soluções digitais que ajudam a acompanhar o bem-estar emocional e promover hábitos saudáveis por meio de tecnologias acessíveis e intuitivas."
        );
    }
}