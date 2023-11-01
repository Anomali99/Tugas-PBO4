# Tugas-PBO4
Aplikasi ini adalah aplikasi java yang menggunakan JDBC PostgreSQL

## Features
- Dapat menampilkan data dari database

## Tech
- JDK 8
- NetBeans IDE 15
- PostgreSQL 14

## Installation
Buat Tabel mahasiswa pada database PBO

```sh
create table mahasiswa (
	nim char (11) primary key, 
	nama varchar (30), 
	alamt varchar (100),
	tlp varchar (13)
);
```
insert data ke tabel

```sh
insert into mahasiswa (nim,nama,alamat,tlp) values
('1234','Asep','Lamongan','064545453535'),
('1235','Budi','Lamongan','064545453535'),
('1236','Candra','Lamongan','064545453535'),
('1237','Dani','Lamongan','064545453535');
```
=======
> Nur Fatiq (09040622071)
