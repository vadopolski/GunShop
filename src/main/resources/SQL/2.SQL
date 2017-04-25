INSERT INTO Address (street, city, house, flat)
        VALUES ('testStreet',
                'TestCity',
                '21b',
                15);

INSERT INTO LicenseLevel (name, description) VALUES ('NONE', '');
INSERT INTO LicenseLevel (name, description) VALUES ('TRAUMATIC', '');
INSERT INTO LicenseLevel (name, description) VALUES ('HUNTER', '');
INSERT INTO LicenseLevel (name, description) VALUES ('POLICE', '');
INSERT INTO LicenseLevel (name, description) VALUES ('MILITARY', '');

INSERT INTO User (first_name, last_name, nickname, dob, address_id, license_level, telephone, email, password)
        VALUES ('Вася',
                  'Пупкин',
                  'vason',
                  'vason',
                  1988-03-04,
                  1,
                  1,
                  '222-33-22',
                  'vason@gmail.com',
                  'qwerty');

INSERT INTO GunModel(name, license_level, caliber, length, is_rifled, capacity)
        VALUES ('Парабеллум', 4, 9, 102, TRUE , 8);

INSERT INTO Gun (id, model_id, dob, delivery_date, buyer_id)
        VALUES ('989898009809',
                1,
                1989-03-04,
                2017-03-04,

                );

INSERT INTO Gun (id, model_id, dob, delivery_date, buyer_id)
VALUES ('123898009809',
        1,
        1989-03-04,
        2017-03-04,

);

INSERT INTO Gun (id, model_id, dob, delivery_date, buyer_id)
VALUES ('989898009345',
        1,
        1989-03-04,
        2017-03-04,

);