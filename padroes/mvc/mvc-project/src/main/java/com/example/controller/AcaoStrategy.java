package com.example.controller;

public interface AcaoStrategy<T> {

    void executar(T objeto);
}
