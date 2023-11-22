import edu.sharif.sel.strategy.StandardStrategy;
import edu.sharif.sel.strategy.ExpressStrategy;
import edu.sharif.sel.strategy.Strategy;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StrategyTest {
    @Test
    public void testStandardStrategy() {
        Strategy strategy = StandardStrategy();
        double weight = 1.4;
        double price = strategy.calculatePrice(weight);
        assertEquals(weight * 2.5, price, 0.0001);
    }

    @Test
    public void testExpressStrategy() {
        Strategy strategy = ExpressStrategy();
        double weight = 1.6;
        double price = strategy.calculatePrice(weight);
        assertEquals(weight * 3.5, price, 0.0001);
    }
}
