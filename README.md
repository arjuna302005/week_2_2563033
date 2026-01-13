# week_2_2563033
Static Keyword Demonstration in Java
Overview
This project demonstrates proper memory utilization in Java using the static keyword with data members and member functions.
It shows how static members are shared among all objects of a class, reducing memory usage.
Technologies Used
Java
JDK (any version supporting basic Java)
Program Description
A Student class is created with:
A non-static data member (rollNo)
A static data member (count)
A static member function (getCount())
Every time a new object is created:
The static variable count is incremented
A unique roll number is assigned
The static method returns the total number of objects created.
