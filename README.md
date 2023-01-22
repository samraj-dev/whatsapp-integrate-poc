# WhatsApp Integrator POC
POC of Integrating with WhatsApp

### Technologies
* Rest Template (Spring Web)
* Spring Shell

### Build Jar
Run the following command to build the jar file
```
mvn clean install
```

### Send WhatsApp Message
Run the following command to start the shell
```
java.exe -jar whatsapp-integrate-poc-0.0.1-SNAPSHOT.jar
```
A shell will be shown, run the below command to send WhatsApp message
```send <message> <number>``` example shown below<br/>
```send Adios 911234567890```
