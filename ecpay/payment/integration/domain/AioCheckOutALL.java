package ecpay.payment.integration.domain;

/**
 * �����隞�(銝���狡�撘�蝬�＊蝷�)
 * @author mark.chiu
 *
 */
public class AioCheckOutALL {
	
	/**
	 * MerchantID
	 * ���摨楊���(�蝬����)
	 */
	private String MerchantID = "";
	
	/**
	 * MerchantTradeNo
	 * ���摨漱��楊���(����摨���)嚗府鈭斗�楊����銴�
	 */
	private String MerchantTradeNo = "";
	
	/**
	 * StoreID
	 * ���摨��誨蝣潘�����摨‵�摨振隞�蝣潔蝙�
	 */
	private String StoreID = "";
	
	/**
	 * MerchantTradeDate
	 * ���摨漱�����
	 */
	private String MerchantTradeDate = "";
	
	/**
	 * PaymentType
	 * 鈭斗����
	 */
	private String PaymentType = "aio";
	
	/**
	 * TotalAmount
	 * 鈭斗�憿�
	 */
	private String TotalAmount = "";
	
	/**
	 * TradeDesc
	 * 鈭斗��膩
	 */
	private String TradeDesc = "";
	
	/**
	 * ItemName
	 * ����迂
	 */
	private String ItemName = "";
	
	/**
	 * ReturnURL
	 * 隞狡摰���蝬脣�
	 */
	private String ReturnURL = "";
	
	/**
	 * ChoosePayment
	 * ����身隞狡�撘�
	 */
	private String ChoosePayment = "ALL";
	
	/**
	 * ClientBackURL
	 * Client蝡航����摨頂蝯梁����蝯�
	 */
	private String ClientBackURL = "";
	
	/**
	 * ItemURL
	 * ����蝬脣�
	 */
	private String ItemURL = "";
	
	/**
	 * Remark
	 * �閮餅���
	 */
	private String Remark = "";
	
	/**
	 * ChooseSubPayment
	 * ����身隞狡摮�
	 */
	private String ChooseSubPayment = "";
	
	/**
	 * OrderResultURL
	 * Client蝡臬�隞狡蝯�雯��
	 */
	private String OrderResultURL = "";
	
	/**
	 * NeedExtraPaidInfo
	 * ����閬����狡鞈��
	 */
	private String NeedExtraPaidInfo = "";
	
	/**
	 * DeviceSource
	 * 鋆蔭靘��
	 */
	private String DeviceSource = "";
	
	/**
	 * IgnorePayment
	 * ����狡�撘�
	 */
	private String IgnorePayment = "";
	
	/**
	 * PlatformID
	 * �蝝��像���誨���(�蝬����)
	 */
	private String PlatformID = "";
	
	/**
	 * InvoiceMark
	 * �摮蟡券��酉閮�
	 */
	private String InvoiceMark = "";
	
	
	
	/**
	 * CustomField1
	 * �閮�迂甈��1嚗������蝙�閮�摰Ｚˊ��蝙�甈��
	 */
	private String CustomField1 = "";
	
	/**
	 * CustomField2
	 * �閮�迂甈��2嚗������蝙�閮�摰Ｚˊ��蝙�甈��
	 */
	private String CustomField2 = "";
	
	/**
	 * CustomField3
	 * �閮�迂甈��3嚗������蝙�閮�摰Ｚˊ��蝙�甈��
	 */
	private String CustomField3 = "";
	
	/**
	 * CustomField4
	 * �閮�迂甈��4嚗������蝙�閮�摰Ｚˊ��蝙�甈��
	 */
	private String CustomField4 = "";
	
	/**
	 * EncryptType
	 * CheckMacValue�撖���
	 */
	private String EncryptType = "1";
	
	/**
	 * ExpireDate
	 * �閮梁像鞎餅��予�嚗��閮剖��� 60 憭抬���1憭押�閮剖�迨�����身�3憭�
	 */
	private String ExpireDate = "";
	
	/**
	 * PaymentInfoURL
	 * Server蝡臬�隞狡������
	 */
	private String PaymentInfoURL = "";
	
