package com.berka;

public class Odunc {
	
	private Kitap kitap;
	private Uye uye;
	private String oduncTarih;
	
	
	
	
	public Odunc(Kitap kitap, Uye uye, String oduncTarih) {
		super();
		this.kitap = kitap;
		this.uye = uye;
		this.oduncTarih = oduncTarih;
	}




	public Kitap getKitap() {
		return kitap;
	}




	public Uye getUye() {
		return uye;
	}




	public String getAlinanTarih() {
		return oduncTarih;
	}
	
	
}
