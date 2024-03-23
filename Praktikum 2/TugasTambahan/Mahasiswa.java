public class Mahasiswa {
	private String nama;
	private String nim;
	private String jurusan;
	private WaliMahasiswa wali;

	public Mahasiswa(String nama, String nim, String jurusan, WaliMahasiswa wali) {
		this.nama = nama;
		this.nim = nim;
		this.jurusan = jurusan;
		this.wali = wali;
	}

	public String getNama() {
		return nama;
	}

	public String getNim() {
		return nim;
	}

	public String getJurusan() {
		return jurusan;
	}

	public WaliMahasiswa getWali() {
		return wali;
	}

	public void setNama(String nama) {
		this.nama = nama;
	}

	public void setNim(String nim) {
		this.nim = nim;
	}

	public void setJurusan(String jurusan) {
		this.jurusan = jurusan;
	}

	public void setWali(WaliMahasiswa wali) {
		this.wali = wali;
	}

	public void cetak() {
		System.out.println("Nama: " + getNama());
		System.out.println("NIM: " + getNim());
		System.out.println("Jurusan: " + getJurusan());
		System.out.println("Nama Wali: " + wali.getNama());
		System.out.println("No. Telp Wali: " + wali.getNomorHp());
		System.out.println("Alamat Wali: " + wali.getAlamat());
	}

}
