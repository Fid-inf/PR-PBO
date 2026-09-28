# Simple Banking Application

> Aplikasi perbankan sederhana berbasis Java yang dijalankan melalui terminal.

## Fitur

- Menambahkan pelanggan dan rekening.
- Melakukan setor dan tarik tunai.
- Melihat informasi pelanggan dan saldo rekening.

## Cara Menjalankan

Pastikan Java JDK sudah terpasang. Dari folder proyek, jalankan:

```bash
javac -d bin src/Account.java src/Bank.java src/Customer.java src/Main.java
java -cp bin Main
```

Aplikasi dimulai dengan pelanggan contoh John Doe dan saldo awal `$1000.0`.

## Hubungan Antar Kelas

- `Main` menampilkan menu dan menerima input pengguna. Untuk proses transaksi dan melihat data, `Main` memanggil objek `Bank`.
- `Bank` menyimpan daftar `Customer` dan menyediakan akses ke pelanggan berdasarkan indeks.
- Setiap `Customer` menyimpan daftar `Account` miliknya.
- `Account` menyimpan saldo serta menjalankan operasi setor (`deposit`) dan tarik (`withdraw`).

Alur sederhananya: pengguna memilih aksi di `Main`, aplikasi mencari pelanggan melalui `Bank`, lalu mengakses rekening milik pelanggan untuk melihat atau mengubah saldo.

## Screenshot
![alt text](<Screenshot 2026-09-28 155419.png>)
![alt text](<Screenshot 2026-09-28 155749.png>)
![alt text](<Screenshot 2026-09-28 155913.png>)

Tambahkan screenshot menu aplikasi di folder `screenshots/`, misalnya `screenshots/menu.png`.

