
 
    package com.example.Bibliotheque.soap;

    import com.example.Bibliotheque.Livre;
    import jakarta.xml.bind.annotation.XmlAccessType;
    import jakarta.xml.bind.annotation.XmlAccessorType;
    import jakarta.xml.bind.annotation.XmlElement;
    import jakarta.xml.bind.annotation.XmlRootElement;
    
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlRootElement(name = "ajouterLivreRequest")
    public class AjouterLivreRequest {
    
        @XmlElement(required = true)
        private Livre livre;
    
        public Livre getLivre() {
            return livre;
        }
    
        public void setLivre(Livre livre) {
            this.livre = livre;
        }
    
}
