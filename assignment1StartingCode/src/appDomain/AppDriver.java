package appDomain;

public class AppDriver {

    public static void main(String[] args) {

        String filename = null;
        char sortType = ' ';
        char algorithm = ' ';

        for (int i = 0; i < args.length; i++) {
            switch (args[i].toLowerCase()) {
                case "-f":
                    filename = args[++i];
                    break;
                case "-t":
                    sortType = args[++i].toLowerCase().charAt(0);
                    break;
                case "-s":
                    algorithm = args[++i].toLowerCase().charAt(0);
                    break;
                default:
                    break;
            }
        }

        // TODO Auto-generated method stub
        // refer to demo001 BasicFileIO.java for a simple example on how to
        // read data from a text file
        // refer to demo01 Test.java for an example on how to parse command
        // line arguments and benchmarking tests
        // refer to demo02 Student.java for comparable implementation, and
        // NameCompare.java or GradeCompare for comparator implementations
        // refer to demo02 KittySort.java on how to use a custom sorting
        // algorithm on a list of comparables to sort using either the
        // natural order (comparable) or other orders (comparators)
        // refer to demo03 OfficeManager.java on how to create specific
        // objects using reflection from a String
    }
}
