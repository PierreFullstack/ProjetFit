DELIMITER $$

DROP PROCEDURE IF EXISTS resetBd $$
CREATE PROCEDURE resetBd()
BEGIN

	DECLARE exit handler for sqlexception
		BEGIN
			show errors; 
            ROLLBACK;
		END;
        
	set foreign_key_checks = 0;
    TRUNCATE TABLE historique;
    TRUNCATE TABLE user;
	set foreign_key_checks = 1;
    
    start transaction;
	INSERT INTO user(prenom, nom, age, taille, mail, mdp)  VALUES("Pierre", "Falck", 24, 175, "pierre.falck@hotmail.fr", "pierre");
    INSERT INTO user(prenom, nom, age, taille, mail, mdp)  VALUES("Hugo", "Carlevaris", 25, 188, "hugo.carlevaris@gmail.fr", "hugo");
    INSERT INTO user(prenom, nom, age, taille, mail, mdp)  VALUES("Martin", "Lenglet", 23, 183, "martinlenglet@gmail.com", "martin");
    
    
    INSERT INTO historique(poids, dateHisto, userId)  VALUES(60, STR_TO_DATE('01, 09, 2018', '%d, %m, %Y'), 1);
    INSERT INTO historique(poids, dateHisto, userId)  VALUES(61, STR_TO_DATE('01, 10, 2018', '%d, %m, %Y'), 1);
    INSERT INTO historique(poids, dateHisto, userId)  VALUES(62, STR_TO_DATE('01, 11, 2018', '%d, %m, %Y'), 1);
    INSERT INTO historique(poids, dateHisto, userId)  VALUES(61, STR_TO_DATE('01, 12, 2018', '%d, %m, %Y'), 1);
    INSERT INTO historique(poids, dateHisto, userId)  VALUES(63, STR_TO_DATE('01, 01, 2019', '%d, %m, %Y'), 1);
    INSERT INTO historique(poids, dateHisto, userId)  VALUES(62, STR_TO_DATE('01, 02, 2019', '%d, %m, %Y'), 1);
    
    INSERT INTO historique(poids, dateHisto, userId)  VALUES(75, STR_TO_DATE('01, 09, 2018', '%d, %m, %Y'), 2);
    INSERT INTO historique(poids, dateHisto, userId)  VALUES(76, STR_TO_DATE('01, 10, 2018', '%d, %m, %Y'), 2);
    INSERT INTO historique(poids, dateHisto, userId)  VALUES(77, STR_TO_DATE('01, 11, 2018', '%d, %m, %Y'), 2);
    INSERT INTO historique(poids, dateHisto, userId)  VALUES(74, STR_TO_DATE('01, 12, 2018', '%d, %m, %Y'), 2);
    INSERT INTO historique(poids, dateHisto, userId)  VALUES(73, STR_TO_DATE('01, 01, 2019', '%d, %m, %Y'), 2);
    INSERT INTO historique(poids, dateHisto, userId)  VALUES(74, STR_TO_DATE('01, 02, 2019', '%d, %m, %Y'), 2);
    
    INSERT INTO historique(poids, dateHisto, userId)  VALUES(70, STR_TO_DATE('01, 09, 2018', '%d, %m, %Y'), 3);
    INSERT INTO historique(poids, dateHisto, userId)  VALUES(72, STR_TO_DATE('01, 10, 2018', '%d, %m, %Y'), 3);
    INSERT INTO historique(poids, dateHisto, userId)  VALUES(73, STR_TO_DATE('01, 11, 2018', '%d, %m, %Y'), 3);
    INSERT INTO historique(poids, dateHisto, userId)  VALUES(74, STR_TO_DATE('01, 12, 2018', '%d, %m, %Y'), 3);
    INSERT INTO historique(poids, dateHisto, userId)  VALUES(80, STR_TO_DATE('01, 01, 2019', '%d, %m, %Y'), 3);
    INSERT INTO historique(poids, dateHisto, userId)  VALUES(85, STR_TO_DATE('01, 02, 2019', '%d, %m, %Y'), 3);
    commit; -- valide la transaction
END $$

CALL resetBd() $$