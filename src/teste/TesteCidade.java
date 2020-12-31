package teste;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import model.Cidade;
import model.Empresa;
import model.Estado;

import org.junit.Test;

public class TesteCidade {
	
	@Test
	public void testeArrayListCidade(){

	List<Estado> ListaEstado = new ArrayList<>();
		
		Estado est1 = new Estado(1L, "Rio Grande do Sul");
		Estado est2 = new Estado(2L, "Rio de Janeiro");
		Estado est3 = new Estado(3L, "São Paulo");
		Estado est4 = new Estado(4L, "Minas Gerais");
				
		ListaEstado.add(est1);
		ListaEstado.add(est2);
		ListaEstado.add(est3);
		ListaEstado.add(est4);

		
	
		
		List<Cidade> listaDaCidade = new ArrayList<>();
		
		Cidade c1 = new Cidade(9248000L, "Nova Santa Rita" , est1);
		Cidade c2 = new Cidade(9250000L, "Poço de Caldas", est4);
		Cidade c3 = new Cidade(92444000L, "Ipanema", est2);
		Cidade c4 = new Cidade(92444000L, "Mogi das Cruzes" , est3);
		
		
		
		listaDaCidade.add(c1);
		listaDaCidade.add(c2);
		listaDaCidade.add(c3);
		listaDaCidade.add(c4);
		
		System.out.println("<<<<<<<<<busca dos valores atavés daLista>>>>>>>>");
		
		for(Cidade c: listaDaCidade){
			System.out.println("o nome da cidade: " + c.getNome()+ "E o nome do estado é:"
					+ c.getEstado().getNome());
			
		}
		
		
	}
	
	@Test
	public void testeMapCidade() {
		

		Estado est1 = new Estado(1L, "Rio Grande do Sul");
		Estado est2 = new Estado(2L, "Rio de Janeiro");
		Estado est3 = new Estado(3L, "São Paulo");
		Estado est4 = new Estado(4L, "Minas Gerais");
				
		Map<Long, Estado> mapEstado = new HashMap<>();
		
		mapEstado.put(est1.getId(), est1);
		mapEstado.put(est2.getId(), est2);
		mapEstado.put(est3.getId(), est3);
		mapEstado.put(est4.getId(), est4);
		
		
		Cidade c1 = new Cidade(9248000L, "Nova Santa Rita" , est1);
		Cidade c2 = new Cidade(9250000L, "Poço de Caldas", est4);
		Cidade c3 = new Cidade(92444000L, "Ipanema", est2);
		Cidade c4 = new Cidade(92444000L, "Mogi das Cruzes" , est3);
		
		Map<Long, Cidade> mapCidade = new HashMap<>();
		
		mapCidade.put(c1.getCep(), c1);
		mapCidade.put(c2.getCep(), c2);
		mapCidade.put(c3.getCep(), c3);
		mapCidade.put(c4.getCep(), c4);
		

		System.out.println("<<<<<<<<<busca dos valores atavés do map>>>>>>>>");
		
		for(Map.Entry<Long, Cidade> elementoCidade : mapCidade.entrySet()) {
			
			System.out.println(elementoCidade.getKey());
			System.out.println(elementoCidade.getValue().getNome());
			
			
		}
		
		
	}
	

}
