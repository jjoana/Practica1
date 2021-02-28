/*
Copyright [2021] [Jesús Joana Azuara]
 
    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
		You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.06 
    Unless required by applicable law or agreed to in writing, software
    distributed Jesús Joana Azuarastributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
	  limitations under the Licene.
*/




import java.util.*;
/**
	* La clase calculoPi permite calcular el numero Pi mediante el método de MonteCarlo
	* Esta clase utiliza el constructor por defecto y contiene el método Main.
	* @version 1.0, 27/02/2021 
	* @author Jesús Joana Azuara
*/

public class CalculoPi{ 

/**
	* El método main lo utilizamos para implementar el algoritmo de MoteCarlo
	* Para ello se crean las variables dentroCirculo y dentroCuadrado
	* Generamos puntos aleatorios y comprobamos si estos puntos están dentro del circulo o no
	* En caso de estar dentro del circulo incrementamos las variable dentroCirculo y dentroCuadrado
	* Por último calculamos el valor de Pi mediante la fórmula que hay al finalizar el for
*/

 public static void main(String[] args){
 //Esta varible la utilizamos para que el usuario introduzca por pantalla el número de iteracciones que queremos realizar 
 	Scanner input = new Scanner(System.in); 
  System.out.println("Introduzca el número de iteraciones que desea realizar: ");
	//Esta variable se utiliza para establecer el numero de iteraciones que vaya a realizar en el bucle for
 	int numeroDeIteraciones = input.nextInt();
	//Esta variable la hemos creado para vaciar el baffer de lectura del scanner
	String basura = input.nextLine();
	//Esta variable sirve para ir contando el numero de puntos que caen aleatoriamente dentro del circulo
	double dentroCirculo=0.0;
	//Esta variable sirve para ir contando los puntos que caen tanto en el circulo como en el cuadrado
	double dentroCuadrado=0.0;
	//Es la constante que esatblece el area de un cuadrado de lado 2
	final int areaCuadrado = 4;
	//Esta variable sirve para establecer la coordenada x del punto aleatorio 
	double coordenadaX;
	//Esta varibale sirve para establecer la coordenada y del punto aleatorio
	double coordenadaY;
	// Esta varible sirve para almacenar el valor del número Pi
	double Pi;

	// Bucle principal del modelo de MonteCarlo
	for (int i=0; i< numeroDeIteraciones; i++){
		coordenadaX = 1 - 2 * Math.random();
		coordenadaY = 1 - 2 * Math.random();

		if (Math.sqrt(Math.pow(coordenadaX , 2) + Math.pow(coordenadaY, 2)) <= 1){
			dentroCirculo++;
			dentroCuadrado++;
		} else {
			dentroCuadrado++;
		}

	}
		Pi = 4.0 * (double)(dentroCirculo/dentroCuadrado);
		System.out.println("El valor calculado de Pi es: " + Pi);
	}

}
