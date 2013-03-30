# Bibulous

This is a extension framework for JUnit 4.7+.

## Usage

In your Java test class:

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

In Maven project, you can make sure Bibulous dependency is resolved 
adding following section in the POM:

```xml
<project>
  <!-- ... -->
  <repositories>
    <repository>
      <id>applicius-releases</id>
      <name>Applicius Maven2 Releases Repository</name>
      <url>https://raw.github.com/applicius/mvn-repo/master/releases/</url>
    </repository>

    <!-- ... -->
  </repositories>

  <dependencies>
    <dependency>
      <groupId>applicius</groupId>
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

Bibulous is built using Maven 2/3+.
