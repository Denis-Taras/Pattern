package chainofresponsibility.processors;

import chainofresponsibility.domain.HTTPRequest;
import chainofresponsibility.exceptions.AuthorizationException;

public class PathProcessorAuthentication extends HTTPAuthenticationRequestProcessor {

    public PathProcessorAuthentication(HTTPRequest request) {
        super(request);
    }

    @Override
    public void check() {
        if(request.getPath().equals("\\authentication")) {
            super.check();
        } else {
            throw new AuthorizationException("Incorrect authentication path");
        }
    }
}
