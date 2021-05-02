import java.time.LocalDate;

public class Visitante extends Pessoa{
	private int NroConvite;
	
	public Visitante(String nome, long cpf, LocalDate Nascimento, int Nro) throws Exce��o
	{
		super(nome,cpf,Nascimento);
		this.setNroConvite(Nro);
	}

	public int getNroConvite() {
		return NroConvite;
	}
	public void setNroConvite(int nroConvite) throws Exce��o {
		if(nroConvite > 0)
		{
			this.NroConvite = nroConvite;
		}
		else
		{
			throw new Exce��o("Numero do Convite invalido");
		}
	}
	@Override
	public String toString() {
		return "Visitante { Numero do Convite: " + NroConvite + ", Nome: " + super.getNome() + ", CPF: " + super.getCpf() + ", Data de Nascimento: " + super.getDataDeNascimento() + "}";
	}
	
	
}
