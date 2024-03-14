build:
	javac -d bin src/*/*.java

run: build
	java -cp bin main.Main