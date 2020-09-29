package control;

import java.util.ArrayList;
import java.util.Calendar;

import com.google.gson.Gson;

import comm.Receptor.OnMessageListener;
import javafx.application.Platform;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ToggleButton;
import javafx.scene.control.ToggleGroup;
import main.Launcher;
import model.CheckTile;
import model.DirectMessage;
import model.Generic;
import model.Jugador;
import model.Message;
import model.NewConnection;
import model.UserDisconnect;
import model.UserMessage;
import comm.TCPConnection;
import view.GameWindow;
import view.ConnectionWindow;

public class GameController implements OnMessageListener {

	private GameWindow view;
	private TCPConnection connection;

	private ArrayList<NewConnection> conectados;
	private int myDevilPoint;
	private String id;
	
	public GameController(GameWindow view,String id) {
		this.view = view;
		this.id = id;
		myDevilPoint = (int) (Math.random() * 9) + 1;
		System.out.println(myDevilPoint);
		conectados = new ArrayList<NewConnection>();
		init();
	}

	public void init() {
		connection = TCPConnection.getInstance();
		connection.setListerOnMessage(this);
		
		view.getBoton1().setOnAction(
				(e)->{
				
					

					int casilla = Integer.parseInt(view.getBoton1().getId());
					Gson gson = new Gson();
					CheckTile check = new CheckTile(id,casilla,id);
					String msj = gson.toJson(check);
					connection.getEmisor().setMessage(msj);
				
					view.getBoton1().setDisable(true);
					view.getBoton2().setDisable(true);
					view.getBoton3().setDisable(true);
					view.getBoton4().setDisable(true);
					view.getBoton5().setDisable(true);
					view.getBoton6().setDisable(true);
					view.getBoton7().setDisable(true);
					view.getBoton8().setDisable(true);
					view.getBoton9().setDisable(true);
					
				}
				
				);
		
		
		view.getBoton2().setOnAction( 
				
				(e)->{
					
			
					int casilla = Integer.parseInt(view.getBoton2().getId());
					Gson gson = new Gson();
					CheckTile check = new CheckTile(id,casilla,id);
					String msj = gson.toJson(check);
					connection.getEmisor().setMessage(msj);
				
					view.getBoton1().setDisable(true);
					view.getBoton2().setDisable(true);
					view.getBoton3().setDisable(true);
					view.getBoton4().setDisable(true);
					view.getBoton5().setDisable(true);
					view.getBoton6().setDisable(true);
					view.getBoton7().setDisable(true);
					view.getBoton8().setDisable(true);
					view.getBoton9().setDisable(true);
					
				}
				
				);
		
		view.getBoton3().setOnAction( 
				
				(e)->{
					
	
					int casilla = Integer.parseInt(view.getBoton3().getId());
					Gson gson = new Gson();
					CheckTile check = new CheckTile(id,casilla,id);
					String msj = gson.toJson(check);
					connection.getEmisor().setMessage(msj);
				
					view.getBoton1().setDisable(true);
					view.getBoton2().setDisable(true);
					view.getBoton3().setDisable(true);
					view.getBoton4().setDisable(true);
					view.getBoton5().setDisable(true);
					view.getBoton6().setDisable(true);
					view.getBoton7().setDisable(true);
					view.getBoton8().setDisable(true);
					view.getBoton9().setDisable(true);
					
				}
				
				);
		
		view.getBoton4().setOnAction( 
				
				(e)->{
					
	
					int casilla = Integer.parseInt(view.getBoton4().getId());
					Gson gson = new Gson();
					CheckTile check = new CheckTile(id,casilla,id);
					String msj = gson.toJson(check);
					connection.getEmisor().setMessage(msj);
				
					view.getBoton1().setDisable(true);
					view.getBoton2().setDisable(true);
					view.getBoton3().setDisable(true);
					view.getBoton4().setDisable(true);
					view.getBoton5().setDisable(true);
					view.getBoton6().setDisable(true);
					view.getBoton7().setDisable(true);
					view.getBoton8().setDisable(true);
					view.getBoton9().setDisable(true);
					
				}
				
				);
		
		view.getBoton5().setOnAction( 
				
				(e)->{
					
	
					int casilla = Integer.parseInt(view.getBoton5().getId());
					Gson gson = new Gson();
					CheckTile check = new CheckTile(id,casilla,id);
					String msj = gson.toJson(check);
					connection.getEmisor().setMessage(msj);
				
					view.getBoton1().setDisable(true);
					view.getBoton2().setDisable(true);
					view.getBoton3().setDisable(true);
					view.getBoton4().setDisable(true);
					view.getBoton5().setDisable(true);
					view.getBoton6().setDisable(true);
					view.getBoton7().setDisable(true);
					view.getBoton8().setDisable(true);
					view.getBoton9().setDisable(true);
					
				}
				
				);

		view.getBoton6().setOnAction( 
				
				(e)->{
					
				
					int casilla = Integer.parseInt(view.getBoton6().getId());
					Gson gson = new Gson();
					CheckTile check = new CheckTile(id,casilla,id);
					String msj = gson.toJson(check);
					connection.getEmisor().setMessage(msj);
				
					view.getBoton1().setDisable(true);
					view.getBoton2().setDisable(true);
					view.getBoton3().setDisable(true);
					view.getBoton4().setDisable(true);
					view.getBoton5().setDisable(true);
					view.getBoton6().setDisable(true);
					view.getBoton7().setDisable(true);
					view.getBoton8().setDisable(true);
					view.getBoton9().setDisable(true);
					
				}
				
				);
		
		view.getBoton7().setOnAction( 
				
				(e)->{
					
			
					int casilla = Integer.parseInt(view.getBoton7().getId());
					Gson gson = new Gson();
					CheckTile check = new CheckTile(id,casilla,id);
					String msj = gson.toJson(check);
					connection.getEmisor().setMessage(msj);
				
					view.getBoton1().setDisable(true);
					view.getBoton2().setDisable(true);
					view.getBoton3().setDisable(true);
					view.getBoton4().setDisable(true);
					view.getBoton5().setDisable(true);
					view.getBoton6().setDisable(true);
					view.getBoton7().setDisable(true);
					view.getBoton8().setDisable(true);
					view.getBoton9().setDisable(true);
					
				}
				
				);
		
		view.getBoton8().setOnAction( 
				
				(e)->{
					
			
					int casilla = Integer.parseInt(view.getBoton8().getId());
					Gson gson = new Gson();
					CheckTile check = new CheckTile(id,casilla,id);
					String msj = gson.toJson(check);
					connection.getEmisor().setMessage(msj);
				
					view.getBoton1().setDisable(true);
					view.getBoton2().setDisable(true);
					view.getBoton3().setDisable(true);
					view.getBoton4().setDisable(true);
					view.getBoton5().setDisable(true);
					view.getBoton6().setDisable(true);
					view.getBoton7().setDisable(true);
					view.getBoton8().setDisable(true);
					view.getBoton9().setDisable(true);
					
				}
				
				);
		
		view.getBoton9().setOnAction( 
				
				(e)->{
					
				
					int casilla = Integer.parseInt(view.getBoton9().getId());
					Gson gson = new Gson();
					CheckTile check = new CheckTile(id,casilla,id);
					String msj = gson.toJson(check);
					connection.getEmisor().setMessage(msj);
				
					view.getBoton1().setDisable(true);
					view.getBoton2().setDisable(true);
					view.getBoton3().setDisable(true);
					view.getBoton4().setDisable(true);
					view.getBoton5().setDisable(true);
					view.getBoton6().setDisable(true);
					view.getBoton7().setDisable(true);
					view.getBoton8().setDisable(true);
					view.getBoton9().setDisable(true);
					
				}
				
				);
		
	}

