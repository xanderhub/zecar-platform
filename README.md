# zecar-platform

Platform with common entities for zecar platform


1. Add repo:
```xml
<repositories>
	<repository>
		<id>zecar-platform-mvn-repo</id>
		<url>https://raw.github.com/myteksp/zecar-platform/mvn-repo/</url>
			<snapshots>
				<enabled>true</enabled>
				<updatePolicy>always</updatePolicy>
			</snapshots>
	</repository>
</repositories>
```

2. Include the artifact:
```xml
<dependency>
	<groupId>com.zecar.platform</groupId>
	<artifactId>platform</artifactId>
	<version>0.0.1-SNAPSHOT</version>
</dependency>
```
