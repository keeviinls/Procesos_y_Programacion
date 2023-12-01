package Ejercicio_CuentaBancaria;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class CuentaBancaria {
    private double saldo;
    //
    private final Lock lock_numerouno = new ReentrantLock();

    public CuentaBancaria(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public void ingreso(double cantidad) {
        // ESTO SIRVE PARA BLOQUEAR EL ACCESO A LA SECCION CRITICA, SI EL BLOQUEO ESTA SIENDO USADO POR OTRO HILO
        // EL HILO DE AHORA SE BLOQUEARÁ, VOLVERÁ A DESBLOQUEARSE HASTA QUE ESTÉ DISPONIBLE.
        lock_numerouno.lock();
        try {
            saldo += cantidad;
            System.out.println("LA CANTIDAD ES  " + cantidad + " TU SALDO ACTUAL ES: " + saldo);
        } catch (Exception e){

            // ESTO ES PARA DESBLOQUEAR EL ACCESO
            lock_numerouno.unlock();
        }
    }

    public void retirar(double cantidad) {

        lock_numerouno.lock();
        try {
            // ESTO INDICA SI EL SALDO ES MAYOR A LA CANTIDAD, RESTARA DE ESE SALDO TAL CANTIDAD INGRESADA
            if (saldo >= cantidad) {
                saldo -= cantidad;
                System.out.println("HAS RETIRADO " + cantidad + " . TU SALDO ACTUAL ES: " + saldo);
            } else {
                System.out.println("NO SE PUEDE RETIRAR PORQUE NO TIENES SUFICIENTE SALDO ");
            }
        } catch (Exception e){
            lock_numerouno.unlock();
        }
    }

    public double consultarSaldo() {
        return saldo;
    }
}
