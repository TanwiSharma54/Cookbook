**Tanwi Sharma Individual Project**
Project Name: **Cookbook**

Problem Statement
=================
We all have those times when we don’t know what we could make for ourselves
to eat from what we have available with us. Even if we do we, may not know
about a new recipe that can be made from the same ingredients or an old 
recipe that can be made in a different way.

Today there are innumerable applications that provide consumers with 
recipes ranging from quick to healthy and from beginner to expert; all 
intending to save time. But, none of these applications take into account 
whether he recipes ingredients are available with the consumer at the 
point of time or not. They fail to provide recipes containing only the 
ingredients that are available, thus proving to be inefficient and wasting
time rather than saving it. These contemporary applications also do not 
evaluate and learn from the user’s choices thus further increasing the 
user’s task of repeating already fed information again. 

The solution we came to is an Application that will provide you recipes 
based on the ingredients that you already have with you, resulting in 
less wastage of time and money in buying the unavailable ingredients. 
The application contains an available database of food recipes that can be 
browsed through by the user.
I plan on using a content-based recommendation system that will learn 
from user’s inputs and provide the user with refined recommended recipes 
which suit the user’s needs.


**Project Technologies/Techniques**
**1>Security/Authentication**

Tomcat's JDBC Realm Authentication

Admin role: create/read/update/delete (crud) of all data

User role: This application allows the user to select the ingredients he 
or she wants and view recipes that contain those ingredients. These
ingredients can be sorted and filtered to the user's convenience. The 
user can also view recipes directly and select the one to cook. Recipes 
can be also added by the user along with new ingredients. The recipes also
show nutritional facts that can help the user make a better choice. Thus 
giving the user complete control over his or her food choices and 
preparation. This application was developed to solve one of the problems 
most people have, what could be made from the available ingredients. 
The application solves this and many other problems while also providing 
the user with nutritional knowledge about their food.

2>**Database**
MySQL
Store users 
Store all data for the Cookbook 

**3>ORM Framework**
Hibernate 5
Dependency Management
Maven
Web Services consumed using Java

4> **CSS**
Bootstrap
Data Validation
Bootstrap Validator for front end
Explore Hibernate's validation
Logging
Configurable logging using Log4J2. In production, only errors will normally be logged, but logging at a debug level can be turned on to facilitate trouble-shooting.

**5>Hosting**
AWS

**6>Independent Research Topic/s**
CI tools in AWS
Google Login API
Hibernate Validation
Hibernat Search
Project Lombok to eliminate boilerplate code like getters/setters/equals

**6>Unit Testing**
JUnit tests to achieve 80%+ code coverage

**IDE: IntelliJ IDEA**

**Design**
User Stories [UserStories.md]
Project Plan [ProjectPlan.md]
Screen Design [cookBookAppScreenDesigns directory]
Application Flow [CookBookActivityDiagram.png]
Database Design 

### Feedback

[Link to the peer feedback form](Feedback.md)

