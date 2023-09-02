Previous one all variables and methods were reachable in everywhere.
Now I solved this "problem" with minor changes and I'll explain it step by step:
1) I changed variables public to private.
2) Without using get, i create two methods which prints the points.
3) calculate, clone and move methods are still same with some changes.
->3.1) They're all private now.
->3.2) For using them, i create new methods which starts "print" in name.
->3.3) These methods can access the private methods and also user cannot reach/know what's going on behind in IDE.
4) In addition to encapsulation, I used this() in new methods to support performance.