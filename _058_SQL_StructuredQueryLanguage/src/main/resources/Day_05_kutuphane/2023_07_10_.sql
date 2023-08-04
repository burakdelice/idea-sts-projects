SELECT * FROM kitap;

SELECT * FROM odunc;

SELECT * FROM tur;

SELECT * FROM uye;

SELECT * FROM yazar;

SELECT *
FROM kitap
JOIN yazar
on kitap.kitap_id=yazar.yazar_id;


SELECT kitap.kitap_id, kitap.kitap_adi, yazar.kitap_yazari, yazar.yazar_id
 FROM kitap
  JOIN yazar
   ON kitap.yazar_id = yazar.yazar_id;

SELECT k.kitap_id, k.kitap_adi, y.kitap_yazari, y.yazar_id
     FROM kitap k
         INNER JOIN yazar y
              ON k.yazar_id = y.yazar_id;

SELECT k.kitap_id, k.kitap_adi, y.kitap_yazari, y.yazar_id
FROM kitap k
         LEFT JOIN yazar y
                    ON k.yazar_id = y.yazar_id;

SELECT k.kitap_id, k.kitap_adi, y.kitap_yazari, y.yazar_id
FROM kitap k
         RIGHT JOIN yazar y
                   ON k.yazar_id = y.yazar_id;

SELECT k.kitap_id, k.kitap_adi, y.kitap_yazari, y.yazar_id
FROM kitap k
         FULL OUTER JOIN yazar y
                   ON k.yazar_id = y.yazar_id;

SELECT * FROM kitap
UNION SELECT * FROM yazar;


