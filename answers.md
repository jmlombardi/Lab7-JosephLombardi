## Joseph Lombardi
### COMP 271
### Lab 7
#### Due 07/18/2018


### Questions

##### What is the purpose of the various auxiliary methods populateList and populateFifoList?

   The purpose of the auxiliary methods are to be able to use recursion and to avoid the user having to provide an arguments they have have to guess on.  The auxiliary methods also enhance our application to use the FIFO functionality.

##### Why do these methods need to have arguments, and how does the argument change from one recursive call to the next?
   These methods have arguments so we can tell our methods which part of the stack to start using the data.  Every time we make a recursive call to our method it retrieves the new value of curr.next() if curr is not equal to null.

##### What are the time and space complexity of each of the populateList populateFifoList methods, as well as ReverseLines.printReverse?

   populateList - The space and time complexity of populateList both O(n) because the the larger n is, the more items you have to iterate through, make another recursive call and copy to your ArrayList.

   populateFifoList - The space and time complexity of populateFifoList both O(n) because the the larger n is, the more items you have to iterate through, make another recursive call and copy to your ArrayList.

   ReverseLines.printReverse - The space and time complexity of ReverseLines.printReverse are both O(n) because the more lines a user enters the more activation records get pushed on the stack, then each line has to be printed before and after.


##### Which of these methods can be implemented using while loops?
   
   All three of these methods can be implemented using while loops.  Both the populateList and populateFifoList methods can use a while loop.  while (curr != null).... ReversedLines.printReverse() can also be used with a while loop.  while (input.hasNextLine())....
