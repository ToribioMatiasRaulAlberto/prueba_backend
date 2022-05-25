package com.prueba.practica.servicio;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.prueba.practica.modelo.Ciudadano;
import com.prueba.practica.modelo.Documento;
@Service
public class CiudadanoServicio{
	
	private List<Ciudadano> ciudadanos = new ArrayList<Ciudadano>();
	
	public Ciudadano buscarPorTipoDocumentoNumeroDocumento(char tipo, long numeroDocumento) {
		List<Documento> listaDocumentos = null;
		int indice = -1;
		for(int i = 0; i<ciudadanos.size();i++) {
			listaDocumentos =ciudadanos.get(i).getDocumentos();
			for(int j = 0; j<listaDocumentos.size();j++) {
				if(listaDocumentos.get(j).getId()==tipo && listaDocumentos.get(j).getNumeroDocumento()==numeroDocumento) {
					indice = i;
					break;
				}
			}

		}
		return indice == -1 ? null : ciudadanos.get(indice);

	}

	public void llenarListaCiudadanos() {
		Documento documentoCedula1 = new Documento('C',23445322);
		ciudadanos.add(new Ciudadano("Alfredo",null,"Peréz","Martinez","555123","Calle 20 de Noviembre #23","Oaxaca de Juarez",documentoCedula1));
		
		Documento documentoCedula2 = new Documento('C',36328723);
		Documento documentoPasaporte3 = new Documento('P',3863746);
		Ciudadano ciudadano = new Ciudadano("Angela","María","Mendez","Flores","36252","Calle Niños Heroes #223","Ciudad de México",documentoCedula2);
		ciudadano.setDocumentos(documentoPasaporte3);
		ciudadanos.add(ciudadano);
	}

}
