package InputOutput;

public class CommandLineArguments {
    public static void main(String[] args) {
        // Collecting input from command line arguments

        // Check whether the length of args array is greater than 0
        if (args.length > 0) {
            System.out.println("The command line arguments are: ");
            for (String val: args) {
                System.out.println(val);
            }
        } else {
            System.out.println("No command line arguments found!");
        }
    }
}
