import java.io.*;
import java.net.*;
import java.util.Calendar;

public class pingclient {
    public static void main(String args[]) throws Exception{
        String str;
        int c =0;
        long t1, t2;
        Socket s = new Socket("127.0.0.1",5000);
        DataInputStream dis = new DataInputStream(s.getInputStream());
        PrintStream out = new PrintStream(s.getOutputStream());
        while(c<4){
            t1 =System.currentTimeMillis();
            str ="Welcome";
            System.out.println(str);
            //System.out.println(dis.readLine()); 
            t2 =System.currentTimeMillis();
            System.out.println(";TTL="+(t2-t1)+"ms");
            c++;
        }
        s.close();

    }
    
}
