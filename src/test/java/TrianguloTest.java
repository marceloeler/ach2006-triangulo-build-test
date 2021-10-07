import each.ach.si.TipoTriangulo;
import each.ach.si.Triangulo;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TrianguloTest {

    @Test
    public void testEquilatero(){
        assertEquals(TipoTriangulo.EQUILATERO, Triangulo.classificaTriangulo(5,5,5));
    }

    @Test
    public void testEscaleno(){
        assertEquals(TipoTriangulo.ESCALENO,Triangulo.classificaTriangulo(5,6,7));
    }

    @Test
    public void testIsosceles(){
        assertEquals(TipoTriangulo.ISOSCELES,Triangulo.classificaTriangulo(5,6,6));
    }

    @Test
    public void testInvalido(){
        assertEquals(TipoTriangulo.LADOINVALIDO,Triangulo.classificaTriangulo(-1,2,3));
    }
}
