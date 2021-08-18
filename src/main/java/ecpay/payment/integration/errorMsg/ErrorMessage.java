package ecpay.payment.integration.errorMsg;

public class ErrorMessage {
	public final static String CHECK_MAC_VALUE_NOT_EQUALL_ERROR = "檢查碼驗證錯誤!";
	
	public final static String NO_SUCH_METHOD_EXCEPTION = "找不到此方法可呼叫!";
	
	public final static String MInfo_NOT_SETTING = "未設定相應基本資料導致無法取得MerchantID, HashKey, HashIV!";
	
	public final static String MInfo_UNDIFINED_TAG = "payment_conf設定擋MInfo放入未定義的參數";
	
	public final static String OperatingMode_ERROR = "payment_conf設定擋OperatingMode設定錯誤";
	
	public final static String COLUMN_RULE_ERROR = "填入非法值，請參閱文件規範";
	
	public final static String CANNOT_BE_EMPTY = "不能為空";
	
	public final static String HASHTABLE_WITHOUT_CHKMACVALUE = "此Hashtable並沒有CheckMacValue可比較";
	
	public final static String JSON_FORMAT_ERROR = "JSON格式錯誤導致放入JSONObject錯誤";
	
	public final static String GEN_CHECK_MAC_VALUE_FAIL = "產生檢查碼失敗";
	
	public final static String OBJ_MISSING_FIELD = "物件缺少屬性";
	
	public final static String CONF_FILE_ERROR = "設定檔格式錯誤!";
	
	public final static String POST_ERROR = "POST失敗";
	
	public final static String UNDIFINED_OBJECT = "傳入非定義的物件導致錯誤!";
	
	public final static String CVS_TOTALAMT_ERROR = "金額必須介於27至2000之間";
}