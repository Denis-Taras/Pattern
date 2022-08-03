package chainofresponsibility.processors;

import chainofresponsibility.domain.HTTPRequest;
import chainofresponsibility.exceptions.AuthorizationException;

public class HTTPAuthenticationHeaderProcessor extends HTTPAuthenticationRequestProcessor {

    public HTTPAuthenticationHeaderProcessor(HTTPRequest request) {
        super(request);
    }

    @Override
    public void check() {
        if(request.getHeader().equals("\"Content-type\": \"application/json;chartSet=UTF-8\"")) {
            super.check();
        } else {
            throw new AuthorizationException("Incorrect HTTPHeader");
        }
    }
}
