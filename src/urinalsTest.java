import static org.junit.jupiter.api.Assertions.*;

class urinalsTest {

    @org.junit.jupiter.api.Test
    void checking() {
        System.out.println("Charan Buddhavarapu--Test2 Implemented");
        String x="01011";
        String y="010111";
        String d="01011";
        String f="01011";
        assertAll(() -> assertEquals(-1,urinals.checking(x.toCharArray())),
                () -> assertEquals(-1,urinals.checking(y.toCharArray())),
                () -> assertEquals(-1,urinals.checking(d.toCharArray())),
                () -> assertEquals(-1,urinals.checking(f.toCharArray())));


    }

    @org.junit.jupiter.api.Test
    void counter() {
    }

    @org.junit.jupiter.api.Test
    void main() {

    }


}