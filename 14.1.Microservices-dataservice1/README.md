* import *dataservice1* project from *D:\sagar\Micro Services\5-exercise-files\before* folder
* Add spring-cloud-starter-sleuth dependency


	<dependency>
	    <groupId>org.springframework.cloud</groupId>
	    <artifactId>spring-cloud-starter-sleuth</artifactId>
	    <version>1.0.9.RELEASE</version>
	</dependency>

* Add following code to application.properties file

	spring.application.name=ContactDetails
	logging.level.org.springframework.cloud.org.springframework.cloud.sleuth=DEBUG

* Add zipkin dependency

		<dependency>
			<groupId>org.springframework.cloud</groupId>
			<artifactId>spring-cloud-starter-zipkin</artifactId>
			<version>1.0.9.RELEASE</version>
		</dependency>

* Add following code to application.properties

	spring.zipkin.base-url=http://localhost:8085
	spring.sleuth.sampler.percentage=1.0

