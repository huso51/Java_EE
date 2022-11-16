package com.mimaraslan;

public class Istemci {
	public static void main(String[] args) throws Exception  {
		
		SelamWSStub stub = new SelamWSStub();
		
		//Web servisine istegimizi yapalim.
		SelamWSStub.SelamVer istek = new SelamWSStub.SelamVer();
		istek.setAdiSoyadi("Murat ASLAN");
		
		//WebServisini cagiralim ve cavbimizi alalim.
		SelamWSStub.SelamVerResponse cevap = stub.selamVer(istek);
		System.out.println("WEB SERVISINDEN GELEN CEVAP : " + cevap.get_return());
		
	}
}
