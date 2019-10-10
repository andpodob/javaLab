package agh.cs.lab2;

import org.junit.Assert;
import org.junit.Test;

public class Vector2dTest {

    private Vector2d v = new Vector2d(0,0);

    @Test
    public void precedens() {
        Assert.assertTrue(v.precedens(new Vector2d(1,1)));
        Assert.assertFalse(v.precedens(new Vector2d(1,-1)));
        Assert.assertFalse(v.precedens(new Vector2d(-1,1)));
        Assert.assertFalse(v.precedens(new Vector2d(-1,-1)));
        Assert.assertTrue(v.precedens(new Vector2d(0,1)));
        Assert.assertTrue(v.precedens(new Vector2d(1,0)));
        Assert.assertFalse(v.precedens(new Vector2d(-1,0)));
        Assert.assertFalse(v.precedens(new Vector2d(0,-1)));
        Assert.assertTrue(v.precedens(new Vector2d(0,0)));
    }

    @Test
    public void follows() {
        Assert.assertFalse(v.follows(new Vector2d(1,1)));
        Assert.assertFalse(v.follows(new Vector2d(1,-1)));
        Assert.assertFalse(v.follows(new Vector2d(-1,1)));
        Assert.assertTrue(v.follows(new Vector2d(-1,-1)));
        Assert.assertFalse(v.follows(new Vector2d(1,0)));
        Assert.assertTrue(v.follows(new Vector2d(-1,0)));
        Assert.assertTrue(v.follows(new Vector2d(0,-1)));
        Assert.assertFalse(v.follows(new Vector2d(0,1)));
        Assert.assertTrue(v.follows(new Vector2d(0,0)));
    }

    @Test
    public void upperRight() {
        Vector2d v1 = new Vector2d(1,1);
        Vector2d v2 = new Vector2d(-1,1);
        Vector2d v3 = new Vector2d(1,-1);
        Vector2d v4 = new Vector2d(-1,-1);
        Vector2d v5 = new Vector2d(0,-1);
        Vector2d v6 = new Vector2d(0,0);

        Assert.assertEquals(v.upperRight(v1),new Vector2d(1,1));
        Assert.assertEquals(v.upperRight(v2),new Vector2d(0,1));
        Assert.assertEquals(v.upperRight(v3),new Vector2d(1,0));
        Assert.assertEquals(v.upperRight(v4),new Vector2d(0,0));
        Assert.assertEquals(v.upperRight(v5),new Vector2d(0,0));
        Assert.assertEquals(v.upperRight(v6),new Vector2d(0,0));
    }

    @Test
    public void lowerLeft() {
        Vector2d v1 = new Vector2d(1,1);
        Vector2d v2 = new Vector2d(-1,1);
        Vector2d v3 = new Vector2d(1,-1);
        Vector2d v4 = new Vector2d(-1,-1);
        Vector2d v5 = new Vector2d(0,-1);
        Vector2d v6 = new Vector2d(0,0);

        Assert.assertEquals(v.lowerLeft(v1),new Vector2d(0,0));
        Assert.assertEquals(v.lowerLeft(v2),new Vector2d(-1,0));
        Assert.assertEquals(v.lowerLeft(v3),new Vector2d(0,-1));
        Assert.assertEquals(v.lowerLeft(v4),new Vector2d(-1,-1));
        Assert.assertEquals(v.lowerLeft(v5),new Vector2d(0,-1));
        Assert.assertEquals(v.lowerLeft(v6),new Vector2d(0,0));
    }

    @Test
    public void add() {
        Vector2d v1 = new Vector2d(6,3);
        Vector2d v2 = new Vector2d(-4,5);
        Vector2d v3 = new Vector2d(2,-1);
        Vector2d v4 = new Vector2d(-1,5);

        Assert.assertEquals(v1.add(v2), new Vector2d(2,8));
        Assert.assertEquals(v2.add(v3), new Vector2d(-2,4));
        Assert.assertEquals(v3.add(v4), new Vector2d(1,4));
        Assert.assertEquals(v4.add(v1), new Vector2d(5,8));
    }

    @Test
    public void subtract() {
    }

    @Test
    public void opposite() {
    }

    @Test
    public void testEquals() {
    }

    @Test
    public void testToString() {
    }
}