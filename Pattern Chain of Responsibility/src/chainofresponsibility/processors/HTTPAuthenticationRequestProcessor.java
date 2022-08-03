package chainofresponsibility.processors;

import chainofresponsibility.domain.HTTPRequest;

public class HTTPAuthenticationRequestProcessor {
    protected HTTPRequest request;
    protected HTTPAuthenticationRequestProcessor nextModifier;

    public HTTPAuthenticationRequestProcessor(HTTPRequest request) {
        this.request = request;
    }

    public void add(HTTPAuthenticationRequestProcessor processor) {
        if (nextModifier != null) {
            nextModifier.add(processor);
        } else {
            nextModifier = processor;
        }
    }

    public void check(){
        if (nextModifier != null) {
            nextModifier.check();
        } else {
            System.out.println("Access Allowed!");
        }
    }
}
