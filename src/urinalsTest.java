import static org.junit.jupiter.api.Assertions.*;

class urinalsTest {

    @org.junit.jupiter.api.Test
    void checking() {
        System.out.println("Charan Buddhavarapu--Test2 Implemented");
        String x="01011";
        String y="010111";
        String d="01011";
        String f="01011";



    }

    @org.junit.jupiter.api.Test
    void counter() {
        System.out.println("Charan Buddhavarapu--Test3 Implemented");
        int c=1;
        int d=99;
        int f=8;
        int y=6;
        assertAll(() -> assertEquals(2,urinals.counter(c)),
                () -> assertEquals(100,urinals.counter(d)),
                () -> assertEquals(8,urinals.counter(f)),
                () -> assertEquals(2,urinals.counter(y)));
    }

    @org.junit.jupiter.api.Test
    void main() {

    }


}