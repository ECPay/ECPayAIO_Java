package ecpay.payment.integration.domain;

/**
 * 產生網路ATM訂單物件
 * @author mark.chiu
 *
 */
public class AioCheckOutWebATM {
	
	/**
	 * MerchantID
	 * 合作特店編號(由綠界提供)
	 */
	private String MerchantID = "";
	
	/**
	 * MerchantTradeNo
	 * 合作特店交易編號(由合作特店提供)，該交易編號不可重複
	 */
	private String MerchantTradeNo = "";
	
	/**
	 * MerchantTradeDate
	 * 合作特店交易時間
	 */
	private String MerchantTradeDate = "";
	
	/**
	 * PaymentType
	 * 交易類型
	 */
	private String PaymentType = "aio";
	
	/**
	 * TotalAmount
	 * 交易金額
	 */
	private String TotalAmount = "";
	
	/**
	 * TradeDesc
	 * 交易描述
	 */
	private String TradeDesc = "";
	
	/**
	 * ItemName
	 * 商品名稱
	 */
	private String ItemName = "";
	
	/**
	 * ReturnURL
	 * 付款完成通知回傳網址
	 */
	private String ReturnURL = "";
	
	/**
	 * ChoosePayment
	 * 選擇預設付款方式
	 */
	private String ChoosePayment = "WebATM";
	
	/**
	 * ClientBackURL
	 * Client端返回合作特店系統的按鈕連結
	 */
	private String ClientBackURL = "";
	
	/**
	 * ItemURL
	 * 商品銷售網址
	 */
	private String ItemURL = "";
	
	/**
	 * Remark
	 * 備註欄位
	 */
	private String Remark = "";
	
	/**
	 * ChooseSubPayment
	 * 選擇預設付款子項目
	 */
	private String ChooseSubPayment = "";
	
	/**
	 * OrderResultURL
	 * Client端回傳付款結果網址
	 */
	private String OrderResultURL = "";
	
	/**
	 * NeedExtraPaidInfo
	 * 是否需要額外的付款資訊
	 */
	private String NeedExtraPaidInfo = "";
	
	/**
	 * DeviceSource
	 * 裝置來源
	 */
	private String DeviceSource = "";
	
	/**
	 * IgnorePayment
	 * 隱藏付款方式
	 */
	private String IgnorePayment = "";
	
	/**
	 * PlatformID
	 * 特約合作平台商代號(由綠界提供)
	 */
	private String PlatformID = "";
	
	/**
	 * InvoiceMark
	 * 電子發票開立註記
	 */
	private String InvoiceMark = "";
	
	/**
	 * EncryptType
	 * CheckMacValue加密類型
	 */
	private String EncryptType = "1";
	
	/**
	 * StoreID
	 * 合作特店商店代碼，提供合作特店填入店家代碼使用
	 */
	private String StoreID = "";
	
	/**
	 * CustomField1
	 * 自訂名稱欄位1，提供合作廠商使用記錄用客製化使用欄位
	 */
	private String CustomField1 = "";
	
	/**
	 * CustomField2
	 * 自訂名稱欄位2，提供合作廠商使用記錄用客製化使用欄位
	 */
	private String CustomField2 = "";
	
	/**
	 * CustomField3
	 * 自訂名稱欄位3，提供合作廠商使用記錄用客製化使用欄位
	 */
	private String CustomField3 = "";
	
	/**
	 * CustomField4
	 * 自訂名稱欄位4，提供合作廠商使用記錄用客製化使用欄位
	 */
	private String CustomField4 = "";
	
	/********************* getters and setters *********************/
	
