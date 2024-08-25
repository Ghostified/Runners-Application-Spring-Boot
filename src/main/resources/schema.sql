CREATE TABLE IF NOT EXISTS Run (
       id INT NOT NULL,
       title varchar(256) NOT NULL,
       startedOn timestamp NOT NULL,
       completedOn timestamp NOT NULL,
       miles INT NOT NULL,
       location varchar(10) NOT NULL,
       PRIMARY KEY(id)
);