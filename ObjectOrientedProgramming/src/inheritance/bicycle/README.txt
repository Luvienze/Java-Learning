Bicycle ClaSs:
//It is not an inheritance example. It's a compositon example. There are no protected variable as you can see.
1) There are 7 classes I created for a bicycle. 
2) All the other class except Bicylce and BicycleTest, connects with bicycle.
3) Bicycle have make, model, color, year and speed. Also it has pedals, a kickstand, two tires, and two glasses/mirrors on it.
4) It has a constructor method, go, stop and park methods.

Glass Class:
1) It has size and name.
2) There is a constructor method.

Kickstand Class:
1) It has height and color.
2) There is a constructor method which prints that kickstand is created when it calls.
3) There are open() and close() methods.

Pedal Class:
1) It has name and color.
2) There is a constructor method which prints that pedal is created when it calls.
^) There are pedalling() and pedalStopped() methods.

Steering Class:
1) It has color, height, type and rotation.
2) There is a initilization block.
3) There are some rotating methods.

Tire Class:
1) It has rim and name;
2) There is a constructor method.
3) There are turning() and stabble() methods.

BicycleTest:
//Main method
1) I created an object and call the methods etc. with on it.