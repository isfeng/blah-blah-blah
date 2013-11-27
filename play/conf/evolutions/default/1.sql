# --- Created by Slick DDL
# To stop Slick DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table "COFFEES" ("COF_NAME" VARCHAR NOT NULL PRIMARY KEY,"PRICE" DOUBLE NOT NULL);

# --- !Downs

drop table "COFFEES";

