package example;

import java.io.UnsupportedEncodingException;
import java.util.Hashtable;
import java.util.UUID;

import ecpay.payment.integration.AllInOne;
import ecpay.payment.integration.domain.AioCheckOutALL;
import ecpay.payment.integration.domain.AioCheckOutApplePay;
import ecpay.payment.integration.domain.AioCheckOutATM;
import ecpay.payment.integration.domain.AioCheckOutBARCODE;
import ecpay.payment.integration.domain.AioCheckOutCVS;
import ecpay.payment.integration.domain.AioCheckOutDevide;
import ecpay.payment.integration.domain.AioCheckOutOneTime;
import ecpay.payment.integration.domain.AioCheckOutPeriod;
import ecpay.payment.integration.domain.AioCheckOutWebATM;
import ecpay.payment.integration.domain.CreateServerOrderObj;
import ecpay.payment.integration.domain.DoActionObj;
import ecpay.payment.integration.domain.FundingReconDetailObj;
import ecpay.payment.integration.domain.InvoiceObj;
import ecpay.payment.integration.domain.QueryCreditCardPeriodInfoObj;
import ecpay.payment.integration.domain.QueryTradeInfoObj;
import ecpay.payment.integration.domain.QueryTradeObj;
import ecpay.payment.integration.domain.TradeNoAioObj;

public class ExampleAllInOne {
	public static AllInOne all;
	public static void main(String[] args) {
		initial();
//		System.out.println("compare CheckMacValue method testing result: " + cmprChkMacValue());
//		System.out.println("apple pay create order: " + postCreateServerOrder());
//		System.out.println("doAction: " + postDoAction());
//		System.out.println("queryTradeInfo: " + postQueryTradeInfo());
//		System.out.println("queryCreditCardPeriodInfo: " + postQueryCreditCardPeriodInfo());
//		System.out.println("queryTrade: " + postQueryTrade());
//		System.out.println("tradeNoAio: " + postTradeNoAio());
//		System.out.println("fundingReconDetail: " + postFundingReconDetail());
//		System.out.println("aioCheckOutALL: " + genAioCheckOutALL());
		System.out.println("aioCheckOutOneTime: " + genAioCheckOutApplePay());
//		System.out.println("aioCheckOutATM: " + genAioCheckOutATM());
//		System.out.println("aioCheckOutCVS: " + genAioCheckOutCVS());
//		System.out.println("aioCheckOutBARCODE: " + genAioCheckOutBARCODE());
//		System.out.println("aioCheckOutDevide: " + genAioCheckOutDevide());
//		System.out.println("aioCheckOutOneTime: " + genAioCheckOutOneTime());
//		System.out.println("aioCheckOutPeriod: " + genAioCheckOutPeriod());
//		System.out.println("aioCheckOutWebATM: " + genAioCheckOutWebATM());
	}
	private static void initial(){
		all = new AllInOne("");
	}
	
	public static boolean cmprChkMacValue(){
		Hashtable<String, String> dict = new Hashtable<String, String>();
		dict.put("MerchantID", "2000132");
		dict.put("CheckMacValue", "50BE3989953C1734E32DD18EB23698241E035F9CBCAC74371CCCF09E0E15BD61");
		return all.compareCheckMacValue(dict);
	}
	
