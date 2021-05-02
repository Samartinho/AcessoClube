import java.time.LocalDate;

public class Visitante extends Pessoa{
	private int NroConvite;
	
	public Visitante(String nome, long cpf, LocalDate Nascimento, int Nro) throws Exceção
	{
		super(nome,cpf,Nascimento);
		this.setNroConvite(Nro);
	}

	public int getNroConvite() {
		return NroConvite;
	}
	public void setNroConvite(int nroConvite) throws Exceção {
		if(nroConvite > 0)
		{
			this.NroConvite = nroConvite;
		}
		else
		{
			throw new Exceção("Numero do Convite invalido");
		}
	}
	@Override
	public String toString() {
		return "Visitante { Numero do Convite: " + NroConvite + ", Nome: " + super.getNome() + ", CPF: " + super.getCpf() + ", Data de Nascimento: " + super.getDataDeNascimento() + "}";
	}
	
	
}
