# DataStructures2139
Java data structure class
This was an assignment where I was asked to create an array that 
 takes an array of non-negative ints.  On completion the array
   *  contains the same numbers, but wherever the array had two or more
   *  consecutive duplicate numbers, they are replaced by one copy of the number.
   *  Hence, after squash() is done, no two consecutive numbers in the array are
   *  the same.
   *
   *  Any unused elements at the end of the array are set to -1.
   *
   *  For example, if the input array is [ 0 0 0 0 1 1 0 0 0 7 7 7 1 1 0 ],
   *  it reads [ 0 1 0 7 1 0 -1 -1 -1 -1 -1 -1 -1 -1 -1 ] after squash()
   *  completes.
