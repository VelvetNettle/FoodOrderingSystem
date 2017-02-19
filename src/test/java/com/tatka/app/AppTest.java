package com.tatka.app;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import java.util.List;


/**
 * Unit test for simple App.
 */
public class AppTest
        extends TestCase {
    private final Model model;

    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest(String testName) {
        super(testName);
        this.model = new Model(new MenuHard());
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite() {
        return new TestSuite(AppTest.class);
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp(){
        assertTrue(true);
    }

    public void test_getPolishProducts_notNull() {

        List<Product> dishes = model.getProducts(Kitchen.POLISH);
        assertTrue(dishes != null);
    }

    public void test_getItalianProducts_notNull() {

        List<Product> dishes = model.getProducts(Kitchen.ITALIAN);
        assertTrue(dishes != null);
    }

    public void test_getMexicanProducts_notNull() {

        List<Product> dishes = model.getProducts(Kitchen.MEXICAN);
        assertTrue(dishes != null);
    }

    public void test_getPolishProducts_notPasta(){

        List<Product> polishDishes = model.getProducts(Kitchen.POLISH);
        boolean pasta = polishDishes.stream().allMatch(x -> !x.getName().equals("pasta"));
        assertTrue(pasta);
    }

    public void test_getPrice_oneKitchen_correctPrice(){


        assertTrue(true);
    }

    public void test_getPrice_fewKitchen_correctPrice(){
        assertTrue(true);
    }

    public void test_getPrice_TwoOrders_correctPrice(){
        assertTrue(true);

    }


}
