package com.prueba.practica.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prueba.practica.dto.CiudadanoDTO;
import com.prueba.practica.modelo.Ciudadano;
import com.prueba.practica.servicio.CiudadanoServicio;

@RestController
@RequestMapping("/api")
public class CiudadanoControlador {
	@Autowired
	CiudadanoServicio ciudadanoservicio;
	
	@PostMapping(path="/ciudadanos",produces=MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<CiudadanoDTO> getById(char tipoDocumento, long numeroDocumento){
        try {
        	ciudadanoservicio.llenarListaCiudadanos();
        	Ciudadano ciudadano = ciudadanoservicio.buscarPorTipoDocumentoNumeroDocumento(tipoDocumento, numeroDocumento);
        	if(ciudadano == null) {
        		return new ResponseEntity<>(null,HttpStatus.NO_CONTENT);
        	}
        	CiudadanoDTO ciudadanodto = new CiudadanoDTO();
        	ciudadanodto.setPrimerNombre(ciudadano.getPrimerNombre());
        	ciudadanodto.setSegundoNombre(ciudadano.getSegundoNombre());
        	ciudadanodto.setPrimerApellido(ciudadano.getPrimerApellido());
        	ciudadanodto.setSegundoApellido(ciudadano.getSegundoApellido());
        	ciudadanodto.setTelefono(ciudadano.getTelefono());
        	ciudadanodto.setDireccion(ciudadano.getDireccion());
        	ciudadanodto.setCiudadResidencia(ciudadano.getCiudadResidencia());
        	return new ResponseEntity<>(ciudadanodto,HttpStatus.OK);
		} catch ( Exception e) {
			return new ResponseEntity<>(null,HttpStatus.BAD_REQUEST);
		}
    }
}
