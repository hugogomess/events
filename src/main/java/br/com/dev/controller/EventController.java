package br.com.dev.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/eventos")
public class EventController {
	
	@RequestMapping("/novo")
	public String newEventForm() {
		return "event/newEventForm";
	}
}
