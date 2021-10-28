/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package routines;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 *
 * @author anass.daou
 */
public class JobErreur {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws UnknownHostException {
        ErreurMessageBD erreurMessageBD=new ErreurMessageBD("post","posgresql", "postgres", "localhost", 3457, "vespa", "public", "", "erreur durant l'entres dans la base de donnees");
        Printermail printm=new Printermail(erreurMessageBD, "daouanass2@gmail.com", "daouanass1@gmail.com",465 , "smtp.gmail.com", "anass daou", "cc", "bcc", "erreurBD");
        System.out.println(printm.PrintMessageBD(erreurMessageBD));
        
        ErreurMessageAPI erreurMessageAPI=new ErreurMessageAPI("urlApi", "modeleUrl", "methodeHttp", "xml", "json");
        Printermail printa=new Printermail(erreurMessageAPI,"daouanass2@gmail.com", "daouanass1@gmail.com",465 , "smtp.gmail.com", "anass daou", "cc", "bcc", "erreurBD");
        System.out.println(printa.PrintMessageAPI(erreurMessageAPI));
        // TODO code application logic here
//     InetAddress addr=InetAddress.getLocalHost();
//            System.out.println(addr.getHostName());
//            System.out.println(addr.getHostAddress());
//            System.out.println(addr.getAddress());
//            System.out.println(System.getProperty("user.name"));
//            System.out.println(System.getProperty("java.class.path"));
//            System.out.println(System.getProperty("java.home"));
//            System.out.println(System.getProperty("os.arch"));
//            System.out.println(System.getProperty("os.name"));
//            System.out.println(System.getProperty("os.version"));
//            System.out.println(System.getProperty("user.dir"));
//            System.out.println(System.getProperty("user.dir"));
//            System.out.println(System.getProperty("user.home"));
    }
    
}
