import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PessoaTeste {
	Pessoa Pessoa;
	
	@BeforeEach
	void SetUp() throws Exceção {
		Pessoa = new Pessoa("Nome", 79846521321L, LocalDate.of(2001, 12, 24));
	}
	
	@Test
	void testPessoaSetCPF() throws Exceção {
		assertThrows(Exceção.class, () -> {Pessoa.setCpf(0);});
	}	
	
	@Test
	void testPessoaSetData() throws Exceção {
		assertThrows(Exceção.class, () -> {Pessoa.setDataDeNascimento(LocalDate.of(1000, 1, 1));});
	}	
	
	@org.junit.jupiter.api.Test
	void testPessoaSetNome() throws Exceção {
		assertThrows(Exceção.class, () -> {Pessoa.setNome(null);});
	}	
	
	@org.junit.jupiter.api.Test
	void testPessoaGetCPF() throws Exceção {
		assertEquals(Pessoa.getCpf(), 79846521321L);
	}	
	
	@org.junit.jupiter.api.Test
	void testPessoaGetDia() throws Exceção {
		assertEquals(Pessoa.getDataDeNascimento().getDayOfMonth(), 24);
	}	
	
	@org.junit.jupiter.api.Test
	void testPessoaGetMes() throws Exceção {
		assertEquals(Pessoa.getDataDeNascimento().getMonthValue(), 12);
	}	
	
	@org.junit.jupiter.api.Test
	void testPessoaGetAno() throws Exceção {
		assertEquals(Pessoa.getDataDeNascimento().getYear(), 2001);
	}
}
