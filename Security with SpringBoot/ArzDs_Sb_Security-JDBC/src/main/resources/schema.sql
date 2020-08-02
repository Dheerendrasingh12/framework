 create table MyUser(
      usn varchar_ignorecase(50) not null primary key,
      pwd varchar_ignorecase(50) not null,
      enabled boolean not null);

  create table MyAuth (
      usn varchar_ignorecase(50) not null,
      authority varchar_ignorecase(50) not null,
      constraint fk_authorities_myuser foreign key(usn) references users(usn));
      

      create unique index ix_auth_username on MyAuth (usn,authority);
      
    