# mmcdrools

For the project following things need to be installed:
1. Maven
2. Spring boot(to use the dependencies) #not compulsorily
3. java jdk 

Steps followed for project:
1. Create a maven project in eclipse.
2. Here 4 classes are used.
   i) Main class: Starts your spring boot application
   ii)Controller class:It has the input of sugar level and then inserts that input in kiesession and fire all rules present in message.drl file.
   iii) Drool Config: It contains your Kiecontainer and the kieservices and the kiemodule is created .
   iv) Model class: It contains getter and setter method for the parameter that you want as input and output.
   
3. In the resourses you have message.drl file where you rules are present.Remember don't write duplicate rules there.Rule should be unique.
4. In application.properties file your port number is written on which your application is running.In our case it is 8082.

To Run the Project:
1. Right click on project and run as java application.
2. Go to postman and use the url http://localhost:8082/message.
3. In the post request add the body {"sugarLevel":"90"}
4. You will receive the output as per your requirement

   
