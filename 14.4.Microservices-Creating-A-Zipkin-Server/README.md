* Create a Springboot project with no dependencies

* Add following dependencies to pom.xml

		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter</artifactId>
		</dependency>
		<dependency>
			<groupId>io.zipkin.java</groupId>
			<artifactId>zipkin-server</artifactId>
		</dependency>

		<dependency>
			<groupId>io.zipkin.java</groupId>
			<artifactId>zipkin-autoconfigure-ui</artifactId>
			<scope>runtime</scope>
		</dependency>

* Add *depedencyManagement* to the pom.xml

	<dependencyManagement>
		<dependencies>
			<dependency>
				<groupId>org.springframework.cloud</groupId>
				<artifactId>spring-cloud-dependencies</artifactId>
				<version>Camden.RELEASE</version>
				<type>pom</type>
				<scope>import</scope>
			</dependency>
		</dependencies>
	</dependencyManagement>

* Add @EnableZipkinServer annotation to the Main class

		@SpringBootApplication
		@EnableZipkinServer
		public class Application {
		public static void main(String[] args) {
			SpringApplication.run(Application.class, args);
		}
		}


* Change the server port to 8085 in application.properties file
 
* Run all services 14.1, 14.2,14.3, 14.4

* Access 14.3 service http://localhost:8083/fastpass/customer/100

* Access zipkin service http://localhost:8085 observe *dependency* link on the page

