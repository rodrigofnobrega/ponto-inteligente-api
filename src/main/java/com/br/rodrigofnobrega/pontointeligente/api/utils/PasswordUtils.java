package com.br.rodrigofnobrega.pontointeligente.api.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class PasswordUtils {
	private static final Logger log = LoggerFactory.getLogger(PasswordUtils.class);	
	
	public PasswordUtils() {
	}
	
	/*
	 * Gera um hash utilizando o BCrypt
	 * 
	 * @param senha
	 * @return string
	 */
	
	public static String gerarBCrypt(String senha) {
		if (senha == null) return senha;
		
		log.info("Gerando HASH BCrypt");
		BCryptPasswordEncoder bCryptEnconder = new BCryptPasswordEncoder();
		return bCryptEnconder.encode(senha);
	}
		
		
	
}
