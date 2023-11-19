# sdpFinal
Name of your final project: Football Event Manager

Group: SE-2213

Team members: Bakhtiiar Abuev, Sagidolla Aldiiar, Tazhenov Tamerlan

Project Overview:
A program for organizing and managing football matches.  The program provides the ability to create new matches with the function of customizing playing teams, dates, and player uniforms. The program also sends notifications to subscribers about matches.  And helps manage ticket sales with calculation of available seats.
The program is designed for match organizers to manage all aspects of the match in one place

Main body:
• Include UML diagram to illustrate the structure of the design patterns used in your project.![umlpic](https://github.com/Bahandi25/sdpFinal/assets/121560352/b938307f-cdee-463a-a8a1-106685e055a7)


The TeamManager class uses the Singleton design pattern.  Ensuring that this class has only one instance, providing one global access point to the data contained in this class.
![Снимок экрана (617)](https://github.com/Bahandi25/sdpFinal/assets/121560352/cb9538f0-3ae6-47ee-b5c9-29bff95320d7)

Pattern strategy determines the actions of team players such as running, defending, hitting.  Strategy defines these actions and makes them interchangeable.  Allows you to change the algorithm.
![Снимок экрана (618)](https://github.com/Bahandi25/sdpFinal/assets/121560352/e62bc5bc-bde9-44b2-80a9-8621968f0f0a)

The pattern decorator allows you to choose the color of the uniform and brand of boots for football team players.  A decorator allows you to dynamically add these attributes to objects by wrapping it in a decorator object.
![Снимок экрана (620)](https://github.com/Bahandi25/sdpFinal/assets/121560352/622b714d-1dbe-484e-9a18-1f069d8240ee)
![Снимок экрана (619)](https://github.com/Bahandi25/sdpFinal/assets/121560352/c7c84fb7-4812-40e7-b106-cbd04bbe670c)

The Observer pattern defines a one-to-many relationship between objects so that when the state of one object changes, all objects that depend on it are notified and updated automatically.  It allows you to send notifications to all subscribers about a football match event.
![Снимок экрана (616)](https://github.com/Bahandi25/sdpFinal/assets/121560352/448e8788-1ba7-4aee-a949-b2b1993861f7)
![Снимок экрана (615)](https://github.com/Bahandi25/sdpFinal/assets/121560352/aee2d222-f45d-4126-a1ed-34acc0d25d1a)

The State pattern is used here. What is this pattern? State is a behavioral design pattern that lets an object alter its behavior when its internal state changes. It appears as if the object changed its class. The match is scheduled, but will it be or not? If the match does take place, then it will go on for 90 minutes. If not, then you need to specify the reason why the match was canceled, and users will receive a notification of cancellation for certain reasons.
![Снимок экрана (612)](https://github.com/Bahandi25/sdpFinal/assets/121560352/428b634f-cff7-46f3-9b3e-de29e0ab8ddd)

The Adapter pattern is applied to make the TeamShop class compatible with the TicketAdapter interface used by the FootballTeamManager. It promotes flexibility and reusability, allowing the system to work with different ticket providers without altering the core logic.
![Снимок экрана (614)](https://github.com/Bahandi25/sdpFinal/assets/121560352/3ac83c38-5f4a-488f-b60c-fa533692ed76)

And our output is this:

![Снимок экрана (623)](https://github.com/Bahandi25/sdpFinal/assets/121560352/85b125ca-c075-4222-8cc7-9a88a6fc11fb)
![Снимок экрана (621)](https://github.com/Bahandi25/sdpFinal/assets/121560352/1cb42b65-968c-4965-9bb8-6f93c12e57ee)
![Снимок экрана (622)](https://github.com/Bahandi25/sdpFinal/assets/121560352/953c50c5-9f22-449e-a187-94036553fe79)


Conclusion:
While writing the code, we were faced with the problem of combining the code of different team members. Our program is still open to many extensions, for example, you can add more global functions to organize all matches or add a database to store match results and maintain tournament tables.

References:
https://refactoring.guru/design-patterns/book
