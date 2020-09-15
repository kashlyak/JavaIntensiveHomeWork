package by.jrr.kashlyak.service;

import by.jrr.kashlyak.bean.Encoder;


public class EncoderService {
    Encoder encoder;


    public EncoderService(Encoder encoder){
        this.encoder = encoder;
    }
    public String encoder(short code ){
        
        encoder.setSymbol((char)code);
        return (code + " => " + ((char)code));

    }
    public String decoder(char symbol) {        
        encoder.setCode((short)symbol);
        return (symbol + " => " + ((short)symbol));
    }
}
