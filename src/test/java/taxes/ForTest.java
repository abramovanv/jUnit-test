package taxes;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ForTest {


    @Test
    @DisplayName("Проверка УСН 6%")
    public void testTaxSystem6_validArgument_success() {

      int x = 100;
      int result = new TaxSystem6().calcTaxFor(100,0);  // when:

      Assertions.assertEquals(6, result);
    }

    @Test
    @DisplayName("Проверка УСН 15%")
    public void testTaxSystem15_validArgument_success() {

        int x = 100;
        int y = 80;
        int result = new TaxSystem15().calcTaxFor(x,y);

        Assertions.assertEquals(3, result);
    }

    @Test
    @DisplayName("Проверка отрицательного налоги при УСН 15%")
    public void testTaxSystem15_minusSumm_success() {

        int x = 80;
        int y = 100;
        int result = new TaxSystem15().calcTaxFor(x,y);

        Assertions.assertEquals(0, result);
    }

}
