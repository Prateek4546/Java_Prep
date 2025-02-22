package newConcept;

import java.net.InetAddress;

public class LocalHostDemo {
    public static void main(String[] args) {
        try{
            InetAddress localhost = InetAddress.getLocalHost();
            System.out.println("LocalHost Name: "+localhost.getHostName());
            System.out.println("LocalHost Address: "+localhost.getHostAddress());
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
