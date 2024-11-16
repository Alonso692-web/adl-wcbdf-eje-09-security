package com.upiiz.memorysecurity.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v2")
public class ControllerFacturas {

    @GetMapping("/listar")
    public String listar() {
        return "Listado de Facturas - Sin seguridad";
    }

    @GetMapping("/actualizar")
    public String actualizar() {
        return "Facturas Actualizadas -  Con seguridad";
    }

    @GetMapping("/eliminar")
    public String eliminar() {
        return "Factura Eliminada  - Con seguridad";
    }

    @GetMapping("/crear")
    public String crear(){
        return "Factura Creada  - Con seguridad";
    }
}
