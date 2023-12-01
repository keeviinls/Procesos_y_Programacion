package Ejercicio_CuentaBancaria;

public class IncrementarHilo extends Thread{
    private CuentaBancaria cuenta_del_banco;

    // Constructor que recibe la cuenta bancaria asociada al hilo
    public IncrementarHilo(CuentaBancaria cuenta) {
        this.cuenta_del_banco = cuenta;
    }

    // Método que se ejecuta cuando se inicia el hilo
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            cuenta_del_banco.ingreso(100);
        }
    }
}
