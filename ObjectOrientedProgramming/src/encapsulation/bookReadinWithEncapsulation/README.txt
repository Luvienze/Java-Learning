I changed a lot things in this example and i'll explain it. Also I can compare with previous one.
Let's start author class.
1) All variables are private now.
2) I used set methods to declaration.
3) Now we can access and print variables without using get methods.
4) In previous code, ısAlive returns false and true but with minor changes now it prints "alive" or "rip".
5) Also we can print all of author's infos in single method i called printAuthotInfo by using this().

Changes on Book class:
1) All variables are private now.
2) I used set methods to declaration.
3) Now we can access and print variables without using get methods.
4) Also we can print all of book's infos in single method i called printBookInfo by using this().
5) We can print reader's info too in single method i called printReaderInfo(9) by using this().
6) In previous code, bookCover returns false and true but with minor changes now it prints "hardcovered" or "softcovered".
7) I made a mistake about read() method on previous one. The book object read itself in previous code but actually reader should be able to read the book.
->7.1) To solve the problem i didn't change the old method in Book class. I'll explain it Reader class.

Changes on Reader class:
1) All variables are private now.
2) I uses set methods to declaration.
3) Now we can access and print variables without using get methods.
4) Also we can print all of reader's infos in single method i called printReaderInfo by using this().
5) To solve the read() method problem I declarate private int read in this class.
->5.1)I created read method in reader clas (as it should be).
->5.2)In read method, it calls book.printReadPage with read (which mean page) parameter.

Changes on ReaderTest class:
1) There are no changes actually but i extend the examples. 
2) I didn't use Scanner but imported it so if you want you can declarate names etc.