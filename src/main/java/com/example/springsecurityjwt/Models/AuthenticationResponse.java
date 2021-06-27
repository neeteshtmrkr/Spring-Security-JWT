package com.example.springsecurityjwt.Models;

public class AuthenticationResponse {
/*
Here the input structure for the authenticatemethod is
the AuthenticationRequest class, which takes the username
and password

And the output structure for the authentication method is
this class.
Which is just a property called jwt in the response with
the actual jwt value

*/
    private final String jwt;

    public AuthenticationResponse(String jwt) {
        this.jwt = jwt;
    }

    public String getJwt() {
        return jwt;
    }
}
