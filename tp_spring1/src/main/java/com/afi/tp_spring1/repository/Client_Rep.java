package com.afi.tp_spring1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.afi.tp_spring1.model.Client;
@Component

public interface Client_Rep extends JpaRepository<Client,Long> {

	
	

}