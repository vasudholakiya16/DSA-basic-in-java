package Object_Orianted_Programming.OOP_four.In_built_Packages.java_net;

import java.net.InetAddress;

public class Main {
    public static void main(String[] args) {
        try {
            InetAddress address = InetAddress.getByName("www.google.com");
            System.out.println("IP Address: " + address.getHostAddress());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

