@echo off
javac -cp "sqlite-jdbc-3.34.0.jar" %1.java
java -cp "sqlite-jdbc-3.34.0.jar;." %1
pause
