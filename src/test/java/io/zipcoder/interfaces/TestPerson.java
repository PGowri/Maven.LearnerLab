package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestPerson {

    @Test
    public void personConstructorTest(){
        final long id = (long) 1.00;
        String name = "Bob";
        Person person = new Person( id, name);
        long actualId = person.getId();
        String actualName = person.getName();

        Assert.assertEquals(id, actualId);
        Assert.assertEquals(name, actualName);

    }

    @Test
    public void testSetName(){
        String name = "Leon";
        Person person = new Person(1,"bob");

        // When
        person.setName(name);
        String actual = person.getName();

        // Then
        Assert.assertEquals(name, actual);

    }

}
