/*public class Hilo_Del_Contador implements Runnable {
    int numHilo, miParte, miCuenta = 0;
    private final Contador cont;

    public int getMiCuenta(){
        return miCuenta;
    }

    Hilo_Del_Contador (int numHilo, int miParte, Contador c){
        this.numHilo = numHilo;
        this.miParte = miParte;
        this.cont = c;
    }

    @Override
    public void run (){
        for (int i = 0; i < miParte; i++){
            this.cont.incrementa();
            miCuenta++;
        }
        System.out.printf("Hilo %d terminado, cuenta: %d\n", numHilo);
        getMiCuenta();
    }


}
*/