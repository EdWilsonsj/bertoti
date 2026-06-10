package com.example;

import com.example.controller.ListaController;
import com.example.model.ListaModel;
import com.example.view.ListaView;
import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage stage) {

        ListaModel model = new ListaModel();

        ListaController controller = new ListaController();

        ListaView listaView = new ListaView(
                stage,
                model
        );
    }

    public static void main(String[] args) {
        launch(args);
    }
}