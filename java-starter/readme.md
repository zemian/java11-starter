# java-starter

Java Platform, Standard Edition (Java SE) lets you develop and deploy Java applications 
on desktops and servers. Java offers the rich user interface, performance, versatility, 
portability, and security that today's applications require.

https://www.oracle.com/technetwork/java/javase/overview/index.html

## How To Build Project

Required Software

* JDK 8
* Maven 3.6.0

```
export JAVA_HOME=/path/to/jdk8
mvn install
```

## Download and Install

OracleJDK is built from OpenJDK project, and it has license restriction!

	https://www.oracle.com/technetwork/java/javase/downloads/index.html

There are many other OpenJDK implementations that you may use as well.

- Azul Zulu JDK
- Amazon JDK
- AdaptOpenJDK

Starting JDK 11, OracleJDK does not requires admin rights to install on Windows!

To install OracleJDK8 on Windows without admin rights, 
see https://zemian.github.io/blog/2018/03/install-windows-jdk-without-admin-rights.html

### Install using `sdkman`

```
curl -s "https://get.sdkman.io" | bash
sdk install java
```

NOTE: The SDK requires `bash` and `zip` commands. On windows, you can use `Git for Windows` that 
comes with bash, and then install 7-zip for `zip` command!

NOTE: With `sdk` you can install different version of JDK and from different vendor!

### Installing using `brew`

This is available for MacOSX only.

  brew cask install java


## Java Class Major Version Numbers

How to check it:

```
javap -v build/com/foo/Hello.class | grep "major"
```

```
Java 1.2 uses major version 46
Java 1.3 uses major version 47
Java 1.4 uses major version 48
Java 5 uses major version 49
Java 6 uses major version 50
Java 7 uses major version 51
Java 8 uses major version 52
Java 9 uses major version 53
Java 10 uses major version 54
Java 11 uses major version 55
Java 12 uses major version 56
Java 13 uses major version 57
Java 14 uses major version 58
Java 15 uses major version 59
```

Ref: https://stackoverflow.com/questions/9170832/list-of-java-class-file-format-major-version-numbers
