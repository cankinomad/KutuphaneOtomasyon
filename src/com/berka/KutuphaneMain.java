package com.berka;

public class KutuphaneMain {

	public static void main(String[] args) {
		
		Kutuphane cafeKutuphane=new Kutuphane();
		Kitap kitap1=new Kitap("978 852 02 2336 5", "Pal Sokagi Cocuklari", "Frenck Monnar", 225, "2017", "Kadife", "Roman", 1);
		Kitap kitap2=new Kitap("444 85 045 2546 5", "Cocuklari", "Jonhattan Monnar", 432, "1989", "Cati", "Roman", 1);
//		Kitap kitap3=new Kitap(); //constructor kismini bos birakirsan bos kitap olusturmasina izin veriyorsun
		cafeKutuphane.kitapEkle(kitap1);
		cafeKutuphane.kitapEkle(kitap2);
//		cafeKutuphane.kitapEkle(kitap3); //bos kitap
		cafeKutuphane.tumKitaplariListele();
		System.out.println("==============================");
		Uye uye=new Uye("Berk", "Aktas", "54523243433", "14.03.2022", 0, 0, "4324324234", "Antalya");
		Uye uye2=new Uye("Berk", "Aktas", "54523243433", "14.03.2022", 0, 0, "4324324234", "Antalya");
		
		cafeKutuphane.uyeEkle(uye);
		cafeKutuphane.uyeEkle(uye2);
		
		
		System.out.println(uye.getUyeNo());
		System.out.println(uye2.getUyeNo());
		cafeKutuphane.tumUyeListele();
		
		cafeKutuphane.kitapOduncVer(kitap1, uye, "20.01.2022");
		cafeKutuphane.kitapOduncVer(kitap1, uye, "20.01.2022");
		
		cafeKutuphane.tumOduncleriListele();
	}

}
