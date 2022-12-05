import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.reflect.InvocationTargetException;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws IOException {
        while (1<2){
            Socket za = new Socket("localhost",7777);
            DataOutputStream message = new DataOutputStream(za.getOutputStream());
            Scanner myObj = new Scanner(System.in);
            String ds=myObj.nextLine();
            String m= ds;
            message.writeUTF(m);
            DataInputStream response = new DataInputStream(za.getInputStream());
            String vaminy= response.readUTF();
            System.out.println(vaminy);
        }


    }
}
