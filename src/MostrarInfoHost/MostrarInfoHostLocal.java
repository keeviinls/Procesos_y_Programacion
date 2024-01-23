package MostrarInfoHost;
import java.net.InetAddress;
import java.net.UnknownHostException;
public class MostrarInfoHostLocal {
    public static void main(String[] args) {
        try {
            // Obtener la información del host local
            InetAddress localhost = InetAddress.getLocalHost();

            //Mostrar el nombre del host
            System.out.println("Nombre del host es "+localhost.getHostName());

            //Mostrar la direccion IP del host
            System.out.println("Direccion IP del host: "+localhost.getHostAddress());

            // Mostrar getCanonicalHostName
            System.out.println("getCanonicalHostName nos devuelve : "+localhost.getCanonicalHostName());

            // Mostrar getAdress()
            System.out.println("getAddress nos devuelve : "+localhost.getAddress());


        }catch (UnknownHostException e){
            e.printStackTrace();
        }
    }
}
