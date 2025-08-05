package com.afi.tp_spring1.service;

import java.util.List;


import com.afi.tp_spring1.model.Client;

public interface Client_Int {
	
	Client ajouter(Client e);
	Client modifier(Client e);
	void supprimer (long id);
	List<Client> listeDesClient();
	Client recherche(long id);
	

}
