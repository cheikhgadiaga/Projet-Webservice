
    
    package com.example.Bibliotheque.soap;

import com.example.Bibliotheque.Livre;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "modifierLivreRequest") 
public class ModifierLivreRequest {

    @XmlElement(required = true)
    private Long livreID;

    @XmlElement(required = true)
    private Livre livre;

    public Long getLivreID() {
        return livreID;
    }

    public void setLivreID(Long livreID) {
        this.livreID = livreID;
    }

    public Livre getLivre() { 
        return livre;
    }

    public void setLivre(Livre livre) {
        this.livre = livre;
    }
}

