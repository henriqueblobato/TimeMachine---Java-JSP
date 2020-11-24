package util;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

import model.Endereco;

public class Correios {
        
	public static Endereco buscarCep(String cep){

        try {
            URL url = new URL("http://viacep.com.br/ws/" + cep + "/json");
            URLConnection urlConnection = url.openConnection();
            InputStream is = urlConnection.getInputStream();
            BufferedReader br = new BufferedReader(new InputStreamReader(is));

            StringBuilder jsonSb = new StringBuilder();

            br.lines().forEach(l -> jsonSb.append(l.trim()));
            String json = jsonSb.toString();
            
            json = json.replaceAll("[{},:]", "").replaceAll("\"", "\n");
            String array[] = new String[30];
            array = json.split("\n");
            
            String logradouro = array[7];            
            String bairro = array[15];
            String cidade = array[19]; 
            String uf = array[23];
            
            Endereco enderecoModel = new Endereco(logradouro, bairro, cidade, uf);
            
            return enderecoModel;
            
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
	
	public static void main(String[] args) {
		Endereco response = buscarCep("13256000");
		System.out.println(response);
		
//		for(String s: response) {
//			System.out.println(s);
//		}
	}
	
	
}
