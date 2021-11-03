package com.driver3.driver3;

import java.util.Optional;

import org.springframework.data.domain.AuditorAware;

public class AuditAware implements AuditorAware<String> {

	@Override
	public Optional<String> getCurrentAuditor() {
		
		return Optional.ofNullable("sam").filter(s -> !s.isEmpty());
	}

}
