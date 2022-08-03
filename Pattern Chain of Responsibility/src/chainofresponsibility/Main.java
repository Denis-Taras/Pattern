package chainofresponsibility;

import chainofresponsibility.domain.HTTPMethod;
import chainofresponsibility.domain.HTTPRequest;
import chainofresponsibility.processors.*;

public class Main {

    public static void main(String[] args) {
        HTTPRequest request = new HTTPRequest("\\authenticationddd",
                                                HTTPMethod.POST,
                                                "\"Content-type\": \"application/json;chartSet=UTF-123\"",
                                                "{\"username\": \"John Dou\", \"password\": \"qwerty123\"}");

        HTTPAuthenticationRequestProcessor rootProcessor = new HTTPAuthenticationRequestProcessor(request);
        rootProcessor.add(new PathProcessorAuthentication(request));
        rootProcessor.add(new HTTPAuthenticationMethodProcessor(request));
        rootProcessor.add(new HTTPAuthenticationHeaderProcessor(request));
        rootProcessor.add(new HTTPBodyProcessor(request));

        rootProcessor.check();
    }
}