	public static String postCreateServerOrder(){
		CreateServerOrderObj obj = new CreateServerOrderObj();
		obj.setMerchantTradeNo("sdfkjh2kli3hlih");
		obj.setMerchantTradeDate("2017/05/12 10:23:46");
		obj.setTotalAmount("1000");
		obj.setCurrencyCode("TWD");
		try {
			obj.setItemName(new String("哈".getBytes("BIG5"), "UTF-8"));
			obj.setTradeDesc(new String("哈".getBytes("BIG5"), "UTF-8"));
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		obj.setTradeType("2");
		obj.setPaymentToken("{	\"token\":	{		\"paymentData\":		{			\"data\":\"rLQsaJzRWR4MGdZWvWY9dvfmKRYKY8jcOP3YDBH+QpB5tklltZErejVyHARz6+pJdBAnjjECuoqH8aDerZHraBz2pb14uBuiawhqeT0UrAsp/vHTM05BZdpcGT7JQAJzx0gcxRWZ7b7EpBt8xiSaPISHZA9TlVwNbfyM3IB1p5e3V3OEWwENAyhaXdBZNovZdjfQ8Z8AhCypjCeiLvprlfXHpzYadZwHlX40lbZRkxWYPEbP3XEaa1FsPVxYNkSJKcE6t4mEW1cSGZJnEbxFOw6npITnm+Pr2lg8mQJwMeRxs90xpmc0m0BVBAnT7CnqYSzEBkmIBUX5EQvgAC3t4XHUAghwx9nkPbgzXtBA5OLkaDq5Cqo5qrgGty37eDot+zkUQfpugj2Axkrc5Mey1J0+PWpG1cOLeAq/UGSv2tbZ\",			\"signature\":\"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\",			\"header\":			{				\"publicKeyHash\":\"xLBxijBsfyoaFVUlEEUEQptPsmD4WIt491ovV5DKNAg=\",				\"ephemeralPublicKey\":\"MFkwEwYHKoZIzj0CAQYIKoZIzj0DAQcDQgAE/WwswbNtdjBmX94iGQh5Z4Cyt7v7rMNAMO2Hgi93HUpSSJ5pI+5TYM4UtdIWfDbBzXQiwCAKT3jreo1cLPAdzg==\",				\"transactionId\":\"85a158652b0d98379cb817dd53e97dfd8131dde2f578128482b6dee4c9e98eb9\"			},			\"version\":\"EC_v1\"		},		\"transactionIdentifier\":\"85A158652B0D98379CB817DD53E97DFD8131DDE2F578128482B6DEE4C9E98EB9\",		\"paymentMethod\":		{			\"network\":\"Visa\",			\"type\":\"debit\",			\"displayName\":\"Visa 0492\"		}	}}");
		return all.createServerOrder(obj);
	}
	
	public static String postDoAction(){
		DoActionObj obj = new DoActionObj();
		obj.setMerchantTradeNo("b0fac40057364c0894b");
		obj.setTotalAmount("100");
		obj.setTradeNo("16054565489");
		obj.setAction("C");
		return all.doAction(obj);
	}
	
	public static String postFundingReconDetail(){
		FundingReconDetailObj obj = new FundingReconDetailObj();
		obj.setPayDateType("close");
		obj.setStartDate("2017-03-03");
		obj.setEndDate("2017-03-03");
		return all.fundingReconDetail(obj);
	}
	
	public static String postQueryTrade(){
		QueryTradeObj obj = new QueryTradeObj();
		obj.setCreditRefundId("10123456");
		obj.setCreditAmount("100");
		obj.setCreditCheckCode("59997889");
		return all.queryTrade(obj);
	}
	
	public static String postQueryTradeInfo(){
		QueryTradeInfoObj obj = new QueryTradeInfoObj();
		obj.setMerchantTradeNo("0c3075e7499743e58ef");
		return all.queryTradeInfo(obj);
	}
	
	public static String postTradeNoAio(){
		TradeNoAioObj obj = new TradeNoAioObj();
		obj.setDateType("6");
		obj.setBeginDate("2017-03-03");
		obj.setEndDate("2017-03-03");
		obj.setMediaFormated("1");
		return all.tradeNoAio(obj);
	}
	
	public static String postQueryCreditCardPeriodInfo(){
		QueryCreditCardPeriodInfoObj obj = new QueryCreditCardPeriodInfoObj();
		obj.setMerchantTradeNo("74823H75879R166472");
		return all.queryCreditCardPeriodInfo(obj);
	}
	
	public static String genAioCheckOutWebATM(){
		AioCheckOutWebATM obj = new AioCheckOutWebATM();
		obj.setMerchantTradeNo("testCompany000444");
		obj.setMerchantTradeDate("2017/01/01 08:05:08");
		obj.setTotalAmount("100");
		obj.setTradeDesc("test Description");
		obj.setItemName("Test Item");
		obj.setReturnURL("http://211.23.128.214:5000");
		obj.setNeedExtraPaidInfo("N");
		String form = all.aioCheckOut(obj, null);
		return form;
	}
	
	public static String genAioCheckOutALL(){
		AioCheckOutALL obj = new AioCheckOutALL();
		obj.setMerchantTradeNo("testCompany0004");
		obj.setMerchantTradeDate("2017/01/01 08:05:23");
		obj.setTotalAmount("50");
		obj.setTradeDesc("test Description");
		obj.setItemName("TestItem");
		obj.setReturnURL("http://211.23.128.214:5000");
		obj.setNeedExtraPaidInfo("N");
		String form = all.aioCheckOut(obj, null);
		return form;
	}
	public static String genAioCheckOutApplePay(){
		AioCheckOutApplePay obj = new AioCheckOutApplePay();
		obj.setMerchantTradeNo("testapplepay052302");
		obj.setMerchantTradeDate("2017/01/01 08:05:23");
		obj.setTotalAmount("50");
		obj.setTradeDesc("test Description");
		obj.setItemName("TestItem");
		obj.setReturnURL("http://211.23.128.214:5000");
		obj.setNeedExtraPaidInfo("N");
		String form = all.aioCheckOut(obj, null);
		return form;
	}
	public static String genAioCheckOutATM(){
		AioCheckOutATM obj = new AioCheckOutATM();
		obj.setMerchantTradeNo("testCompany0005");
		obj.setMerchantTradeDate("2017/01/01 08:05:23");
		obj.setTotalAmount("50");
		obj.setTradeDesc("test Description");
		obj.setItemName("TestItem");
		obj.setReturnURL("http://211.23.128.214:5000");
		obj.setNeedExtraPaidInfo("N");
		obj.setExpireDate("6");
		String form = all.aioCheckOut(obj, null);
		return form;
	}
	
	public static String genAioCheckOutBARCODE(){
		AioCheckOutBARCODE obj = new AioCheckOutBARCODE();
		obj.setMerchantTradeNo("testCompany0007");
		obj.setMerchantTradeDate("2017/01/01 08:05:23");
		obj.setTotalAmount("50");
		obj.setTradeDesc("test Description");
		obj.setItemName("TestItem");
		obj.setReturnURL("http://211.23.128.214:5000");
		obj.setNeedExtraPaidInfo("N");
		obj.setStoreExpireDate("3");
		String form = all.aioCheckOut(obj, null);
		return form;
	}
	
	public static String genAioCheckOutCVS(){
		AioCheckOutCVS obj = new AioCheckOutCVS();
		InvoiceObj invoice = new InvoiceObj();
		UUID uid = UUID.randomUUID();
		obj.setMerchantTradeNo(uid.toString().replaceAll("-", "").substring(0, 20));
		obj.setMerchantTradeDate("2017/01/01 08:05:23");
		obj.setTotalAmount("50");
		obj.setTradeDesc("test Description");
		obj.setItemName("TestItem");
		obj.setReturnURL("http://211.23.128.214:5000");
		obj.setNeedExtraPaidInfo("N");
		obj.setStoreExpireDate("3");
		obj.setInvoiceMark("Y");
		invoice.setRelateNumber("test202017test");
		invoice.setCustomerID("123456");
		invoice.setCarruerType("1");
		invoice.setTaxType("1");
		invoice.setCarruerNum("");
		invoice.setDonation("0");
		invoice.setLoveCode("X123456");
		invoice.setPrint("0");
		invoice.setCustomerName("Mark");
		invoice.setCustomerAddr("台北市南港區三重路");
		invoice.setCustomerPhone("0911429215");
		invoice.setDelayDay("1");
		invoice.setInvType("07");
		invoice.setInvoiceItemName("測試");
		invoice.setInvoiceItemCount("1");
		invoice.setInvoiceItemWord("個");
		invoice.setInvoiceItemPrice("50");
		invoice.setInvoiceItemTaxType("1");
		String form = all.aioCheckOut(obj, invoice);
		return form;
	}
	
	public static String genAioCheckOutDevide(){
		AioCheckOutDevide obj = new AioCheckOutDevide();
		obj.setMerchantTradeNo("testorder2022052301");
		obj.setMerchantTradeDate("2017/01/01 08:05:23");
		obj.setTotalAmount("20000");
		obj.setTradeDesc("test Description");
		obj.setItemName("TestItem");
		obj.setReturnURL("http://211.23.128.214:5000");
		obj.setNeedExtraPaidInfo("N");
		obj.setCreditInstallment("12");
		String form = all.aioCheckOut(obj, null);
		return form;
	}
	
	public static String genAioCheckOutOneTime(){
		AioCheckOutOneTime obj = new AioCheckOutOneTime();
		obj.setMerchantTradeNo("testCompany0008");
		obj.setMerchantTradeDate("2017/01/01 08:05:23");
		obj.setTotalAmount("50");
		obj.setTradeDesc("test Description");
		obj.setItemName("TestItem");
		obj.setReturnURL("http://211.23.128.214:5000");
		obj.setNeedExtraPaidInfo("N");
		obj.setRedeem("Y");
		String form = all.aioCheckOut(obj, null);
		return form;
	}
	
	public static String genAioCheckOutPeriod(){
		AioCheckOutPeriod obj = new AioCheckOutPeriod();
		obj.setMerchantTradeNo("testCompany0009");
		obj.setMerchantTradeDate("2017/01/01 08:05:23");
		obj.setTotalAmount("50");
		obj.setTradeDesc("test Description");
		obj.setItemName("TestItem");
		obj.setReturnURL("http://211.23.128.214:5000");
		obj.setNeedExtraPaidInfo("N");
		obj.setPeriodAmount("50");
		obj.setPeriodType("D");
		obj.setFrequency("1");
		obj.setExecTimes("12");
		String form = all.aioCheckOut(obj, null);
		return form;
	}
}
