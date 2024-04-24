package SingleThreaded;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    public void run() throws IOException {
        int port = 9010;
        ServerSocket socket = new ServerSocket(port);
        socket.setSoTimeout(10000);//10sec
        while(true){
            System.out.println("server is listening on port " +port);
            Socket acceptConnection = socket.accept();//the below code doesn't execute till socket accepts.
            System.out.println("connection accepted from client "+acceptConnection.getRemoteSocketAddress());
            PrintWriter toClient = new PrintWriter(acceptConnection.getOutputStream());
//            the PrintWriter handles the conversion of characters to bytes, and acceptConnection.getOutputStream() provides the output stream through which the bytes are sent to the client over the network.
            BufferedReader fromClient = new BufferedReader(new InputStreamReader(acceptConnection.getInputStream()));
//            the above line from client we get bytes(1's and 0's) which we should convert that to character's done by InputStreamReader the BufferedReader is wrapper around the InputStreamReader.
            toClient.println("hello from the server");
            toClient.close();
            fromClient.close();
            socket.close();
        }

    }
    public static void main(String[] args)  {
//        System.out.println("Hello world!");
        Server server = new Server();//here we are initializing because the run method is non-static
        try{
            server.run();
        }catch (Exception ex){
            ex.printStackTrace();
        }

    }

}