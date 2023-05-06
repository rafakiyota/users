INSERT INTO users(name, email) VALUES ('rafael', 'kiyota@email.com');
INSERT INTO users(name, email) VALUES ('nathy', 'nathy@email.com');

INSERT INTO addresses(user_id, address, city, state, postal_code)
    VALUES (1, 'Rua Cel Bento Jose de Carvalho, 666', 'São Paulo', 'SP', '03516-010');
INSERT INTO addresses(user_id, address, city, state, postal_code)
   VALUES (1, 'Avenida Leonardo da Vinci, 69', 'São Paulo', 'SP', '04313-000');

INSERT INTO addresses(user_id, address, city, state, postal_code)
    VALUES (2, 'Rua Prof. Alexandre Monat, 171', 'São Paulo', 'SP', '08441-370');
INSERT INTO addresses(user_id, address, city, state, postal_code)
   VALUES (2, 'Avenida Leonardo da Vinci, 69', 'São Paulo', 'SP', '04313-000');
