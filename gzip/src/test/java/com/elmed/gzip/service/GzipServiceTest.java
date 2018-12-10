package com.elmed.gzip.service;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;

import javax.xml.bind.DatatypeConverter;
import java.io.IOException;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class GzipServiceTest {

    @InjectMocks
    private GzipService gzipService;

    @Rule
    public ExpectedException exception = ExpectedException.none();

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void compress() throws IOException {
        byte[] luis = gzipService.compress("Luis");
        String res = DatatypeConverter.printBase64Binary(luis);

        Assert.assertEquals(24, luis.length);

    }

    @Test
    public void compressWithNullOrEmpty() throws IOException {
        byte[] luis = gzipService.compress("");
        Assert.assertNull(luis);
    }

    @Test
    public void decompress() throws IOException {
        String cadenaComprimir = "Luis";
        byte[] luis = gzipService.compress(cadenaComprimir);
        String cadenaResultado = gzipService.decompress(luis);
        Assert.assertEquals(cadenaComprimir,cadenaResultado);
    }

    @Test
    public void isCompressed() {
    }
}