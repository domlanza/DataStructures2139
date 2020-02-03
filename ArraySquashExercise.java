public class ArraySquashExercise {

  /**
   *  squash() takes an array of non-negative ints.  On completion the array
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
   *
   *  @param a the input array.
   **/

  public static void squash(int[] a) {

	  int firstelement = a[0];//first element of the list
	  int k = 1;
	  for(int i = 1; i< a.length; i++) {
		  if(a[i] != firstelement) {
			  a[j] = a[i];
			  j++;
		  }
		  firstelement = a[i];
	  }
	  for (int y = k; k< a.length; a++) {
		  a[k] = -1;
	  }
	  
  }


  /**
   *  stringInts() converts an array of ints to a String.
   *  @return a String representation of the array.
   **/
  private static String stringInts(int[] ints) {
    StringBuilder builder = new StringBuilder("[  ");
    for (int element : ints)
      builder.append(element).append("  ");
    return builder.append(']').toString();
  }



  /**
   *  main() runs test cases on your squash method.  Prints summary
   *  information on basic operations and halts with an error (and
   *  a stack trace) if any of the tests fail.
   **/
  public static void main(String[] args) {
    System.out.println("Let's squash arrays!\n");

    String result;
    int i;

    int[] test1 = {3, 7, 7, 7, 4, 5, 5, 2, 0, 8, 8, 8, 8, 5};
    System.out.println("squashing " + stringInts(test1) + ":");
    squash(test1);
    result = stringInts(test1);
    System.out.println(result);
    TestHelper.verify(result.equals(
            "[  3  7  4  5  2  0  8  5  -1  -1  -1  -1  -1  -1  ]"),
                      "BAD SQUASH!!!  No candy.");

    int[] test2 = {6, 6, 6, 6, 6, 3, 6, 3, 6, 3, 3, 3, 3, 3, 3};
    System.out.println("squashing " + stringInts(test2) + ":");
    squash(test2);
    result = stringInts(test2);
    System.out.println(result);
    TestHelper.verify(result.equals(
            "[  6  3  6  3  6  3  -1  -1  -1  -1  -1  -1  -1  -1  -1  ]"),
                      "BAD SQUASH!!!  No candy.");

    int[] test3 = {4, 4, 4, 4, 4};
    System.out.println("squashing " + stringInts(test3) + ":");
    squash(test3);
    result = stringInts(test3);
    System.out.println(result);
    TestHelper.verify(result.equals("[  4  -1  -1  -1  -1  ]"),
                      "BAD SQUASH!!!  No candy.");

    int[] test4 = {0, 1, 2, 3, 4, 5, 6};
    System.out.println("squashing " + stringInts(test4) + ":");
    squash(test4);
    result = stringInts(test4);
    System.out.println(result);
    TestHelper.verify(result.equals("[  0  1  2  3  4  5  6  ]"),
                      "BAD SQUASH!!!  No candy.");
  }

}
