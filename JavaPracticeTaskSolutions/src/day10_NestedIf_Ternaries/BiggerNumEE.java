package day10_NestedIf_Ternaries;

public class BiggerNumEE {
    public static void main(String[] args) {
        int n1=45, n2=35, n3=30;

        int max= (n1>n2 && n1>n3)? n1 :(n2>n1 && n2>n3)?
                n2 :n3;
        System.out.println("max = " + max);

    }
}
