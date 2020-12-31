package teste;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import model.Empresa;
import model.Produto;

import org.junit.Test;

public class TesteProduto {

	@Test
	public void testeArray() {

		List<Empresa> nomeListaEmpresa = new ArrayList<>();

		// settando atribudos da classe Empresa

		Empresa emp1 = new Empresa("3233232", "Campo Vivo", 102, 500000.00,
				1995);
		Empresa emp2 = new Empresa("9398324", "DataCorporation", 57, 200000.00,
				2010);
		Empresa emp3 = new Empresa("939832923", "Hot dog do Homer", 3,
				10000.00, 2018);

		// adicionando dados dos objetos a lista

		nomeListaEmpresa.add(emp1);
		nomeListaEmpresa.add(emp2);
		nomeListaEmpresa.add(emp3);

		Empresa empresa;

		List<Produto> ListaDeProdutos = new ArrayList<>();

		Produto produto1 = new Produto(1L, "cachorro Quente", emp3, 10.00);
		Produto produto2 = new Produto(2L, "Graos de milho", emp1, 0.35);
		Produto produto3 = new Produto(3L, "Switchs", emp2, 10000.00);
		
		
		
		ListaDeProdutos.add(produto1);
		ListaDeProdutos.add(produto2);
		ListaDeProdutos.add(produto3);
		
		for(Produto l: ListaDeProdutos){
			System.out.println("produto é " + l.getNome()+ "da empresa "+ l.getEmpresa().getNome());
		}
		

	}
	
	@Test
	public void TestHashMap(){

		

		// settando atribudos da classe Empresa

		Empresa emp1 = new Empresa("3233232", "Campo Vivo", 102, 500000.00,
				1995);
		Empresa emp2 = new Empresa("9398324", "DataCorporation", 57, 200000.00,
				2010);
		Empresa emp3 = new Empresa("939832923", "Hot dog do Homer", 3,
				10000.00, 2018);
		
		Map<String, Empresa> mapaDeEmpresa = new HashMap<>();
		
		mapaDeEmpresa.put(emp1.getCnpj(), emp1);
		mapaDeEmpresa.put(emp2.getCnpj(), emp2);
		mapaDeEmpresa.put(emp3.getCnpj(), emp3);
		
		for(Map.Entry<String, Empresa> elemento: mapaDeEmpresa.entrySet()){
			System.out.println("get key "+elemento.getKey());
			System.out.println("get Value" + elemento.getValue().getNome());
		}
		
		Produto produto1 = new Produto(1L, "cachorro Quente", emp3, 10.00);
		Produto produto2 = new Produto(2L, "Graos de milho", emp1, 0.35);
		Produto produto3 = new Produto(3L, "Switchs", emp2, 10000.00);

				
		Map<Long, Produto> mapaDeProdutos = new HashMap<>();
		
		mapaDeProdutos.put(produto1.getId(), produto1);
		mapaDeProdutos.put(produto2.getId(), produto2);
		mapaDeProdutos.put(produto3.getId(), produto3);
		
		for(Map.Entry<Long, Produto> elemento : mapaDeProdutos.entrySet()){
			System.out.println("get key do elemento do produto: "+ elemento.getKey());
			System.out.println("get value do elemento do produto: " + elemento.getValue().getNome());
		}
		
	}
	
	
	
	

}
