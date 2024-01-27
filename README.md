# XCPU
A emulator for my custom CPU written in Java

## How to install the XCPU packet

### Gradle:
* In your root `build.gradle` file under the repositories tab add:
```groovy
maven { url 'https://jitpack.io' }
```
* Then under the dependencies section add:
```groovy
 dependencies {
     implementation 'com.github.raphtikatghg:XCPU:{RELEASE_TAG}'
 }
```
* You can change `{RELEASE_TAG}` to one of the release tags found on the Releases page
 * <b>Now you are done!</b>

### Maven

* In you `pom.xml` file, to add the Jitpack repository, add:
```xml
<repositories>
    <repository>
        <id>jitpack.io</id>
        <url>https://jitpack.io</url>
    </repository>
</repositories>
``` 
* Now in `pom.xml` again add the following code to add the dependency:
````xml
<dependency>
    <groupId>com.github.raphtikatghg</groupId>
    <artifactId>XCPU</artifactId>
    <version>{RELEASE_TAG}</version>
</dependency>
````
* You can change `{RELEASE_TAG}` to one of the release tags found on the Releases page
* <b>Now you are done!</b>

### Information

License: [Apache License Version 2.0](https://www.apache.org/licenses/LICENSE-2.0)