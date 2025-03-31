package es.eviden.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Controlador {
	@RequestMapping
	public String pagina1() {
		return "pagina1";
	}

}
