package com.negozio.service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Type;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.util.List;

import org.springframework.stereotype.Service;


import com.negozio.entities.Products;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

@Service
public class MagazinoServiceImpl implements MagazinoService{

	@Override
	public Products[] getProdotti() {
		
		HttpURLConnection connection = null;
		StringBuilder output = new StringBuilder();
		BufferedReader reader;
		String riga;
		
		try {
			URL url =  new URL("https://dummyjson.com/products");
			connection = (HttpURLConnection)url.openConnection();
			connection.setRequestMethod("GET");
			connection.setConnectTimeout(3000);
			connection.setReadTimeout(3000);
			int status = connection.getResponseCode();
			System.out.println("La risposta di fakestore ha risposto:  " + status);
			
			reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
			
			while ( (riga = reader.readLine()) != null) {
				output.append(riga);
			}
					
			reader.close();
			
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		} 
		catch (ProtocolException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Gson gson = new Gson();
		
		Type listadiprodotti = new TypeToken<List<Products>>(){}.getType();
		Products[] prodotti = gson.fromJson(output.toString(), listadiprodotti);
		
		System.out.println(output.toString());
		
		return prodotti;
	}

	@Override
	public Products[] getProdotti(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
