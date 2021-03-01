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

package aplicacion;
import mates.Matematicas;

/**
	* Clase que implementa el método principal,
	* el argumento args[0] indica el número de iteraciones que van a realizarse para calcular el número Pi
	* @version 1.0
*/
public class Principal{ 

 public static void main(String[] args){
 	System.out.println("El número PI es " + Matematicas.generarNumeroPi(Integer.parseInt(args[0])));

	}
}

