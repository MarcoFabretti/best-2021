package org.generation.italy.controller;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/")
public class IndexController {
	
	@GetMapping("/")
	public String index(Model model) {		
		model.addAttribute("nome","Marco");  //nome variabile, contenuto
		return "index";
	}	
	
	@GetMapping("/films")
	public String movies(Model model) {
		List<String> filmList = new ArrayList<String>();
		model.addAttribute("films", Arrays.asList("SPIDER-MAN: NO WAY HOME", "DUNE", "ENCANTO", "THE SUICIDE SQUAD – MISSIONE SUICIDA"));
		return "movies";
	}
	
	@GetMapping("/songs")
	public String songs(Model model) {
		List<String> songList = new ArrayList<String>();
		model.addAttribute("songs", Arrays.asList("Malibù", "Mi fai impazzire", "Mille", "La canzone nostra"));
		return "songs";
	}
	
}
