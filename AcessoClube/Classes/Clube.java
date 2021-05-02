import java.time.LocalDate;
import java.time.Period;
public class Clube {
	private static final int MAX_ACESSOS = 1000;
	private static final int MAX_SOCIOS = 1000;
	private static int ContAcessos = 0;
	private static int ContSocio = 0;
	Acesso[] Acessos;
	Socio[] Socio;

	public Clube()
	{
		Acessos = new Acesso[MAX_ACESSOS];
		Socio = new Socio[MAX_SOCIOS];
	}
	public Acesso[] getAcessos() {
		return Acessos;
	}
	public void setAcessos(Acesso[] acessos) {
		Acessos = acessos;
	}
	public void setSocio(Socio[] socio) {
		Socio = socio;
	}
	public Socio[] getSocio() {
		return Socio;
	}
	public void addAcesso(LocalDate x, Pessoa a) throws Exceção
	{
		if(a !=null && x != null)
		{
			Acessos[ContAcessos] = new Acesso(x, a);
			ContAcessos++;
		}
		else
		{
			throw new Exceção("Data ou Pessoa invalidos");
		}
	}
	public void addSocio(LocalDate x, Socio o) throws Exceção
	{
		if(o != null && x != null)
		{
			Socio[ContSocio] = o;
			this.addAcesso(x, o);
			ContSocio++;
		}
		else
		{
			throw new Exceção("Data ou Socio invalidos");
		}
	}
	
	public String ListaDeVisitante(LocalDate DATA)
	{
		String d = "";
		for(int i=0; i < ContAcessos; i++)
		{
			if((this.Acessos[i].getDataAcesso().isEqual(DATA)) && this.Acessos[i].getPessoa() instanceof Visitante)
			{
				d = d + Acessos[i].toString();
			}
		}
		return d;
	}
	
	public String AcessosEmIntervaloDeTempo(LocalDate datinha, LocalDate DATA)
	{
		String d = "";
		for(int i = 0; i < ContAcessos; i++)
		{
			if((Acessos[i].getDataAcesso().isAfter(datinha)) && (Acessos[i].getDataAcesso().isBefore(DATA)))
			{
				d = d + Acessos[i].toString();
			}
		}
		return d;
	}
	
	public String VisitantesEmUmDia(LocalDate DATA)
	{
		String d = "";
		for(int i = 0; i < ContAcessos; i++)
		{
			if(this.Acessos[i].getPessoa() instanceof Visitante)
			{
				if(this.Acessos[i].getDataAcesso().equals(DATA))
				{
					d = d + Acessos[i].toString();
				}
			}
		}
		return d;
	}
	
	public boolean ValidarListaSocios(Socio o)
	{
		boolean d = false;
		for(int i = 0; (i < ContSocio); i++)
		{
			if(this.Socio[i].getNroSocio() == o.getNroSocio())
			{
				d = true;
				break;
			}
		}
		return d;
	}
	
	public int NroDeAcessos(LocalDate datinha)
	{
		int d = 0;
		for(int i = 0; i < ContAcessos; i++)
		{
			if(this.Acessos[i].getDataAcesso().getDayOfMonth() == datinha.getDayOfMonth())
			{
				d = d + 1;
			}
		}
		return d;
	}
}
