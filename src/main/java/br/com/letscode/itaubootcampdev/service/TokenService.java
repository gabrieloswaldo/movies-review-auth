package br.com.letscode.itaubootcampdev.service;

import br.com.letscode.itaubootcampdev.model.User;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class TokenService {

    @Value("${auth-token.jwt.expiration}")
    private String expirationMiliSec;

    @Value("${auth-token.jwt.secret}")
    private String secret;

    public String getToken(Authentication authentication) {
        User userLogged = (User) authentication.getPrincipal();
        Date issuedDate = new Date();
        Date expirationDate = new Date(issuedDate.getTime() + Long.parseLong(expirationMiliSec));
        return Jwts.builder()
                .setIssuer("moview-review-auth")
                .setSubject(userLogged.getId().toString())
                .setIssuedAt(issuedDate)
                .setExpiration(expirationDate)
                .signWith(SignatureAlgorithm.HS256, secret)
                .compact();
    }
}
