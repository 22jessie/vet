create schema vet;

CREATE TABLE IF NOT EXISTS `client`   (
	`client_id` int NOT NULL AUTO_INCREMENT PRIMARY KEY,
	`name` varchar(40) NOT NULL,
	`email` varchar(40) NOT NULL,
	`pwd` varchar(200) NOT NULL,
	`role` varchar(10) NOT NULL,
    	`phone_numb` varchar(10) NOT NULL,
    	`created_at` TIMESTAMP NOT NULL,
	`created_by` varchar(50) NOT NULL,
	`updated_at` TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
	`updated_by` varchar(50) DEFAULT NULL
    
);

CREATE TABLE IF NOT EXISTS `veterinarian`  (
	`vet_id` int NOT NULL  AUTO_INCREMENT  PRIMARY KEY,
	`name` varchar(40) NOT NULL,
	`email` varchar(40) NOT NULL,
	`pwd` varchar(200) NOT NULL,
	`role` varchar(10) NOT NULL,
    	`phone_numb` varchar(10) NOT NULL,
    	`specialty` varchar(20) NOT NULL,
    	`info` varchar(200) NOT NULL,
    	`created_at` TIMESTAMP NOT NULL,
	`created_by` varchar(50) NOT NULL,
	`updated_at` TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
	`updated_by` varchar(50) DEFAULT NULL
);


CREATE TABLE IF NOT EXISTS `admin`  (
	`admin_id` int NOT NULL  AUTO_INCREMENT  PRIMARY KEY,
	`name` varchar(40) NOT NULL,
	`email` varchar(40) NOT NULL,
	`pwd` varchar(200) NOT NULL,
	`role` varchar(10) NOT NULL,
    	`created_at` TIMESTAMP NOT NULL,
	`created_by` varchar(50) NOT NULL,
	`updated_at` TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
	`updated_by` varchar(50) DEFAULT NULL
);



CREATE TABLE IF NOT EXISTS `appointment`  (
	`appnmnt_id` int NOT NULL AUTO_INCREMENT  PRIMARY KEY,
	`client_id` int NOT NULL,
	`vet_id` int NOT NULL,
	`created_at` TIMESTAMP NOT NULL,
	`created_by` varchar(50) NOT NULL,
	`updated_at` TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
	`updated_by` varchar(50) DEFAULT NULL,
	FOREIGN KEY (client_id) REFERENCES client(client_id),
	FOREIGN KEY (vet_id) REFERENCES veterinarian(vet_id)
);


CREATE TABLE IF NOT EXISTS `pet`  (
	`pet_id` int NOT NULL AUTO_INCREMENT  PRIMARY KEY,
	`name` varchar(20) NOT NULL,
	`dob` TIMESTAMP NOT NULL,
	`gender` char NOT NULL,
	`breed` varchar(20) NOT NULL,
	`color` varchar(20) NOT NULL,
    	`owner_id` int NOT NULL,
    	`created_at` TIMESTAMP NOT NULL,
	`created_by` varchar(50) NOT NULL,
	`updated_at` TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
	`updated_by` varchar(50) DEFAULT NULL,
    	
	FOREIGN KEY (owner_id) REFERENCES client(client_id)
);


CREATE TABLE IF NOT EXISTS `procedure`  (
	`proc_id` int NOT NULL AUTO_INCREMENT  PRIMARY KEY,
    	`descptn` varchar(200) NOT NULL,
    	`vet_id` int NOT NULL,
    	`pet_id` int NOT NULL,
	`proc_date` TIMESTAMP NOT NULL,
	`created_at` TIMESTAMP NOT NULL,
	`created_by` varchar(50) NOT NULL,
	`updated_at` TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
	`updated_by` varchar(50) DEFAULT NULL,
	FOREIGN KEY (vet_id) REFERENCES veterinarian(vet_id),
	FOREIGN KEY (pet_id) REFERENCES pet(pet_id)
);



















