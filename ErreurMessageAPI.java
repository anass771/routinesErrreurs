/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package joberreur;

/**
 *
 * @author anass.daou
 */
public class ErreurMessageAPI extends ErreurMessage{
    
    private String urlApi;
    private String modeleUrl;
    private String methodeHttp;
    private String consomme;
    private String produit;

    public ErreurMessageAPI(String urlApi, String modeleUrl, String methodeHttp, String consomme, String produit) {
        super();
        this.urlApi = urlApi;
        this.modeleUrl = modeleUrl;
        this.methodeHttp = methodeHttp;
        this.consomme = consomme;
        this.produit = produit;
    }

    public String getUrlApi() {
        return urlApi;
    }

    public void setUrlApi(String urlApi) {
        this.urlApi = urlApi;
    }

    public String getModeleUrl() {
        return modeleUrl;
    }

    public void setModeleUrl(String modeleUrl) {
        this.modeleUrl = modeleUrl;
    }

    public String getMethodeHttp() {
        return methodeHttp;
    }

    public void setMethodeHttp(String methodeHttp) {
        this.methodeHttp = methodeHttp;
    }

    public String getConsomme() {
        return consomme;
    }

    public void setConsomme(String consomme) {
        this.consomme = consomme;
    }

    public String getProduit() {
        return produit;
    }

    public void setProduit(String produit) {
        this.produit = produit;
    }
    
    

}