	/**
	 * 取得MerchantID 合作特店編號(由綠界提供)
	 * @return MerchantID
	 */
	public String getMerchantID() {
		return MerchantID;
	}
	/**
	 * 設定MerchantID 合作特店編號(由綠界提供)
	 * @param merchantID
	 */
	public void setMerchantID(String merchantID) {
		MerchantID = merchantID;
	}
	/**
	 * 取得MerchantTradeNo 合作特店交易編號(由合作特店提供)，該交易編號不可重複
	 * @return MerchantTradeNo
	 */
	public String getMerchantTradeNo() {
		return MerchantTradeNo;
	}
	/**
	 * 設定MerchantTradeNo 合作特店交易編號(由合作特店提供)，該交易編號不可重複
	 * @param merchantTradeNo
	 */
	public void setMerchantTradeNo(String merchantTradeNo) {
		MerchantTradeNo = merchantTradeNo;
	}
	/**
	 * 取得MerchantTradeDate 合作特店交易時間
	 * @return MerchantTradeDate
	 */
	public String getMerchantTradeDate() {
		return MerchantTradeDate;
	}
	/**
	 * 設定MerchantTradeDate 合作特店交易時間，請以 yyyy/MM/dd HH:mm:ss格式帶入
	 * @param merchantTradeDate
	 */
	public void setMerchantTradeDate(String merchantTradeDate) {
		MerchantTradeDate = merchantTradeDate;
	}
	/**
	 * 取得PaymentType 交易類型
	 * @return PaymentType
	 */
	public String getPaymentType() {
		return PaymentType;
	}
	/**
	 * 設定PaymentType 交易類型
	 * @param paymentType
	 */
//	public void setPaymentType(String paymentType) {
//		PaymentType = paymentType;
//	}
	/**
	 * 取得TotalAmount 交易金額
	 * @return TotalAmount
	 */
	public String getTotalAmount() {
		return TotalAmount;
	}
	/**
	 * 設定TotalAmount 交易金額
	 * @param totalAmount
	 */
	public void setTotalAmount(String totalAmount) {
		TotalAmount = totalAmount;
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
	 * 取得ItemName 商品名稱
	 * @return ItemName
	 */
	public String getItemName() {
		return ItemName;
	}
	/**
	 * 設定ItemName 商品名稱
	 * @param itemName
	 */
	public void setItemName(String itemName) {
		ItemName = itemName;
	}
	/**
	 * 取得ReturnURL 付款完成通知回傳網址
	 * @return ReturnURL
	 */
	public String getReturnURL() {
		return ReturnURL;
	}
	/**
	 * 設定ReturnURL 付款完成通知回傳網址
	 * @param returnURL
	 */
	public void setReturnURL(String returnURL) {
		ReturnURL = returnURL;
	}
	/**
	 * 取得ChoosePayment 選擇預設付款方式
	 * @return ChoosePayment
	 */
	public String getChoosePayment() {
		return ChoosePayment;
	}
	/**
	 * 設定ChoosePayment 選擇預設付款方式
	 * @param choosePayment
	 */
//	public void setChoosePayment(String choosePayment) {
//		ChoosePayment = choosePayment;
//	}
	/**
	 * 取得ClientBackURL Client端返回合作特店系統的按鈕連結
	 * @return ClientBackURL
	 */
	public String getClientBackURL() {
		return ClientBackURL;
	}
	/**
	 * 設定ClientBackURL Client端返回合作特店系統的按鈕連結
	 * @param clientBackURL
	 */
	public void setClientBackURL(String clientBackURL) {
		ClientBackURL = clientBackURL;
	}
	/**
	 * 取得ItemURL 商品銷售網址
	 * @return ItemURL
	 */
	public String getItemURL() {
		return ItemURL;
	}
	/**
	 * 設定 ItemURL 商品銷售網址
	 * @param itemURL
	 */
	public void setItemURL(String itemURL) {
		ItemURL = itemURL;
	}
	/**
	 * 取得Remark 備註欄位
	 * @return Remark
	 */
	public String getRemark() {
		return Remark;
	}
	/**
	 * 設定Remark 備註欄位
	 * @param remark
	 */
	public void setRemark(String remark) {
		Remark = remark;
	}
	/**
	 * 取得ChooseSubPayment 選擇預設付款子項目
	 * @return ChooseSubPayment
	 */
	public String getChooseSubPayment() {
		return ChooseSubPayment;
	}
	/**
	 * 設定ChooseSubPayment 選擇預設付款子項目
	 * @param chooseSubPayment
	 */
	public void setChooseSubPayment(String chooseSubPayment) {
		ChooseSubPayment = chooseSubPayment;
	}
	/**
	 * 取得OrderResultURL Client端回傳付款結果網址
	 * @return OrderResultURL
	 */
	public String getOrderResultURL() {
		return OrderResultURL;
	}
	/**
	 * 設定OrderResultURL Client端回傳付款結果網址
	 * @param orderResultURL
	 */
	public void setOrderResultURL(String orderResultURL) {
		OrderResultURL = orderResultURL;
	}
	/**
	 * 取得NeedExtraPaidInfo 是否需要額外的付款資訊 
	 * @return NeedExtraPaidInfo
	 */
	public String getNeedExtraPaidInfo() {
		return NeedExtraPaidInfo;
	}
	/**
	 * 設定NeedExtraPaidInfo 是否需要額外的付款資訊 
	 * @param needExtraPaidInfo
	 */
	public void setNeedExtraPaidInfo(String needExtraPaidInfo) {
		NeedExtraPaidInfo = needExtraPaidInfo;
	}
	/**
	 * 取得DeviceSource 裝置來源
	 * @return DeviceSource
	 */
	public String getDeviceSource() {
		return DeviceSource;
	}
	/**
	 * 設定DeviceSource 裝置來源
	 * @param deviceSource
	 */
	public void setDeviceSource(String deviceSource) {
		DeviceSource = deviceSource;
	}
	/**
	 * 取得IgnorePayment 隱藏付款方式
	 * @return IgnorePayment
	 */
	public String getIgnorePayment() {
		return IgnorePayment;
	}
	/**
	 * 設定IgnorePayment 隱藏付款方式
	 * @param ignorePayment
	 */
	public void setIgnorePayment(String ignorePayment) {
		IgnorePayment = ignorePayment;
	}
	/**
	 * 取得PlatformID 特約合作平台商代號(由綠界提供)
	 * @return PlatformID
	 */
	public String getPlatformID() {
		return PlatformID;
	}
	/**
	 * 設定PlatformID 特約合作平台商代號(由綠界提供)
	 * @param platformID
	 */
	public void setPlatformID(String platformID) {
		PlatformID = platformID;
	}
	/**
	 * 取得InvoiceMark 電子發票開立註記
	 * @return InvoiceMark
	 */
	public String getInvoiceMark() {
		return InvoiceMark;
	}
	/**
	 * 設定InvoiceMark 電子發票開立註記
	 * @param invoiceMark
	 */
	public void setInvoiceMark(String invoiceMark) {
		InvoiceMark = invoiceMark;
	}
	/**
	 * 取得EncryptType CheckMacValue加密類型
	 * @return EncryptType
	 */
	public String getEncryptType() {
		return EncryptType;
	}
	/**
	 * 設定EncryptType CheckMacValue加密類型
	 * @param encryptType
	 */
//	public void setEncryptType(String encryptType) {
//		EncryptType = encryptType;
//	}
	/**
	 * 取得StoreID 合作特店商店代碼，提供合作特店填入店家代碼使用
	 * @return StoreID
	 */
	public String getStoreID() {
		return StoreID;
	}
	/**
	 * 設定StoreID 合作特店商店代碼，提供合作特店填入店家代碼使用
	 * @param storeID
	 */
	public void setStoreID(String storeID) {
		StoreID = storeID;
	}
	/**
	 * 取得CustomField1 自訂名稱欄位1，提供合作廠商使用記錄用客製化使用欄位
	 * @return CustomField1
	 */
	public String getCustomField1() {
		return CustomField1;
	}
	/**
	 * 設定CustomField1 自訂名稱欄位1，提供合作廠商使用記錄用客製化使用欄位
	 * @param customField1
	 */
	public void setCustomField1(String customField1) {
		CustomField1 = customField1;
	}
	/**
	 * 取得CustomField2 自訂名稱欄位2，提供合作廠商使用記錄用客製化使用欄位
	 * @return CustomField2
	 */
	public String getCustomField2() {
		return CustomField2;
	}
	/**
	 * 設定CustomField2 自訂名稱欄位2，提供合作廠商使用記錄用客製化使用欄位
	 * @param customField2
	 */
	public void setCustomField2(String customField2) {
		CustomField2 = customField2;
	}
	/**
	 * 取得CustomField3 自訂名稱欄位3，提供合作廠商使用記錄用客製化使用欄位
	 * @return CustomField3
	 */
	public String getCustomField3() {
		return CustomField3;
	}
	/**
	 * 設定CustomField3 自訂名稱欄位3，提供合作廠商使用記錄用客製化使用欄位
	 * @param customField3
	 */
	public void setCustomField3(String customField3) {
		CustomField3 = customField3;
	}
	/**
	 * 取得CustomField4 自訂名稱欄位4，提供合作廠商使用記錄用客製化使用欄位
	 * @return CustomField4
	 */
	public String getCustomField4() {
		return CustomField4;
	}
	/**
	 * 設定CustomField4 自訂名稱欄位4，提供合作廠商使用記錄用客製化使用欄位
	 * @param customField4
	 */
	public void setCustomField4(String customField4) {
		CustomField4 = customField4;
	}
	@Override
	public String toString() {
		return "AioCheckOutWebATM [MerchantID=" + MerchantID + ", MerchantTradeNo=" + MerchantTradeNo
				+ ", MerchantTradeDate=" + MerchantTradeDate + ", PaymentType=" + PaymentType + ", TotalAmount="
				+ TotalAmount + ", TradeDesc=" + TradeDesc + ", ItemName=" + ItemName + ", ReturnURL=" + ReturnURL
				+ ", ChoosePayment=" + ChoosePayment + ", ClientBackURL=" + ClientBackURL + ", ItemURL=" + ItemURL
				+ ", Remark=" + Remark + ", ChooseSubPayment=" + ChooseSubPayment + ", OrderResultURL=" + OrderResultURL
				+ ", NeedExtraPaidInfo=" + NeedExtraPaidInfo + ", DeviceSource=" + DeviceSource + ", IgnorePayment="
				+ IgnorePayment + ", PlatformID=" + PlatformID + ", InvoiceMark=" + InvoiceMark + ", EncryptType=" + EncryptType + ", StoreID=" + StoreID + ", CustomField1="
				+ CustomField1 + ", CustomField2=" + CustomField2 + ", CustomField3=" + CustomField3 + ", CustomField4="
				+ CustomField4 + "]";
	}
}
