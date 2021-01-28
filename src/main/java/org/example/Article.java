package org.example;

public abstract class Article {

    /**
     * Création des variables
     */
    private long reference;
    private String intitule;
    private float prixHT;
    private int quantiteStock;
    private float prixTTC;
    private float TVA;

    public Article(){

    }

    public float getPrixTTC() {
        return prixTTC;
    }

    public void setPrixTTC(float prixTTC) {
        this.prixTTC = prixTTC;
    }

    public float getTVA() {
        return TVA;
    }

    public void setTVA(float TVA) {
        this.TVA = TVA;
    }

    /**
     *
     * @param reference
     * @param intitule
     * @param prixHT
     * @param quantiteStock
     * @param prixTTC
     * @param TVA
     */
    public Article(long reference, String intitule, float prixHT, int quantiteStock, float prixTTC, float TVA){
        this.reference = reference;
        this.intitule = intitule;
        this.prixHT = prixHT;
        this.quantiteStock = quantiteStock;
        this.prixTTC = prixTTC;
        this.TVA = TVA;
    }

    public long getReference() {
        return reference;
    }

    public void setReference(long reference) {
        this.reference = reference;
    }

    public String getIntitule() {
        return intitule;
    }

    public void setIntitule(String intitule) {
        this.intitule = intitule;
    }

    public float getPrixHT() {
        return prixHT;
    }

    public void setPrixHT(float prixHT) {
        this.prixHT = prixHT;
    }

    public int getQuantiteStock() {
        return quantiteStock;
    }

    public void setQuantiteStock(int quantiteStock) {
        this.quantiteStock = quantiteStock;
    }

    /**
     *
     * @param nombreUnites
     * @author Alex
     * Méthode qui approvisionne le stock
     */
    public void approvisionner(int nombreUnites){
        this.quantiteStock += nombreUnites;
    }

    /**
     *
     * @param nombreUnites
     * @return
     * Méthode qui réduit le stock en cas de vente d'un produit
     */
    public boolean vendre(int nombreUnites){
        if (nombreUnites > this.quantiteStock) {
            return false;
        }
        else{
            this.quantiteStock -= nombreUnites;
            return true;
        }
    }

    /**
     * Méthode qui retourne le prix TTC
     * @return
     */
    public float prixTTC(){
        float prixTTC = this.prixHT * TVA;
        return prixTTC;
    }

    /**
     * Méthode qui affiche la référence, l'intitulé et le prix du produit
     * @return
     */
    public String afficher(){
        String afficherArticle = "La référence : " + reference + " l'intitulé : " + intitule + "le prix de l'article est : ", prixTTC;
        return afficherArticle;
    }

}
