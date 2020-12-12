package model;

import java.util.Comparator;

public class ProviderAltura implements Comparator<Pessoa> {

	@Override
	public int compare(Pessoa p1, Pessoa p2) {
		return new Double(p2.getAltura()).compareTo(p1.getAltura()); 
	
	}
	

}
