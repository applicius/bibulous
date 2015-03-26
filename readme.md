# Bibulous

This is a extension framework for JUnit 4.7+.

## Usage

In your Java test class `@RunWith` and `@TestDoc` annotations.

```java
import org.junit.runner.RunWith;

import bibulous.TestDoc;

@RunWith(bibulous.Runner.class)
class MyTest {

  @TestDoc("Test custom description.")
  @Test
  public void myTest() {
    // ...
  }
}
```

### Maven

In a Maven project, you can make sure Bibulous dependency is resolved 
adding following section in the POM:

```xml
<project>
  <!-- ... -->
  <repositories>
    <repository>
      <id>tatami-releases</id>
      <name>Tatami Releases Repository</name>
      <url>https://raw.github.com/cchantep/tatami/master/releases/</url>
    </repository>

    <!-- ... -->
  </repositories>

  <dependencies>
    <dependency>
      <groupId>bibulous</groupId>
      <dependency>bibulous</dependency>
      <version>1.0</version>
      <scope>test</scope>
    </dependency>

    <!-- ... -->
  </dependencies>

  <!-- ... -->
</project>
```

## Build

Bibulous is built using Maven 3+: `mvn -U clean install`
