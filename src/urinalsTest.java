import static org.junit.jupiter.api.Assertions.*;

class urinalsTest {

    @org.junit.jupiter.api.Test
    void checking() {
        System.out.println("Charan Buddhavarapu--Test1 Implemented");
        String x="01011";
        String y="01000";
        String d="111001";
        String f="110001";
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