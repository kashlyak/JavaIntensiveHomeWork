package by.jrr.kashlyak.service;

import by.jrr.kashlyak.bean.Encoder;
import org.junit.Test;

import static org.junit.Assert.*;

public class EncoderServiceTest {

    @Test
    public void encoder() {
        Encoder encoder = new Encoder();
        EncoderService encoderService = new EncoderService(encoder);

        String expected = "A => 65";
        String actual = encoderService.decoder('A');
        assertEquals(expected,actual);
    }

    @Test
    public void decoder() {
        Encoder encoder = new Encoder();
        EncoderService encoderService = new EncoderService(encoder);
        String expected = "68 => D";
        String actual = encoderService.encoder((short)68);
        assertEquals(expected,actual);

    }
}