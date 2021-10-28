/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package routines;

/**
 *
 * @author anass.daou
 */
public class Printermail implements IPrinter{
    private ErreurMessage erreurMessage;
    private String smtpTo;
    private String smtpFrom;
    private int smtpPort;
    private String host;
    private String nomExpediteur;
    private String cc;
    private String bcc;
    private String Sujet;

    public Printermail(ErreurMessage erreurMessage, String smtpTo, String smtpFrom, int smtpPort, String host, String nomExpediteur, String cc, String bcc, String Sujet) {
        this.erreurMessage = erreurMessage;
        this.smtpTo = smtpTo;
        this.smtpFrom = smtpFrom;
        this.smtpPort = smtpPort;
        this.host = host;
        this.nomExpediteur = nomExpediteur;
        this.cc = cc;
        this.bcc = bcc;
        this.Sujet = Sujet;
    }

    public ErreurMessage getErreurMessage() {
        return erreurMessage;
    }

    public void setErreurMessage(ErreurMessage erreurMessage) {
        this.erreurMessage = erreurMessage;
    }

    public String getSmtpTo() {
        return smtpTo;
    }

    public void setSmtpTo(String smtpTo) {
        this.smtpTo = smtpTo;
    }

    public String getSmtpFrom() {
        return smtpFrom;
    }

    public void setSmtpFrom(String smtpFrom) {
        this.smtpFrom = smtpFrom;
    }

    public int getSmtpPort() {
        return smtpPort;
    }

    public void setSmtpPort(int smtpPort) {
        this.smtpPort = smtpPort;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getNomExpediteur() {
        return nomExpediteur;
    }

    public void setNomExpediteur(String nomExpediteur) {
        this.nomExpediteur = nomExpediteur;
    }

    public String getCc() {
        return cc;
    }

    public void setCc(String cc) {
        this.cc = cc;
    }

    public String getBcc() {
        return bcc;
    }

    public void setBcc(String bcc) {
        this.bcc = bcc;
    }

    public String getSujet() {
        return Sujet;
    }

    public void setSujet(String Sujet) {
        this.Sujet = Sujet;
    }
    
    
   


    public String PrintMessageBD(ErreurMessageBD erreurMBd) {
        return "<html><head>\n<title>Message d'erreur</title>\n\n</br></head><p>Bonjour,\n\nUne erreur s'est produite lors de l'execution de la base de donnees : "+erreurMBd.getBaseDeDonnees()+"de type "+erreurMBd.getTypeBDD()+" lorsque vous faites l'action : "+erreurMBd.getTypeAction()+"</p><br><p>les parametres de la base de donnees est :"+erreurMBd.getBaseDeDonnees()+" "+erreurMBd.getIdentifiant()+" "+erreurMBd.getServeur()+" "+erreurMBd.getTypeBDD()+" "+erreurMBd.getPort()+" "+erreurMBd.getSchema()+"\n\n<br>"+erreurMBd.getCheminDeConnexion()+"\n\n<br>"+erreurMBd.getParametresSupp()+"</br>avec le message d'erreur suivant:"+erreurMBd.getMessage()+"</html>";
    
    }

    @Override
    public String PrintMessageAPI(ErreurMessageAPI erreurMAPI) {
        return "<html><head>\n<title>Message d'erreur</title>\n\n</br></head><p>Bonjour,\n\nUne erreur s'est produite lors de l'execution de l'api qui a l'url suivant : "+erreurMAPI.getUrlApi()+"\n\nQui va consommer "+erreurMAPI.getConsomme()+" et produire "+erreurMAPI.getProduit()+"</p><br>\n\n<p>Qui va utiliser le modele Url : "+erreurMAPI.getModeleUrl()+" et le methode http : "+erreurMAPI.getMethodeHttp()+"</html>";
    }

   
}
