import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {
    private Printer printer1;

    @Before
    public void before(){
        printer1 = new Printer(5);
    }

    @Test
    public void has_sheets_of_paper(){
        assertEquals(5, printer1.getPaper());
    }

    @Test
    public void returns_one_for_printing_pages(){
        printer1.printPages(2, 2);
        assertEquals(1 , printer1.getPaper());
    }

    @Test
    public void returns_5_for_not_printing_pages(){
        printer1.printPages(3, 7);
        assertEquals(5, printer1.getPaper());
    }

}
