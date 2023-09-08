package co.edu.unisabana.siga.banco.controller;

import co.edu.unisabana.siga.banco.bd.CuentaRepository;
import co.edu.unisabana.siga.banco.controller.dto.RespuestaDTO;
import co.edu.unisabana.siga.banco.logica.TransaccionLogica;
import org.jetbrains.annotations.Contract;
import org.springframework.web.bind.annotation.*;

@RestController
public class TransaccionesController {
    private TransaccionLogica logica;

    public TransaccionesController(TransaccionLogica logica) {
        this.logica = logica;
    }

    @PostMapping(path = "/depositar")
    public RespuestaDTO depositar(@RequestParam("id_usuario") String id_usuario, @RequestParam("numero_cuenta") String numero_cuenta, @RequestParam("deposito") String deposito){
        try {
            logica.depositar(id_usuario, numero_cuenta, deposito);

            return new RespuestaDTO("Transaccion correctamente");
        } catch (IllegalArgumentException e) {
            return new RespuestaDTO("Transaccion erronea");
        }
    }

    @PostMapping(path = "/retirar")
    public RespuestaDTO retirar(@RequestParam("id_usuario") String id_usuario, @RequestParam("numero_cuenta") String numero_cuenta, @RequestParam("deposito") String deposito){
        try {
            logica.retirar(id_usuario, numero_cuenta, deposito);

            return new RespuestaDTO("Transaccion correctamente");
        } catch (IllegalArgumentException e) {
            return new RespuestaDTO("Transaccion erronea");
        }
    }

    @PostMapping(path = "/pagos")
    public RespuestaDTO pagos(@RequestParam("id_usuario") String id_usuario, @RequestParam("numero_cuenta") String numero_cuenta, @RequestParam("deposito") String deposito){
        try {
            logica.pagos(id_usuario, numero_cuenta, deposito);

            return new RespuestaDTO("Transaccion correctamente");
        } catch (IllegalArgumentException e) {
            return new RespuestaDTO("Transaccion erronea");
        }
    }

    @PostMapping(path = "/transferencias")
    public RespuestaDTO transferencias(@RequestParam("id_usuarioDe") String id_usuarioDe,@RequestParam("id_usuarioHacia") String id_usuarioHacia, @RequestParam("numero_cuentaDe") String numero_cuentaDe, @RequestParam("numero_cuentaHacia") String numero_cuentaHacia,@RequestParam("deposito") String deposito){
        try {
            logica.transferencias(id_usuarioDe, id_usuarioHacia, numero_cuentaDe, numero_cuentaHacia, deposito);

            return new RespuestaDTO("Transaccion correctamente");
        } catch (IllegalArgumentException e) {
            return new RespuestaDTO("Transaccion erronea");
        }
    }
}
