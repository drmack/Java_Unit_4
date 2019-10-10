public class IntegerLimits extends ConsoleProgram
{
    public void run()
    {
        // Print out the upper and lower bounds for ints
        int min = Integer.MIN_VALUE;
        int max = Integer.MAX_VALUE;
        
        System.out.println("Minimum integer value: " + min);
        System.out.println("Maximum integer value: " + max);
        
        System.out.println();
        
        // Subtracting from Integer.MIN_VALUE wraps around to the
        // Integer.MAX_VALUE end of the range
        System.out.println("Integer.MIN_VALUE - 1 = " + (min - 1));
        
        // Adding to Integer.MAX_VALUE wraps around to the negative
        // end of the range
        System.out.println("Integer.MAX_VALUE + 1 = " + (max + 1));
    }
}
