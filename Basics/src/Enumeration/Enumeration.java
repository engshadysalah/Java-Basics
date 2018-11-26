/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Enumeration;

/**
 *
 * @author rm
 */
//enum is like class : بس عبارة عن مخزن او مصفوفة فيها مجموعة من القيم الثابته
public enum Enumeration {

    Egypt("ciro", "10000"),
    USA("amrica", "200000"),
    darelsalam("amrica", "3000000"),
    esomal("city", "400000"),
    Irag("iragg", "500000");

    private final String c_country;
    private final String P_population;

    Enumeration(String country, String population) {

        c_country = country;
        P_population = population;

    }

    public String getcountry() {

        return c_country;
    }

    public String getpopulation() {

        return P_population;
    }

}
