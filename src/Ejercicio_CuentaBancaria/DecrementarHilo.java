package Ejercicio_CuentaBancaria;

public class DecrementarHilo extends Thread{
    private CuentaBancaria cuenta_del_banco;

    // Constructor que recibe la cuenta bancaria asociada al hilo
    public DecrementarHilo(CuentaBancaria cuenta) {
        this.cuenta_del_banco = cuenta;
    }


    // Método que se ejecuta cuando se inicia el hilo
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            cuenta_del_banco.retirar(150);
        }
    }
}
