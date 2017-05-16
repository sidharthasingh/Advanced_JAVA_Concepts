javac *.java
rmic MyClass
start start_rmiregistry.bat
start start_server.bat
timeout 2
start start_client.bat
exit