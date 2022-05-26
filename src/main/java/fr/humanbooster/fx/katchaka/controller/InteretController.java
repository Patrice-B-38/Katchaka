package fr.humanbooster.fx.katchaka.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import fr.humanbooster.fx.katchaka.service.InteretService;

public class InteretController {
	private final InteretService interetService;

	public InteretController( InteretService interetService) {
        this.interetService = interetService;
    }

    @GetMapping("interets")
    public ModelAndView interetsGet(@RequestParam(name = "filtre", defaultValue = "", required = false)String filtre) {
        ModelAndView mav = new ModelAndView("interets");
        mav.addObject("interets", interetService.recupererInterets());
        mav.addObject("filtre", filtre);
        return mav;
    }

    @GetMapping("interet")
    public ModelAndView interetGet() {
        return new ModelAndView("interet");
    }

    @PostMapping(value = "ajouterInteret" )
    public ModelAndView interetPost(@RequestParam(name = "interet")String nom) {
        interetService.ajouterInteret(nom);
        return new ModelAndView("redirect:interet");
    }
//    
//	@GetMapping({ "interet" })
//	public ModelAndView interetGet() {
//		// On redirige vers la vue interet.jsp
//		return new ModelAndView("interet");
//	}
//
//	@GetMapping({ "/", "interets" })
//	public ModelAndView interetsGet() {
//		ModelAndView mav = new ModelAndView("interets");
//		mav.addObject("interets", interetService.recupererInterets());
//		return mav;
//	}
//
//	@PostMapping({ "interet" })
//	public ModelAndView interetPost(@RequestParam("NOM") String nom) {
//		interetService.ajouterInteret(nom);
//		return new ModelAndView("redirect:interets");
//	}
}
