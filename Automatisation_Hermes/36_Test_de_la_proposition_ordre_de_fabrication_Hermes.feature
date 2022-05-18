# Automation priority: null
# Test case importance: High
# language: en
Feature: Test de la proposition ordre de fabrication Hermès

	Scenario Outline: Test de la proposition ordre de fabrication Hermès
		Given Que je suis sur URL du site
			#URL : https://mingle-portal.eu1.inforcloudsuite.com/IBM1_DEM/dd01c7cd-9f46-418c-be0a-9e5612067c74?favoriteContext=%7B%22type%22%3A%22page%22%2C%22id%22%3A%229d2e4bf6-eb67-42e9-856c-15415d03c3e6%22%2C%22source%22%3A7%7D&LogicalId=lid://infor.homepages.1
			#
		And Que je saisisse mes identifiants et que je me connecte
			#Ajouter une tempo pour laisser la page se charger 
		And Dans le menu M3 je cherche MMS001 pour avoir le code article et appuie sur ENTRER
		And Je rentre les valeurs TpA = <valeur1> et Code article =<valeur2>
		And Que je rentre dans le nouvel onglet, et que je tappe PMS170 et je clique sur le bouton OK
			#Ajouter une tempo pour attendre l'affichage de la nouvelle page
		And Que je rentre dans le champ produit : je colle la valeur2 et appuie sur le bouton Suivant
		And Que je rempli les 3 champs : numéro programme <valeur4>, date de fin, quantité planifiée <valeur3> et je verifie les informations
		And Je verifie que mon numero de programme est <valeur4>
		And Dans la liste déroulante Ordre de tri, je sélectionne <valeur5>

		@Donnees_1
		Examples:
		| valeur1 | valeur2 | valeur3 | valeur4 | valeur5 |
		| "B01" | "Y3003-Y01-012" | 55 | 125691 | "1-Resp/Whse/Prod" |