package com.abhisheksingh.morethanheapspace;

import javax.net.ServerSocketFactory;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerSock {
    public static void main(String[] args) throws IOException {
//        ServerSocket ss = new ServerSocket(5000);
//
//        Socket s = ss.accept();
//        System.out.println("Client accepted");

        System.out.println("Server Socket");
        int port = 16000;
        ServerSocket serverSocket =
                ServerSocketFactory.getDefault()
                        .createServerSocket(port, 1, InetAddress.getLoopbackAddress());
        while (true) {
            // Echo Server
            Socket accept = serverSocket.accept();
            final var br =
                    new BufferedReader(new InputStreamReader(accept.getInputStream())).readLine();
            System.out.println(br);
            final var os = accept.getOutputStream();
            final var printWrite = new PrintWriter(os, true);
            printWrite.println(br + " " + "from server");
        }
    }
}
































