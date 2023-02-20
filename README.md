# exchange-rate

## 说明：
由于coinmarketcap关闭了他们的免费api,而统计比较公认的权威和完善的汇率数据主要来自于coinmarketcap和非小号，本程序为通过http和爬虫获取汇率数据。

获取加密货币的实时汇率,获取货币的美元、人民币和比特币等102种计价币的价格

当前版本支持非小号上交易排名前100的币种，需要拓展更多币种的价格可以修改源码中的url做翻页等方式。

- 2019-1-8 正式发布OceanBBBBbb/exchange-rate
- 2019-8-7 今日进行了更新：coinmarketcap更改了页面，修改了页面解析；非小号修改了api地址。
- 2019-12-3 更新readme,增加对外接口演示地址

## 使用方法：
下载后打包引入。
公共仓库maven:

我把这个放线上了,可以直接调用查看效果,</br>
比如查比特币的实时美元价:</br>
https://www.361shipin.com/shipin/others/rate/get?coin=BTC&currency=USD


## 代码示例：
本地调用示例.

```java
    System.out.println(getCoinPrice("BTC",Currency.EUR));// 获取综合指数价(汇率)

    System.out.println(ReptileCMC.getPriceByCMC("BTC",Currency.CNY));// 获取coinmarketcap的价(汇率)

    System.out.println(ConvertFXH.getPriceByFXH("BTC",CurrencyFXH.USD));// 获取feixiaohao的价(汇率)
```

## 问题：

1.只支持查询主流的100个币，但可以自己拓展；

2.已解决.偶尔会有    ```javax.net.ssl.SSLHandshakeException```
于是在创建client的时候，忽略了ssl认证,```SslUtil.ignoreSsl```


## api doc
https://docs.coincap.io/#0a8102a5-c338-4661-aa99-f1c57661b5b1

## 获取指定币种的价格