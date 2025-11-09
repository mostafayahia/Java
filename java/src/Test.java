public class Test {

    public static void main(String[] args) {
        System.out.println("hello world in Java :)");

        int sum = 0;

        for (String arg : args)
            sum += Integer.parseInt(arg);
            
        System.out.println("sum: " + sum);
    }
}