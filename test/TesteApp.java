/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Controller.GourmetController;
import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;

/**
 *
 * @author paulo
 */
@RunWith(JUnitParamsRunner.class)
public class TesteApp {

    GourmetController controller = new GourmetController();

    public TesteApp() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @Test
    @FileParameters("src\\util\\teste.csv")
    public void efetua(String prato) {
        if (controller.getRaiz().getPrato().equals(prato)) {
            Assert.assertEquals(controller.getRaiz().getPrato(), prato);
        } else if (controller.getRaiz().getEsq().getPrato().equals(prato)) {
            Assert.assertEquals(controller.getRaiz().getEsq().getPrato(), prato);
        } else {
            Assert.assertEquals(controller.getRaiz().getDir().getPrato(), prato);
        }
    }

}
