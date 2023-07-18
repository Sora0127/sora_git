package application;

import java.math.BigDecimal;

import javafx.application.Application;  
import javafx.event.ActionEvent;  
import javafx.event.EventHandler;  
import javafx.geometry.Pos;  
import javafx.scene.Scene;  
import javafx.scene.control.Button;  
import javafx.scene.control.TextField;  
import javafx.scene.layout.HBox;  
import javafx.scene.layout.VBox;  
import javafx.stage.Stage;  
  
public class 監聽函式 extends Application {  
  
private TextField num1Field, num2Field, resultField;  
  
@Override  
public void start(Stage primaryStage) {  
	num1Field = new TextField();  
	num2Field = new TextField();  
	resultField = new TextField();  
	resultField.setEditable(false);  
	
	num1Field.textProperty().addListener((x) -> {
		resultField.setText("");
	});
  
	num2Field.textProperty().addListener((x) -> {
		resultField.setText("");
	});
	
	Button 相加 = new Button("相加");  
	相加.setOnAction(new EventHandler<ActionEvent>() {  
	@Override  
	public void handle(ActionEvent event) { 
			double num1 = Double.parseDouble(num1Field.getText());  
			double num2 = Double.parseDouble(num2Field.getText());
			if(resultField.getText().length()>0) {
				num1 = Double.parseDouble(resultField.getText());
				num1Field.setText(Double.toString(num1));
			}
			double result = num1 + num2;  
			
			resultField.setText(String.valueOf(new BigDecimal(result).setScale(5,BigDecimal.ROUND_HALF_UP)));  
		}  
	});  
  
	Button 相減 = new Button("相減");  
	相減.setOnAction(new EventHandler<ActionEvent>() {  
	@Override  
	public void handle(ActionEvent event) {  
			double num1 = Double.parseDouble(num1Field.getText());  
			double num2 = Double.parseDouble(num2Field.getText());
			if(resultField.getText().length()>0) {
				num1 = Double.parseDouble(resultField.getText());
				num1Field.setText(Double.toString(num1));
			}
			double result = num1 - num2;  
			resultField.setText(String.valueOf(new BigDecimal(result).setScale(5,BigDecimal.ROUND_HALF_UP)));   
		}  
	});  
  
	HBox hbox1 = new HBox(10, num1Field, num2Field);  
	HBox hbox2 = new HBox(10, resultField); 
	HBox hbox3 = new HBox(10, 相減 ,相加); 

	hbox1.setAlignment(Pos.CENTER);  
	hbox2.setAlignment(Pos.CENTER);  
	hbox3.setAlignment(Pos.CENTER); 
  
	VBox vbox = new VBox(10, hbox1, hbox2, hbox3);  
	vbox.setAlignment(Pos.CENTER);  
  	
	Scene scene = new Scene(vbox, 300, 200);  
		  
		primaryStage.setTitle("Simple Calculator");  
		primaryStage.setScene(scene);  
		primaryStage.show();  
	}  	
  
	public static void main(String[] args) {  
		launch(args);  
	}  
}