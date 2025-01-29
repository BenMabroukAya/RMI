package service;

import metier.Compte;

import java.rmi.Naming;
import java.util.List;

public class ClientRMI {
    public static void main(String[] args) {
        try {
            EbanqueRemote stub= (EbanqueRemote)
                    Naming.lookup("rmi://localhost:1099/BK");
            System.out.println(stub.conversion(78));
            System.out.println (stub.getServerDate());
            System.out.println("Consulmtation d'un compte à distance");
            Compte cp=stub.consulterCompte(1);
            System.out.println("Code:" + cp.getCode());
            System.out.println("Sole:" + cp.getSolde()) ;
            System.out.println("Date : " + cp.getDateCreation());

            System.out.println("Liste des comptes");
            List<Compte> cpt=stub.listComptes();
            for (Compte c:cpt){
                System.out.println("---------------------------");
                System.out.println(c.getCode());
                System.out.println(c.getSolde());

                System.out.println(c.getDateCreation());

            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}