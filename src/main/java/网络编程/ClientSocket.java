package 网络编程;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.nio.Buffer;

/**
 * @Description:
 * @Author: boolean
 * @Date: 2020/1/7 18:23
 */
public class ClientSocket {
    public static void main(String[] args) {
        try {
            // 1 绑定本地的端口
            Socket socket = new Socket("127.0.0.1",9999);
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
            String str = "你好，这是我的第一个 socket";
            bufferedWriter.write(str);
            // 刷新输入流
            bufferedWriter.flush();
            // 关闭 socket 的输出流
            socket.shutdownOutput();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}



