-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema ProjetFit
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema ProjetFit
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `ProjetFit` DEFAULT CHARACTER SET utf8 ;
USE `ProjetFit` ;

-- -----------------------------------------------------
-- Table `ProjetFit`.`user`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `ProjetFit`.`user` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `prenom` VARCHAR(45) NOT NULL,
  `nom` VARCHAR(45) NOT NULL,
  `age` INT NOT NULL,
  `taille` INT NOT NULL,
  `mail` VARCHAR(45) NOT NULL,
  `mdp` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `mail_UNIQUE` (`mail` ASC))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `ProjetFit`.`historique`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `ProjetFit`.`historique` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `poids` DOUBLE NOT NULL,
  `dateHisto` DATE NOT NULL,
  `userId` INT NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `fk_user_idx` (`userId` ASC),
  CONSTRAINT `fk_user`
    FOREIGN KEY (`userId`)
    REFERENCES `ProjetFit`.`user` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
