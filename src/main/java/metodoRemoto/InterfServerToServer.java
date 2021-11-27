/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodoRemoto;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;
import util.Grafo;

/**
 *
 * @authors Alexandre & Bianca
 */
public interface InterfServerToServer extends Remote {

    public ArrayList<Grafo> getGrafoCompanhia() throws RemoteException;

    public String getNomeCompanhia() throws RemoteException;

    public boolean solicitacaoComprarTrecho(String companhia) throws RemoteException;

    public boolean comprarRotaCompanhia(List<String> idCidades, String companhia) throws RemoteException;

    public void semaforoTirarPerm(String companhia) throws RemoteException;

}
