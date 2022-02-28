CREATE TABLE users (
	id UUID,
	name varchar(255) NOT NULL,
	email varchar(255) NOT NULL,
	password varchar(255) NOT NULL,
	is_active boolean,
	PRIMARY KEY (id)
);
