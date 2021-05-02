import java.time.LocalDate;

public class Pessoa {
	private String Nome;
	private long cpf;
	private LocalDate dataDeNascimento;
	
	public Pessoa(String nome, long CPF, LocalDate Data) throws Exceção
	{
		this.setCpf(CPF);
		this.setDataDeNascimento(Data);
		this.setNome(nome);
	}
	
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) throws Exceção{
		if(nome != null)
		{
			this.Nome = nome;
		}
		else
		{
			throw new Exceção("Nome Invalido");
		}
	}
	public long getCpf() {
		return cpf;
	}
	public void setCpf(long cpf) throws Exceção {
		if(cpf > 100000000)
		{
			this.cpf = cpf;
		}
		else
		{
			throw new Exceção("CPF invalido");
		}
	}
	public LocalDate getDataDeNascimento() {
		return dataDeNascimento;
	}
	public void setDataDeNascimento(LocalDate dataDeNascimento) throws Exceção {
		if(dataDeNascimento.isAfter(LocalDate.of(1900, 1, 1)))
		{
			this.dataDeNascimento = dataDeNascimento;
		}
		else
		{
			throw new Exceção("Data de Nascimento invalida");
		}
	}

	@Override
	public String toString() {
		return "Pessoa { nome:" + Nome + ", CPF: " + cpf + ", Data de Nascimento: " + dataDeNascimento.toString() + "}";
	}
}
