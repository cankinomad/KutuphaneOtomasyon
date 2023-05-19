package com.berka;

public class Uye {
	//POJO TURUNDE BIR CLASS ENTITIY.
	private int uyeNo;
	private String ad;
	private String soyad;
	private String tcNo;
	private String kayitTarihi;
	private int puan;
	private int oduncKitapSayisi;
	private String telefon;
	private String adres;
	
	
	
	
	//constructor
	


	public Uye(String ad, String soyad, String tcNo, String kayitTarihi, int puan, int oduncKitapSayisi, String telefon,
			String adres) {
		super();
		this.ad = ad;
		this.soyad = soyad;
		this.tcNo = tcNo;
		this.kayitTarihi = kayitTarihi;
		this.puan = puan;
		this.oduncKitapSayisi = oduncKitapSayisi;
		this.telefon = telefon;
		this.adres = adres;
	}








	public void setUyeNo(int uyeNo) {
		this.uyeNo = uyeNo;
	}








	public String getAd() {
		return ad;
	}






	public void setAd(String ad) {
		this.ad = ad;
	}






	public String getSoyad() {
		return soyad;
	}






	public void setSoyad(String soyad) {
		this.soyad = soyad;
	}






	public String getTcNo() {
		return tcNo;
	}






	public void setTcNo(String tcNo) {
		this.tcNo = tcNo;
	}






	public String getKayitTarihi() {
		return kayitTarihi;
	}






	public void setKayitTarihi(String kayitTarihi) {
		this.kayitTarihi = kayitTarihi;
	}






	public int getPuan() {
		return puan;
	}






	public void setPuan(int puan) {
		this.puan = puan;
	}






	public int getOduncKitapSayisi() {
		return oduncKitapSayisi;
	}






	public void setOduncKitapSayisi(int oduncKitapSayisi) {
		this.oduncKitapSayisi = oduncKitapSayisi;
	}






	public String getTelefon() {
		return telefon;
	}






	public void setTelefon(String telefon) {
		this.telefon = telefon;
	}






	public String getAdres() {
		return adres;
	}






	public void setAdres(String adres) {
		this.adres = adres;
	}
	







	public int getUyeNo() {
		return uyeNo;
	}








	@Override
	public String toString() {
		return "Uye [uyeNo=" + uyeNo + ", ad=" + ad + ", soyad=" + soyad + ", tcNo=" + tcNo + ", kayitTarihi="
				+ kayitTarihi + ", puan=" + puan + ", oduncKitapSayisi=" + oduncKitapSayisi + ", telefon=" + telefon
				+ ", adres=" + adres + "]";
	}
	
	
	
	
	
	
}
