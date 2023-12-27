# Install custom build artifacts to cloudsmith

* create ~/.m2/settings.xml
```
<settings xmlns="http://maven.apache.org/SETTINGS/1.0.0"
xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
xsi:schemaLocation="http://maven.apache.org/SETTINGS/1.0.0
https://maven.apache.org/xsd/settings-1.0.0.xsd">
<servers>
<server>
<id>cloudsmith</id>
<username>???</username>
<password>???</password>
</server>
</servers>
</settings>
```

From `flink-sql-connector-mysql-cdc` and `flink-sql-connector-mysql-vitess` do:

* ```mvn deploy:deploy-file -DrepositoryId=cloudsmith```
