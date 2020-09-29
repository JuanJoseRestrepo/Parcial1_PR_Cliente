package view;

import control.ConnectionController;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ConnectionWindow extends Stage{
	
	private Scene scene;
	private Label labelPrChat;
	private BorderPane paneInicial;
	private Button boton1;
	private ConnectionController control;
	
	public ConnectionWindow() {
		

		labelPrChat = new Label("Enviando al servidor");
		
		paneInicial = new BorderPane();

		boton1 = new Button("Conectar");
		VBox vbox = new VBox();
		vbox.getChildren().add(labelPrChat);
		vbox.getChildren().add(boton1);
		
		paneInicial.setCenter(vbox);
		scene = new Scene(paneInicial,400,400);
		this.setScene(scene);
		control = new ConnectionController(this);
	}

	//Permitiendo acceso al control

	public Label getLabelPrChat() {
		return labelPrChat;
	}

	public void setLabelPrChat(Label labelPrChat) {
		this.labelPrChat = labelPrChat;
	}

	public BorderPane getPaneInicial() {
		return paneInicial;
	}

	public void setPaneInicial(BorderPane paneInicial) {
		this.paneInicial = paneInicial;
	}

	public Button getBoton1() {
		return boton1;
	}

	public void setBoton1(Button boton1) {
		this.boton1 = boton1;
	}


}
