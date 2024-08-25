CREATE TABLE IF NOT EXISTS Run (
       id INT NOT NULL,
       title varchar(256) NOT NULL,
       startedOn timestamp NOT NULL,
       completedOn timestamp NOT NULL,
       miles INT NOT NULL,
       location VARCHAR(25) NOT NULL,
       PRIMARY KEY(id)
);