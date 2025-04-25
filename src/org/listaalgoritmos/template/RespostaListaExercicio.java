package org.listaalgoritmos.template;



public class RespostaListaExercicio {
	
	/*
	 * Utilize apenas o método main para testar a implementação dos métodos. 
	 * Não se faz necessário implementar dentro do escopo do método.
	 */

	public static void main(String[] args) {
	  
	  //calculo do imc
	  float  resultado = calcularImc(70f , 1.85f);
	  System.out.println("IMC:" + resultado);
	  
	  
	  //calculo da area do trapezio
	  float area = calcularAreaTrapezio(100f , 70f ,1.70f);
	  System.out.println("Area:" + area);
	  
	  
	  //maior Entre Dois Inteiros
	  int maior = maiorEntreDoisInteiros(30 , 40);
	  System.out.println("O maior é:"+ maior);
	  
	  
	  //numero impar
	  boolean impar = verificarParImpar(10);
	  System.out.println("O numero é:" + impar);
	  
	  
	  //media das notas 
	  float [] notas = {10f , 20f ,  30f , 40f};
	  float media =  calcularMediaNotas(notas);
	  System.out.println("A media é:" + media);
	  
	  
	  //array inverso
	  /*int [] array = {10 , 20 ,30 , 40};
	  imprimirArrayInverso(array);*/
	  
	  //numero primo
	  /*int [] array = {10,20,5,7,8};
	  imprimirElementosPrimos(array);*/
	  
	  int [] array = {3, 2 ,7 ,6};
	  imprimirElementosImpares(array);
	  
	 
}
	  
		
	/**
	 * Método deve calcular o IMC utilizando peso e altura. Como resultado
	 * o método deve retornar uma variável resultado do tipo float.
	 * @param peso
	 * @param altura
	 * @return resultado
	 */
	public static float calcularImc(float peso, float altura) 
	{
		return  peso / (altura * altura);
		
		

	}

	
	/**
	 * Método deve calcular a área do trapézio independente da unidade de medida.
	 * Como resultado, o método deve retornar a área calculada.
	 * @param baseMaior
	 * @param baseMenor
	 * @param altura
	 * @return areaTrapezio
	 */
	public static float calcularAreaTrapezio(float baseMaior, float baseMenor, float altura) 
	{	
		return ((baseMaior + baseMenor) * altura) /2;
		
	}
	
	/**
	 * O método deve calcular o maior entre dois inteiros, que são fornecidos
	 * como argumento do método. O retorno deve ser o maior valor dado
	 * como entrada, sendo do tipo inteiro.
	 * @param a
	 * @param b
	 * @return maiorValor
	 */
	public static int maiorEntreDoisInteiros(int a, int b) 
	{
		if(a < b) {
			return b;
		}else {
			return a;
		}
	}
	
	/**
	 * Método verifica se o número apresentado como argumento é ímpar ou par.
	 * caso seja par, o retorno do método deve ser verdadeiro. Caso contrário,
	 * o valor retornado deve ser falso.
	 * @param numero
	 * @return condicao
	 */
	public static boolean verificarParImpar(int numero) 
	{
		return numero%2 != 0;
	
		
	}
	
	/**
	 * Método calcula a média aritmetica dos elementos float a partir de um array. 
	 * O retorno deve ser o resultado do cálculo da média.
	 * @param notas
	 * @return media
	 */
	public static float calcularMediaNotas(float[] notas) {
		float soma = 0;
		
		for(int i = 0; i < notas.length; i++){
			
			soma += notas[i];
		}
		return soma/notas.length;
	}
	
	/**
	 * Método imprime array de inteiros no sentido inverso, separando os elementos por vírgula.
	 * O último elemento impresso não deve preceder vírgula. Use o System.out.print() para imprimir os valores.
	 * Os elementos devem ser impresso numa única linha.
	 * @param array
	 */
	public static void imprimirArrayInverso(int[] array)
	{
		
		for(int i = array.length -1; i >= 0; i--) {
			
			
			System.out.println(array[i] + "");
		}
		
	}
	 
	/**
	 * Método deve imprimir os elementos primos de um array de inteiros. O formato da impressão 
	 * deve ser feito numa única linha, utilizando espaço em branco (" ") entre os elementos e 
	 * após o último elemento. Utilize System.out.print()
	 * @param array
	 */
    public static void imprimirElementosPrimos(int[] array) {
        for (int j : array) {
            int contador = 0;

         
            for (int i = 2; i < j; i++) {
                if (j % i == 0) {
                    contador++; 
                    break; 
                }
            }

          
            if (contador == 0 && j > 1) {
                System.out.print(j + " "); 
            }
        }
    }
	
	
	/**
	 * Método deve imprimir os elementos ímpares de um array de inteiros. O formato da impressão 
	 * deve ser feito numa única linha, utilizando espaço em branco (" ") entre os elementos e 
	 * após o último elemento. Utilize System.out.print()
	 * @param array
	 */
	public static void imprimirElementosImpares(int[] array) 
	{
		for(int j:array) {
			if(j  % 2 != 0) {
				
				System.out.print(j + " ");
			}
			
		}
	}
	
	
	/**
	 * Método deve imprimir os elementos pares de um array de inteiros. O formato da impressão 
	 * deve ser feito numa única linha, utilizando espaço em branco (" ") entre os elementos e 
	 * após o último elemento. Utilize System.out.print()
	 * @param array
	 */
	public static void imprimirElementosPares(int[] array) 
	{
		System.out.print("");
	}
	
	
	/**
	 * Método deve imprimir o maior e o menor elemento de um array de inteiros. O formato da impressão 
	 * deve ser feito numa única linha, utilizando espaço em branco (" ") entre os elementos e 
	 * após o último elemento. Utilize System.out.print()
	 * @param array
	 */
	public static void imprimirMaiorMenorElemento(int[] array) 
	{
		System.out.print("");
	}
	
	/**
	 * O método calcula a média aritmética dos elementos de um array de inteiros. 
	 * Como resultado, o valor da média deve ser retornado no método.
	 * @param array
	 * @return media
	 */
	public static float calcularMediaAritmetica(int[] array) 
	{
		return 0f;
	}
	
}
