package coding.InterviewQuestions;

public class Sample {
    public static void main(String[] args) {
        final A object =  new A(null, null);
        System.out.println(object.i  + " " + object.j);
    }
}
class A {
    String i ; String j;
    A(String i , String j ){
        this.i = i;
        this.j =j;
    }
}