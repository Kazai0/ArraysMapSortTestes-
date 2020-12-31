package teste;

import java.util.ArrayList;
import java.util.List;

import model.Cidade;

import org.junit.Test;

public class TesteCidade {
	
	@Test
	public void testeArrayList(){
		String teste;
		
		List<Cidade> listaDaCidade = new ArrayList<>();
		
		Cidade c1 = new Cidade(9248000L, "Nova Santa Rita");
		Cidade c2 = new Cidade(9250000L, "Guaíba");
		Cidade c3 = new Cidade(92444000L, "Aranrangua");
		Cidade c4 = new Cidade(92444000L, "Lusia");
		
		
		
		listaDaCidade.add(c1);
		listaDaCidade.add(c2);
		listaDaCidade.add(c3);
		listaDaCidade.add(c4);
		
		for(Cidade c: listaDaCidade){
			System.out.println("o nome da cidade: " + c.getNome());
		}
		
		
	}

}
