CREATE TABLE
    car
    (
        id BIGINT NOT NULL,
        contact BOOLEAN NOT NULL,
        email VARCHAR,
        model VARCHAR,
        name VARCHAR,
        phone VARCHAR,
        purchase_date DATETIME,
        purchase_price NUMERIC,
        vin VARCHAR,
        PRIMARY KEY (id)
    );

CREATE TABLE
    hibernate_sequence
    (
        next_val BIGINT
    );

INSERT INTO car (id, contact, email, model, name, phone, purchase_date, purchase_price)
  VALUES (1, 1, 'jeff@cars.com', 'Globo MTB 29 Full Suspension', 'Jeff Miller', '328-443-5555', 4419619200000, '1100');
INSERT INTO car (id, contact, email, model, name, phone, purchase_date, purchase_price)
  VALUES (2, 0, 'samantha@cars.com', 'Globo Carbon Fiber Race Series', 'Samantha Davis', '448-397-5555', 4419619200000, '1999');
INSERT INTO car (id, contact, email, model, name, phone, purchase_date, purchase_price)
  VALUES (3, 1, 'dave@cars.com', 'Globo Time Trial Blade', 'Dave Warren', '563-891-5555', 4419619200000, '2100');

INSERT INTO hibernate_sequence (next_val) VALUES (4);