package com.afi.tp_spring1.service;

import java.util.List;


import com.afi.tp_spring1.model.Client;

public interface Client_Int {
	
	Etudiant ajouter(Client e);
	Etudiant modifier(Client e);
	void supprimer (long id);
	List<Client> listeDesEtudiant();
	Client recherche(long id);
	

}
