package chainofresponsibility.processors;

import chainofresponsibility.domain.AuthorizationObject;
import chainofresponsibility.domain.HTTPRequest;
import chainofresponsibility.exceptions.AuthorizationException;
import chainofresponsibility.utils.JSONUtils;

public class HTTPBodyProcessor extends HTTPAuthenticationRequestProcessor {

    public HTTPBodyProcessor(HTTPRequest request) {
        super(request);
    }

    @Override
    public void check() {
        if(request.getBody() != null || !request.getBody().isEmpty()) {
            JSONUtils utils = new JSONUtils();
            AuthorizationObject authObject = utils.fromJSON(request.getBody());
            System.out.println(utils.toJSON(authObject));
            super.check();
        } else {
            throw new AuthorizationException("Wrong username or password");
        }
    }
}
