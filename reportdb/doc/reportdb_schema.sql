-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema reportdb
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema reportdb
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `reportdb` DEFAULT CHARACTER SET utf8 ;
USE `reportdb` ;

-- -----------------------------------------------------
-- Table `reportdb`.`student`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `reportdb`.`student` ;

CREATE TABLE IF NOT EXISTS `reportdb`.`student` (
  `studentId` INT NOT NULL AUTO_INCREMENT,
  `studentName` VARCHAR(45) NOT NULL,
  `department` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`studentId`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `reportdb`.`subject`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `reportdb`.`subject` ;

CREATE TABLE IF NOT EXISTS `reportdb`.`subject` (
  `subjectId` INT NOT NULL AUTO_INCREMENT,
  `subjectName` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`subjectId`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `reportdb`.`subjectscore`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `reportdb`.`subjectscore` ;

CREATE TABLE IF NOT EXISTS `reportdb`.`subjectscore` (
  `scoreId` INT NOT NULL AUTO_INCREMENT,
  `score` INT NULL DEFAULT 0,
  `studentId` INT NOT NULL,
  `subjectId` INT NOT NULL,
  PRIMARY KEY (`scoreId`),
  INDEX `fk_subjectscore_student_idx` (`studentId` ASC) VISIBLE,
  INDEX `fk_subjectscore_subject1_idx` (`subjectId` ASC) VISIBLE,
  CONSTRAINT `fk_subjectscore_student`
    FOREIGN KEY (`studentId`)
    REFERENCES `reportdb`.`student` (`studentId`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_subjectscore_subject1`
    FOREIGN KEY (`subjectId`)
    REFERENCES `reportdb`.`subject` (`subjectId`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
