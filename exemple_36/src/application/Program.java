/*
 * HASHCODE EQUALS
 * HASHCODE É MAIS RÁPIDO, MAS POSSUI UMA GRANDE MARGEM DE ERRO;
 * EQUALS É MAIS LENTO, MAS É 100% PRECISO;
 */

package application;

import entities.Client;

public class Program {

	public static void main(String[] args) {
		
		Client c1 = new Client("Maria", "maria@gmail.com");
		Client c2 = new Client("Paulo", "paulo@gmail.com");
		
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		System.out.println(c1.equals(c2)); //false
		
		System.out.println(c1 == c2); //false, '==' compara os endereços de memória;
		
		String s1 = "Teste";
		String s2 = "Teste";
		
		System.out.println(s1 == s2); // true. Nesse caso, o compilador interpreta os literais de forma diferente;
		
	}
}
