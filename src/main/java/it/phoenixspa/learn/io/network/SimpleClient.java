package it.phoenixspa.learn.io.network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ConnectException;
import java.net.Socket;
import java.net.UnknownHostException;

public class SimpleClient {
    public static void main(String args[]) {
        int port = 12345;
        String host = "127.0.0.1";
        try {
            Socket socket = new Socket(host, port);
            InputStream inputStream = socket.getInputStream();
            InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
            BufferedReader reader = new BufferedReader(inputStreamReader);
            System.out.println(reader.readLine());
        } catch (ConnectException e) {
            System.err.println("Error in managing socket stream");
            e.printStackTrace();
        } catch (UnknownHostException e) {
            System.err.println("Host sconosciuto: " + host);
            e.printStackTrace();
        } catch (IOException e) {
            System.err.println("eccezione IO");
            e.printStackTrace();
        }
    }
}
