package ecpay.payment.integration.domain;

/**
 * 產生訂單物件(不指定付款方式，由綠界顯示)
 * @author mark.chiu
 *
 */
public class AioCheckOutALL {
	
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
	 * StoreID
	 * 合作特店商店代碼，提供合作特店填入店家代碼使用
	 */
	private String StoreID = "";
	
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
	private String ChoosePayment = "ALL";
	
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
	
	/**
	 * EncryptType
	 * CheckMacValue加密類型
	 */
	private String EncryptType = "1";
	
	/**
	 * ExpireDate
	 * 允許繳費有效天數，若需設定最長 60 天，最短1天。未設定此參數則預設為3天
	 */
	private String ExpireDate = "";
	
	/**
	 * PaymentInfoURL
	 * Server端回傳付款相關資訊
	 */
	private String PaymentInfoURL = "";
	
	/**
	 * ClientRedirectURL
	 * Client端回傳付款相關資訊
	 */
	private String ClientRedirectURL = "";
	
	/**
	 * StoreExpireDate
	 * 超商繳費截止時間
	 */
	private String StoreExpireDate = "";
	
	/**
	 * Desc_1
	 * 交易描述1
	 */
	private String Desc_1 = "";
	
	/**
	 * Desc_2
	 * 交易描述2
	 */
	private String Desc_2 = "";
	
	/**
	 * Desc_3
	 * 交易描述3
	 */
	private String Desc_3 = "";
	
	/**
	 * Desc_4
	 * 交易描述4
	 */
	private String Desc_4 = "";
	
	/**
	 * Language
	 * 語系設定
	 */
	private String Language = "";
	
	/**
	 * BidingCard
	 * 記憶卡號，使用記憶信用卡 1:使用  0:不使用
	 */
	private String BidingCard = "";
	
	/**
	 * MerchantMemberID
	 * 記憶卡號識別碼，為合作特店使的會員識別碼，若記憶卡號為1時，記憶卡號識別碼為必填
	 */
	private String MerchantMemberID = "";
	
	/**
	 * Redeem
	 * 信用卡是否使用紅利折抵
	 */
	private String Redeem = "";
	
	/**
	 * UnionPay
	 * 是否為銀聯卡交易
	 */
	private String UnionPay = "";
	
	/**
	 * CreditInstallment
	 * 刷卡分期期數
	 */
	private String CreditInstallment = "";
	
	/**
	 * InstallmentAmount
	 * 使用刷卡分期的總付款金額
	 */
	private String InstallmentAmount = "";
	
	/**
	 * PeriodAmount
	 * 每次授權金額
	 */
	private String PeriodAmount = "";
	
	/**
	 * PeriodType
	 * 週期種類
	 */
	private String PeriodType = "";
	
	/**
	 * Frequency
	 * 執行頻率
	 */
	private String Frequency = "";
	
	/**
	 * ExecTimes
	 * 執行次數
	 */
	private String ExecTimes = "";
	
