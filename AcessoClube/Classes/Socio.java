import java.time.LocalDate;

public class Socio extends Pessoa{
	private int NroSocio;

	public Socio(String nome, long cpf, LocalDate Nascimento, int Nro) throws Exce��o
	{
		super(nome,cpf,Nascimento);
		this.setNroSocio(Nro);
	}
	
	public int getNroSocio() {
		return NroSocio;
	}
	public void setNroSocio(int nroSocio) throws Exce��o {
		if(nroSocio > 0)
		{
			this.NroSocio = nroSocio;
		}
		else
		{
			throw new Exce��o("Nro do Socio Invalido");
		}
	}

	@Override
	public String toString() {
		return "Socio { Numero de Socio: " + NroSocio + ", Nome: " + super.getNome() + ", CPF: " + super.getCpf() + ", Data de Nascimento: " + super.getDataDeNascimento() + "}";
	}
}
