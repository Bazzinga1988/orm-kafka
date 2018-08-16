package ru.glosav.glosavcluster.orm.ctrl;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Grigory Panin
 */
public class OperatorTest {

    @Test
    public void testReference() {
        Operator operator1 = new Operator();
        operator1.setId(1001);
        operator1.setName("ПРОД 1");
        operator1.setDescription("ПРОД 1");

        Assertions.assertFalse(operator1.equals(null));

        Operator operator1Copy = new Operator();
        operator1Copy.setId(1001);
        operator1Copy.setName("ПРОД 1");
        operator1Copy.setDescription("ПРОД 1");

        Assertions.assertTrue(operator1.equals(operator1Copy));
        Assertions.assertEquals(operator1.hashCode(), operator1Copy.hashCode());
        Assertions.assertEquals(operator1.compareTo(operator1Copy), 0);

        Operator operator2 = new Operator();
        operator2.setId(1002);
        operator2.setName("ПРОД 2");
        operator2.setDescription("ПРОД 2");

        Assertions.assertFalse(operator1.equals(operator2));
        Assertions.assertNotEquals(operator1.hashCode(), operator2.hashCode());
        Assertions.assertNotEquals(operator1.compareTo(operator2), 0);

        System.out.println("=====> Testing of " + Operator.class.getCanonicalName() + " was succesful.");
    }
}