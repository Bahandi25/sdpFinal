# sdpFinal
Name of your final project: Football Event Manager

Group: SE-2213
Team members: Bakhtiiar Abuev, Sagidolla Aldiiar, Tazhenov Tamerlan
Project Overview:
• Provide some information about your project.
• Describe the idea of the project.
• The purpose of the work.
• The objectives of the work.
A program for organizing and managing football matches.  The program provides the ability to create new matches with the function of customizing playing teams, dates, and player uniforms. The program also sends notifications to subscribers about matches.  And helps manage ticket sales with calculation of available seats.
The program is designed for match organizers to manage all aspects of the match in one place
Main body:
• Include explanations of each feature and design pattern. Provide screenshots, if
necessary (for example, we used observer to notify users about something).
• Include UML diagram to illustrate the structure of the design patterns used in your
project.
The TeamManager class uses the Singleton design pattern.  Ensuring that this class has only one instance, providing one global access point to the data contained in this class.
Pattern strategy determines the actions of team players such as running, defending, hitting.  Strategy defines these actions and makes them interchangeable.  Allows you to change the algorithm.
The pattern decorator allows you to choose the color of the uniform and brand of boots for football team players.  A decorator allows you to dynamically add these attributes to objects by wrapping it in a decorator object.
The Observer pattern defines a one-to-many relationship between objects so that when the state of one object changes, all objects that depend on it are notified and updated automatically.  It allows you to send notifications to all subscribers about a football match event.
The State pattern is used here. What is this pattern? State is a behavioral design pattern that lets an object alter its behavior when its internal state changes. It appears as if the object changed its class. The match is scheduled, but will it be or not? If the match does take place, then it will go on for 90 minutes. If not, then you need to specify the reason why the match was canceled, and users will receive a notification of cancellation for certain reasons.
Conclusion:
• Key points of your project. Mention used patterns.я
• Project outcomes. Challenges faced.
• Future improvements![image](https://github.com/Bahandi25/sdpFinal/assets/121560352/12e1738a-6c72-4c54-b060-6b351bace947)
