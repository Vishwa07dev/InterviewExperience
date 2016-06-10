# Interview Experience Services

How to use
==========
> - Install Mongodb and start the mongo server in it's default setting
> - Clone the repo , and do the maven import in the IDE or do mvn clean install
> - Run the ApplicationStart.java class to start the service .


Following Operations are supported :
===================================
> - Create Interview Experience
      POST 
      Sample PayLoad /Request body
      
-----------------------------------------------------------      
      {
        "candidate" : {
                        "userId" : "asf133",
                        "name" : "Vishwa" ,
                        "totalExperience" : "5 years" ,
                        "typeOfInterview" : "IT"
                      },
        "company" : "Oracle" ,
        "designationApplied" : "SE2" ,
        "expectedSalary" : "100000000" ,
        "interviewRounds" : [{
                              "question" : "What is your name ",
                              "answer" : "Vishwa" ,
                              "duration" : "30 mins" 
                             },
                             {
                              "question" : "What is your name ",
                              "answer" : "Vishwa" ,
                              "duration" : "30 mins" 
                             }
                            ]
      }

------------------------------------------------------

End Point : http://localhost:8080/v1/api/interviewExperience (When running on the local system)


> - Get Interview Experience
    GET request
    End Point1 : http://localhost:8080/v1/api/interviewExperience/{id}
    End Point2 : http://localhost:8080/v1/api/interviewExperience

> - Delete Interview Experience
    DELETE request
    End Point : http://localhost:8080/v1/api/interviewExperience/{id}
    
> - Update Interview Experience
    PUT request
    End Point : http://localhost:8080/v1/api/interviewExperience/{id}
    PayLoad will be same as that of the POST request
    
    
> - In the case of any doubt please feel free to mail at kankvish@gmail.com. If you want to contribute , kindly fork the repo and provide a pull request !



