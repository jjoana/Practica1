jar_file = ap-Practica1.jar

limpiar:
	rm -rf bin calculoPiDocs ap-Practica1.jar
compilar:limpiar
	mkdir bin
	find src -name *.java | xargs javac -cp "lib/*:bin" -d bin 
	javadoc	-d calculoPiDocs ./src/aplicacion/Principal.java ./src/mates/Matematicas.java
	jar cvfm $(jar_file) Manifest.txt -C bin .
ejecutar:
	java -cp bin aplicacion.Principal 10000000
ejecutar_jar:
	java -jar ap-Practica1.jar 10000000
