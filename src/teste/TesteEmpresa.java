package teste;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.Test;

import model.Empresa;
import model.Pessoa;

public class TesteEmpresa {

	
	@Test
	public void testArray() {
		
		List<Empresa> lista = new ArrayList<>();
		
		Empresa e1 = new Empresa("9898934", "ghostesters", 44, 10000.00, 2000);
		Empresa e2 = new Empresa("5766557", "farber", 100, 990000.00, 2003);
		Empresa e3 = new Empresa("4554534", "fuker", 30, 50000.00, 2006);
		Empresa e4 = new Empresa("2131232", "amber", 14, 9000.00, 2011);
		Empresa e5 = new Empresa("9808998", "raizen", 123, 100000.00,1990);
		
		lista.add(e1);
		lista.add(e2);
		lista.add(e3);
		lista.add(e4);
		lista.add(e5);
		
		for(Empresa e: lista) {
			System.out.println(e.getNome());
		}
		
	}
		
		
		@Test
		public void testMap() {
			
			Map<String, Empresa> map = new HashMap<>();
			
			Empresa e1 = new Empresa("9898934", "ghostesters", 44, 10000.00, 2000);
			Empresa e2 = new Empresa("5766557", "farber", 100, 990000.00, 2003);
			Empresa e3 = new Empresa("4554534", "fuker", 30, 50000.00, 2006);
			Empresa e4 = new Empresa("2131232", "amber", 14, 9000.00, 2011);
			Empresa e5 = new Empresa("9808998", "raizen", 123, 100000.00,1990);
			
			map.put(e1.getCnpj(), e1);
			map.put(e2.getCnpj(), e2);
			map.put(e3.getCnpj(), e3);
			map.put(e4.getCnpj(), e4);
			map.put(e5.getCnpj(), e5);

			
			for(Map.Entry<String, Empresa> elemento : map.entrySet()) {
				
				System.out.println(elemento.getKey());
				System.out.println(elemento.getValue().getNome());
			}
	}
}
