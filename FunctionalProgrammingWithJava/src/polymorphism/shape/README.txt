There is a shape creation example in Java. The 'Shape' class is the parent class, and it has child classes named 
'Square,' 'Rectangle,' 'Triangle,' and 'Circle.'
The 'Shape' class contains five methods: 'draw(),' 'erase(),' 'calculateArea(),' 'calculateCircumference(),' and 'printInfo().'
All child classes override these methods.
The 'ShapeFactory' class has a method called 'createShape()' which randomly creates a shape.
The 'Canvas' class has two methods called 'drawShape()' and 'eraseShape(). 
As you might guess, these methods draw and erase shapes. 'Canvas' is also a child class of 'Shape.'
The 'ShapeMain' class is the main class. It can call methods on the 'ShapeFactory' object and draw/erase shapes using the 'Canvas' class.