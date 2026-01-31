/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */
package aula25a;


import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author sn1085640
 */
public class Aula25a extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        // Controles do Formulário
        Label labelNome = new Label("Nome:");
        TextField textFieldNome = new TextField();
        
        Label labelIdade = new Label("Idade:");
        TextField textFieldIdade = new TextField();
        
        // Botões de ação
        Button btnSalvar = new Button("Salvar");
        Button btnLimpar = new Button("Limpar Formulário");
        Button btnFechar = new Button("Fechar");
        
        // Layout dos botões
        HBox hboxBotoes = new HBox(10); // 10 é o espaçamento em px entre os botões
        hboxBotoes.getChildren().addAll(btnSalvar, btnLimpar, btnFechar);
        
        // Layout principal do formulário
        VBox root = new VBox(10); // 10 é o espacento em px entre o VBox e as bordas do formulário
        root.setPadding(new Insets(20)); // Adiciona um espaçamento interno
        root.getChildren().addAll(
            labelNome, textFieldNome, 
            labelIdade, textFieldIdade,
            hboxBotoes
        );
        
        // Lógica dos botões
        btnSalvar.setOnAction(e -> {
            String nome = textFieldNome.getText(); // captura o nome digitado
            String idade = textFieldIdade.getText();
            System.out.println("--- DADOS SALVOS ---");
            System.out.println("Nome: " + nome);
            System.out.println("Idade: " + idade);
        });
        
        btnLimpar.setOnAction(e -> {
           textFieldNome.clear();
           textFieldIdade.clear();
        });
        
        btnFechar.setOnAction(e -> {
            primaryStage.close();
        });
        
        // Configurando a cena e o palco
        Scene scene = new Scene(root, 300, 200); //conteiner, largura, altura
        primaryStage.setTitle("Cadastro de Aluno");
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
