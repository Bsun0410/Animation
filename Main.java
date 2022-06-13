public class Main
{
  public static void main(String[] args)
  {
        Caterpillar harry = new Caterpillar("Harry");
      
      /* A. uncomment code below first
            then study my code and see how colors work! */

        harry.introduce();


      /* B. uncomment code below second
            then study the code to see how emojis work! */

        harry.printFavoriteFoods();


      /* C. uncomment code below third
            then study my code and see how 'console animation' is made!
            for more info on try-catch syntax (not required for this course),
            check out https://docs.oracle.com/javase/tutorial/essential/exceptions/index.html */
            
        try {
         harry.animate();
        } catch (Exception e) { }


      /* D. EXTRA if you finish early
            uncomment me then study how the IMPROVED version
            of the animate code uses a NESTED FOR LOOP
            to make the code a lot shorter! */

        try {
           harry.animateImprovedCode();
        } catch (Exception e) { }
  }
}