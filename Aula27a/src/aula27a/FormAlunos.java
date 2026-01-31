/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula27a;

import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

/**
 *
 * @author SN1085640
 */
public class FormAlunos {
    
    public void exibir(){
        
        Stage janela = new Stage();
        
        janela.initModality(Modality.APPLICATION_MODAL);
        
        janela.setTitle("Cadastro de Alunos");
        
        Label labelNome = new Label("Nome do Aluno:");
        TextField textFieldNome = new TextField();
        Button btnSalvar = new Button("Salvar");
        Button btnFechar = new Button("Fechar");
        
        HBox hboxBotoes = new HBox(10, btnSalvar, btnFechar);
        
        btnFechar.setOnAction(e -> janela.close());
        
        VBox layout = new VBox(10, labelNome, textFieldNome, 
        hboxBotoes);
        layout.setPadding(new Insets(20));
        
        janela.setScene(new Scene(layout, 300, 200));
        janela.show();
        
    }
    
}
