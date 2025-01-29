package service;

import metier.Compte;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BanqueServImpl extends UnicastRemoteObject implements
        EbanqueRemote{

    public BanqueServImpl() throws RemoteException {
        super();
    }

    @Override
    public double conversion(double mt) throws RemoteException {
        return 3.5*mt;
    }

    @Override
    public Compte consulterCompte(int code) throws RemoteException {
        Compte cp = new Compte(1,Math.random()*9000,new Date());
        return cp;
    }

    @Override
    public Date getServerDate() throws RemoteException {
        return new Date();
    }

    @Override
    public List<Compte> listComptes() throws RemoteException {
        List<Compte> comptes = new ArrayList<Compte>();
        comptes.add(new Compte(1,Math.random()*9000,new Date()));
        comptes.add(new Compte(2,Math.random()*9000,new Date()));
        comptes.add(new Compte(3,Math.random()*9000,new Date()));

        return comptes;
    }
}