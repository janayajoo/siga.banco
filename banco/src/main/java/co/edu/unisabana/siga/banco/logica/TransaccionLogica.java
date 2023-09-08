package co.edu.unisabana.siga.banco.logica;

import co.edu.unisabana.siga.banco.bd.CuentaRepository;
import co.edu.unisabana.siga.banco.controller.dto.CuentaDTO;
import org.springframework.stereotype.Service;

@Service
public class TransaccionLogica {
    private CuentaRepository cuentaRepository;

    public TransaccionLogica(CuentaRepository cuentaRepository) {
        this.cuentaRepository = cuentaRepository;
    }

    public void depositar(String id_usuario, String numero_cuenta, String deposito) {

        int idUsuario = Integer.parseInt(id_usuario);
        int cuentaId = Integer.parseInt(numero_cuenta);
        double cantidadDeposito = Double.parseDouble(deposito);
        double balanceActual = cuentaRepository.getBalanceCuenta(idUsuario, cuentaId);
        double nuevoBalance = balanceActual + cantidadDeposito;
        cuentaRepository.cambiarBalanceCuentaById(nuevoBalance, cuentaId);
    }

    public void retirar(String id_usuario, String numero_cuenta, String deposito) {

        int idUsuario = Integer.parseInt(id_usuario);
        int cuentaId = Integer.parseInt(numero_cuenta);
        double cantidadRetiro = Double.parseDouble(deposito);
        double balanceActual = cuentaRepository.getBalanceCuenta(idUsuario, cuentaId);
        double nuevoBalance = balanceActual - cantidadRetiro;
        cuentaRepository.cambiarBalanceCuentaById(nuevoBalance, cuentaId);
    }

    public void pagos(String id_usuario, String numero_cuenta, String deposito) {

        int idUsuario = Integer.parseInt(id_usuario);
        int cuentaId = Integer.parseInt(numero_cuenta);
        double cantidadPagos = Double.parseDouble(deposito);
        double balanceActual = cuentaRepository.getBalanceCuenta(idUsuario, cuentaId);
        double nuevoBalance = balanceActual - cantidadPagos;
        cuentaRepository.cambiarBalanceCuentaById(nuevoBalance, cuentaId);
    }

    public void transferencias(String id_usuarioDe, String id_usuarioHacia, String numero_cuentaDe, String numero_cuentaHacia,String deposito) {
        double cantidadTransferencia = Double.parseDouble(deposito);

        int idUsuarioDe = Integer.parseInt(id_usuarioDe);
        int cuentaIdDe = Integer.parseInt(numero_cuentaDe);

        int idUsuarioHacia = Integer.parseInt(id_usuarioHacia);
        int cuentaIdHacia = Integer.parseInt(numero_cuentaHacia);

        double balanceActualDe = cuentaRepository.getBalanceCuenta(idUsuarioDe, cuentaIdDe);
        double nuevoBalanceDe = balanceActualDe - cantidadTransferencia;

        double balanceActualHacia = cuentaRepository.getBalanceCuenta(idUsuarioHacia, cuentaIdHacia);
        double nuevoBalanceHacia = balanceActualHacia + cantidadTransferencia;

        cuentaRepository.cambiarBalanceCuentaById(nuevoBalanceDe, cuentaIdDe);
        cuentaRepository.cambiarBalanceCuentaById(nuevoBalanceHacia, cuentaIdHacia);
    }


}
