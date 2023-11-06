import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @org.junit.jupiter.api.Test
    void numberOfVowels() {
        String one = "let him cook";
        String two = "relax, you're doing fine";
        String three = "aaaaah!!!";
        assertTrue(Main.numberOfVowels(one) == 4);
        assertTrue(Main.numberOfVowels(two) == 9);
        assertTrue(Main.numberOfVowels(three) == 5);
    }

    @org.junit.jupiter.api.Test
    private void assertEquals(boolean b) {

        assertEquals(Main.notDivisibleBy235(5) == 1);
        assertEquals(Main.notDivisibleBy235(10) == 2);
        assertEquals(Main.notDivisibleBy235(100) == 26);
        assertEquals(Main.notDivisibleBy235(1000) == 266);

    }

    @org.junit.jupiter.api.Test
    void toCamelCase() {
        String one = "the-stealth-warrior";
        String two = "The_Stealth_Warrior";
        String three = "The_Stealth-Warrior";
        String four = "-no_shot_bruh_";
        assertTrue(Main.camelCaseMe(one).equals("theStealthWarrior"));
        assertTrue(Main.camelCaseMe(two).equals("TheStealthWarrior"));
        assertTrue(Main.camelCaseMe(three).equals("TheStealthWarrior"));
        assertTrue(Main.camelCaseMe(four).equals("NoShotBruh"));
    }

}