	/**
	 * ClientRedirectURL
	 * Client蝡臬�隞狡������
	 */
	private String ClientRedirectURL = "";
	
	/**
	 * StoreExpireDate
	 * 頞�像鞎餅甇Ｘ���
	 */
	private String StoreExpireDate = "";
	
	/**
	 * Desc_1
	 * 鈭斗��膩1
	 */
	private String Desc_1 = "";
	
	/**
	 * Desc_2
	 * 鈭斗��膩2
	 */
	private String Desc_2 = "";
	
	/**
	 * Desc_3
	 * 鈭斗��膩3
	 */
	private String Desc_3 = "";
	
	/**
	 * Desc_4
	 * 鈭斗��膩4
	 */
	private String Desc_4 = "";
	
	/**
	 * Language
	 * 隤頂閮剖��
	 */
	private String Language = "";
	
	/**
	 * BidingCard
	 * 閮����蝙�閮靽∠� 1:雿輻  0:銝蝙�
	 */
	private String BidingCard = "";
	
	/**
	 * MerchantMemberID
	 * 閮����蝣潘����摨蝙���霅蝣潘�閮���1��������蝣潛敹‵
	 */
	private String MerchantMemberID = "";
	
	/**
	 * Redeem
	 * 靽∠���雿輻蝝��
	 */
	private String Redeem = "";
	
	/**
	 * UnionPay
	 * �������鈭斗��
	 */
	private String UnionPay = "";
	
	/**
	 * CreditInstallment
	 * ������
	 */
	private String CreditInstallment = "";
	
	/**
	 * InstallmentAmount
	 * 雿輻������蜇隞狡�憿�
	 */
	private String InstallmentAmount = "";
	
	/**
	 * PeriodAmount
	 * 瘥活���憿�
	 */
	private String PeriodAmount = "";
	
	/**
	 * PeriodType
	 * �望�車憿�
	 */
	private String PeriodType = "";
	
	/**
	 * Frequency
	 * �銵���
	 */
	private String Frequency = "";
	
	/**
	 * ExecTimes
	 * �銵活�
	 */
	private String ExecTimes = "";
	
	/**
	 * PeriodReturnURL
	 * 摰����銵���URL
	 */
	private String PeriodReturnURL = "";
	
	/********************* getters and setters *********************/
	
