import edu.sharif.sel.state.DeliveredState;
import edu.sharif.sel.state.InTransitState;
import edu.sharif.sel.state.State;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StateTest {
    @Test
    public void testInTransitState() {
        State state = new InTransitState(null);
        assertEquals("In Transit", state.getMessage());
    }

    @Test
    public void testDeliveredState() {
        State state = new DeliveredState(null);
        assertEquals("Delivered", state.getMessage());
    }
}
