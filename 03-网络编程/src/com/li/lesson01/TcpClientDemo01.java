package com.li.lesson01;
import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

/*
客户端
 */
public class TcpClientDemo01 {
    public static void main(String[] args) {
        Socket socket = null;
        OutputStream outputStream  = null;
        try {
            //1.要知道服务器的地址
            InetAddress severIP = InetAddress.getByName("127.0.0.1");
            //端口号
            int port = 9999;
            //2.创建一个socket连接
            socket = new Socket(severIP,port);
            //3.发送消息 IO流
            outputStream = socket.getOutputStream();
            outputStream.write("这是一个小测试".getBytes(StandardCharsets.UTF_8));

        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (outputStream!= null){
                try {
                    outputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (socket != null){
                try {
                    socket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}

