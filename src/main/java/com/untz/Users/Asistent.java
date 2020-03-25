package com.untz.Users;

public class Asistent extends People {
    /**
     * parametri koje se koji se pohranjuju u tabelu LicniPodatci
     *
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
    public Asistent(int JMBG, String ime, String prezime, String imeOca, String bracniStatus, String mjestoRodenja, String mjestoPrevivalista, String mjestoPrebivalistaStudiranja, String adresaPrebivalista, String adresaTokomStudiranja, String datumRodenja) {
        super(JMBG, ime, prezime, imeOca, bracniStatus, mjestoRodenja, mjestoPrevivalista, mjestoPrebivalistaStudiranja, adresaPrebivalista, adresaTokomStudiranja, datumRodenja);
    }
}
