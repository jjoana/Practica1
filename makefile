limpiar:
	rm -rf bin calculoPiDocs
compilar:limpiar
	mkdir bin
	find src -name *.java | xargs javac -cp "lib/*:bin" -d bin 
	javadoc	-d calculoPiDocs ./src/CalculoPi.java
ejecutar:
	java -cp bin CalculoPi
