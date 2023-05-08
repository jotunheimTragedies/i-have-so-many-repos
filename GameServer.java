import java.io.*;
import java.net.*;

public class GameServer {
    private ServerSocket serverSocket; 
    private int numPlayers; 
    private int maxPlayers; 

    public GameServer() {
        System.out.println("---- GAME SERVER ----");
        numPlayers = 0; 
        maxPlayers = 2; 

        try {
            serverSocket = new ServerSocket(65000);
        
        } catch(IOException ex) {
            System.out.println("IOException from GameServer constructor");
        }
    }

    public void acceptConnections() {
        try {
            System.out.println("Waiting for connections...");
            while(numPlayers < maxPlayers) {
                Socket s = serverSocket.accept();
                numPlayers++; 
                System.out.println("Player #" + numPlayers + " has connected.");
            }
            System.out.println("We now have 2 players. No longer accepting connections.");

        } catch(IOException ex) {
            System.out.println("IOException from acceptConnections() GameServer");
        }
    }
    
    public static void main(String[] args) {
        GameServer gs = new GameServer();
        gs.acceptConnections();
    }
}
