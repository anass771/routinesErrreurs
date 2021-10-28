/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package joberreur;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.Writer;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author anass.daou
 */
public class PrinterLog implements IPrinter{
        public String sp=System.getProperty("user.home");
        File fileMail =new File(sp);
        File fileAPI =new File(sp);

        
    @Override
    public String PrintMessageBD(ErreurMessageBD erreurMBD) {
        PrintWriter writer;
            try {
                writer = new PrintWriter(fileMail);
                writer.println("<html><head>\n<title>Message d'erreur</title>\n\n</br></head><p>Bonjour,\n\nUne erreur s'est produite lors de l'execution du : "+erreurMBD.getBaseDeDonnees()+"de type "+erreurMBD.getTypeBDD()+" lorsque vous faites l'action : "+erreurMBD.getTypeAction()+"</p><br><p>les parametres de la base de donnees est :"+erreurMBD.getBaseDeDonnees()+" "+erreurMBD.getIdentifiant()+" "+erreurMBD.getServeur()+" "+erreurMBD.getTypeBDD()+" "+erreurMBD.getPort()+" "+erreurMBD.getSchema()+"\n\n<br>"+erreurMBD.getCheminDeConnexion()+"\n\n<br>"+erreurMBD.getParametresSupp()+"</br>avec le message d'erreur suivant:"+erreurMBD.getMessage()+"</html>");
                writer.close();
            } catch (FileNotFoundException ex) {
                Logger.getLogger(PrinterLog.class.getName()).log(Level.SEVERE, null, ex);
            }
           return "fichier log a été creer dans le chemin"+sp;
    }

    @Override
    public String PrintMessageAPI(ErreurMessageAPI erreurMAPI) {

        PrintWriter writer;
            try {
                writer = new PrintWriter(fileAPI);
                writer.println("<html><head>\n<title>Message d'erreur</title>\n\n</br></head><p>Bonjour,\n\nUne erreur s'est produite lors de l'execution de l'api qui a l'url suivant : "+erreurMAPI.getUrlApi()+"\n\nQui va consommer "+erreurMAPI.getConsomme()+" et produire "+erreurMAPI.getProduit()+"</p><br>\n\n<p>Qui va utiliser le modele Url : "+erreurMAPI.getModeleUrl()+" et le methode http : "+erreurMAPI.getMethodeHttp()+"</html>");
                writer.close();
            } catch (FileNotFoundException ex) {
                Logger.getLogger(PrinterLog.class.getName()).log(Level.SEVERE, null, ex);
            }
           return "fichier log a été creer dans le chemin"+sp;


    }

    
    
}
