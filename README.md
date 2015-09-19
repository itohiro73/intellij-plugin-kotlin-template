# intellij-plugin-kotlin-template
Gradle project template for IntelliJ plugin development in Kotlin.

You can just clone the project and immediately start IntelliJ plugin development with Gradle and Kotlin.

# How to use 

Clone the project, and you can launch the IntelliJ IDEA with "Hello World" plugin with the build command below. You can find a tool window named "sample" at the bottom after you launch IntelliJ IDEA with the build command. 

Start modifying plugin.xml/HelloWorldWindow.kt to develope your own plugin.

For Mac/Linux:

```
# ./gradlew runIdea
```

For Windows:

```
# gradlew.bat runIdea
```

# How to release
You can build a zip file for release with the build command below.

```
# ./gradlew buildPlugin
```

For Windows:

```
# gradlew.bat buildPlugin
```

