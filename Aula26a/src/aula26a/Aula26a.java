/*  Nesse programa vamos criar caixas de opção
 */
package aula26a;

import java.time.LocalDate;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class Aula26a extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        Label labelNome = new Label("Nome do aluno:");
        TextField textFieldNome = new TextField();
        Label labelCursos = new Label("Cursos");
        CheckBox checkBoxJava = new CheckBox("Java");
        CheckBox checkBoxPython = new CheckBox("Python");
        CheckBox checkBoxPowerBi = new CheckBox("Power BI");
        CheckBox checkBoxWeb = new CheckBox("Desenvolvedor Front-end");
        
        Label labelDataNascimento = new Label("Data de Nascimento:");
        DatePicker datePickerDataNascimento = new DatePicker();
        datePickerDataNascimento.setValue(LocalDate.now());
        
        Label labelCidades = new Label("Cidade");
        ListView<String> listViewCidades = new ListView();
        listViewCidades.setPrefSize(200, 100);
        listViewCidades.setItems(FXCollections.observableArrayList(
                "Guarulhos Centro",
                "Guarulhos Dutra",
                "Aruja",
                "Mairiporã"
        ));
        
        ChoiceBox<String> choiceBoxPeriodo = new ChoiceBox();
        choiceBoxPeriodo.getItems().addAll(
                "Manhã",
                "Tarde",
                "Noite",
                "Sábado"                
        );
        choiceBoxPeriodo.setValue("Manhã"); // Valor Padrão
        Label labelPeriodo = new Label("Périodo:");
        
        Button btnSalvar = new Button("Salvar");
        Button btnLimpar = new Button("Limpar Formulário");
        Button btnFechar = new Button("Fechar");
        
        HBox hboxBotoes = new HBox(10, btnSalvar, btnLimpar, btnFechar);
        
        HBox hboxPeriodo = new HBox(10, labelPeriodo, choiceBoxPeriodo);
        
        VBox root = new VBox(10);
        root.setPadding(new Insets(20));
        root.getChildren().addAll(
            labelNome, 
            textFieldNome,
            labelDataNascimento,
            datePickerDataNascimento,
            labelCursos,
            checkBoxJava,
            checkBoxPython,
            checkBoxPowerBi,
            checkBoxWeb,
            hboxPeriodo,            
            labelCidades,
            listViewCidades,
            hboxBotoes            
        );
        
        btnSalvar.setOnAction(e -> {
            String periodo = choiceBoxPeriodo.getValue();
            String cidade = listViewCidades.getSelectionModel().getSelectedItem();
            
            LocalDate dataNascimento = datePickerDataNascimento.getValue();
            int dia = datePickerDataNascimento.getValue().getDayOfMonth();
            int mes = datePickerDataNascimento.getValue().getMonthValue();
            int ano = datePickerDataNascimento.getValue().getYear();
            
            String nome = textFieldNome.getText();
            String cursoJava = checkBoxJava.getText();
            String cursoPython = checkBoxPython.getText();
            String cursoPowerBi = checkBoxPowerBi.getText();
            String cursoWeb = checkBoxWeb.getText();
            
            System.out.println("--- Dados Salvo ---");
            System.out.println("Nome: " + nome);
            System.out.println("Data de Nascimento: " + dataNascimento);
            System.out.println("Periodo: " + dia + "/" + mes + "/" + ano);
            System.out.println("Cidade: " + cidade);
            if (checkBoxJava.isSelected()) {
                System.out.println("Curso: " + cursoJava);
            }
            if (checkBoxPython.isSelected()) {
                System.out.println("Curso: " + cursoPython);
            }
            if (checkBoxPowerBi.isSelected()){
                System.out.println("Curso: " + cursoPowerBi);
            }
            if (checkBoxWeb.isSelected()){
                System.out.println("Curso: " + cursoWeb);
            }             
            
        });
        
        Scene scene = new Scene(root, 300, 500);
        primaryStage.setTitle("Seleção de Cursos");
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
