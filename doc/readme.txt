compiling:

javac -d bin -sourcepath src -cp lib/lib1.jar;lib/lib2.jar src/com/example/Application.java

javac -d bin -sourcepath src -cp lib/selenium-java-2.47.1.jar:lib/* src/TestClass.java




running:

java -cp bin;lib/lib1.jar;lib/lib2.jar com.example.Application

java -cp bin:lib/selenium-java-2.47.1.jar:lib/* TestClass

