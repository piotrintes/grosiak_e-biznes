# --- !Ups
INSERT INTO "category"("name") VALUES("Kategoria 1");
INSERT INTO "category"("name") VALUES("Kategoria 2");
INSERT INTO "category"("name") VALUES("Kategoria 3");
INSERT INTO "category"("name") VALUES("Kategoria 4");
INSERT INTO "category"("name") VALUES("Kategoria 5");

INSERT INTO "product" ("name","description","category","price")
VALUES ("produkt1","opis1",1,10.20);
INSERT INTO "product" ("name","description","category","price")
VALUES ("produkt2","opis2",1,10.20);
INSERT INTO "product" ("name","description","category","price")
VALUES ("produkt3","opis3",1,10.20);
INSERT INTO "product" ("name","description","category","price")
VALUES ("produkt4","opis4",1,10.20);
INSERT INTO "product" ("name","description","category","price")
VALUES ("produkt5","opis5",2,10.20);
INSERT INTO "product" ("name","description","category","price")
VALUES ("produkt6","opis6",2,10.20);
INSERT INTO "product" ("name","description","category","price")
VALUES ("produkt7","opis7",2,10.20);
INSERT INTO "product" ("name","description","category","price")
VALUES ("produkt8","opis8",3,10.20);
INSERT INTO "product" ("name","description","category","price")
VALUES ("produkt9","opis9",3,10.20);
INSERT INTO "product" ("name","description","category","price")
VALUES ("produkt10","opis10",4,10.20);
INSERT INTO "product" ("name","description","category","price")
VALUES ("produkt11","opis11",4,10.20);
INSERT INTO "product" ("name","description","category","price")
VALUES ("produkt11","opis11",4,10.20);
INSERT INTO "product" ("name","description","category","price")
VALUES ("produkt12","opis12",5,10.20);
INSERT INTO "product" ("name","description","category","price")
VALUES ("produkt13","opis13",5,10.20);
INSERT INTO "product" ("name","description","category","price")
VALUES ("produkt14","opis14",5,10.20);
INSERT INTO "product" ("name","description","category","price")
VALUES ("produkt15","opis15",5,10.20);


INSERT INTO "promotion" ("product","discount")
VALUES (1,20);

INSERT INTO "user" ("providerId", "userKey", "usrName","name","surname","email","admin")
VALUES ("providerId", "1", "user1","imie","nazwisko","niepodam@gmail.com",0);

INSERT INTO "user" ("providerId", "userKey", "usrName","name","surname","email","admin")
VALUES ("providerId", "0", "admin1","imie","nazwisko","niebanowalny@gmail.com",1);

INSERT INTO "prOpinion" ("user","product","stars","text")
VALUES (1,1,4,"Fajny produkt");
INSERT INTO "prOpinion" ("user","product","stars","text")
VALUES (1,1,0,"Badziew jakiś!!!");
INSERT INTO "prOpinion" ("user","product","stars","text")
VALUES (1,1,5,"Właśnie, że fajne!");
INSERT INTO "prOpinion" ("user","product","stars","text")
VALUES (2,1,5,"Rozdwojenie jaźni?");
# --- !Downs

DELETE FROM "category";
delete from sqlite_sequence where name='category';
DELETE FROM "product";
delete from sqlite_sequence where name='product';
DELETE FROM "user";
delete from sqlite_sequence where name='user';
DELETE FROM "prOpinion";
delete from sqlite_sequence where name='prOpinion';
