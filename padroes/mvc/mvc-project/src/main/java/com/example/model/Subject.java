package com.example.model;

public interface Subject {

    void adicionarObserver(Obs observer);

    void removerObserver(Obs observer);

    void notificarObservers();
    
}