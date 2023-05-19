package com.berka;

public class Kutuphane {
	
	private Kitap[] kitaplar;
	private Uye[] uyeler;
	private Odunc[] oduncListesi;
	private String gorevli;
	private int kitapSayisi;
	private int uyeSayisi;
	private int uyeIndex=0;
	private int oduncSayisi=0;
	
	public Kutuphane() {
		kitaplar=new Kitap[200];
		uyeler=new Uye[50];
		oduncListesi=new Odunc[uyeler.length*2];
		kitapSayisi=0;
		uyeSayisi=0;
		oduncSayisi=0;
	}
	// kitapEkle
	
	public void kitapEkle(Kitap kitap) {
		if(kitapSayisi<=200) {
		kitaplar[kitapSayisi]=kitap;
		kitapSayisi++;}
		else {
			System.out.println("Kutuphane dolu. Yeni kitap eklenemiyor");
		}
	}
	public void uyeEkle(Uye uye) {
		uyeIndex++;
		uye.setUyeNo(uyeIndex);
		if(uyeSayisi<50) {
		uyeler[uyeSayisi]=uye;
		uyeSayisi++;}
		else {
			System.out.println("Kutuphane uye sayisi dolu. Yeni uyelik alinamiyor");
		}
	}
	//kitapListele
	public void tumKitaplariListele() {
		System.out.println("Kitap Ad\t\t Kitap Yazar \t Adet");
		for (Kitap kitap : kitaplar) {
			if(kitap!=null) {
			System.out.println(kitap.getAd()+"\t"+kitap.getYazar()+"\t"+kitap.getAdet());
			}
		}
	}
	public void tumUyeListele() {
		System.out.println("Uye No\tUye Ad\t Uye Soyad \t Odunc Kitap Sayisi");
		for (Uye uye : uyeler) {
			if(uye!=null) {
				System.out.println(uye.getUyeNo()+"\t"+uye.getAd()+"\t"+uye.getSoyad()+"\t\t\t"+uye.getOduncKitapSayisi());
			}
		}
		
	}
	//Kitap Odunc verme
	
	public boolean kitapOduncVer(Kitap kitap, Uye uye, String oduncVermeTarihi) {
		if(oduncSayisi>=uyeler.length*2) {
			System.out.println("Odunc verme kapasitesi dolu!");
			return false;
		}
		
			if(uye.getPuan()>=0 && kitap.getAdet()>0) {
				oduncListesi[oduncSayisi++]=new Odunc(kitap, uye, oduncVermeTarihi);
				kitap.setAdet(kitap.getAdet()-1);
				return true;
			}
			else {
				System.out.println("Puaniniz yetersiz");
			}
		
		return false;
		
		
	}
	//tumOduncListesi
	
	public void tumOduncleriListele() {
		System.out.println("Uye No\tUye Ad\t Kitap Ad \t Odunc Verme Tarihi");
		for (Odunc odunc : oduncListesi) {
			if(odunc!=null) {
				System.out.println(
						odunc.getUye().getUyeNo()+"\t"+
						odunc.getUye().getAd()+"\t"+
						odunc.getKitap().getAd()+"\t"+
						odunc.getAlinanTarih());
			}
		}
		
	}
	
	
}
