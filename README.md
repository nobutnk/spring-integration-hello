# spring-integration-hello

# AddQueueの使い方
* MBean経由でいろいろな情報を取得するためのサンプル
* jolokia使って取得します。

## 起動方法
VM起動パラメータに以下を追加してください。HTTPでjolokiaにアクセスできるようになります。

```
-javaagent:./lib/jolokia-jvm-1.3.7-agent.jar=port=8778,host=localhost
```

## MBeanにアクセス

* 今回作成したMBeanにアクセスするには、以下で一気に全情報を取得できます。

```
http://localhost:8778/jolokia/read/com.nobutnk.springintegration.example.service.cafe:name=threadPoolMBean,type=ThreadPoolMBean/
```

* レスポンスの例

```
{"request":{"mbean":"com.nobutnk.springintegration.example.service.cafe:name=threadPoolMBean,type=ThreadPoolMBean","type":"read"},"value":{"QueueSize":0,"MaximumPoolSize":2,"CompletedTaskCount":377,"LargestPoolSize":2,"TaskCount":377,"ActiveCount":0,"CorePoolSize":2,"QueueRemainingCapacity":1000},"timestamp":1516122627,"status":200}
```