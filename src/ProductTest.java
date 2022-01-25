import static org.junit.jupiter.api.Assertions.*;

class ProductTest {

    Product p1, p2, p3;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        p1 = new Product("000001", "TI-84", "Calculator", 100.0);
        p2 = new Product("000002", "iPhone 13", "Phone", 830.0);
        p3 = new Product("000003", "North Face Jacket", "Coat", 60.0);
    }

    @org.junit.jupiter.api.Test
    void setID() {
        assertEquals("000001", p1.getID());
        assertEquals("000002", p2.getID());
        assertEquals("000003", p3.getID());
    }

    @org.junit.jupiter.api.Test
    void setName() {
        assertEquals("TI-84", p1.getName());
        assertEquals("iPhone 13", p2.getName());
        assertEquals("North Face Jacket", p3.getName());
    }

    @org.junit.jupiter.api.Test
    void setDescription() {
        assertEquals("Calculator", p1.getDescription());
        assertEquals("Phone", p2.getDescription());
        assertEquals("Coat", p3.getDescription());
    }

    @org.junit.jupiter.api.Test
    void setCost() {
        assertEquals(100.0, p1.getCost());
        assertEquals(830.0, p2.getCost());
        assertEquals(60.0, p3.getCost());
    }

    @org.junit.jupiter.api.Test
    void toCSV() {
        assertEquals("000001, TI-84, Calculator, 100.0", p1.toCSV());
        assertEquals("000002, iPhone 13, Phone, 830.0", p2.toCSV());
        assertEquals("000003, North Face Jacket, Coat, 60.0", p3.toCSV());
    }
}