	/**
	 * ���erchantID ���摨楊���(�蝬����)
	 * @return MerchantID
	 */
	public String getMerchantID() {
		return MerchantID;
	}
	/**
	 * 閮剖�erchantID ���摨楊���(�蝬����)
	 * @param merchantID
	 */
	public void setMerchantID(String merchantID) {
		MerchantID = merchantID;
	}
	/**
	 * ���erchantTradeNo ���摨漱��楊���(����摨���)嚗府鈭斗�楊����銴�
	 * @return MerchantTradeNo
	 */
	public String getMerchantTradeNo() {
		return MerchantTradeNo;
	}
	/**
	 * 閮剖�erchantTradeNo ���摨漱��楊���(����摨���)嚗府鈭斗�楊����銴�
	 * @param merchantTradeNo
	 */
	public void setMerchantTradeNo(String merchantTradeNo) {
		MerchantTradeNo = merchantTradeNo;
	}
	/**
	 * ���erchantTradeDate ���摨漱�����
	 * @return MerchantTradeDate
	 */
	public String getMerchantTradeDate() {
		return MerchantTradeDate;
	}
	/**
	 * 閮剖�erchantTradeDate ���摨漱������誑 yyyy/MM/dd HH:mm:ss�撘葆�
	 * @param merchantTradeDate
	 */
	public void setMerchantTradeDate(String merchantTradeDate) {
		MerchantTradeDate = merchantTradeDate;
	}
	/**
	 * ���aymentType 鈭斗����
	 * @return PaymentType
	 */
	public String getPaymentType() {
		return PaymentType;
	}
	/**
	 * 閮剖�aymentType �������狡�撘�
	 * @param paymentType
	 */
//	public void setPaymentType(String paymentType) {
//		PaymentType = paymentType;
//	}
	/**
	 * ���otalAmount 鈭斗�憿�
	 * @return TotalAmount
	 */
	public String getTotalAmount() {
		return TotalAmount;
	}
	/**
	 * 閮剖�otalAmount 鈭斗�憿�
	 * @param totalAmount
	 */
	public void setTotalAmount(String totalAmount) {
		TotalAmount = totalAmount;
	}
	/**
	 * ���radeDesc 鈭斗��膩
	 * @return TradeDesc
	 */
	public String getTradeDesc() {
		return TradeDesc;
	}
	/**
	 * 閮剖�radeDesc 鈭斗��膩
	 * @param tradeDesc
	 */
	public void setTradeDesc(String tradeDesc) {
		TradeDesc = tradeDesc;
	}
	/**
	 * ���temName ����迂
	 * @return ItemName
	 */
	public String getItemName() {
		return ItemName;
	}
	/**
	 * 閮剖�temName ����迂
	 * @param itemName
	 */
	public void setItemName(String itemName) {
		ItemName = itemName;
	}
	/**
	 * ���eturnURL 隞狡摰���蝬脣�
	 * @return ReturnURL
	 */
	public String getReturnURL() {
		return ReturnURL;
	}
	/**
	 * 閮剖�eturnURL 隞狡摰���蝬脣�
	 * @param returnURL
	 */
	public void setReturnURL(String returnURL) {
		ReturnURL = returnURL;
	}
	/**
	 * ���hoosePayment ����身隞狡�撘�
	 * @return ChoosePayment
	 */
	public String getChoosePayment() {
		return ChoosePayment;
	}
	/**
	 * 閮剖�hoosePayment ����身隞狡�撘�
	 * @param choosePayment
	 */
//	public void setChoosePayment(String choosePayment) {
//		ChoosePayment = choosePayment;
//	}
	/**
	 * ���lientBackURL Client蝡航����摨頂蝯梁����蝯�
	 * @return ClientBackURL
	 */
	public String getClientBackURL() {
		return ClientBackURL;
	}
	/**
	 * 閮剖�lientBackURL Client蝡航����摨頂蝯梁����蝯�
	 * @param clientBackURL
	 */
	public void setClientBackURL(String clientBackURL) {
		ClientBackURL = clientBackURL;
	}
	/**
	 * ���temURL ����蝬脣�
	 * @return ItemURL
	 */
	public String getItemURL() {
		return ItemURL;
	}
	/**
	 * 閮剖�� ItemURL ����蝬脣�
	 * @param itemURL
	 */
	public void setItemURL(String itemURL) {
		ItemURL = itemURL;
	}
	/**
	 * ���emark �閮餅���
	 * @return Remark
	 */
	public String getRemark() {
		return Remark;
	}
	/**
	 * 閮剖�emark �閮餅���
	 * @param remark
	 */
	public void setRemark(String remark) {
		Remark = remark;
	}
	/**
	 * ���hooseSubPayment ����身隞狡摮�
	 * @return ChooseSubPayment
	 */
	public String getChooseSubPayment() {
		return ChooseSubPayment;
	}
	/**
	 * 閮剖�hooseSubPayment ����身隞狡摮�
	 * @param chooseSubPayment
	 */
	public void setChooseSubPayment(String chooseSubPayment) {
		ChooseSubPayment = chooseSubPayment;
	}
	/**
	 * ���rderResultURL Client蝡臬�隞狡蝯�雯��
	 * @return OrderResultURL
	 */
	public String getOrderResultURL() {
		return OrderResultURL;
	}
	/**
	 * 閮剖�rderResultURL Client蝡臬�隞狡蝯�雯��
	 * @param orderResultURL
	 */
	public void setOrderResultURL(String orderResultURL) {
		OrderResultURL = orderResultURL;
	}
	/**
	 * ���eedExtraPaidInfo ����閬����狡鞈�� 
	 * @return NeedExtraPaidInfo
	 */
	public String getNeedExtraPaidInfo() {
		return NeedExtraPaidInfo;
	}
	/**
	 * 閮剖�eedExtraPaidInfo ����閬����狡鞈�� 
	 * @param needExtraPaidInfo
	 */
	public void setNeedExtraPaidInfo(String needExtraPaidInfo) {
		NeedExtraPaidInfo = needExtraPaidInfo;
	}
	/**
	 * ���eviceSource 鋆蔭靘��
	 * @return DeviceSource
	 */
	public String getDeviceSource() {
		return DeviceSource;
	}
	/**
	 * 閮剖�eviceSource 鋆蔭靘��
	 * @param deviceSource
	 */
	public void setDeviceSource(String deviceSource) {
		DeviceSource = deviceSource;
	}
	/**
	 * ���gnorePayment ����狡�撘�
	 * @return IgnorePayment
	 */
	public String getIgnorePayment() {
		return IgnorePayment;
	}
	/**
	 * 閮剖�gnorePayment ����狡�撘�
	 * @param ignorePayment
	 */
	public void setIgnorePayment(String ignorePayment) {
		IgnorePayment = ignorePayment;
	}
	/**
	 * ���latformID �蝝��像���誨���(�蝬����)
	 * @return PlatformID
	 */
	public String getPlatformID() {
		return PlatformID;
	}
	/**
	 * 閮剖�latformID �蝝��像���誨���(�蝬����)
	 * @param platformID
	 */
	public void setPlatformID(String platformID) {
		PlatformID = platformID;
	}
	/**
	 * ���nvoiceMark �摮蟡券��酉閮�
	 * @return InvoiceMark
	 */
	public String getInvoiceMark() {
		return InvoiceMark;
	}
	/**
	 * 閮剖�nvoiceMark �摮蟡券��酉閮�
	 * @param invoiceMark
	 */
	public void setInvoiceMark(String invoiceMark) {
		InvoiceMark = invoiceMark;
	}
	

