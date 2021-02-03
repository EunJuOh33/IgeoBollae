package org.moviebollae.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.extern.log4j.Log4j;

@Controller
@Log4j
public class MainController {
	
	/* 메인 */
	@GetMapping("/main")
	public void main(Model model) {
		
		log.info("main");
		
	}
	
}
