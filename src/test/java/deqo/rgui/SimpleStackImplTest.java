package deqo.rgui;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.time.Clock;

import static org.junit.Assert.*;

public class SimpleStackImplTest {

    SimpleStack stack;

    @Before
    public void setUp() throws Exception {
        stack = new SimpleStackImpl();
        System.out.println("Je suis executé avant chaque test");
    }

    @Test
    public void isEmpty() throws Exception {
        Assert.assertTrue(stack.isEmpty());
        String el = "el";
        stack.push(new Item(el));
        Assert.assertFalse(stack.isEmpty());
    }

    @Test
    public void getSize() throws Exception {
        Assert.assertEquals(0, stack.getSize());
        String el = "el";
        stack.push(new Item(el));
        stack.push(new Item(el));
        Assert.assertEquals(2, stack.getSize());
    }

    @Test
    public void push() throws Exception {
        Item ita = new Item(new Integer(8));
        Assert.assertEquals(0, stack.getSize());
        stack.push(ita);
        Assert.assertEquals(1, stack.getSize());
        Item o = stack.peek();
        Assert.assertTrue(o.getValue() instanceof Integer);
        Integer integer = (Integer)o.getValue();
        Assert.assertEquals(8, integer.intValue());
        Assert.assertEquals(ita.getValue(), integer);
    }

    @Test
    public void peek() throws Exception {
        Item ita = new Item(new Integer(8));
        Assert.assertEquals(0, stack.getSize());
        stack.push(ita);
        Assert.assertEquals(1, stack.getSize());
        Item o = stack.peek();
        Assert.assertEquals(1, stack.getSize());
        Assert.assertTrue(o.getValue() instanceof Integer);
        Integer integer = (Integer)o.getValue();
        Assert.assertEquals(8, integer.intValue());
        Assert.assertEquals(ita.getValue(), integer);
    }

    @Test
    public void pop() throws Exception {
        Item ita = new Item(new Integer(8));
        Assert.assertEquals(0, stack.getSize());
        stack.push(ita);
        Assert.assertEquals(1, stack.getSize());
        Item o = stack.pop();
        Assert.assertEquals(0, stack.getSize());
        Assert.assertTrue(o.getValue() instanceof Integer);
        Integer integer = (Integer)o.getValue();
        Assert.assertEquals(8, integer.intValue());
        Assert.assertEquals(ita.getValue(), integer);
    }

}