package clases;

import java.rmi.Naming;

public class Cliente {
    public static String consultar(int id) throws Exception{
        String resultado = null;
        String rmiObjectName = "rmi://localhost/Datos";
        Servidor servicio = (Servidor) Naming.lookup(rmiObjectName);
        String r = servicio.consultar(id);
        return r;
    }

    static void main(String[] args){
        try {
            System.out.println(consultar(1));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
