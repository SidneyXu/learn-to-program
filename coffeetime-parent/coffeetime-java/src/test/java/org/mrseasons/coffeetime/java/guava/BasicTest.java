package org.mrseasons.coffeetime.java.guava;

import org.junit.Test;

import java.util.Optional;

import static com.google.common.base.Preconditions.*;

/**
 * Created by mrseasons on 1/30/15.
 */
public class BasicTest {

    @Test
    public void testNull() {
        Optional<Integer> possible = Optional.of(5);
        assert possible.isPresent();
        assert 5 == possible.get();
    }

    @Test
    public void testPreconditions() {
        int i = 10;
        int j = 20;
        checkArgument(i >= 0, "Argument was %s but expected nonnegative", i);
        checkArgument(i < j, "Expected i < j, but %s > %s", i, j);
    }
}
