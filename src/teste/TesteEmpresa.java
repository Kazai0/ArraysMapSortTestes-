package teste;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

import model.Empresa;
import model.Pessoa;

public class TesteEmpresa {

	@Test
	public void testArray() {

		//Criando objeto nomeListaEmpresa apartir da classe ArrayList
		List<Empresa> nomeListaEmpresa = new ArrayList<>();
		
		
		//settando atribudos da classe Empresa
		
		Empresa emp1 = new Empresa("3233232", "Campo Vivo", 102 , 500000.00, 1995);
		Empresa emp2 = new Empresa("9398324", "DataCorporation", 57, 200000.00, 2010);
		Empresa emp3 = new Empresa("939832923", "Hot dog do Homer", 3, 10000.00, 2018);
		
		
		//adicionando dados dos objetos a lista  
		
		nomeListaEmpresa.add(emp1);
		nomeListaEmpresa.add(emp2);
		nomeListaEmpresa.add(emp3);
		
		//utiliza um for com parametro um objeto e da classe empresa até o final do ultimo nome da lista
		
		for(Empresa e: nomeListaEmpresa){
			//printa o nome da empresa
			System.out.println(e.getNome());
		}

	}

	@Test
	public void testMap() {

		// Criação do objeto map, da classe HashMap e utilizando como parâmetros
		// dos vetores Uma String e a classe "Empresa"
		Map<String, Empresa> map = new HashMap<>();

		// criando os objetos e's através do método construtor e settando os
		// valores

		Empresa e1 = new Empresa("9898934", "ghostesters", 44, 10000.00, 2000);
		Empresa e2 = new Empresa("5766557", "farber", 100, 990000.00, 2003);
		Empresa e3 = new Empresa("4554534", "fuker", 30, 50000.00, 2006);
		Empresa e4 = new Empresa("2131232", "amber", 14, 9000.00, 2011);
		Empresa e5 = new Empresa("9808998", "raizen", 123, 100000.00, 1990);

		// utiliza o método 'put' para indicar qual será o atributo 'key' da
		// classe "Empresa" instânciado pelo objeto e's

		map.put(e1.getCnpj(), e1);
		map.put(e2.getCnpj(), e2);
		map.put(e3.getCnpj(), e3);
		map.put(e4.getCnpj(), e4);
		map.put(e5.getCnpj(), e5);

		// Criando um laço de repetição e usando como condição (Utiliza a classe
		// "map" e o método
		// 'Entry' usando como Parâmetro uma String e a classe "Empresa" criando
		// o objeto elemento
		// este mesmo será iterado até o utlimo atributo do map
		for (Map.Entry<String, Empresa> elemento : map.entrySet()) {

			// Este print irá imprimir na tela o atributo q'key' de cada objeto
			// elemento
			System.out.println(elemento.getKey());

			// Este print irá imprimir na tela o valor do nome do objeto
			// elemento
			System.out.println(elemento.getValue().getNome());
		}
	}
}