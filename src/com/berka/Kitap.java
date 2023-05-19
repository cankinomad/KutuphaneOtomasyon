package com.berka;

public class Kitap {
	//Member variables/fields/ Attribute/
	private String ISBN;
	private String ad;
	private String yazar;
	private int sayfaSayisi;
	private String basimTarihi;
	private String yayinEvi;
	private String tur;
	private int adet;
	
	
	//Constructor
	
	public Kitap() {
		super();
	}




	public Kitap(String iSBN, String ad, String yazar, int sayfaSayisi, String basimTarihi, String yayinEvi, String tur,
			int adet) {
		super();
		ISBN = iSBN;
		this.ad = ad;
		this.yazar = yazar;
		this.sayfaSayisi = sayfaSayisi;
		this.basimTarihi = basimTarihi;
		this.yayinEvi = yayinEvi;
		this.tur = tur;
		this.adet = adet;
	}

	//Getter&Setter olusturalim
	


	public String getISBN() {
		return ISBN;
	}




	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}




	public String getAd() {
		return ad;
	}




	public void setAd(String ad) {
		this.ad = ad;
	}




	public String getYazar() {
		return yazar;
	}




	public void setYazar(String yazar) {
		this.yazar = yazar;
	}




	public int getSayfaSayisi() {
		return sayfaSayisi;
	}




	public void setSayfaSayisi(int sayfaSayisi) {
		this.sayfaSayisi = sayfaSayisi;
	}




	public String getBasimTarihi() {
		return basimTarihi;
	}




	public void setBasimTarihi(String basimTarihi) {
		this.basimTarihi = basimTarihi;
	}




	public String getYayinEvi() {
		return yayinEvi;
	}




	public void setYayinEvi(String yayinEvi) {
		this.yayinEvi = yayinEvi;
	}




	public String getTur() {
		return tur;
	}




	public void setTur(String tur) {
		this.tur = tur;
	}




	public int getAdet() {
		return adet;
	}




	public void setAdet(int adet) {
		this.adet = adet;
	}
	
	
	
	
	
	
	
	
}
