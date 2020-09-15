package by.jrr.kashlyak;

import by.jrr.kashlyak.bean.Encoder;
import by.jrr.kashlyak.service.EncoderService;

public class App {
    public static void main(String[] args) {
        
        Encoder encoder = new Encoder();
        EncoderService encoderService = new EncoderService(encoder);
        encoderService.decoder('B');
        encoderService.encoder((short) 68);
        
    }
}
