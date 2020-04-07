package com.example.demo.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.domain.Usuario;

@Controller
public class MainController {

	String user = "diego";
	String contra = "admin";
	
	@GetMapping("/login")
		public String enviarForm(Usuario usuario) {
			return "login";
	}
	
	@GetMapping("/correcto")
		public String ingreso(Usuario usuario) {
			return "MostrarMensajeV";
	}
	
	
	@RequestMapping(value = "login", method = RequestMethod.POST)
	public String procesarForm(Usuario usuario) {
		
		
		
		if(usuario.getNombre().equals(user) && usuario.getContra().equals(contra))
			{
			return "MostrarMensajeV"; 
			}
		
		else {
			return "MostrarMensajeF"; }
			}
}



