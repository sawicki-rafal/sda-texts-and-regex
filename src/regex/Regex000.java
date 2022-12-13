package regex;

/*
Napisz Regex,
który dopasowuje ciąg znaków, w którym po 'p' występuje
zero lub więcej 'q'.

p
pq
pqqqqqqq

 */
public class Regex000 {

    public static void main(String[] args) {
        RegexTester tester = new RegexTester("pq*");
        tester.validate("p");
        tester.validate("pq");
        tester.validate("pqqqq");
        tester.validate("pqqqqrrrrr");
        tester.validate("qqqqq");
        tester.validate("asdfsadf");
    }

}
