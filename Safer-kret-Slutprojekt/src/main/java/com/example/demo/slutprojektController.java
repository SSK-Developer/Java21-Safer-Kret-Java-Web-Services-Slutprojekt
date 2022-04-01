package com.example.demo;


import javax.servlet.http.HttpServletResponse;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class slutprojektController  implements ErrorController{
	
	DokumentationService DokService = new DokumentationService();
	
	@RequestMapping(value = "/", produces = MediaType.TEXT_PLAIN_VALUE)
	public String root() {
		return DokService.totDescription();
	}
	
	//  --------------------->Error Handling<---------------------
	@RequestMapping(value = "/error", produces = MediaType.TEXT_HTML_VALUE)
	public String error(HttpServletResponse response) {
		if (response.getStatus() == HttpStatus.NOT_FOUND.value()) {
			return "error-404" + start();
		} else if (response.getStatus() == HttpStatus.INTERNAL_SERVER_ERROR.value()) {
			return "error-500" + start();
		} else {
			return "something went wrong! Try again" + start();
		}
	}
	
	@RequestMapping(value = "/message", method = RequestMethod.GET, produces = MediaType.TEXT_HTML_VALUE)
	public String start() {
		String index = "";
		index += "<html><head><title>Error Message</title></head>";
		index += "<body>";
		index += "<h4>Check our documentation and try again!</h4>";
		index += "<ul>";
		index += " <li><a href=\"/\">Documentation</a></li> ";
		index += "</ul>";

		index += "</body></html>";
		return index;
	}
	
	//  --------------------->Error Handling<---------------------
}
