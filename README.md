# 綠界 全方位(All In One)金流介接Java版
---

## 1. 介紹
  - 綠界對於有收款需求的會員，提供完整的交易介接API，並有多種收款方式(All In One)可選擇使用。 本套件為Java版，可使用作建立訂單，接受付款通知，查詢訂單等金流交易的應用。
  - 收款方式清單：
    - 信用卡(一次付清、分期付款、定期定額)
    - 網路ATM
    - ATM櫃員機
    - 超商代碼
    - Apple Pay
    - Google Pay (須特別申請才能使用)(原Android Pay)


## 2. 安裝環境
  - _jdk 1.6以上_
  - SDK元件限制在伺服器上使用，嚴禁使用於手機環境，已避免商家金鑰資訊外流
 

## 3. 使用教學
  - 使用者文件放置於Doc資料夾內，可供參閱
  - 範例放在example資料夾，可供參閱
  - JavaDoc 在建置完成後將出現在target資料夾 (ECPayAIO_Java-<version>-javadoc.jar)，解除壓縮後並打開index.html，就會有完整的JavaDoc (Parameters, Examples WIP)


## 4. Maven 使用
目前並未放在任何Maven Repository，必須自行建置，其指令如下，這將會建置並安裝到你的Local Maven Repository (~/.m2/repository) (照理來說能夠在Windows, MacOS和Linux運作，但是需要安裝Git和Maven):
```shell
git clone https://github.com/ECPay/ECPayAIO_Java.git
cd ECPayAIO_Java
mvn clean package install
```
使用方法: <br>
```xml
<dependencies>
    <dependency>
        <groupId>tw.com.ecpay</groupId>
        <artifactId>ECPayAIO_Java</artifactId>
        <version>版本 (請見pom.xml)</version>
        <scope>compile</scope>
<!--        可以改成其他的Scope，這裡只是範例-->
    </dependency>
</dependencies>
```


## 5. 聯絡我們
  - 綠界技術服務工程師信箱: techsupport@ecpay.com.tw
  