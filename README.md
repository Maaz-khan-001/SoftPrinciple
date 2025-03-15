Code Without Creator Principle:
The Main class is responsible for creating both Item and Order objects.
It increases coupling and makes Order dependent on external code for object creation.


Code With Creator Principle:
Here, the Order class follows the Creator Principle by creating and managing its own Item object.
Order is responsible for creating the Item object, reducing dependency on external code.
Encapsulation & maintainability improve since object creation is handled within the appropriate class.