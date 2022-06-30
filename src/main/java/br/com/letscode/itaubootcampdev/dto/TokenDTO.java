package br.com.letscode.itaubootcampdev.dto;

import lombok.Getter;

@Getter
public class TokenDTO {

    private final String token;

    private final String schema;

    public TokenDTO(String token) {
        this.token = token;
        this.schema = "Bearer";
    }
}
