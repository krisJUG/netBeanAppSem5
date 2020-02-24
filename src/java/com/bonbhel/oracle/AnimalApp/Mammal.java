/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bonbhel.oracle.AnimalApp;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author KrisJ
 */
@Entity
@XmlRootElement
public class Mammal implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

       private String Gatunek;

    /**
     * Get the value of Gatunek
     *
     * @return the value of Gatunek
     */
    public String getGatunek() {
        return Gatunek;
    }

    /**
     * Set the value of Gatunek
     *
     * @param Gatunek new value of Gatunek
     */
    public void setGatunek(String Gatunek) {
        this.Gatunek = Gatunek;
    }
    private String Wystepowanie;

    /**
     * Get the value of Wystepowanie
     *
     * @return the value of Wystepowanie
     */
    public String getWystepowanie() {
        return Wystepowanie;
    }

    /**
     * Set the value of Wystepowanie
     *
     * @param Wystepowanie new value of Wystepowanie
     */
    public void setWystepowanie(String Wystepowanie) {
        this.Wystepowanie = Wystepowanie;
    }
    private String odzywianie;

    /**
     * Get the value of odzywianie
     *
     * @return the value of odzywianie
     */
    public String getOdzywianie() {
        return odzywianie;
    }

    /**
     * Set the value of odzywianie
     *
     * @param odzywianie new value of odzywianie
     */
    public void setOdzywianie(String odzywianie) {
        this.odzywianie = odzywianie;
    }

    private long Liczebnosc;

    /**
     * Get the value of Liczebnosc
     *
     * @return the value of Liczebnosc
     */
    public long getLiczebnosc() {
        return Liczebnosc;
    }

    /**
     * Set the value of Liczebnosc
     *
     * @param Liczebnosc new value of Liczebnosc
     */
    public void setLiczebnosc(long Liczebnosc) {
        this.Liczebnosc = Liczebnosc;
    }


 public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Mammal)) {
            return false;
        }
        Mammal other = (Mammal) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.bonbhel.oracle.AnimalApp.Mammal[ id=" + id + " ]";
    }
    
}
