package clases;

import java.rmi.Naming;

public class Cliente {
    public static void consultar(int id) throws Exception{
        String resultado = null;
        String rmiObjectName = "rmi://localhost/Datos";
        Servidor servicio = (Servidor) Naming.lookup(rmiObjectName);
        servicio.consultar(id);

    }

    static void main(String[] args) throws Exception{
        try {
            consultar(1);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
