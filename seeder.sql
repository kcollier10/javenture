USE javenture_db;

DROP TABLE IF EXISTS items;
CREATE TABLE IF NOT EXISTS items (
      id INT UNSIGNED NOT NULL AUTO_INCREMENT,
      item TEXT NOT NULL,
      description TEXT NOT NULL,
      damage INT NOT NULL,
      PRIMARY KEY (id)
);

DROP TABLE IF EXISTS locations;
CREATE TABLE IF NOT EXISTS locations (
    id INT UNSIGNED NOT NULL AUTO_INCREMENT,
    name TEXT NOT NULL,
    description TEXT NOT NULL,
    climate TEXT NOT NULL,
    PRIMARY KEY (id)
);

DROP TABLE IF EXISTS portals;
CREATE TABLE IF NOT EXISTS portals (
    id INT UNSIGNED NOT NULL AUTO_INCREMENT,
    portalLocation TEXT NOT NULL,
    location_id INT UNSIGNED NOT NULL,
    PRIMARY KEY (id),
    KEY location_fk (location_id),
    CONSTRAINT location_fk FOREIGN KEY (location_id) REFERENCES locations (id)
);

INSERT INTO items (item, description, damage)
VALUES ('The Holy Grail', 'A really nice cup a lot of guys seem to want.', 100),
       ('Rubber Ducky', 'A stealthy hunter hidden behind the veil of innocence.', 42),
       ('Basic Sword', '*Clink clank*', 10),
       ('Spaghetti', 'Piping hot and ready to satiate.', 35),
       ('Cell Phone', 'A small handheld computer used for phoning friends (or ignoring them).', 3);

INSERT INTO locations (name, description, climate)
VALUES ('exit', 'Exiting program. Have a good day!', 'sad'),
       ('bed', 'You are in your bed. Get to the castle!', 'cozy'),
       ('forest', 'You are in a forest.', 'muggy'),
       ('island', 'You are on an island.', 'tropical'),
       ('park', 'You are at the park.', 'breezy'),
       ('museum', 'You made it to the museum!', 'controlled');

INSERT INTO portals (portalLocation, location_id)
VALUES ('Bedroom Portal 1', 2),
       ('Forest Portal 1', 3),
       ('Forest Portal 2', 3),
       ('Island Portal 1', 4),
       ('Island Portal 2', 4),
       ('Island Portal 3', 4),
       ('Park Portal 1', 5),
       ('Park Portal 2', 5),
       ('Museum Portal 1', 6);


