package teste;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

import model.Cidade;
import model.Estado;


public class TesteEstado {
	
	@Test
	public void testeArray() {
	
		List<Estado> ListaEstado = new ArrayList<>();
		
		Estado est1 = new Estado(1L, "Rio Grande do Sul");
		Estado est2 = new Estado(2L, "Rio de Janeiro");
		Estado est3 = new Estado(3L, "São Paulo");
		Estado est4 = new Estado(4L, "Minas Gerais");
				
		ListaEstado.add(est1);
		ListaEstado.add(est2);
		ListaEstado.add(est3);
		ListaEstado.add(est4);
		
		System.out.println("<<<<<<<<<busca dos valores atavés da Lista>>>>>>>>");
		
		for(Estado estado: ListaEstado) {
			System.out.println(estado.getNome());
		}
		
	}
	
	@Test
	public void testHashMap() {
		
		Estado est1 = new Estado(1L, "Rio Grande do Sul");
		Estado est2 = new Estado(2L, "Rio de Janeiro");
		Estado est3 = new Estado(3L, "São Paulo");
		Estado est4 = new Estado(4L, "Minas Gerais");
				
		Map<Long, Estado> mapEstado = new HashMap<>();
		
		mapEstado.put(est1.getId(), est1);
		mapEstado.put(est2.getId(), est2);
		mapEstado.put(est3.getId(), est3);
		mapEstado.put(est4.getId(), est4);
		
		System.out.println("<<<<<<<<<busca dos valores atavés do map>>>>>>>>");
		
		for (Map.Entry<Long, Estado> elementoMapEstado: mapEstado.entrySet()) {
			System.out.println(elementoMapEstado.getKey());
			System.out.println(elementoMapEstado.getValue().getNome());
		}
		
	}

}
