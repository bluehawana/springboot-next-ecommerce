package se.dsve.ecoeats.config;

import org.springframework.core.convert.converter.Converter;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.oauth2.jwt.Jwt;
import org.springframework.security.oauth2.server.resource.authentication.JwtAuthenticationConverter;
import org.springframework.security.oauth2.server.resource.authentication.JwtGrantedAuthoritiesConverter;

import java.util.Collection;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class NextAuthJwtAuthenticationConverter extends JwtAuthenticationConverter {

    private final Converter<Jwt, Collection<GrantedAuthority>> jwtGrantedAuthoritiesConverter = new JwtGrantedAuthoritiesConverter();

    public NextAuthJwtAuthenticationConverter() {
        setJwtGrantedAuthoritiesConverter(jwt -> {
            Map<String, Object> claims = jwt.getClaims();
            Object roles = claims.get("roles");
            return extractAuthorities(roles);
        });
    }

    private Collection<GrantedAuthority> extractAuthorities(Object roles) {
        if (roles instanceof Collection) {
            return ((Collection<?>) roles).stream()
                    .map(role -> new SimpleGrantedAuthority("ROLE_" + role))
                    .collect(Collectors.toList());
        }
        return Stream.of(new SimpleGrantedAuthority("ROLE_USER"))
                .collect(Collectors.toList());
    }

    protected Collection<GrantedAuthority> extractAuthorities(Jwt jwt) {
        Map<String, Object> claims = jwt.getClaims();
        Object roles = claims.get("roles");
        if (roles instanceof Collection) {
            return ((Collection<?>) roles).stream()
                    .map(role -> new SimpleGrantedAuthority("ROLE_" + role))
                    .collect(Collectors.toList());
        }
        return Stream.of(new SimpleGrantedAuthority("ROLE_USER"))
                .collect(Collectors.toList());
    }
}
