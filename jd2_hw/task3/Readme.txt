mvn archetype:generate
maven-archetype-quickstart

// создание java-проекта
groupId: jd2.jd2_hw
artifactId task3
version: 1.0-SNAPSHOT
package: jd2.jd2_hw

// установка артефакта в локальный репозиторий
mvn clean install

// переопределение созданного java-проекта на родительский. 
// изменить расширение пакета на pom добавив строчку в pom.xml
<packaging>pom</packaging

// создание java модуля 
maven-archetype-quickstart
groupId: jd2.jd2_hw.task3
artifactId: moduleJar
version: 1.0-SNAPSHOT: :
package: jd2.jd2_hw.task3

// создание web модуля
mvn archetype:generate -DarchetypeArtifactId=maven-archetype-webapp
groupId: jd2.jd2_hw.task3
artifactId: moduleWar
version: 1.0-SNAPSHOT
package: jd2.jd2_hw.task3

// создание раздела <dependencyManagment> в родительском pom.xml
// добавление зависимости от проекта от MySql
<!-- https://mvnrepository.com/artifact/mysql/mysql-connector-java -->
<dependency>
    <groupId>mysql</groupId>
    <artifactId>mysql-connector-java</artifactId>
    <version>8.0.22</version>
</dependency>

// добавление зависимости <dependency> в модуле Jar (область действия compile и jar)
<dependency>
    <groupId>mysql</groupId>
    <artifactId>mysql-connector-java</artifactId>
</dependency>

// локальная сборка проекта 
mvn clean install

// добавление buildpligin для компиляции проекта с помощью JDK 1.8
// в файл проекта в секцию build
<finalName>moduleWar</finalName>
<plugin>
  <artifactId>maven-compiler-plugin</artifactId>
  <configuration>
    <source>1.6</source>
    <target>1.6</target>
  </configuration>
</plugin>
