package com.hunghv.indentityservice.service;

import com.hunghv.indentityservice.dto.request.AuthenticationRequest;
import com.hunghv.indentityservice.dto.request.IntrospectRequest;
import com.hunghv.indentityservice.dto.response.AuthenticationResponse;
import com.hunghv.indentityservice.dto.response.IntrospectResponse;
import com.nimbusds.jose.JOSEException;

import java.text.ParseException;

public interface AuthenticationService {
    AuthenticationResponse authenticate(AuthenticationRequest request);

    IntrospectResponse introspect(IntrospectRequest request) throws JOSEException, ParseException;
}