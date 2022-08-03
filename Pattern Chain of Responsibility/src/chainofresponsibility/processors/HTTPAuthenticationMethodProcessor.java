package chainofresponsibility.processors;

import chainofresponsibility.domain.HTTPMethod;
import chainofresponsibility.domain.HTTPRequest;
import chainofresponsibility.exceptions.AuthorizationException;

public class HTTPAuthenticationMethodProcessor extends HTTPAuthenticationRequestProcessor {

    public HTTPAuthenticationMethodProcessor(HTTPRequest request) {
        super(request);
    }

    @Override
    public void check() {
        if(request.getMethod().equals(HTTPMethod.POST)) {
            super.check();
        } else {
            throw new AuthorizationException("Incorrect HTTPMethod");
        }
    }
}
