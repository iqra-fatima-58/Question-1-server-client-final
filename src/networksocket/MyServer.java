
package networksocket;

import java.io.DataInputStream;
import java.net.ServerSocket;
import java.net.Socket;
import javax.swing.JOptionPane;


public class MyServer {

    public static void main(String[] args) {
        try {
            ServerSocket ss = new ServerSocket(127);
            while (true) {
                System.out.println("Going to Establish Connection....\n\n");
                Socket s = ss.accept();// 
                System.out.println("Connection Extablish \n");

                DataInputStream dis = new DataInputStream(s.getInputStream());
                String str = (String) dis.readUTF();
                System.out.println("massage :" + str);

                if (str.equalsIgnoreCase("$/@")) {
                    ss.close();
                    break;
                }
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
}
