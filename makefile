limpiar:
	rm -rf bin calculoPiDocs
compilar:limpiar
	mkdir bin
	find src -name *.java | xargs javac -cp "lib/*:bin" -d bin 
	javadoc	-d calculoPiDocs ./src/aplicacion/Principal.java ./src/mates/Matematicas.java
ejecutar:
	java -cp bin aplicacion.Principal 10000000
