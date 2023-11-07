# Program Constructor

Program ini memiliki kemiripan sama dengan program tugas_pbo1 sebelumnya, perbedaannya program ini menjelaskan contoh mengenai Constructor. 

Langkah-langkah: 
1. Membuat 3 atribut, yakni alatNafas dan berkembangBiak saya jadikan private, dan jenisMakan saya jadikan protected.
2. Membuat Constructor untuk memberi nilai atau mendefinisikan atribut jenisMakan tadi sebagai “Insectivora”
3. Membuat Class baru dengan nama Binatang yang saya extends dengan Class Organism. Disini saya memberikan 3 atribut, yaitu namaSpesies dan jumlahKaki dijadikan private, serta habitat dijadikan protected
4. Membuat method super yang berfungsi untuk mengakses Constructor jenisMakan, lalu tambahkan Constructor habitat yang akan digunakan untuk mendefinisikan atribut habitat
5. Membuat Class baru lagi dengan nama Vertebrata yang saya extends dengan Class Binatang. Dan juga membuat 2 atribut, yaitu nama dan makanan.
6. Membuat perintah super yang saya gunakan untuk mengakses Constructor habitat, lalu membuat isi dari habitat tersebut yaitu “Darat”. Serta membuat Constructor jadi atribut jenisMakan
7. Membuat Class baru lagi dengan nama Tumbuhan yang saya extends dengan Class Organism. Lalu membuat 3 atribut, yaitu habitat dan namaSpesies dijadikan private, dan jenisBatang dijadikan protected
8. Membuat Constructor pada jenisBatang dengan nilai “Berkambium”, serta membuat Constructor lagi dibawah nya yang akan digunakan untuk mengganti nilai dari jenisBatang
9. Membuat Class baru lagi dengan nama Dikotil yang saya extends dengan Class Tumbuhan. Pada Class Dikotil ini dibuat 2 atribut private, yaitu nama dan biji.
10. Membuat perintah super yang digunakan untuk mengakses Constructor yang ada pada Class tumbuhan
11. Membuat main method untuk menjalankan program
