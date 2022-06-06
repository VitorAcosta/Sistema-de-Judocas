package test.java.org.fpij.jitakyoei.model.beans;

import static org.junit.Assert.assertEquals;

import org.fpij.jitakyoei.model.beans.Rg;
import org.junit.Test;


public class RgTest
{
    @Test
    public void inserirRgValidoTest() {
        // Initial Setup
        Rg rg_teste = new Rg();        
        String expected = "123456789";

        rg_teste.setNumero("123456789");
        String curr_value = rg_teste.getNumero();

        assertEquals(expected, curr_value);
    }
}