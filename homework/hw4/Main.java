public class Main {

    public static void main(String[] args) {
        //1.1 (a = 20) ++a + ++a + ++a + a-- - 6 = ?
        // a = 21 + 22 + 23 + 23(--) - 6 = 82
        //1.2 (a = 10) a++ + a + a-- + a-- + --a + a++ - --a + a++ - a-- + a - --a + a++ + ++a =?
        // a = 10 + 11 + 11 + 10 + 8 + 8 - 8 + 8 - 9 + 8 - 7 + 7 + 9 = 66
        //1.3 (a = 10) a++ + a * a-- + a-- * -- a + a++ - --a * a++ - a-- + a - --a * a++ + ++a =?
        // a = 11 + 121 + 90 + 9 - 81 - 10 + 9 - 64 + 11 = 106
        
        //1.4 De declarat o variabilă boolean care să pastreze răspunsul la întrebarea (a > 5)
        System.out.println("Ex 1.4");
        int a = 5;
        boolean var4 = a > 5;
        System.out.println("var4 = " + var4);

        //1.5 De declarat 3 variabile char, pentru care să-i atribuiți valoare în 3 modalități
        System.out.println("\nEx 1.5");
        char var5dot1 = 'x';
        char var5dot2 = 120; //x
        char var5dot3 = '\u0078'; //x
        System.out.println("var5.1 = " + var5dot1);
        System.out.println("var5.2 = " + var5dot2);
        System.out.println("var5.3 = " + var5dot3);

        //1.6 Declarați o variabilă x de tip int și atribuiți-i valoarea -1.
        //    De declarat 2 variabile de tip boolean, care să pastreze răspunsul expresiei x<100 && x++>=0, x<100 & x++ > 0.
        //    Care este valoarea x după evaluarea fiecărei expresii, dacă x=-1 înainte de fiecare evaluare.
        System.out.println("\nEx 1.6");
        boolean v1, v2;
        int x = -1;
        v1 = x < 100 && x++ >= 0; // ajungem dupa && pentru ca prima parte e true, si x++ se face (x = 0) | v1 = false; (-1 >= 0) = false;
        System.out.println("v1 = " + v1 + ", x = " + x);
        x = -1;
        v2 = x < 100 & x++ > 0; // ajungem dupa & indiferent de prima parte, si x++ se executa (x = 0)    | v2 = false; (-1 > 0) = false;
        System.out.println("v2 = " + v2 + ", x = " + x);
    }
}
