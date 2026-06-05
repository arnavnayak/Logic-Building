package phase.first.beforedsu.looping.basiclooping;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrintAGivenNTableTest {

    @Test
    void printAGivenNTable() {
        PrintAGivenNTable tablePrinter = new PrintAGivenNTable();
        tablePrinter.printAGivenNTable(5);
        tablePrinter.printAGivenNTable(9);
        tablePrinter.printAGivenNTable(7);

    }
}