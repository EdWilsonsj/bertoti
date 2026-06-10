package org;

import java.util.ArrayList;
import java.util.List;

public class Subject {

    Pedido pedido;
    List<Observer> observers = new ArrayList<Observer>();

    public void addObserver(Observer obs){
        observers.add(obs);
    }

    public void notificar(Pedido pedido){
        for(Observer obs: observers){
            obs.atualizar(pedido);
        }
    }
}
