
package recursion;


public class Random {
    
    public static void main(String[] args){

        // int array[] = {1,2,3,1,3,4};

        // Arrays.stream(array)
        //         .mapToObj(x ->Integer.valueOf(x)).collect(Collectors.groupingBy(x -> x ,  Collectors.counting()))
        //         .entrySet().stream().forEach(System.out::println);


        String string1  = "My";
        String string2 = "Name";
        String string3 = "is";
        String string4 = "Aditya";

        // yM | eman | si | aytidA

        StringBuilder string = new StringBuilder();
    
        string.append(string1.chars().mapToObj(x -> String.valueOf((char) x)).reduce("" , (a,b) -> b + a));

        

        string.append("|");
        string.append(string2.chars().mapToObj(x -> String.valueOf((char) x)).reduce("" , (a,b) -> b + a));
        string.append("|");
        string.append(string3.chars().mapToObj(x -> String.valueOf((char) x)).reduce("" , (a,b) -> b + a));
        string.append("|");
        string.append(string4.chars().mapToObj(x -> String.valueOf((char) x)).reduce("" , (a,b) -> b + a));

        System.out.println(string.toString());
    }
}
