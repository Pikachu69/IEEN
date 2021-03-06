-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Schema inventario
-- -----------------------------------------------------
DROP SCHEMA IF EXISTS `inventario` ;

-- -----------------------------------------------------
-- Schema inventario
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `inventario` DEFAULT CHARACTER SET utf8 ;
USE `inventario` ;

-- -----------------------------------------------------
-- Table `inventario`.`status`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `inventario`.`status` ;

CREATE TABLE IF NOT EXISTS `inventario`.`status` (
  `id_status` INT NOT NULL,
  `status` VARCHAR(45) NULL,
  PRIMARY KEY (`id_status`))
ENGINE = InnoDB;
insert into status values(1,'Activo'),
						 (2,'Baja'),
                         (3,'Comodato'),
                         (4,'Donación');


-- -----------------------------------------------------
-- Table `inventario`.`clasificacion`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `inventario`.`clasificacion` ;

CREATE TABLE IF NOT EXISTS `inventario`.`clasificacion` (
  `id_clas` INT NOT NULL,
  `fol_clas` VARCHAR(45) NULL,
  `nom_clas` VARCHAR(45) NULL,
  `stock_clas` boolean NULL,
  PRIMARY KEY (`id_clas`))
ENGINE = InnoDB;

insert into clasificacion values(1,'EY-01-','Mobiliario',false),
								(2,'EY-02-','Comunicación',false),
                                (3,'EY-03-','Foto y Video',false),
                                (4,'EY-04-','A/C',false),
                                (5,'EY-05-','Comunicación 2',false),
                                (6,'EY-06-','Audiovisuales',false),
                                (7,'EY-07-','Diverso',false),
                                (8,'EY-10-','Transporte',false);

-- -----------------------------------------------------
-- Table `inventario`.`notificaciones`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `inventario`.`notificaciones` ;

CREATE TABLE IF NOT EXISTS `inventario`.`notificaciones` (
  `idproductos` INT NOT NULL,
  `nom_pro` VARCHAR(45) NULL,
  `mar_pro` VARCHAR(45) NULL,
  `mot_sol` VARCHAR(200) NULL,
  `tipo_sol` VARCHAR (15) NULL,
  `depar` VARCHAR(40) NULL)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `inventario`.`productos`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `inventario`.`productos` ;

CREATE TABLE IF NOT EXISTS `inventario`.`productos` (
  `idproductos` INT NOT NULL AUTO_INCREMENT,
  `con_pro` INT NULL,
  `subcat_pro` VARCHAR(5) NULL,
  `nom_pro` VARCHAR(45) NULL,
  `des_pro` VARCHAR(45) NULL,
  `mar_pro` VARCHAR(45) NULL,
  `mod_pro` VARCHAR(45) NULL,
  `ser_pro` VARCHAR(45) NULL,
  `col_pro` VARCHAR(45) NULL,
  `pla_pro` VARCHAR(45) NULL,
  `nomot_pro` VARCHAR(45) NULL,
  `fechcompra_pro` DATE NULL,
  `nofact_pro` VARCHAR(20) NULL,
  `imp_pro` DOUBLE NULL,
  `obs_pro` LONGTEXT NULL,
  `stock_pro` INT NULL,
  `stockmin_pro` INT NULL,
  `km_pro` INT NULL,
  `km_ser_pro` INT NULL,
  `status_id_status` INT NOT NULL,
  `clasificacion_id_clas` INT NOT NULL,
  PRIMARY KEY (`idproductos`, `status_id_status`, `clasificacion_id_clas`),
  CONSTRAINT `fk_productos_status`
    FOREIGN KEY (`status_id_status`)
    REFERENCES `inventario`.`status` (`id_status`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_productos_clasificacion1`
    FOREIGN KEY (`clasificacion_id_clas`)
    REFERENCES `inventario`.`clasificacion` (`id_clas`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;

CREATE INDEX `fk_productos_status_idx` ON `inventario`.`productos` (`status_id_status` ASC);

CREATE INDEX `fk_productos_clasificacion1_idx` ON `inventario`.`productos` (`clasificacion_id_clas` ASC);


-- -----------------------------------------------------
-- Table `inventario`.`fotos`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `inventario`.`fotos` ;

CREATE TABLE IF NOT EXISTS `inventario`.`fotos` (
  `idfotos` INT NOT NULL,
  `foto` LONGBLOB NULL,
  `productos_idproductos` INT NOT NULL,
  PRIMARY KEY (`idfotos`, `productos_idproductos`),
  CONSTRAINT `fk_fotos_productos1`
    FOREIGN KEY (`productos_idproductos`)
    REFERENCES `inventario`.`productos` (`idproductos`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;

CREATE INDEX `fk_fotos_productos1_idx` ON `inventario`.`fotos` (`productos_idproductos` ASC);


-- -----------------------------------------------------
-- Table `inventario`.`asignacion`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `inventario`.`asignacion` ;

CREATE TABLE IF NOT EXISTS `inventario`.`asignacion` (
  `id_as` INT NOT NULL,
  `can_asi` INT NULL,
  `productos_idproductos` INT NOT NULL,
  PRIMARY KEY (`id_as`, `productos_idproductos`),
  CONSTRAINT `fk_asignacion_productos1`
    FOREIGN KEY (`productos_idproductos`)
    REFERENCES `inventario`.`productos` (`idproductos`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;

CREATE INDEX `fk_asignacion_productos1_idx` ON `inventario`.`asignacion` (`productos_idproductos` ASC);


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
