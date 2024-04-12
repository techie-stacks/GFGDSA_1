package norgan;

public class Main1 {

    public static void main(String[] args) {
        MyClass1 myClass1 = new MyClass1();
        //String s = "HackerRank";
       // int x = 2;
        //int y = 3;
        //String result = myClass1.foo2((s,x,y)-> s+" "+x+y, "HackerRank",2,3);
        String result = myClass1.foo2((s,x,y)-> s+" "+(x+y), "HackerRank",2,3);
        System.out.println(result);
    }


}
