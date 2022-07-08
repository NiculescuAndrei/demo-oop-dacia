import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class DaciaEngineTest2 {
  @Test
  public void testSpeedIncrement2() {
    DaciaEngine engine = new DaciaEngine();
    engine.setAcceleration(100);
    assertEquals(2.0, engine.getSpeedIncrement(), 0);
  }
}