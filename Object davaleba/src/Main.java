public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("firstname1", "lastname1");
        Author author2 = new Author("firstname2", "lastname2");

        Book[] books = {
                new Book("title1", 100, "genre1", author1),
                new Book("title2", 150, "genre2", author1),
                new Book("title3", 200, "genre3", author2)
        };

        System.out.println("Books:");
        for (Book book : books) {
            System.out.println(book);
        }


        Fraction[] fractions = {
                new Fraction(1, 2),
                new Fraction(2, 4),
                new Fraction(5, 10),
                new Fraction(3, 4),
                new Fraction(6, 8)
        };

        System.out.println("\nFractions:");
        for (Fraction fraction : fractions) {
            System.out.println(fraction);
        }

        int equalFractionsCount = 0;
        for (int i = 0; i < fractions.length; i++) {
            for (int j = i + 1; j < fractions.length; j++) {
                if (fractions[i].equals(fractions[j])) {
                    equalFractionsCount++;
                }
            }
        }
        System.out.println("Number of equal fractions: " + equalFractionsCount);



        QuadraticEquation[] equations = {
                new QuadraticEquation(1, -3, 2),
                new QuadraticEquation(1, -2, 1),
                new QuadraticEquation(1, -3, 2),
                new QuadraticEquation(1, 0, -4),
                new QuadraticEquation(1, 4, 4)
        };

        for (QuadraticEquation eq : equations) {
            System.out.println(eq);
        }

        int equalCount = 0;
        for (int i = 0; i < equations.length; i++) {
            for (int j = i + 1; j < equations.length; j++) {
                if (equations[i].equals(equations[j])) {
                    equalCount++;
                }
            }
        }

        System.out.println("Number of equal equations: " + equalCount);
    }
}