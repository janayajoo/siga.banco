package co.edu.unisabana.siga.banco.controller;

import co.edu.unisabana.siga.banco.controller.dto.ClienteDTO;
import co.edu.unisabana.siga.banco.controller.dto.RespuestaDTO;
import co.edu.unisabana.siga.banco.logica.ClienteLogica;
import org.springframework.web.bind.annotation.*;

@RestController
public class ClienteController {

    private ClienteLogica logica;

    public ClienteController(ClienteLogica logica) {
        this.logica = logica;
    }

    @PostMapping(path = "/agregarCliente")
    public RespuestaDTO guardarCliente(@RequestBody ClienteDTO clienteDTO) {
        try {
            logica.guardarCliente(clienteDTO);
            return new RespuestaDTO("cliente guardado correctamente");
        } catch (IllegalArgumentException e) {
            return new RespuestaDTO("cliente con nombre prohibido");
        }
    }

    @GetMapping(path = "/verCliente/{id}")
    public RespuestaDTO verCliente(@PathVariable int id) {
        try {
            logica.verCliente(id);
            return new RespuestaDTO("Se visualizo la cuenta");
        } catch (IllegalArgumentException e) {
            return new RespuestaDTO("No se visualizo la cuenta");
        }
    }
}