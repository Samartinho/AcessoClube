import java.time.LocalDate;

public class App {
	public static void main(String[] args) throws Exceção{
		try
		{
		Clube Clube = new Clube();
		Clube.addSocio(LocalDate.of(2020, 07, 9), new Socio("Josue", 13246579845L, LocalDate.of(2001, 8, 24), 200));
		Clube.addAcesso(LocalDate.of(2020, 07, 02), new Visitante("Gabrel", 7984651321L, LocalDate.of(2001, 12, 24), 87));
		System.out.println(Clube.ListaDeVisitante(LocalDate.of(2020, 07, 2)));
		System.out.println(Clube.AcessosEmIntervaloDeTempo(LocalDate.of(2020, 07, 1), LocalDate.of(2020, 07, 10)));
		System.out.println(Clube.VisitantesEmUmDia(LocalDate.of(2020, 07, 2)));
		System.out.println(Clube.VisitantesEmUmDia(LocalDate.of(2020, 07, 9)));//Não printou o socio como solicitado
		System.out.println(Clube.ValidarListaSocios(new Socio("Josue", 13246579845L, LocalDate.of(2001, 8, 24), 200)));
		System.out.println(Clube.ValidarListaSocios(new Socio("Rafael", 46513279821L, LocalDate.of(2001, 8, 24), 12)));//Socio nao cadastrado
		System.out.println(Clube.NroDeAcessos(LocalDate.of(2020, 07, 2)));
		}
		catch(Exceção E)
		{
			System.out.println(E);
		}
		
	}
}
