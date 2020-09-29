package view;

import java.util.ArrayList;

import control.GameController;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.stage.Window;

public class GameWindow extends Stage{
	
	private Scene scene;
	private Label Contendor;
	private Button boton1;
	private Button boton2;
	private Button boton3;
	private Button boton4;
	private Button boton5;
	private Button boton6;
	private Button boton7;
	private Button boton8;
	private Button boton9;
	private VBox vbox;
	private HBox hbox;
	private HBox hbox2;
	private HBox hbox3;
	private Label idClient;
	private String id;
	
	private GameController control;
	
	public GameWindow(String id) {
		this.id = id;
		hbox = new HBox();
		hbox2 = new HBox();
		hbox3 = new HBox();
		idClient = new Label();
		//idClient.setVisible(false);
		
		boton1 = new Button("   ");
		boton2 = new Button("   ");
		boton3 = new Button("   ");
		boton4 = new Button("   ");
		boton5 = new Button("   ");
		boton6 = new Button("   ");
		boton7 = new Button("   ");
		boton8 = new Button("   ");
		boton9 = new Button("   ");
		
		boton1.setPrefSize(70,70);
		boton2.setPrefSize(70,70);
		boton3.setPrefSize(70,70);
		boton4.setPrefSize(70,70);
		boton5.setPrefSize(70,70);
		boton6.setPrefSize(70,70);
		boton7.setPrefSize(70,70);
		boton8.setPrefSize(70,70);
		boton9.setPrefSize(70,70);
		
		boton1.setId("1");
		boton2.setId("2");
		boton3.setId("3");
		boton4.setId("4");
		boton5.setId("5");
		boton6.setId("6");
		boton7.setId("7");
		boton8.setId("8");
		boton9.setId("9");
		
		
		boton1.setText("     " + boton1.getId() + "     ");
		boton2.setText("     " + boton2.getId() + "     ");
		boton3.setText("     " + boton3.getId() + "     ");
		boton4.setText("     " + boton4.getId() + "     ");
		boton5.setText("     " + boton5.getId() + "     ");
		boton6.setText("     " + boton6.getId() + "     ");
		boton7.setText("     " + boton7.getId() + "     ");
		boton8.setText("     " + boton8.getId() + "     ");
		boton9.setText("     " + boton9.getId() + "     ");
		
		Contendor = new Label("Contendor");
		vbox = new VBox();
		
		vbox.getChildren().add(Contendor);
		hbox.getChildren().add(boton1);
		hbox.getChildren().add(boton2);
		hbox.getChildren().add(boton3);
		vbox.getChildren().add(hbox);
		hbox2.getChildren().add(boton4);
		hbox2.getChildren().add(boton5);
		hbox2.getChildren().add(boton6);
		vbox.getChildren().add(hbox2);
		hbox3.getChildren().add(boton7);
		hbox3.getChildren().add(boton8);
		hbox3.getChildren().add(boton9);
		vbox.getChildren().add(hbox3);
		vbox.getChildren().add(idClient);
		
		scene = new Scene(vbox,400,400);
		this.setScene(scene);

		control = new GameController(this,id);
	
	}

	public void closeWindow() {
		this.close();
	}
	
	public HBox getHbox() {
		return hbox;
	}

	public void setHbox(HBox hbox) {
		this.hbox = hbox;
	}

	public Label getContendor() {
		return Contendor;
	}

	public Button getBoton1() {
		return boton1;
	}

	public Button getBoton2() {
		return boton2;
	}

	public Button getBoton3() {
		return boton3;
	}

	public Button getBoton4() {
		return boton4;
	}

	public Button getBoton5() {
		return boton5;
	}

	public Button getBoton6() {
		return boton6;
	}

	public Button getBoton7() {
		return boton7;
	}

	public Button getBoton8() {
		return boton8;
	}

	public Button getBoton9() {
		return boton9;
	}

	public VBox getVbox() {
		return vbox;
	}

	public HBox getHbox2() {
		return hbox2;
	}

	public HBox getHbox3() {
		return hbox3;
	}

	public GameController getControl() {
		return control;
	}

	public Label getIdClient() {
		return idClient;
	}

	public void setIdClient(Label idClient) {
		this.idClient = idClient;
	}
	
}
