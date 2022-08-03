package chainofresponsibility.utils;

import chainofresponsibility.domain.AuthorizationObject;
import chainofresponsibility.exceptions.JSONException;

public class JSONUtils {

    public String toJSON(AuthorizationObject authorizationObject) {
        return "{" + "\n" +
                "\"username\": " + authorizationObject.getUsername() + "\"," + "\n" +
                "\"password\": " + authorizationObject.getPassword() + "\"\n" +
                "}";
    }

    public AuthorizationObject fromJSON(String stringAuthObject) {
        if(stringAuthObject.startsWith("{") && stringAuthObject.endsWith("}")) {
            if(stringAuthObject.contains("\"username\":") && stringAuthObject.contains("\"password\":")) {
                AuthorizationObject authorizationObject = new AuthorizationObject();
                authorizationObject.setUsername(stringAuthObject.substring(stringAuthObject.indexOf("\"username\": \""), stringAuthObject.indexOf("\",")));
                authorizationObject.setPassword(stringAuthObject.substring(stringAuthObject.indexOf("\"password\": \""), stringAuthObject.indexOf("\"}")));
                return authorizationObject;
            } else {
                throw new JSONException("Wrong JSON Object");
            }
        } else {
            throw new JSONException("Incorrect format");
        }
    }
}
