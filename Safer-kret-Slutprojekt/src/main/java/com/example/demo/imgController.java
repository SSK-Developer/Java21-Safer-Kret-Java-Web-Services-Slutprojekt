package com.example.demo;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.core.io.ClassPathResource;
import org.springframework.http.MediaType;
import org.springframework.util.StreamUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class imgController {

	@RequestMapping(value = "/img", method = RequestMethod.GET, produces = MediaType.IMAGE_PNG_VALUE)

	public void getImage(HttpServletResponse response) throws IOException {
		
		var imgFile = new ClassPathResource("img/Strawberry.png");
		if (Math.random() < 0.5) {
			imgFile = new ClassPathResource("img/Lemon.png");
		}

		response.setContentType(MediaType.IMAGE_PNG_VALUE);
		StreamUtils.copy(imgFile.getInputStream(), response.getOutputStream());
	}
	
}
