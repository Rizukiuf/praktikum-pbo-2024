public class Titik {
	float absis;
	float ordinat;
	static float counterTitik;

	Titik(){
		absis = 0;
		ordinat = 0;
		counterTitik++;
	}

	// overloading konstruktor Titik
	Titik(float absis, float ordinat){
		this.absis = absis;
		this.ordinat = ordinat;
		Titik.counterTitik++;
	}

	void setAbsis(float a){
		absis = a;
	}
	
	void setOrdinat(float o){
		ordinat = o;
	}

	float getAbsis(){
		return absis;
	}

	float getOrdinat(){
		return ordinat;
	}

	static float getCounterTitik(){
		return counterTitik;
	}
}
