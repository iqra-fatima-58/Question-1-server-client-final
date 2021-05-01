
package networksocket;

import java.io.DataOutputStream;
import java.net.Socket;
import javax.swing.JOptionPane;


public class MyClient {

    public static void main(String[] args) {

        try {
            Socket s = new Socket("localhost", 127);

            DataOutputStream dout = new DataOutputStream(s.getOutputStream());

            dout.writeUTF("Client sending message hello!!!");

            dout.flush();
            dout.close();
            s.close();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

}
