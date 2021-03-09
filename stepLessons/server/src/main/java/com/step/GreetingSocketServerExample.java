package com.step;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class GreetingSocketServerExample {
    public GreetingSocketServerExample() throws IOException {
        try (ServerSocket serverSocket = new ServerSocket(8100)) {
//            asteptam un client
            Socket client = serverSocket.accept();

            InputStream input = client.getInputStream();
//            BufferedReader ii folosit pentru a citi rand cu rand ce nu char cu char
            BufferedReader reader = new BufferedReader(new InputStreamReader(input));
            String cerere = reader.readLine();
            System.out.println("Cerere de la client: " + cerere);



            OutputStream output = client.getOutputStream();
            PrintWriter writer = new PrintWriter(output);
            writer.println("Hello, " + cerere);
//            flush ii transmite clientului
            writer.flush();
        }
    }

    public static void main(String[] args) throws IOException {
        GreetingSocketServerExample object = new GreetingSocketServerExample();
    }
}
