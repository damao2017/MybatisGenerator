### Mybatis Ganerator使用

特点：
- 自定义commentGenerator来指定生成内容，具体查看生成的类文件
- 通过main方法执行

使用方法:

1. clone到本地，maven update
2. 配置mysql.properties里面的数据库连接信息
3. 配置GeneratrConfig.xml `<javaModelGenerator>`、`<sqlMapGenerator>`、`<javaClientGenerator>`里面的`targetPackage`和`targetProject`，配置`<table>`里面的`tableName`和`domainObjectName`
4. 打开`com.ntkd.GenerateMain`文件，运行main方法即可

目前仅测试mysql自动生成