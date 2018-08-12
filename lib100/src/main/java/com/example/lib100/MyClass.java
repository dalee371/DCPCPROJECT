package com.example.lib100;

import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class MyClass {

    public static void main (String[] args){
        String hostname="fierce-forest-59715.herokuapp.com";
        int port=80;

        try {
            Socket s = new Socket(hostname, port);
            s.setSoTimeout(1000);

            String request = "GET / HTTP/1.1\r\nHost: fierce-forest-59715.herokuapp.com\r\n\r\n";
            byte[] requestBytes = request.getBytes();
            s.getOutputStream().write(requestBytes);
            Scanner sc = new Scanner(s.getInputStream());
            while(sc.hasNextLine()){
                System.out.println(sc.nextLine());
            }
            s.close();
        }catch(IOException e){
            e.printStackTrace();
        }

        String request = "GET / HTTP/1.1\n\n";
        byte[] requestBytes = request.getBytes();


    }


}
