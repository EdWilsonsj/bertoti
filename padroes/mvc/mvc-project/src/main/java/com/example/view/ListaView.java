package com.example.view;

import com.example.controller.AdicionarStrategy;
import com.example.controller.RemoverStrategy;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import com.example.model.ListaModel;
import com.example.model.Obs;
import com.example.model.Produto;

public class ListaView implements Obs {

    private final ListaModel model;

    private final ListView<Produto> lista = new ListView<>();

    public ListaView(Stage stage,
                     ListaModel model) {

        this.model = model;

        model.adicionarObserver(this);

        TextField txtNome =
                new TextField();

        txtNome.setPromptText("Nome do Produto");

        TextField txtValor =
                new TextField();

        txtValor.setPromptText("Valor");

        Button btnAdicionar =
                new Button("Adicionar");

        Button btnRemover =
                new Button("Remover");

        btnAdicionar.setOnAction(e -> {

            try {

                String nome =
                        txtNome.getText();

                double valor =
                        Double.parseDouble(
                                txtValor.getText());

                Produto produto =
                        new Produto(nome, valor);

                new AdicionarStrategy(model)
                        .executar(produto);

                txtNome.clear();
                txtValor.clear();

            } catch (NumberFormatException ex) {

                Alert alert =
                        new Alert(Alert.AlertType.ERROR);

                alert.setHeaderText(null);
                alert.setContentText(
                        "Valor inválido!");

                alert.show();
            }
        });

        btnRemover.setOnAction(e -> {

            Produto produto =
                    lista.getSelectionModel()
                         .getSelectedItem();

            if (produto != null) {

                new RemoverStrategy(model)
                        .executar(produto);
            }
        });

        HBox botoes =
                new HBox(10,
                        btnAdicionar,
                        btnRemover);

        VBox root =
                new VBox(
                        10,
                        txtNome,
                        txtValor,
                        botoes,
                        lista
                );

        root.setPadding(
                new Insets(15));

        stage.setScene(
                new Scene(root, 500, 400));

        stage.setTitle(
                "Cadastro de Produtos");

        stage.show();
    }

    @Override
    public void update() {

        lista.getItems().setAll(
                model.getProdutos());
    }
}