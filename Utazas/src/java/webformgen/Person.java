/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package webformgen;

/**
 *
 * @author lvbubi
 */
public class Person {
    private final int personID;
    private final String vnev;
    private final String knev;
    private final String adoszam;
    private final String bankszamlaszam;
    private final String beosztas;
    private final int nap20;

    public int getPersonID() {
        return personID;
    }

    public String getVnev() {
        return vnev;
    }

    public String getKnev() {
        return knev;
    }

    public String getAdoszam() {
        return adoszam;
    }

    public String getBankszamlaszam() {
        return bankszamlaszam;
    }

    public String getBeosztas() {
        return beosztas;
    }

    public int getNap20() {
        return nap20;
    }

    
    
    public Person(int personID, String vnev, String knev, String adoszam, String bankszamlaszam, String beosztas, int nap20) {
        this.personID = personID;
        this.vnev = vnev;
        this.knev = knev;
        this.adoszam = adoszam;
        this.bankszamlaszam = bankszamlaszam;
        this.beosztas = beosztas;
        this.nap20 = nap20;
    }
}
