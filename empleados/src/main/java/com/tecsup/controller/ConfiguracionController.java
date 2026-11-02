package com.tecsup.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.LinkedHashMap;
import java.util.Map;

@RestController
public class ConfiguracionController {

    @Value("${empresa.ambiente}")
    private String ambiente;

    @Autowired
    private Environment environment;

    @GetMapping("/configuracion")
    public Map<String, String> obtenerConfiguracion() {
        String url = environment.getProperty("spring.datasource.url");

        Map<String, String> datos = new LinkedHashMap<>();
        datos.put("ambiente", ambiente);
        datos.put("perfil", environment.getActiveProfiles()[0]);
        datos.put("puerto", environment.getProperty("server.port"));
        datos.put("baseDatos", url.substring(url.lastIndexOf('/') + 1));
        return datos;
    }
}
