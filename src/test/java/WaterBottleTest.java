import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaterBottleTest {

    private WaterBottle bottle1;

    @Before
    public void before(){
        bottle1 = new WaterBottle();
    }

    @Test
    public void bottle_has_volume(){
        assertEquals(100, bottle1.getVolume());
    }

    @Test
    public void drink_removes_10_volume(){
        bottle1.drink();
        assertEquals(90, bottle1.getVolume());
    }

    @Test
    public void empty_sets_volume_to_0(){
        bottle1.empty();
        assertEquals(0, bottle1.getVolume());
    }

    @Test
    public void fill_resets_volume_to_100(){
        bottle1.drink();
        bottle1.fill();
        assertEquals(100, bottle1.getVolume());
    }

}
