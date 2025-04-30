
    
    package com.example.Bibliotheque.soap;
    
    import com.example.Bibliotheque.service.LivreService;
import com.example.Bibliotheque.service.ModifierLivreResponse;
import com.example.Bibliotheque.service.PreterLivreResponse;
import com.example.Bibliotheque.service.RetournerLivreResponse;
import com.example.Bibliotheque.service.SupprimerLivreResponse;

import org.springframework.ws.server.endpoint.annotation.Endpoint;
    import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
    import org.springframework.ws.server.endpoint.annotation.RequestPayload;
    import org.springframework.ws.server.endpoint.annotation.ResponsePayload;
    
    @Endpoint
    public class livreEndpoint {
    
        private static final String NAMESPACE_URI = "http://example.com/Bibliotheque/soap";
    
        private LivreService livreService;
    
        public livreEndpoint(LivreService livreService) {
            this.livreService = livreService;
        }
    
        @PayloadRoot(namespace = NAMESPACE_URI, localPart = "ajouterLivreRequest")
        @ResponsePayload
        public AjouterLivreResponse ajouterLivre(@RequestPayload AjouterLivreRequest request) {
            return livreService.ajouterLivre(request.getLivre());
        }
    
        @PayloadRoot(namespace = NAMESPACE_URI, localPart = "modifierLivreRequest")
        @ResponsePayload
        public PreterLivreResponse modifierLivre(@RequestPayload ModifierLivreResponse request) {
            return livreService.preterLivre(request.getLivreID(), request.getLivreID());
        }
    
        @PayloadRoot(namespace = NAMESPACE_URI, localPart = "supprimerLivreRequest")
        @ResponsePayload
        public SupprimerLivreResponse supprimerLivre(@RequestPayload SupprimerLivreResponse request) {
            return livreService.supprimerLivre(request.getLivreID());
        }
    
        @PayloadRoot(namespace = NAMESPACE_URI, localPart = "preterLivreRequest")
        @ResponsePayload
        public PreterLivreResponse preterLivre(@RequestPayload PreterLivreResponse request) {
            return livreService.preterLivre(request.getUserID(), request.getLivreID());
        }
    
        @PayloadRoot(namespace = NAMESPACE_URI, localPart = "retournerLivreRequest")
        @ResponsePayload
        public RetournerLivreResponse retournerLivre(@RequestPayload RetournerLivreResponse request) {
            return livreService.retournerLivre(request.getUserID(), request.getLivreID());
        }
    }


 
