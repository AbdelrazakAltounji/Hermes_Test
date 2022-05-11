Feature: Naviguer sur sit Hermes


		
			@TEST_PT-11
			Scenario: Naviguer sur site Hermes
				Feature: Naviguer sur un site web
				 Test a realiser pour naviguer sur un site web
				 
				  Example: premier test
				    Given Que je suis sur le site 
						And Que je saisisse mes identifiants
						And Dans le menu M3 je cherche le "MMS001" pour avoir le code article
						#And Que appuie sur ENTRER
						And Que dans TpA = <valeur1> et Code article = <valeur2>
						And Que je rentre, dans onglet qui saffiche, je tappe PMS170 et je clique sur le bouton OK			
						And Que je rentre dans le champ produit : je colle la valeur2 et appuie sur le bouton Suivant
						And Que je rempli les 3 champs:no programme <valeur4>,date de fin et qte planifie <valeur3> et je verifie les informations
						#And Dans la liste droulante Ordre de tri, je sélectionne <valeur5>

					Examples:
					
					| valeur1 |     valeur2    | valeur3 |  valeur4 | valeur5            | 
					|"B01"    |"Y3003-Y01-012" |      "55" |   "125696" | "1-Resp/Whse/Prod" | 
									
					 