	/**
	 * ���ncryptType CheckMacValue�撖���
	 * @return EncryptType
	 */
	public String getEncryptType() {
		return EncryptType;
	}
	/**
	 * 閮剖�ncryptType CheckMacValue�撖���
	 * @param encryptType
	 */
//	public void setEncryptType(String encryptType) {
//		EncryptType = encryptType;
//	}
	/**
	 * ���xpireDate �閮梁像鞎餅��予�嚗��閮剖��� 60 憭抬���1憭押�閮剖�迨�����身�3憭�
	 * @return ExpireDate
	 */
	public String getExpireDate() {
		return ExpireDate;
	}
	/**
	 * 閮剖�xpireDate �閮梁像鞎餅��予�嚗��閮剖��� 60 憭抬���1憭押�閮剖�迨�����身�3憭�
	 * @param expireDate
	 */
	public void setExpireDate(String expireDate) {
		ExpireDate = expireDate;
	}
	/**
	 * ���aymentInfoURL Server蝡臬�隞狡������
	 * @return PaymentInfoURL
	 */
	public String getPaymentInfoURL() {
		return PaymentInfoURL;
	}
	/**
	 * 閮剖�aymentInfoURL Server蝡臬�隞狡������
	 * @param paymentInfoURL
	 */
	public void setPaymentInfoURL(String paymentInfoURL) {
		PaymentInfoURL = paymentInfoURL;
	}
	/**
	 * ���lientRedirectURL Client蝡臬�隞狡������
	 * @return ClientRedirectURL
	 */
	public String getClientRedirectURL() {
		return ClientRedirectURL;
	}
	/**
	 * 閮剖�lientRedirectURL Client蝡臬�隞狡������
	 * @param clientRedirectURL
	 */
	public void setClientRedirectURL(String clientRedirectURL) {
		ClientRedirectURL = clientRedirectURL;
	}
	/**
	 * ���toreExpireDate 頞�像鞎餅甇Ｘ���
	 * @return StoreExpireDate
	 */
	public String getStoreExpireDate() {
		return StoreExpireDate;
	}
	/**
	 * 閮剖�toreExpireDate 頞�像鞎餅甇Ｘ���
	 * @param storeExpireDate
	 */
	public void setStoreExpireDate(String storeExpireDate) {
		StoreExpireDate = storeExpireDate;
	}
	/**
	 * ���esc_1 鈭斗��膩1
	 * @return Desc_1
	 */
	public String getDesc_1() {
		return Desc_1;
	}
	/**
	 * 閮剖�esc_1 鈭斗��膩1
	 * @param desc_1
	 */
	public void setDesc_1(String desc_1) {
		Desc_1 = desc_1;
	}
	/**
	 * ���esc_2 鈭斗��膩2
	 * @return Desc_2
	 */
	public String getDesc_2() {
		return Desc_2;
	}
	/**
	 * 閮剖�esc_2 鈭斗��膩2
	 * @param desc_2
	 */
	public void setDesc_2(String desc_2) {
		Desc_2 = desc_2;
	}
	/**
	 * ���esc_3 鈭斗��膩3
	 * @return Desc_3
	 */
	public String getDesc_3() {
		return Desc_3;
	}
	/**
	 * 閮剖�esc_3 鈭斗��膩3
	 * @param desc_3
	 */
	public void setDesc_3(String desc_3) {
		Desc_3 = desc_3;
	}
	/**
	 * ���esc_4 鈭斗��膩4
	 * @return Desc_4
	 */
	public String getDesc_4() {
		return Desc_4;
	}
	/**
	 * 閮剖�esc_4 鈭斗��膩4
	 * @param desc_4
	 */
	public void setDesc_4(String desc_4) {
		Desc_4 = desc_4;
	}
	/**
	 * ���anguage 隤頂閮剖��
	 * @return Language
	 */
	public String getLanguage() {
		return Language;
	}
	/**
	 * 閮剖�anguage 隤頂閮剖��
	 * @param language
	 */
	public void setLanguage(String language) {
		Language = language;
	}
	/**
	 * ���edeem 靽∠���雿輻蝝��
	 * @return Redeem
	 */
	public String getRedeem() {
		return Redeem;
	}
	/**
	 * 閮剖�edeem 靽∠���雿輻蝝��
	 * @param redeem
	 */
	public void setRedeem(String redeem) {
		Redeem = redeem;
	}
	/**
	 * ���nionPay �������鈭斗��
	 * @return UnionPay
	 */
	public String getUnionPay() {
		return UnionPay;
	}
	/**
	 * 閮剖�nionPay �������鈭斗��
	 * @param unionPay
	 */
	public void setUnionPay(String unionPay) {
		UnionPay = unionPay;
	}
	/**
	 * ���reditInstallment ������
	 * @return CreditInstallment
	 */
	public String getCreditInstallment() {
		return CreditInstallment;
	}
	/**
	 * 閮剖�reditInstallment ������
	 * @param creditInstallment
	 */
	public void setCreditInstallment(String creditInstallment) {
		CreditInstallment = creditInstallment;
	}
	/**
	 * ���nstallmentAmount 雿輻������蜇隞狡�憿�
	 * @return InstallmentAmount
	 */
	public String getInstallmentAmount() {
		return InstallmentAmount;
	}
	/**
	 * 閮剖�nstallmentAmount 雿輻������蜇隞狡�憿�
	 * @param installmentAmount
	 */
	public void setInstallmentAmount(String installmentAmount) {
		InstallmentAmount = installmentAmount;
	}
	/**
	 * ���eriodAmount 瘥活���憿�
	 * @return PeriodAmount
	 */
	public String getPeriodAmount() {
		return PeriodAmount;
	}
	/**
	 * 閮剖�eriodAmount 瘥活���憿�
	 * @param periodAmount
	 */
	public void setPeriodAmount(String periodAmount) {
		PeriodAmount = periodAmount;
	}
	/**
	 * ���eriodType �望�車憿�
	 * @return PeriodType
	 */
	public String getPeriodType() {
		return PeriodType;
	}
	/**
	 * 閮剖�eriodType �望�車憿�
	 * @param periodType
	 */
	public void setPeriodType(String periodType) {
		PeriodType = periodType;
	}
	/**
	 * ���requency �銵���
	 * @return Frequency
	 */
	public String getFrequency() {
		return Frequency;
	}
	/**
	 * 閮剖�requency �銵���
	 * @param frequency
	 */
	public void setFrequency(String frequency) {
		Frequency = frequency;
	}
	/**
	 * ���xecTimes �銵活�
	 * @return ExecTimes
	 */
	public String getExecTimes() {
		return ExecTimes;
	}
	/**
	 * 閮剖�xecTimes �銵活�
	 * @param execTimes
	 */
	public void setExecTimes(String execTimes) {
		ExecTimes = execTimes;
	}
	/**
	 * ���eriodReturnURL 摰����銵���URL
	 * @return PeriodReturnURL
	 */
	public String getPeriodReturnURL() {
		return PeriodReturnURL;
	}
	/**
	 * 閮剖�eriodReturnURL 摰����銵���URL
	 * @param periodReturnURL
	 */
	public void setPeriodReturnURL(String periodReturnURL) {
		PeriodReturnURL = periodReturnURL;
	}
	/**
	 * ���toreID ���摨��誨蝣潘�����摨‵�摨振隞�蝣潔蝙�
	 * @return StoreID
	 */
	public String getStoreID() {
		return StoreID;
	}
	/**
	 * 閮剖�toreID ���摨��誨蝣潘�����摨‵�摨振隞�蝣潔蝙�
	 * @param storeID
	 */
	public void setStoreID(String storeID) {
		StoreID = storeID;
	}
	/**
	 * ���ustomField1 �閮�迂甈��1嚗������蝙�閮�摰Ｚˊ��蝙�甈��
	 * @return CustomField1
	 */
	public String getCustomField1() {
		return CustomField1;
	}
	/**
	 * 閮剖�ustomField1 �閮�迂甈��1嚗������蝙�閮�摰Ｚˊ��蝙�甈��
	 * @param customField1
	 */
	public void setCustomField1(String customField1) {
		CustomField1 = customField1;
	}
	/**
	 * ���ustomField2 �閮�迂甈��2嚗������蝙�閮�摰Ｚˊ��蝙�甈��
	 * @return CustomField2
	 */
	public String getCustomField2() {
		return CustomField2;
	}
	/**
	 * 閮剖�ustomField2 �閮�迂甈��2嚗������蝙�閮�摰Ｚˊ��蝙�甈��
	 * @param customField2
	 */
	public void setCustomField2(String customField2) {
		CustomField2 = customField2;
	}
	/**
	 * ���ustomField3 �閮�迂甈��3嚗������蝙�閮�摰Ｚˊ��蝙�甈��
	 * @return CustomField3
	 */
	public String getCustomField3() {
		return CustomField3;
	}
	/**
	 * 閮剖�ustomField3 �閮�迂甈��3嚗������蝙�閮�摰Ｚˊ��蝙�甈��
	 * @param customField3
	 */
	public void setCustomField3(String customField3) {
		CustomField3 = customField3;
	}
	/**
	 * ���ustomField4 �閮�迂甈��4嚗������蝙�閮�摰Ｚˊ��蝙�甈��
	 * @return CustomField4
	 */
	public String getCustomField4() {
		return CustomField4;
	}
	/**
	 * 閮剖�ustomField4 �閮�迂甈��4嚗������蝙�閮�摰Ｚˊ��蝙�甈��
	 * @param customField4
	 */
	public void setCustomField4(String customField4) {
		CustomField4 = customField4;
	}
	/**
	 * ���idingCard 閮����蝙�閮靽∠� 1:雿輻  0:銝蝙�
	 * @return BidingCard
	 */
	public String getBidingCard() {
		return BidingCard;
	}
	/**
	 * 閮剖�idingCard 閮����蝙�閮靽∠� 1:雿輻  0:銝蝙�
	 * @param bidingCard
	 */
	public void setBidingCard(String bidingCard) {
		BidingCard = bidingCard;
	}
	/**
	 * ���erchantMemberID 閮����蝣潘����摨蝙���霅蝣潘�閮���1��������蝣潛敹‵
	 * @return MerchantMemberID
	 */
	public String getMerchantMemberID() {
		return MerchantMemberID;
	}
	/**
	 * 閮剖�erchantMemberID 閮����蝣潘����摨蝙���霅蝣潘�閮���1��������蝣潛敹‵
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
				+ InvoiceMark +  ", CustomField1=" + CustomField1 + ", CustomField2="
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
