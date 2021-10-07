package each.ach.si;

public class Triangulo {
    public static TipoTriangulo classificaTriangulo(int A, int B, int C){
        if (A<=0 || B<=0 || C<0)
            return TipoTriangulo.INVALIDO;
        if (A>=B+C || B>=A+C || C>=A+B)
            return TipoTriangulo.INVALIDO;
        if (A==B && B==C)
            return TipoTriangulo.EQUILATERO;
        if (A==B || B==C || A==C)
            return TipoTriangulo.ISOSCELES;
        return TipoTriangulo.ESCALENO;
    }

    public static void main(String[] args) {
        if (args.length==3){
            int A = Integer.valueOf(args[0]);
            int B = Integer.valueOf(args[1]);
            int C = Integer.valueOf(args[2]);
            System.out.println(Triangulo.classificaTriangulo(A,B,C));
        }

    }
}