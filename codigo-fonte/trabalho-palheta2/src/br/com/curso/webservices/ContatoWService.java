package br.com.curso.webservices;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService
public class ContatoWService {

	private BufferedWriter buffer;
	private String file = "baseDeDados.txt";
	Set<String> contatos = new HashSet<String>();
	@SuppressWarnings("unused")
	private boolean resposta;
	BufferedReader myReader;
	@SuppressWarnings("unused")
	private boolean achou;

	@WebMethod
	public String inserirCpf(@WebParam(name = "cpf") String cpf) {
		String retorno;

		try {

			buffer = new BufferedWriter(new FileWriter(file, true));
			buffer.write(cpf);
			buffer.newLine();
			buffer.flush();
			buffer.close();
			retorno = "Arquivo gravado com sucesso";

		} catch (IOException e) {
			// TODO Auto-generated catch block
			retorno = " Arquivo não pode ser gravado";
			e.printStackTrace();
			
		}
		return retorno;
	}

	protected void criaHashSetCpf() {

		try {

			File myFile = new File(file);
			myReader = new BufferedReader(new FileReader(myFile));

			String line = null;

			while ((line = myReader.readLine()) != null) {
				contatos.add(line);

			}
			myReader.close();

		} catch (Exception ex) {
			System.out.println("O arquivo não pode ser aberto ");
			ex.printStackTrace();
		}

	}

	@WebMethod
	public String excluirCpf(@WebParam(name = "cpf") String cpf) {

		criaHashSetCpf();
		String retorno;

		if (resposta = contatos.contains(cpf)) {

			contatos.remove(cpf);
			System.out.println("cpf excluido com sucesso");
			retorno = "cpf excluido com sucesso";

			aualizaArquivoTxt(contatos);

		} else {
			System.out.println("Este cpf nao existe");
			retorno = "Este cpf nao existe";
		}
		return retorno;
	}

	protected void aualizaArquivoTxt(Set<String> contatos) {
		// TODO Auto-generated method stub
		try {
			System.out.println("Atualizando arquivo");
			BufferedWriter newBuffer = new BufferedWriter(new FileWriter(file));

			for (String string : contatos) {

				newBuffer.write(string);
				newBuffer.newLine();
				newBuffer.flush();
			}
			myReader.close();

			newBuffer.close();

		} catch (IOException e) {
			System.out.println("O arquivo não pode ser atualizado");
			e.printStackTrace();
		}
	}

	@WebMethod
	public String procuraCpf(@WebParam(name = "cpf") String cpf) {
		criaHashSetCpf();
		String retorno;

		if (achou = contatos.contains(cpf)) {
			System.out.println("O cpf: " + cpf
					+ " se encontra na base de dados");
			retorno = "Este CPF se encontra na Base de dados";

		} else {
			retorno = "Cpf não encontrado";
		}
		return retorno;
	}

}
