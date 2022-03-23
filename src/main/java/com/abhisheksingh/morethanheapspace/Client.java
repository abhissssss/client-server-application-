package com.abhisheksingh.morethanheapspace;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;

public class Client {

    public static void main(String[] args) throws IOException {
//        Socket s = new Socket("localhost",5000);

          System.out.println(Runtime.getRuntime().totalMemory());

        System.out.println("Client Socket");

        int port = 16000;
        // Client
        InetAddress addr = InetAddress.getLoopbackAddress();
        final var clientSocket = new Socket(addr, port);
        final var os = clientSocket.getOutputStream();
        final var printWrite = new PrintWriter(os, true);
        printWrite.println("Block Vinay immediately");
        System.out.println(
                new BufferedReader(new InputStreamReader(clientSocket.getInputStream()))
                        .readLine());
    }
}
