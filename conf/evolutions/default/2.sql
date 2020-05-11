# --- !Ups

INSERT INTO "category"("name") VALUES("sample1");
INSERT INTO "category"("name") VALUES("sample2");

INSERT INTO "product" ("name","description","category","price")
    VALUES ("produkt1","opis1",1,10.20);

INSERT INTO "user" ("name","surname","email","admin")
    VALUES ("imie","nazwisko","niepodam@gmail.com",0);

INSERT INTO "prOpinion" ("user","product","stars","text")
    VALUES (0,1,4,"fajny produkt");
# --- !Downs

DELETE FROM "category";
DELETE FROM "product";
DELETE FROM "user";
DELETE FROM "prOpinion";
