sandbox_jaxb_template
=====================

JAXBを使ってPOJOからshema定義を作成する遊び

## やりたいこと

JAXB APIを使ってクラスファイルからXMLスキーマを生成する

## 作成方法

出力するxsdファイルのファイル名は指定できない模様

```
# project rootディレクトリで実行
schemagen src/main/java/org/tksmaru/sandbox/jaxb/config/*.java
```
