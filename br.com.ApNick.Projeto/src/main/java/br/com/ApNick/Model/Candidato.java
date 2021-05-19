package br.com.ApNick.Model;

public class Candidato {

	private String nome;

	private String sobrenome;

	private Integer idade;

	// ---------------------Getters and Setters--------------

	/**
	 * Primeiro Nome do Candidato.
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * Primeiro Nome do Candidato.
	 * 
	 * Utilizar apenas caracteres alfabéticos.
	 * 
	 * @throws Execption não utilize números no nome do aluno.
	 */
	public void setNome(String nomeEntrada) throws Exception {

		// retirar o que não é alfabético.
		if (Validators.onlyValidChars(nomeEntrada)) {
			this.nome = nomeEntrada;
		} else
			throw new Exception("Não utilize números no nome");
	}

	/**
	 * Último nome do Candidato.
	 */
	public String getSobrenome() {
		return sobrenome;
	}

	/**
	 * Último nome do Candidato.
	 * 
	 * Utilizar apenas caracteres alfabéticos.
	 * 
	 * @throws Exception
	 */
	public void setSobrenome(String sobrenomeEntrada) throws Exception {
		if (!Validators.onlyValidChars(sobrenomeEntrada)) {
			throw new Exception("Não utilize números no nome");
		}
		this.sobrenome = sobrenomeEntrada;
	}

	/**
	 * Idade do Candidato.
	 */
	public Integer getIdade() {
		return idade;
	}

	/**
	 * Idade do Candidato.
	 * 
	 * Idade em anos. Deve ser um número inteiro.
	 * 
	 * @throws Exception
	 * 
	 */
	public void setIdade(Integer idadeEntrada) throws Exception {
		if (idadeEntrada < 0 || idadeEntrada > 139) {
			throw new Exception("Idade precisa estar entre 0 e 130 (inclusive)");
		}

		this.idade = idadeEntrada;
	}

}
	

