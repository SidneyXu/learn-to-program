package org.mrseasons.coffeetime.java.guava;

import com.google.common.base.Function;
import com.google.common.base.Optional;
import com.google.common.collect.ComparisonChain;
import com.google.common.collect.Ordering;
import com.google.common.hash.HashCode;
import com.google.common.hash.HashFunction;
import com.google.common.hash.Hashing;
import com.sun.istack.internal.Nullable;
import junit.framework.TestCase;
import org.junit.Test;


import com.google.common.base.Objects;

import java.nio.charset.Charset;

import static com.google.common.base.Preconditions.checkArgument;
import static com.google.common.base.Preconditions.checkNotNull;


/**
 * Created by mrseasons on 1/30/15.
 */
public class BasicTest extends TestCase {

    public void testNull() {
        Optional<Integer> possible = Optional.of(5);
        assert possible.isPresent();
        assert 5 == possible.get();
    }

    public void testPreconditions() {
        int i = 10;
        int j = 20;
        checkArgument(i >= 0, "Argument was %s but expected nonnegative", i);
        checkArgument(i < j, "Expected i < j, but %s > %s", i, j);

        String str = "";
        checkNotNull(str, "str is null");
    }

    public void testObjects() {
        //equals
        assert Objects.equal("a", "a");
        assert !Objects.equal(null, "a");
        assert Objects.equal(null, null);

        //hashcode
        System.out.println(Objects.hashCode(1, 2, 3));          //30817

        //toString
        System.out.println(Objects.toStringHelper("abc").add("x", 1).toString());   //abc{x=1}

        //compareTo
        Person person = new Person();

    }

    public void testOrdering() {
        Ordering<Person> ordering = Ordering.natural().nullsFirst().onResultOf(new Function<Person, String>() {
            @Override
            public String apply(Person input) {
                return input.firstName;
            }
        });
    }

    public void testHash() {
        HashFunction function = Hashing.md5();
        HashCode hashCode = function.newHasher().putLong(18).putString("Peter", Charset.forName("utf-8")).hash();
        System.out.println(hashCode.hashCode());

        hashCode = function.newHasher().putLong(18).putString("Peter", Charset.forName("utf-8")).hash();
        System.out.println(hashCode.hashCode());

        hashCode = function.newHasher().putLong(19).putString("Peter", Charset.forName("utf-8")).hash();
        System.out.println(hashCode.hashCode());
    }

    private static class Person implements Comparable {
        private String firstName;
        private String lastName;
        private int age;

        @Override
        public int compareTo(Object o) {
            Person other = (Person) o;
            return ComparisonChain.start()
                    .compare(firstName, other.firstName)
                    .compare(lastName, other.lastName)
                    .compare(age, other.age)
                    .result();
        }
    }
}
