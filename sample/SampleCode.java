package sample;

import ecpay.payment.integration.AllInOne;
import ecpay.payment.integration.domain.AioCheckOutALL;
import ecpay.payment.integration.domain.AioCheckOutPeriod;
import ecpay.payment.integration.domain.CaptureObj;
import ecpay.payment.integration.domain.DoActionObj;
import ecpay.payment.integration.domain.InvoiceObj;
import ecpay.payment.integration.domain.QueryCreditCardPeriodInfoObj;

public class SampleCode {
	private AllInOne all;
	
	public void initial(){
		//此步驟為透過AllInOne建構子來實體化此類別，順便輸入log4j.properties的位置路徑
		//若不需要產生log檔，可直接在log4j.properties更改設定，或是將此步驟所輸入的字串改為""
		all = new AllInOne("XXX/OOO");
	}
	
	public String sampleAioALL(){
		initial();
		//實體化出所需要的domain物件
		AioCheckOutALL aio = new AioCheckOutALL();
		//合作特店後台自行產生不重複的流水號，或是UUID隨機產生不重複的廠商交易編號(記得把'-'濾掉，僅接受英文字與數字)
		aio.setMerchantTradeNo("XXX");
		//合作特店後台填入會員交易時間(不一定是當下，依據需求自行判斷填入)
		aio.setMerchantTradeDate("xxxx/xx/xx xx:xx:xx");

		//建議從後端DB撈取資料填入，勿從前端輸入以免遭竄改
		aio.setTotalAmount("xx");
		aio.setTradeDesc("XX");
		aio.setItemName("XX");
		
		//可以從前端使用者填入資料
		aio.setRemark("XX");
		
		//以上資料不完全，僅供參考如何放入資料
		
		
		//呼叫AllInOne中相應的method，產生html form字串(含JavaScript Submit)之後再放入前端即可
		//此筆交易模擬不開發票，InvoiceObj請帶null
		String html = all.aioCheckOut(aio, null);
		return html;
	}
	
	public String sampleAioPeriod(){
		initial();
		//實體化出所需要的domain物件
		AioCheckOutPeriod aio = new AioCheckOutPeriod();
		//合作特店後台自行產生不重複的流水號，或是UUID隨機產生不重複的廠商交易編號(記得把'-'濾掉，僅接受英文字與數字)
		aio.setMerchantTradeNo("XXX");
		//合作特店後台填入會員交易時間(不一定是當下，依據需求自行判斷填入)
		aio.setMerchantTradeDate("xxxx/xx/xx xx:xx:xx");

		//建議從後端DB撈取資料填入，勿從前端輸入以免遭竄改
		aio.setTotalAmount("xx");
		aio.setTradeDesc("XX");
		aio.setItemName("XX");
				
		//可以從前端使用者填入資料
		aio.setRemark("XX");
		//消費者可選擇欲購買的期數(後台可能要驗證前端所帶入的是否與後端的選項相同以防舞弊)
		aio.setExecTimes("XX");
		//後端設定
		aio.setPeriodType("XX");
		aio.setFrequency("XX");
		aio.setPeriodAmount("XX");
		
		//以上資料不完全，僅供參考如何放入資料
		
		//若顧客需要電子發票
		InvoiceObj invoice = new InvoiceObj();
		//使用者填入
		invoice.setCustomerName("XX");
		invoice.setCustomerAddr("XX");
		invoice.setCustomerEmail("XX");
		invoice.setCustomerIdentifier("XX");
		
		//其餘參數都是從後端系統自動幫他設定
		invoice.setRelateNumber("XX");
		//商品資訊請勿從前端頁面取得，請透過商品ID去從後端撈取商品資訊以免遭從前方竄改
		invoice.setInvoiceItemName("XX");
		
		//呼叫AllInOne中相應的method，產生html form字串(含JavaScript Submit)之後再放入前端即可
		//此筆交易模擬開發票，請帶入InvoiceObj
		String html = all.aioCheckOut(aio, invoice);
		return html;
	}
	
	public String sampleQueryCreditCardPeriodInfo(){
		//Query的功能都類似，在此以查詢定期定額訂單來做範例
		QueryCreditCardPeriodInfoObj obj = new QueryCreditCardPeriodInfoObj();
		//只有會員交易編號要填入
		obj.setMerchantTradeNo("XX");
		String result = all.queryCreditCardPeriodInfo(obj);
		return result;
	}
	
	public String sampleCapture(){
		initial();
		//會員申請撥款/退款範例
		CaptureObj obj = new CaptureObj();
		obj.setMerchantTradeNo("XX");
		//撥款金額要小心保護
		obj.setCaptureAMT("XX");
		obj.setRemark("XX");
		String result = all.capture(obj);
		return result;
	}
	
	public String sampleDoAction(){
		//信用卡關帳、退刷、取消、放棄、 無法在Stage環境模擬
		initial();
		DoActionObj obj = new DoActionObj();
		obj.setMerchantTradeNo("XX");
		obj.setTradeNo("XX");
		//執行動作需要有權限控管
		obj.setAction("XX");
		obj.setTotalAmount("XX");
		String result = all.doAction(obj);
		return result;
	}
}
