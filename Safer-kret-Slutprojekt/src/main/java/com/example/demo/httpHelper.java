package com.example.demo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class httpHelper {

	public static String UrlResponse(String url, String verb, String body) throws IOException {
		HttpURLConnection myConnection = getConnection(url, verb);

		if (verb.toUpperCase().equals("POST")) {
			addBody(myConnection, body);
		}

		int responseCode = myConnection.getResponseCode();
		if (responseCode == HttpURLConnection.HTTP_OK) {
			return readStream(myConnection);
		} else {
			return "Could not read URL: " + url + " as " + verb;
		}
	}

	private static HttpURLConnection getConnection(String urlString, String verb) throws IOException {
		URL urlObj = new URL(urlString);
		HttpURLConnection con = (HttpURLConnection) urlObj.openConnection();
		con.setRequestMethod(verb.toUpperCase());
		con.setRequestProperty("User-Agent", "Mozilla/5.0");

		return con;
	}

	private static void addBody(HttpURLConnection con, String body) throws IOException {
		con.setDoOutput(true);
		OutputStream myOutputStream = con.getOutputStream();
		myOutputStream.write(body.getBytes());
		myOutputStream.flush();
		myOutputStream.close();
	}

	private static String readStream(HttpURLConnection con) throws IOException {
		BufferedReader inputStreamReader = new BufferedReader(new InputStreamReader(con.getInputStream()));

		String textLine;
		StringBuffer resultText = new StringBuffer();

		while ((textLine = inputStreamReader.readLine()) != null) {
			resultText.append(textLine);
		}
		inputStreamReader.close();

		return resultText.toString();
	}
}