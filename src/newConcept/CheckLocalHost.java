package newConcept;

import java.net.InetAddress;

public class CheckLocalHost {
    public static void main(String[] args) {
        try{
            InetAddress[] addresses = InetAddress.getAllByName("localhost");
            for(InetAddress address : addresses){
                System.out.println("Resolving  Localhost: "+address.getHostAddress());
                if(address.getHostAddress().contains(":")){
                    System.out.println("This is IPv6");
                }
                else{
                    System.out.println("Running");
                    System.out.println("This is IPv4");
                    System.out.println("New things com here to discribe");
                    System.out.println("New things com here to discribe");

                }
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
