package com.step;

import java.io.*;
import java.net.Inet4Address;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public Client() throws IOException {
//        127.0.0.1 - local host
        try (Socket server = new Socket("127.0.0.1", 8100)) {
            OutputStream outputStream = server.getOutputStream();
            PrintWriter printWriter = new PrintWriter(outputStream, true);

            //Scanner scanner = new Scanner(System.in);

            printWriter.println("John");
            BufferedReader reader = new BufferedReader(new InputStreamReader(server.getInputStream()));
            System.out.println("Raspuns de la server: " + reader.readLine());
        }
    }

    public static void main(String[] args) throws IOException {
        Client client = new Client();
    }
}
