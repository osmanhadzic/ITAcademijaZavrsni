package com.untz.Users;

public abstract class People {
    /**
     * JMBG povezuje sa tabelom LicniPodatci preko lookup tabele
     * Licni
     * sa tabelma Student, Profesor, Asisstent, Referent
     * preko IDLicni
     */
    private int JMBG; /**
     * Licni podatci o svim korisnicima sistema
     */
    private String ime;
    private String prezime;
    private String imeOca;
    private String bracniStatus;
    private String mjestoRodenja;
    private String mjestoPrevivalista;
    private String mjestoPrebivalistaStudiranja;
    private String adresaPrebivalista;
    private String adresaTokomStudiranja;
    private String datumRodenja;

    /**
     * parametri koje se koji se pohranjuju u tabelu LicniPodatci
     * @param JMBG
     * @param ime
     * @param prezime
     * @param imeOca
     * @param bracniStatus
     * @param mjestoRodenja
     * @param mjestoPrevivalista
     * @param mjestoPrebivalistaStudiranja
     * @param adresaPrebivalista
     * @param adresaTokomStudiranja
     * @param datumRodenja
     */

    public People(int JMBG, String ime, String prezime, String imeOca, String bracniStatus, String mjestoRodenja, String mjestoPrevivalista, String mjestoPrebivalistaStudiranja, String adresaPrebivalista, String adresaTokomStudiranja, String datumRodenja) {
        this.JMBG = JMBG;
        this.ime = ime;
        this.prezime = prezime;
        this.imeOca = imeOca;
        this.bracniStatus = bracniStatus;
        this.mjestoRodenja = mjestoRodenja;
        this.mjestoPrevivalista = mjestoPrevivalista;
        this.mjestoPrebivalistaStudiranja = mjestoPrebivalistaStudiranja;
        this.adresaPrebivalista = adresaPrebivalista;
        this.adresaTokomStudiranja = adresaTokomStudiranja;
        this.datumRodenja = datumRodenja;
    }

    public int getJMBG() {
        return JMBG;
    }

    public void setJMBG(int JMBG) {
        this.JMBG = JMBG;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public String getImeOca() {
        return imeOca;
    }

    public void setImeOca(String imeOca) {
        this.imeOca = imeOca;
    }

    public String getBracniStatus() {
        return bracniStatus;
    }

    public void setBracniStatus(String bracniStatus) {
        this.bracniStatus = bracniStatus;
    }

    public String getMjestoRodenja() {
        return mjestoRodenja;
    }

    public void setMjestoRodenja(String mjestoRodenja) {
        this.mjestoRodenja = mjestoRodenja;
    }

    public String getMjestoPrevivalista() {
        return mjestoPrevivalista;
    }

    public void setMjestoPrevivalista(String mjestoPrevivalista) {
        this.mjestoPrevivalista = mjestoPrevivalista;
    }

    public String getMjestoPrebivalistaStudiranja() {
        return mjestoPrebivalistaStudiranja;
    }

    public void setMjestoPrebivalistaStudiranja(String mjestoPrebivalistaStudiranja) {
        this.mjestoPrebivalistaStudiranja = mjestoPrebivalistaStudiranja;
    }

    public String getAdresaPrebivalista() {
        return adresaPrebivalista;
    }

    public void setAdresaPrebivalista(String adresaPrebivalista) {
        this.adresaPrebivalista = adresaPrebivalista;
    }

    public String getAdresaTokomStudiranja() {
        return adresaTokomStudiranja;
    }

    public void setAdresaTokomStudiranja(String adresaTokomStudiranja) {
        this.adresaTokomStudiranja = adresaTokomStudiranja;
    }

    public String getDatumRodenja() {
        return datumRodenja;
    }

    public void setDatumRodenja(String datumRodenja) {
        this.datumRodenja = datumRodenja;
    }



}
