# --- !Ups

CREATE TABLE "category" (
 "id" INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,
 "name" VARCHAR NOT NULL
);

CREATE TABLE "product" (
 "id" INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,
 "name" VARCHAR NOT NULL,
 "description" TEXT NOT NULL,
 "category" INT NOT NULL,
 "price" DOUBLE NOT NULL,
 FOREIGN KEY(category) references category(id)
);

CREATE TABLE "user" (
 "id" INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,
 "name" VARCHAR NOT NULL
 "surname" VARCHAR NOT NULL
 "email" VARCHAR NOT NULL
 "admin" BIT NOT NULL
);

CREATE TABLE "chart" (
 "id" INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,
 "user" INT NOT NULL,
 "product" INT NOT NULL,
 "count" INT NOT NULL,
 FOREIGN KEY(user) references user(id)
 FOREIGN KEY(product) references product(id)
);

CREATE TABLE "comment" (
 "id" INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,
 "user" INT NOT NULL,
 "stars" INT NOT NULL,
 "text" TEXT NOT NULL,
 FOREIGN KEY(user) references user(id)
);

CREATE TABLE "prOpinion" (
 "id" INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,
 "user" INT NOT NULL,
 "product" INT NOT NULL,
 "stars" INT NOT NULL,
 "text" TEXT NOT NULL,
 FOREIGN KEY(user) references user(id)
 FOREIGN KEY(product) references product(id)
);

CREATE TABLE "transaction" (
 "id" INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,
 "user" INT NOT NULL,
 "product" INT NOT NULL,
 "count" INT NOT NULL,
 "price" DOUBLE NOT NULL,
 "date" VARCHAR NOT NULL,
 FOREIGN KEY(user) references user(id)
 FOREIGN KEY(product) references product(id)
);

CREATE TABLE "payment" (
 "id" INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,
 "transaction" INT NOT NULL,
 "date" VARCHAR NOT NULL,
 FOREIGN KEY(transaction) references transaction(id)
);

CREATE TABLE "delivery" (
 "id" INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,
 "transaction" INT NOT NULL,
 "date" VARCHAR NOT NULL,
 FOREIGN KEY(transaction) references transaction(id)
);

# --- !Downs

DROP TABLE "category"
DROP TABLE "product"
DROP TABLE "user"
DROP TABLE "chart"
DROP TABLE "comment"
DROP TABLE "prOpinion"
DROP TABLE "transaction"
DROP TABLE "payment"
DROP TABLE "delivery"
