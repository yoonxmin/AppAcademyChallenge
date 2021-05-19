package br.com.ApNick.Model;

import java.util.ArrayList;

public class Idade {
	ArrayList<Integer> idade = new ArrayList<Integer>();
	
	public void setIdade(Integer id) {
		idade.add(id);
	}
	
	public ArrayList<Integer> getIdade(){
		return idade;
	}
}
