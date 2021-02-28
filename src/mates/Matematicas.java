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

package mates;
public class Matematicas{
/**
	* Genera una aproximacion al numero Pi mediante el metodo de Montecarlo
	* El parametro 'pasos' inidica el número de puntos generado
*/

	public static double generarNumeroPi(long pasos){

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
		for (int i=0; i< pasos; i++){
			coordenadaX = 1 - 2 * Math.random();
			coordenadaY = 1 - 2 * Math.random();

			if (Math.sqrt(Math.pow(coordenadaX , 2) + Math.pow(coordenadaY, 2)) <= 1){
				dentroCirculo++;
			} 
			dentroCuadrado++;
		}

		Pi = 4.0 * (dentroCirculo/dentroCuadrado);
		return Pi;
	}

}


