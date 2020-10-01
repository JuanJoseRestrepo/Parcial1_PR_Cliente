package control;

import java.awt.peer.TextComponentPeer;
import java.util.UUID;

import com.google.gson.Gson;

import comm.TCPConnection;
import javafx.application.Platform;
import view.GameWindow;
import view.ConnectionWindow;
import model.*;

public class ConnectionController implements TCPConnection.OnConnectionListener {
	
	private ConnectionWindow view;
	private TCPConnection connection;
	private String idGlobal;
	
	public ConnectionController(ConnectionWindow view) {
		this.view = view;
		init();
	}
	
	public void init() {
		connection = TCPConnection.getInstance();
		connection.setConnectionListener(this);
		connection.setIp("127.0.0.1");
		connection.setPuerto(5000);
		
		view.getBoton1().setOnAction(
				
				(e)->{
					
					connection.start();
					
				}
				
				
				);
		
		
	}

	@Override
	public void onConnection() {
		//-----------------------------------------------
		// TODO Auto-generated method stub
		// No se puede utilizar metodos con resultados grafico en un hilo que no sea principal

			Platform.runLater(
					
					()->{
						GameWindow window = new GameWindow(idGlobal);
						window.show();
						view.close();
					}
					
					
					);	
		
		
		
	}

	@Override
	public void onConnectionListener() {
		
		idGlobal = UUID.randomUUID().toString();
		UserMessage m = new UserMessage(idGlobal,"Conectado","");
		Gson gson = new Gson();
		String msj = gson.toJson(m);
		connection.getEmisor().setMessage(msj);
			
	}
	

}
