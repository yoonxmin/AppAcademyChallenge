package br.com.ApNick.Model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class DAO {
	private String csvFilePath = "S:\\Bruna Carvalho\\AppAcademyChallenge";

	public void csvConnector() {

	}

	public ArrayList<Candidato> getAll(String csvFilePath) {
		ArrayList<Candidato> inputList = new ArrayList<Candidato>();
		try {
			File inputF = new File(csvFilePath);
			InputStream inputFS = new FileInputStream(inputF);
			BufferedReader br = new BufferedReader(new InputStreamReader(inputFS));

			// skip the header of the csv
			inputList = br.lines().map(mapToItem).collect(Collectors.toList());
			br.close();
		} catch (Exception e) {
		}
		return inputList;
	}
}
