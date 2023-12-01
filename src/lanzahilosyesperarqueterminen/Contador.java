package lanzahilosyesperarqueterminen;

public class Contador {
    private int cuenta = 0;

    synchronized public int getCuenta(){
        return cuenta;
    }

    synchronized public int incrementa(){
        this.cuenta++;
        return cuenta;
    }
}
