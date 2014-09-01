package br.com.curso.webservices;

import javax.xml.ws.Endpoint;



public class PublicService {

	public static void main(String[] args) {
		Endpoint.publish("http://localhost:8000/ContatoWService", new ContatoWService());
	}

	

}
