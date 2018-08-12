package com.example.lib100;

import java.io.IOException;
import java.net.Socket;

public class MyClass {

    public static void main (String[] args){
        String hostname="milou.local";
        int port=5000;

        try {
            Socket s = new Socket(hostname, port);

            s.close();
        }catch(IOException e){
            e.printStackTrace();
        }

        String request = "GET / HTTP/1.1\n\n";
        byte[] requestBytes = request.getBytes();
        s.getOutputStream().write(requestBytes);
        //  Scanner sc = new Scanner(s.getInputStream());
        //while(sc.hasNextLine()){
            //System.out.println(sc.nextLine());
    }


}
