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
public class ErreurMessageBD extends ErreurMessage{
    private String typeAction;
    private String typeBDD;
    private String identifiant;
    private String serveur;
    private int port;
    private String baseDeDonnees;
    private String schema;
    private String parametresSupp;
    private String cheminDeConnexion="jdbc:"+typeBDD+"://"+serveur+":"+port+"/"+baseDeDonnees+"?";

    public ErreurMessageBD() {
    }

    
    public ErreurMessageBD(String typeAction,String typeBDD, String identifiant, String serveur, int port, String baseDeDonnees, String schema, String parametresSupp, String Message) {
        super(Message);
        this.typeAction=typeAction;
        this.typeBDD = typeBDD;
        this.identifiant = identifiant;
        this.serveur = serveur;
        this.port = port;
        this.baseDeDonnees = baseDeDonnees;
        this.schema = schema;
        this.parametresSupp = parametresSupp;
    }

    public String getTypeAction() {
        return typeAction;
    }

    public void setTypeAction(String typeAction) {
        this.typeAction = typeAction;
    }

    

    public String getTypeBDD() {
        return typeBDD;
    }

    public void setTypeBDD(String typeBDD) {
        this.typeBDD = typeBDD;
    }

    public String getIdentifiant() {
        return identifiant;
    }

    public void setIdentifiant(String identifiant) {
        this.identifiant = identifiant;
    }

    public String getServeur() {
        return serveur;
    }

    public void setServeur(String serveur) {
        this.serveur = serveur;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public String getBaseDeDonnees() {
        return baseDeDonnees;
    }

    public void setBaseDeDonnees(String baseDeDonnees) {
        this.baseDeDonnees = baseDeDonnees;
    }

    public String getSchema() {
        return schema;
    }

    public void setSchema(String schema) {
        this.schema = schema;
    }

    public String getParametresSupp() {
        return parametresSupp;
    }

    public void setParametresSupp(String parametresSupp) {
        this.parametresSupp = parametresSupp;
    }

    public String getCheminDeConnexion() {
        return cheminDeConnexion;
    }

    public void setCheminDeConnexion(String cheminDeConnexion) {
        this.cheminDeConnexion = cheminDeConnexion;
    }

   

   
    
    
    
}