	@Override
	public void onMessage(String message) {
		// ----------------------
		Platform.runLater(

				() -> {
					Gson gson = new Gson();
					Generic msjObj = gson.fromJson(message,Generic.class);
					System.out.println(msjObj.getType());
					switch(msjObj.getType()) {
					
					case "NewConnection":
						NewConnection nuevaConexion = gson.fromJson(message, NewConnection.class);

						if (nuevaConexion.getBody().isEmpty()) {

							conectados.add(nuevaConexion);
							System.out.println(conectados.size());
							
						} else {
							//reloadStage();
							System.out.println("EHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH");
							view.closeWindow();
							connection.closeSocket();		
						}
					break;
					
					case "Message":
						
						Message mensajeLlegado = gson.fromJson(message, Message.class);

						int numero = Integer.parseInt(mensajeLlegado.getBody());
						
							if(numero == myDevilPoint) {
							
								System.out.println("sadasdasd");
								UserDisconnect usuarioDesconectado = new UserDisconnect(id);
								String mensajePrincipal = gson.toJson(usuarioDesconectado);
								connection.getEmisor().setMessage(mensajePrincipal);
								
								Alert alert = new Alert(AlertType.INFORMATION);
								alert.setTitle("Acabaste de perder jugador:(" + "  " + usuarioDesconectado.getId());
								alert.setHeaderText("Acabas de perder la partida, por favor juega mas");
								alert.setContentText("¡Yikes!");
								alert.showAndWait();
								
								view.close();
								connection.closeSocket();
								
							}else {
							view.getBoton1().setDisable(false);
							view.getBoton2().setDisable(false);
							view.getBoton3().setDisable(false);
							view.getBoton4().setDisable(false);
							view.getBoton5().setDisable(false);
							view.getBoton6().setDisable(false);
							view.getBoton7().setDisable(false);
							view.getBoton8().setDisable(false);
							view.getBoton9().setDisable(false);
							}	
						
						
					break;
					
					case "UserDisconnect":
					

						UserDisconnect mensajeDesconexion = gson.fromJson(message, UserDisconnect.class);	
						
						view.getBoton1().setDisable(false);
						view.getBoton2().setDisable(false);
						view.getBoton3().setDisable(false);
						view.getBoton4().setDisable(false);
						view.getBoton5().setDisable(false);
						view.getBoton6().setDisable(false);
						view.getBoton7().setDisable(false);
						view.getBoton8().setDisable(false);
						view.getBoton9().setDisable(false);
						
					
						
						System.out.println("ganaste");
						
					break;
				
						
					}

				}

		);

	}


	
	
	public void reloadStage() {
		
		Platform.runLater(
				
				()->{
					ConnectionWindow window = new ConnectionWindow();
					window.show();
					view.closeWindow();
				}
				
				
				);	
		
	}
	

}
