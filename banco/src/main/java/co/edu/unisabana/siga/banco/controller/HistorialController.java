package co.edu.unisabana.siga.banco.controller;

import co.edu.unisabana.siga.banco.bd.Cuenta;
import co.edu.unisabana.siga.banco.controller.dto.CuentaDTO;
import co.edu.unisabana.siga.banco.controller.dto.HistorialTransaccionDTO;
import co.edu.unisabana.siga.banco.controller.dto.RespuestaDTO;
import co.edu.unisabana.siga.banco.logica.CuentaLogica;
import co.edu.unisabana.siga.banco.logica.HistorialLogica;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public class HistorialController {
    private HistorialLogica logica;

    public HistorialController(HistorialLogica logica) {
        this.logica = logica;
    }


    @PostMapping(path = "/historial/{id}")
    public List<Cuenta> verHistorial(@PathVariable int id) {
        try{
            return logica.verHistorial(id);
        } catch (IllegalArgumentException e) {
            return (List<Cuenta>) e;
        }
}
