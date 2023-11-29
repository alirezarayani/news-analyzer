package ir.lazydeveloper.util;

import ir.lazydeveloper.model.News;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by a_rayani on 11/18/2023
 */
public class ServerSocketConnection {

    private static final ServerSocketConnection SERVER_SOCKET_CONNECTION = new ServerSocketConnection();

    private List<News> newsList = new ArrayList<>();

    public ServerSocketConnection() {
        try {
            receiveMessage();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public static ServerSocketConnection getInstance() {
        return SERVER_SOCKET_CONNECTION;
    }

    public Socket openSocket() throws IOException {
        ServerSocket serverSocket = new ServerSocket(7000);
        return serverSocket.accept();
    }

    public void receiveMessage() throws IOException, ClassNotFoundException {
        Socket socket = openSocket();
        while (true) {
            InputStream is = socket.getInputStream();
            ObjectInputStream ois = new ObjectInputStream(is);
            newsList.add((News) ois.readObject());
        }
    }

    public List<News> getNewsList() {
        synchronized (this) {
            return newsList;
        }
    }
}
