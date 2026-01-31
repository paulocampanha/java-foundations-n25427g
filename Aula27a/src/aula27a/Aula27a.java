/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */
package aula27a;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

/**
 *
 * @author SN1085640
 */
public class Aula27a extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        
        Button btnAlunos = new Button("Alunos");
        Button btnProfessores = new Button("Professores");
        Button btnCursos = new Button("Cursos");
        Button btnFechar = new Button("Fechar");
        
        HBox hboxBotoes = new HBox(10, btnAlunos, btnProfessores,
        btnCursos, btnFechar);
        
        btnAlunos.setOnAction(e -> new FormAlunos().exibir());
        
        VBox root = new VBox(10);
        root.setPadding(new Insets(20));
        root.getChildren().add(hboxBotoes);
        
        Scene scene = new Scene(root, 350, 100);
        
        primaryStage.setTitle("Sistema de Gestão Escolar");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
