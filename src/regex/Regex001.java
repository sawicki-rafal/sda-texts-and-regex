package regex;

/*
Napisz Regex,
który dopasowuje ciąg znaków, w który zaczyna się od 'p',
 po którym następuje cokolwiek, kończąc na 'q'.

 pdfgdfgdsfg
 pq
 pqqqqqqqqq
 p123423412342134q
 */
public class Regex001 {

    public static void main(String[] args) {
        RegexTester tester = new RegexTester("p.*q");

        tester.validate("pasdfsdfq");
        tester.validate("pq");
        tester.validate("pqqqq");
        tester.validate("p12421341234q");
        tester.validate("qqqqq");
        tester.validate("pasdfsadf");
    }

}
