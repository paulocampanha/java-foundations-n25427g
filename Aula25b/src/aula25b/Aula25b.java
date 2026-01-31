/* Nesse formulário vamos criar dois botões de rádio para selecionar o
   sexo
*/
package aula25b;

import java.util.Optional;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class Aula25b extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        // Controles do formulário
        Label labelNome = new Label("Nome:");
        TextField textFieldNome = new TextField();
        Label labelGenero = new Label("Gênero:");
        
        ToggleGroup tgGenero = new ToggleGroup(); //Grupo para os RadioButtons
        RadioButton rbMasculino = new RadioButton("Masculino");
        RadioButton rbFeminino = new RadioButton("Feminino");
        rbMasculino.setToggleGroup(tgGenero); // Adiciona botão ao grupo
        rbFeminino.setToggleGroup(tgGenero);
        rbMasculino.setSelected(true); // Define a opção inicial
        
        HBox hboxGenero = new HBox(10, rbMasculino, rbFeminino);
        
        // Botões de Ação
        Button btnSalvar = new Button("Salvar");
        Button btnFechar = new Button("Fechar");
        HBox hboxBotoes = new HBox(10, btnSalvar, btnFechar);
        
        // Layout principal
        VBox root = new VBox(10);
        root.setPadding(new Insets(20));
        root.getChildren().addAll(
            labelNome, 
            textFieldNome, 
            labelGenero,
            hboxGenero,
            hboxBotoes
        );
        root.setStyle("-fx-background-color: #35A2F9;");     

        btnFechar.setOnAction(e -> primaryStage.close());
        
        btnSalvar.setOnAction(e -> {
            //Captura dos dados do formulário
            String nome = textFieldNome.getText();
            //Captura o botão de rádio selecionado pelo usuário
            RadioButton selectedRadioButton = (RadioButton) tgGenero.getSelectedToggle();
            String genero = selectedRadioButton.getText();
            
            // Criar uma caixa de confirmação
            Alert alertConfirmacao = new Alert(Alert.AlertType.CONFIRMATION);
            alertConfirmacao.setTitle("Confirmar Salvamento dos dados");
            alertConfirmacao.setHeaderText("Deseja salvar os dados do formulário?");
            alertConfirmacao.setContentText("Nome: " + nome);
            
            // Exibe a caixa de dialogo e captura a resposta do usuário
            Optional<ButtonType> resultado = alertConfirmacao.showAndWait();
            
            // Verifica se o usuário clicou em OK
            if (resultado.get() == ButtonType.OK) {
                System.out.println("--- Dados Salvos ---");
                System.out.println("Nome: " + nome);
                System.out.println("Genero: " + genero);
            } else {
                Alert alertCancelado = new Alert(Alert.AlertType.INFORMATION);
                alertCancelado.setTitle("Salvamento Cancelado");
                alertCancelado.setHeaderText(null);
                alertCancelado.setContentText("Operação cancelada pelo usuário");
                alertCancelado.show();
            }
            
            
        });
        
        
        
        Scene scene = new Scene(root, 300, 250);
        
        primaryStage.setTitle("Seleção do Gênero");
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
