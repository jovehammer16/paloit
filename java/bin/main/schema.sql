create table Document
(
   id integer not null,
   title varchar(255) not null,
   body varchar(255) not null,
   primary key(id)
);


create table User
(
   id integer not null,
   firstName varchar(255) not null,
   lastName varchar(255) not null,
   primary key(id)
);

create table Keyword
(
   id integer not null,
   humanReadable varchar(255) not null,
   slug varchar(255) not null,
   primary key(id)
);
