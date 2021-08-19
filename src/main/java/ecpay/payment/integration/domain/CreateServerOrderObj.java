package ecpay.payment.integration.domain;

/**
 * ApplePay 信用卡授權作業物件
 * @author mark.chiu
 *
 */
public class CreateServerOrderObj {
	
	/**
	 * MerchantID
	 * 合作廠商編號，由綠界提供
	 */
	private String MerchantID = "";
	
	/**
	 * MerchantTradeNo
	 * 合作廠商交易序號
	 */
	private String MerchantTradeNo = "";
	
	/**
	 * MerchantTradeDate
	 * 合作廠商交易時間( yyyy/MM/dd HH:mm:ss )
	 */
	private String MerchantTradeDate = "";
	
	/**
	 * TotalAmount
	 * 交易金額，請帶整數，不可有小數點，僅限新台幣，金額不可為0元
	 */
	private String TotalAmount = "";
	
	/**
	 * CurrencyCode
	 * 幣別，Apple Server做商店驗證所傳的CurrencyCode
	 */
	private String CurrencyCode = "";
	
	/**
	 * ItemName
	 * 商品名稱，如果商品名稱有多筆時，請以井號分隔(#)
	 */
	private String ItemName = "";
	
	/**
	 * PlatformID
	 * 特約合作平台商代號
	 */
	private String PlatformID = "";
	
	/**
	 * TradeDesc
	 * 交易描述
	 */
	private String TradeDesc = "";
	
	/**
	 * TradeType
	 * 付款方式  1. In App   2. On the Web
	 */
	private String TradeType = "";
	
	/**
	 * PaymentToken
	 * 付款資料物件，Apple Server做商店驗證完回傳的Merchant Session物件中payment的JSON字串
	 */
	private String PaymentToken = "";
	
	/********************* getters and setters *********************/

	/**
	 * 取得MerchantID 合作廠商編號，由綠界提供
	 * @return MerchantID
	 */
	public String getMerchantID() {
		return MerchantID;
	}

	/**
	 * 設定MerchantID 合作廠商編號，由綠界提供
	 * @param merchantID
	 */
	public void setMerchantID(String merchantID) {
		MerchantID = merchantID;
	}

	/**
	 * 取得MerchantTradeNo 合作廠商交易序號
	 * @return MerchantTradeNo
	 */
	public String getMerchantTradeNo() {
		return MerchantTradeNo;
	}

	/**
	 * 設定MerchantTradeNo 合作廠商交易序號
	 * @param merchantTradeNo
	 */
	public void setMerchantTradeNo(String merchantTradeNo) {
		MerchantTradeNo = merchantTradeNo;
	}

	/**
	 * 取得MerchantTradeDate 合作廠商交易時間( yyyy/MM/dd HH:mm:ss )
	 * @return MerchantTradeDate
	 */
	public String getMerchantTradeDate() {
		return MerchantTradeDate;
	}

	/**
	 * 設定MerchantTradeDate 合作廠商交易時間( yyyy/MM/dd HH:mm:ss )
	 * @param merchantTradeDate
	 */
	public void setMerchantTradeDate(String merchantTradeDate) {
		MerchantTradeDate = merchantTradeDate;
	}

	/**
	 * 取得TotalAmount 交易金額，請帶整數，不可有小數點，僅限新台幣，金額不可為0元
	 * @return TotalAmount
	 */
	public String getTotalAmount() {
		return TotalAmount;
	}

	/**
	 * 設定TotalAmount 交易金額，請帶整數，不可有小數點，僅限新台幣，金額不可為0元
	 * @param totalAmount
	 */
	public void setTotalAmount(String totalAmount) {
		TotalAmount = totalAmount;
	}

	/**
	 * 取得CurrencyCode 幣別，Apple Server做商店驗證所傳的CurrencyCode
	 * @return CurrencyCode
	 */
	public String getCurrencyCode() {
		return CurrencyCode;
	}

	/**
	 * 設定CurrencyCode 幣別，Apple Server做商店驗證所傳的CurrencyCode
	 * @param currencyCode
	 */
	public void setCurrencyCode(String currencyCode) {
		CurrencyCode = currencyCode;
	}

	/**
	 * 取得ItemName 商品名稱，如果商品名稱有多筆時，請以井號分隔(#)
	 * @return ItemName
	 */
	public String getItemName() {
		return ItemName;
	}

	/**
	 * 設定ItemName 商品名稱，如果商品名稱有多筆時，請以井號分隔(#)
	 * @param itemName
	 */
	public void setItemName(String itemName) {
		ItemName = itemName;
	}

	/**
	 * 取得PlatformID 特約合作平台商代號
	 * @return PlatformID
	 */
	public String getPlatformID() {
		return PlatformID;
	}

	/**
	 * 設定PlatformID 特約合作平台商代號
	 * @param platformID
	 */
	public void setPlatformID(String platformID) {
		PlatformID = platformID;
	}

	/**
	 * 取得TradeDesc 交易描述
	 * @return TradeDesc
	 */
	public String getTradeDesc() {
		return TradeDesc;
	}

	/**
	 * 設定TradeDesc 交易描述
	 * @param tradeDesc
	 */
	public void setTradeDesc(String tradeDesc) {
		TradeDesc = tradeDesc;
	}

	/**
	 * 取得TradeType 付款方式  1. In App   2. On the Web
	 * @return TradeType
	 */
	public String getTradeType() {
		return TradeType;
	}

	/**
	 * 設定TradeType 付款方式  1. In App   2. On the Web
	 * @param tradeType
	 */
	public void setTradeType(String tradeType) {
		TradeType = tradeType;
	}

	/**
	 * 取得PaymentToken 付款資料物件，Apple Server做商店驗證完回傳的Merchant Session物件中payment的JSON字串
	 * @return PaymentToken
	 */
	public String getPaymentToken() {
		return PaymentToken;
	}

	/**
	 * 設定PaymentToken 付款資料物件，Apple Server做商店驗證完回傳的Merchant Session物件中payment的JSON字串
	 * @param paymentToken
	 */
	public void setPaymentToken(String paymentToken) {
		PaymentToken = paymentToken;
	}

	@Override
	public String toString() {
		return "CreateServerOrderObj [MerchantID=" + MerchantID + ", MerchantTradeNo=" + MerchantTradeNo
				+ ", MerchantTradeDate=" + MerchantTradeDate + ", TotalAmount=" + TotalAmount + ", CurrencyCode="
				+ CurrencyCode + ", ItemName=" + ItemName + ", PlatformID=" + PlatformID + ", TradeDesc=" + TradeDesc
				+ ", TradeType=" + TradeType + ", PaymentToken=" + PaymentToken + "]";
	}
}
