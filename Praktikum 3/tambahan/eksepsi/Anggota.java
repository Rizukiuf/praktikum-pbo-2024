public class Anggota {
	private String nama;
	private Buku[] bukuPinjaman;
	private int jumlahBukuPinjaman;

	public Anggota(String nama) {
		this.nama = nama;
		bukuPinjaman = new Buku[3];
		jumlahBukuPinjaman = 0;
	}

	public String getNama() {
		return nama;
	}

	public Buku[] getBukuPinjaman() {
		return bukuPinjaman;
	}

	public int getJumlahBukuPinjaman() {
		return jumlahBukuPinjaman;
	}

	public void pinjamBuku(Buku buku) throws MaksimumBukuTerpinjamException {
		// TODO 2: Buat kondisi untuk mencegah jumlah buku yang dipinjam melebihi 3 dengan throw keyword

		// TODO 3: Buat kondisi untuk mencegah buku yang tidak tersedia dipinjam dengan throw keyword

		buku.setTersedia(false);
		bukuPinjaman[jumlahBukuPinjaman] = buku;
		jumlahBukuPinjaman++;
	}

}
