Story eaapp01-Create Employe List

STORY
Description: Employee verilerini olusturmak, editlemek ve silmek icin 
ilgili bir tablo olustur.


Teknik Kriter:
- Emp bilgileri icin EAAPP db sinde "Employee" isimli table olustur
- DurationWorked ve Salary alanlari not nullable olacak
- Grade icin onden tanimali veriler eklenecek : Junior, Senior...
- .. alani varChar 20 boyutunda olacak , ..alani number olarak, reocrd date DATE type olacak..

Kabul Kriterleri: (Acceptance Criteria)
1- Tabloya yeni isci ekleme icin ayri bir buton olacak, bu buton tablonun en ustunde olacak
2- Isciler icin Name,Salary,Duration,Grade,Email bilgileri tabloda yer alacak
3- Her bir isci icin kendi satirinda Benefit, Edit ve Delete linkleri olacak 
4- Tablodaki Name valuesu icinde arama yapabilecek bir "search" filter olacak
5- Filterde sonuc cikmayinda ek bir uyari gosterilmeyecek
6- "search" filter da startwiths fonk yapisi olacaktir, key sensitive olmayacak!
7- Dublicated isim kayitlari engellenmeyecek
8- Tablonun default view orderi Record date a gore Asc olacaktir 
9- Yeni kayit olustururken DurationWorked ve Salary alanlarinda null kayit onleme icin validation olacak ve
alt kisimin hata mesaji gozukecek

------------------------------------------------------
Test Cases:
1- Tabloda tum biglileri olan 1 kayit olustur ve Name,Salary,Duration,Grade,Email bilgilerini tabloda dogrula
2- Salary ve Duration degeri haric tum degerleri olan 1 kayit olustur, ve girilen degerlere gore 
Name,Salary,Duration,Grade,Email bilgilerini tabloda dogrula
3- Zorunlu olan alanlari tek tek bos birakip geri kalan alanlari doldur 1 kayit olustur, 
beklenen "field is required." hata mesajini isci ekleme menusunde dogrula
4- Her bir isci icin tablado ayri sekilde Benefit, Edit ve Delete butonlarinin oldugunu dogrula ve
yeni bir kayit olustur, o kayit icin de ayni link lerin geldigini dogrula
5- Yeni olusturulan kayit icin Benefit butonuna tikla. yeni acilan penceredeki verileri dogrula
6- Olusturulan isci kaydini Edit le "save" et, editlenen bilginin kaydedip geri ana tabloda 
gozlemlendigini dogrula.
7- Edit ekraninda zorunlu alanlari tek tek bos birakip geri kalan alanlari doldur 1 kayit editlemeye calis, 
beklenen "field is required." hata mesajini isci ekleme menusunde dogrula
8- Yeni editlenen kaydin tablodaki siralamasi degismedigini dogrula
9- Editleme islemi sonrasi "save" etmeden "Back to list" butonuna bas ve degisikliklerin tabloda 
gozlemlenmedigini dogrula
10- Yeni kayit ekle, ilgili satirinda Delete butonuna bas, yeni pencere acildigini ve bu pencere ilgili
 isci verileri ciktigini dogrula ve tekrar Delete butonuna tikla. Geri tabloya don ve ilgili kaydin
  silindigini dogrula (dublicated name kayitlara dikkat! ), ayni islemi mevcut bir kayit ile de dogrula
11- Ana Delete e bastiktan sonra"delete" etmeden "Back to list" butonuna bas ve isci kaydinin tabloda 
halen gozuktugunu dogrula

