public class Fourth{
    public static void main (String[] args){
        double A = ((25+5) + (36/4) - 72)*5;
        double B = ((25*5) + (36-4) +71)/4;
        double C = (128/4)*2;
        double[] list = {A, B, C};

        if ( A <= B && B <= C )
            System.out.println(A+"\n"+B+"\n"+C);
        else if ( A <= C && C <= B )
            System.out.println(A+"\n"+C+"\n"+B);
        else if ( B <= A && A <= C )
            System.out.println(B+"\n"+A+"\n"+C);
        else if ( B <= C && C <= A )
            System.out.println(B+"\n"+C+"\n"+A);
        else if ( C <= A && A <= B )
            System.out.println(C+"\n"+A+"\n"+B);
        else if ( C <= B && B <= A )
            System.out.println(C+"\n"+B+"\n"+A);
    }
}
