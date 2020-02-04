package az.com.springbootjwt.auth;

import java.util.Date;

import org.springframework.stereotype.Service;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

@Service
public class TokenManager {

	private static final String secretKey = "key";
	private static final int validity = 5 * 60 * 1000;

	public String generateToken(String username) {
		return Jwts.builder().setSubject(username).setIssuer("Taceddin")
				.setIssuedAt(new Date(System.currentTimeMillis()))
				.setExpiration(new Date(System.currentTimeMillis() + validity))
				.signWith(SignatureAlgorithm.ES256, secretKey).compact();

	}

	public boolean tokenValidate(String token) {
		return true;
	}

	public String getUsernameToken(String token) {
		return "";
	}
}
