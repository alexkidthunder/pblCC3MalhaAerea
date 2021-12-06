/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodoRemoto;

import controller.CompanhiaControllerServer;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.List;
import util.Grafo;

/**
 * Classe das funções principais que o Servidor tem no sistema.
 *
 * @authors Alexandre & Bianca
 */
public class ServicesServer extends UnicastRemoteObject implements InterfServerToServer {

    private static final long serialVersionUID = 15L;
    private final String companhia;

    public ServicesServer(String companhia) throws RemoteException {
        super();
        this.companhia = companhia;
    }

    @Override
    public ArrayList<Grafo> getGrafoCompanhia() throws RemoteException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /*@Override
    public String getNomeCompanhia() throws RemoteException {
        return companhia;
    }*/

    @Override
    public boolean solicitacaoComprarCaminho(String companhia) throws RemoteException {
        return false;

    }

    @Override
    public boolean comprarCaminhoCompanhia(List<String> idCidades, String companhia) throws RemoteException {
      
        InterfServerToServer lookupMethod = null;
        InterfServerToServer lookupMethodTwo = null;
        
        try{
                lookupMethod = CompanhiaControllerServer.getserverUmLookupMethod();
            }

            try{
                lookupMethodTwo = CompanhiaControllerServer.getserverUmLookupMethod();
            }
    }

    /*@Override
    public void semaforoPermis(String companhia) throws RemoteException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }*/
}