import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PessoaTeste {
	Pessoa Pessoa;
	
	@BeforeEach
	void SetUp() throws Exce��o {
		Pessoa = new Pessoa("Nome", 79846521321L, LocalDate.of(2001, 12, 24));
	}
	
	@Test
	void testPessoaSetCPF() throws Exce��o {
		assertThrows(Exce��o.class, () -> {Pessoa.setCpf(0);});
	}	
	
	@Test
	void testPessoaSetData() throws Exce��o {
		assertThrows(Exce��o.class, () -> {Pessoa.setDataDeNascimento(LocalDate.of(1000, 1, 1));});
	}	
	
	@org.junit.jupiter.api.Test
	void testPessoaSetNome() throws Exce��o {
		assertThrows(Exce��o.class, () -> {Pessoa.setNome(null);});
	}	
	
	@org.junit.jupiter.api.Test
	void testPessoaGetCPF() throws Exce��o {
		assertEquals(Pessoa.getCpf(), 79846521321L);
	}	
	
	@org.junit.jupiter.api.Test
	void testPessoaGetDia() throws Exce��o {
		assertEquals(Pessoa.getDataDeNascimento().getDayOfMonth(), 24);
	}	
	
	@org.junit.jupiter.api.Test
	void testPessoaGetMes() throws Exce��o {
		assertEquals(Pessoa.getDataDeNascimento().getMonthValue(), 12);
	}	
	
	@org.junit.jupiter.api.Test
	void testPessoaGetAno() throws Exce��o {
		assertEquals(Pessoa.getDataDeNascimento().getYear(), 2001);
	}
}
