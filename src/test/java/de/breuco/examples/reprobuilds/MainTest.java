package de.breuco.examples.reprobuilds;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.*;

class MainTest {

    @Test
    void failOnWrongJavaVersion() {
        assertThat(Runtime.version().feature(), is(11));
        assertThat(Runtime.version().update(), is(5));
    }

}