	/**
	 * PeriodReturnURL
	 * 定期定額的執行結果回應URL
	 */
	private String PeriodReturnURL = "";
	
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
	 * 設定PaymentType 會員選擇的付款方式
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
	 * 取得ExpireDate 允許繳費有效天數，若需設定最長 60 天，最短1天。未設定此參數則預設為3天
	 * @return ExpireDate
	 */
	public String getExpireDate() {
		return ExpireDate;
	}
	/**
	 * 設定ExpireDate 允許繳費有效天數，若需設定最長 60 天，最短1天。未設定此參數則預設為3天
	 * @param expireDate
	 */
	public void setExpireDate(String expireDate) {
		ExpireDate = expireDate;
	}
	/**
	 * 取得PaymentInfoURL Server端回傳付款相關資訊
	 * @return PaymentInfoURL
	 */
	public String getPaymentInfoURL() {
		return PaymentInfoURL;
	}
	/**
	 * 設定PaymentInfoURL Server端回傳付款相關資訊
	 * @param paymentInfoURL
	 */
	public void setPaymentInfoURL(String paymentInfoURL) {
		PaymentInfoURL = paymentInfoURL;
	}
	/**
	 * 取得ClientRedirectURL Client端回傳付款相關資訊
	 * @return ClientRedirectURL
	 */
	public String getClientRedirectURL() {
		return ClientRedirectURL;
	}
	/**
	 * 設定ClientRedirectURL Client端回傳付款相關資訊
	 * @param clientRedirectURL
	 */
	public void setClientRedirectURL(String clientRedirectURL) {
		ClientRedirectURL = clientRedirectURL;
	}
	/**
	 * 取得StoreExpireDate 超商繳費截止時間
	 * @return StoreExpireDate
	 */
	public String getStoreExpireDate() {
		return StoreExpireDate;
	}
	/**
	 * 設定StoreExpireDate 超商繳費截止時間
	 * @param storeExpireDate
	 */
	public void setStoreExpireDate(String storeExpireDate) {
		StoreExpireDate = storeExpireDate;
	}
	/**
	 * 取得Desc_1 交易描述1
	 * @return Desc_1
	 */
	public String getDesc_1() {
		return Desc_1;
	}
	/**
	 * 設定Desc_1 交易描述1
	 * @param desc_1
	 */
	public void setDesc_1(String desc_1) {
		Desc_1 = desc_1;
	}
	/**
	 * 取得Desc_2 交易描述2
	 * @return Desc_2
	 */
	public String getDesc_2() {
		return Desc_2;
	}
	/**
	 * 設定Desc_2 交易描述2
	 * @param desc_2
	 */
	public void setDesc_2(String desc_2) {
		Desc_2 = desc_2;
	}
	/**
	 * 取得Desc_3 交易描述3
	 * @return Desc_3
	 */
	public String getDesc_3() {
		return Desc_3;
	}
	/**
	 * 設定Desc_3 交易描述3
	 * @param desc_3
	 */
	public void setDesc_3(String desc_3) {
		Desc_3 = desc_3;
	}
	/**
	 * 取得Desc_4 交易描述4
	 * @return Desc_4
	 */
	public String getDesc_4() {
		return Desc_4;
	}
	/**
	 * 設定Desc_4 交易描述4
	 * @param desc_4
	 */
	public void setDesc_4(String desc_4) {
		Desc_4 = desc_4;
	}
	/**
	 * 取得Language 語系設定
	 * @return Language
	 */
	public String getLanguage() {
		return Language;
	}
	/**
	 * 設定Language 語系設定
	 * @param language
	 */
	public void setLanguage(String language) {
		Language = language;
	}
	/**
	 * 取得Redeem 信用卡是否使用紅利折抵
	 * @return Redeem
	 */
	public String getRedeem() {
		return Redeem;
	}
	/**
	 * 設定Redeem 信用卡是否使用紅利折抵
	 * @param redeem
	 */
	public void setRedeem(String redeem) {
		Redeem = redeem;
	}
	/**
	 * 取得UnionPay 是否為銀聯卡交易
	 * @return UnionPay
	 */
	public String getUnionPay() {
		return UnionPay;
	}
	/**
	 * 設定UnionPay 是否為銀聯卡交易
	 * @param unionPay
	 */
	public void setUnionPay(String unionPay) {
		UnionPay = unionPay;
	}
	/**
	 * 取得CreditInstallment 刷卡分期期數
	 * @return CreditInstallment
	 */
	public String getCreditInstallment() {
		return CreditInstallment;
	}
	/**
	 * 設定CreditInstallment 刷卡分期期數
	 * @param creditInstallment
	 */
	public void setCreditInstallment(String creditInstallment) {
		CreditInstallment = creditInstallment;
	}
	/**
	 * 取得InstallmentAmount 使用刷卡分期的總付款金額
	 * @return InstallmentAmount
	 */
	public String getInstallmentAmount() {
		return InstallmentAmount;
	}
	/**
	 * 設定InstallmentAmount 使用刷卡分期的總付款金額
	 * @param installmentAmount
	 */
	public void setInstallmentAmount(String installmentAmount) {
		InstallmentAmount = installmentAmount;
	}
	/**
	 * 取得PeriodAmount 每次授權金額
	 * @return PeriodAmount
	 */
	public String getPeriodAmount() {
		return PeriodAmount;
	}
	/**
	 * 設定PeriodAmount 每次授權金額
	 * @param periodAmount
	 */
	public void setPeriodAmount(String periodAmount) {
		PeriodAmount = periodAmount;
	}
	/**
	 * 取得PeriodType 週期種類
	 * @return PeriodType
	 */
	public String getPeriodType() {
		return PeriodType;
	}
	/**
	 * 設定PeriodType 週期種類
	 * @param periodType
	 */
	public void setPeriodType(String periodType) {
		PeriodType = periodType;
	}
	/**
	 * 取得Frequency 執行頻率
	 * @return Frequency
	 */
	public String getFrequency() {
		return Frequency;
	}
	/**
	 * 設定Frequency 執行頻率
	 * @param frequency
	 */
	public void setFrequency(String frequency) {
		Frequency = frequency;
	}
	/**
	 * 取得ExecTimes 執行次數
	 * @return ExecTimes
	 */
	public String getExecTimes() {
		return ExecTimes;
	}
	/**
	 * 設定ExecTimes 執行次數
	 * @param execTimes
	 */
	public void setExecTimes(String execTimes) {
		ExecTimes = execTimes;
	}
	/**
	 * 取得PeriodReturnURL 定期定額的執行結果回應URL
	 * @return PeriodReturnURL
	 */
	public String getPeriodReturnURL() {
		return PeriodReturnURL;
	}
	/**
	 * 設定PeriodReturnURL 定期定額的執行結果回應URL
	 * @param periodReturnURL
	 */
	public void setPeriodReturnURL(String periodReturnURL) {
		PeriodReturnURL = periodReturnURL;
	}
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
	/**
	 * 取得BidingCard 記憶卡號，使用記憶信用卡 1:使用  0:不使用
	 * @return BidingCard
	 */
	public String getBidingCard() {
		return BidingCard;
	}
	/**
	 * 設定BidingCard 記憶卡號，使用記憶信用卡 1:使用  0:不使用
	 * @param bidingCard
	 */
	public void setBidingCard(String bidingCard) {
		BidingCard = bidingCard;
	}
	/**
	 * 取得MerchantMemberID 記憶卡號識別碼，為合作特店使的會員識別碼，若記憶卡號為1時，記憶卡號識別碼為必填
	 * @return MerchantMemberID
	 */
	public String getMerchantMemberID() {
		return MerchantMemberID;
	}
	/**
	 * 設定MerchantMemberID 記憶卡號識別碼，為合作特店使的會員識別碼，若記憶卡號為1時，記憶卡號識別碼為必填
	 * @param merchantMemberID
	 */
	public void setMerchantMemberID(String merchantMemberID) {
		MerchantMemberID = merchantMemberID;
	}
	@Override
	public String toString() {
		return "AioCheckOutALL [MerchantID=" + MerchantID + ", MerchantTradeNo=" + MerchantTradeNo + ", StoreID="
				+ StoreID + ", MerchantTradeDate=" + MerchantTradeDate + ", PaymentType=" + PaymentType
				+ ", TotalAmount=" + TotalAmount + ", TradeDesc=" + TradeDesc + ", ItemName=" + ItemName
				+ ", ReturnURL=" + ReturnURL + ", ChoosePayment=" + ChoosePayment + ", ClientBackURL=" + ClientBackURL
				+ ", ItemURL=" + ItemURL + ", Remark=" + Remark + ", ChooseSubPayment=" + ChooseSubPayment
				+ ", OrderResultURL=" + OrderResultURL + ", NeedExtraPaidInfo=" + NeedExtraPaidInfo + ", DeviceSource="
				+ DeviceSource + ", IgnorePayment=" + IgnorePayment + ", PlatformID=" + PlatformID + ", InvoiceMark="
				+ InvoiceMark + ", CustomField1=" + CustomField1 + ", CustomField2="
				+ CustomField2 + ", CustomField3=" + CustomField3 + ", CustomField4=" + CustomField4 + ", EncryptType="
				+ EncryptType + ", ExpireDate=" + ExpireDate + ", PaymentInfoURL=" + PaymentInfoURL
				+ ", ClientRedirectURL=" + ClientRedirectURL + ", StoreExpireDate=" + StoreExpireDate + ", Desc_1="
				+ Desc_1 + ", Desc_2=" + Desc_2 + ", Desc_3=" + Desc_3 + ", Desc_4=" + Desc_4 + ", Language=" + Language
				+ ", BidingCard=" + BidingCard + ", MerchantMemberID=" + MerchantMemberID + ", Redeem=" + Redeem
				+ ", UnionPay=" + UnionPay + ", CreditInstallment=" + CreditInstallment + ", InstallmentAmount="
				+ InstallmentAmount + ", PeriodAmount=" + PeriodAmount + ", PeriodType=" + PeriodType + ", Frequency="
				+ Frequency + ", ExecTimes=" + ExecTimes + ", PeriodReturnURL=" + PeriodReturnURL + "]";
	}
}
