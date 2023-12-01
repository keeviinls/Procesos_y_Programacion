package Ejercicio_CuentaBancaria;

public class Main_CuentaBancaria {
    public static void main(String[] args) throws InterruptedException{

        // CREAMOS EL OBJETO DE LA CLASE "CuentaBancaria", LE AÑADIMOS UN SALDO INICIAL
        CuentaBancaria cuenta_del_banco = new CuentaBancaria(1500);

        // CREAMOS EL HILO PARA INCREMENTARLO DE 100 EN 100
        IncrementarHilo hiloIncrementador = new IncrementarHilo(cuenta_del_banco);

        // CREAMOS EL HILO PARA DECREMENTARLO DE 150 EN 150
        DecrementarHilo hiloDecrementador = new DecrementarHilo(cuenta_del_banco);

        // INICIAMOS EL HILO DE INCREMENTAR
        hiloIncrementador.start();

        // INICIAMOS EL HILO DE DECREMENTAR
        hiloDecrementador.start();

        // ESPERAMOS QUE EL HILO DE INCREMENTAR TERMINE SU EJECUCION
        hiloIncrementador.join();

        // ESPERAR QUE EL HILO DE DECREMENTAR TERMINE SU EJECUCION
        hiloDecrementador.join();

        System.out.println("EL SALDO FINAL ES: " + cuenta_del_banco.consultarSaldo());

    }
}
