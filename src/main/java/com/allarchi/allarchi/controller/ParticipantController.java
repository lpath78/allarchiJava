package com.allarchi.allarchi.controller;

import com.allarchi.allarchi.service.ServiceParticipant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import java.util.Map;

@Controller
@RequestMapping(path = "/participant")
public class ParticipantController extends AbstractController {
    @Autowired
    private ServiceParticipant serviceParticipant;

    @PostMapping(path = "/createBureauEtude")
    public @ResponseBody String addParticipantBureauEtude(@RequestBody Map<String,String> obj){
        serviceParticipant.AjouterParticipantBureauEtude(obj.get(), obj.get());
return "Sauvgardé";
    }
    @PostMapping(path = "/createEntreprise")
    public @ResponseBody String addParticipantEntreprise(@RequestBody Map<String,String> obj){
        serviceParticipant.AjouterParticipantEntreprise();
        return "Sauvgardé";
    }
    @PostMapping(path = "/createMairie")
    public @ResponseBody String addParticipantMaire(@RequestBody Map<String,String> obj){
        serviceParticipant.AjouterParticipantMairie();
        return "Sauvgardé";
    }
    @PostMapping(path = "/createMaitreOuvrage")
    public @ResponseBody String addParticipantMaitreOuvrage(@RequestBody Map<String,String> obj){
        serviceParticipant.AjouterParticipantMaitreOuvrage();
        return "Sauvgardé";
    }
    @PostMapping(path = "/createPromoteur")
    public @ResponseBody String addParticipantPromoteur(@RequestBody Map<String,String> obj){
serviceParticipant.AjouterParticipantPromoteur();
        return "Sauvgardé";
    }
}
