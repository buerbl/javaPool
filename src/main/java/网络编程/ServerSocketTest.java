package 网络编程;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @Description:
 * @Author: boolean
 * @Date: 2020/1/7 18:17
 */
public class ServerSocketTest {
    public static void main(String[] args) {
        try {
            // 1 初始化服务端 socket 并且绑定 9999 端口
            ServerSocket serverSocket = new ServerSocket(9999);
            // 2 等待客户端连接
            Socket socket = serverSocket.accept();

            // 3 获取输入流
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));

            // 4 读取一行数据
            String srt = bufferedReader.readLine();

            // 5 输出打印
            System.out.println(srt);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}



