package service;


import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class ServeurRMI {
    public static void main(String[] args) {

        try {
//démarrer l'annuaire
            LocateRegistry.createRegistry(1099);
//instancier l'objet distant
            BanqueServImpl od=new BanqueServImpl();
//afficher la référence de l'objet distant sous forme de chaine de caractère
            System.out.printf(od.toString());
            //publier la référence
            Naming.rebind("rmi://localhost:1099/BK", od);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}