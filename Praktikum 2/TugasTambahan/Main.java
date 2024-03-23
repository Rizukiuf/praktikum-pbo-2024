public class Main {
	public static void main(String[] args) {
		WaliMahasiswa wali = new WaliMahasiswa("Paijo", "08123456789", "Jl. Malioboro, Yogyakarta");
		Mahasiswa mhs = new Mahasiswa("Charlie", "185150200111050", "Teknik Informatika", wali);
		mhs.cetak();
		System.out.println();
		mhs.setNama("Delta");
		mhs.setNim("185150200111051");
		mhs.setJurusan("Teknik Elektro");
		mhs.setWali(new WaliMahasiswa("Paijem", "08123456788", "Jl. Malioboro, Yogyakarta"));
		mhs.cetak();
	}

}
