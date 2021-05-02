import java.time.LocalDate;
public class Acesso {
	private LocalDate DataAcesso;
	private Pessoa Pessoa;

	public Acesso(LocalDate x, Pessoa a) throws Exceção 
	{
		this.setDataAcesso(x);
		this.setPessoa(a);
	}
	public LocalDate getDataAcesso() {
		return DataAcesso;
	}

	public void setDataAcesso(LocalDate dataAcesso) throws Exceção {
		if(dataAcesso.isAfter(LocalDate.of(2000, 1, 1)))
		{
			this.DataAcesso = dataAcesso;
		}
		else
		{
			throw new Exceção("Data de acesso invalida");
		}
	}

	public Pessoa getPessoa() {
		return Pessoa;
	}

	public void setPessoa(Pessoa pessoa) throws Exceção {
		if(pessoa != null)
		{
			this.Pessoa = pessoa;
		}
		else
		{
			throw new Exceção("Pessoa Invalida");
		}
	}
	@Override
	public String toString() {
		return "Acesso { Data do Acesso: " + DataAcesso + ", Pessoa: " + Pessoa + "}";
	}
	
}
