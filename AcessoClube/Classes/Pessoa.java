import java.time.LocalDate;

public class Pessoa {
	private String Nome;
	private long cpf;
	private LocalDate dataDeNascimento;
	
	public Pessoa(String nome, long CPF, LocalDate Data) throws Exce��o
	{
		this.setCpf(CPF);
		this.setDataDeNascimento(Data);
		this.setNome(nome);
	}
	
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) throws Exce��o{
		if(nome != null)
		{
			this.Nome = nome;
		}
		else
		{
			throw new Exce��o("Nome Invalido");
		}
	}
	public long getCpf() {
		return cpf;
	}
	public void setCpf(long cpf) throws Exce��o {
		if(cpf > 100000000)
		{
			this.cpf = cpf;
		}
		else
		{
			throw new Exce��o("CPF invalido");
		}
	}
	public LocalDate getDataDeNascimento() {
		return dataDeNascimento;
	}
	public void setDataDeNascimento(LocalDate dataDeNascimento) throws Exce��o {
		if(dataDeNascimento.isAfter(LocalDate.of(1900, 1, 1)))
		{
			this.dataDeNascimento = dataDeNascimento;
		}
		else
		{
			throw new Exce��o("Data de Nascimento invalida");
		}
	}

	@Override
	public String toString() {
		return "Pessoa { nome:" + Nome + ", CPF: " + cpf + ", Data de Nascimento: " + dataDeNascimento.toString() + "}";
	}
}
