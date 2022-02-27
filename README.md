# lesson04 - Warmup

- name: TODO
- email: TODO
- [lab specs](https://shanepanter.com/cs2/lessons/lesson04.html)

## Testing

TODO - This section should detail how you tested your code.

## Know issues

TODO - Please detail any known issues, bugs, or features that you didn't have time to implement.

## Sources used

TODO - If you used any sources outside of the lecture notes, class lab files, or text book you need to list them here.

## Hello World (Boring edition)

Here is a traditional hello world in Java.

```java
class Hello{
    public static void main(String [] args){
        System.out.println("needs more cowbell");
    }
}
```
We can compile and run this simple example as follows:

```bash
$ javac Hello.java
$ java Hello
needs more cowbell
```

Boo!! Boring! This is not enterprise grade software.

## Hello World (Enterprise edition)

Lets spice this up. We need to have a more robust Hello World that is **enterprise grade**.
Enterprise grade software at a minimum needs a well defined build system, testing, and some
unnecessary abstraction to ensure long term job security. The next few sections will walk you
through setting this all up which you will then replicate on your own system.

### Build System

So up to this point you may have either been compiling Java by hand or you have been transparently
using a build system with an IDE such as [Eclipse](https://www.eclipse.org/eclipseide/) or
[IntelliJ](https://www.jetbrains.com/idea/). It's now time for us to formally introduce a build
system and write a simple build file just like you would do in industry.

There are quite a few build systems that were specifically designed for java. By far the top three
are:

- [ant](https://ant.apache.org/) - Released in 2000. Designed as a replacement for
  [make](https://en.wikipedia.org/wiki/Make_(software)). Still in use but has largely been replaced
  by newer tools such as maven and gradle.
- [maven](https://maven.apache.org/) - Released in 2004. Notable for managing both the build process
  and dependencies. 
- [gradle](https://gradle.org/) - Released in 2008. One of the newer build systems for Java. Adopted
  by google as their official build system for Android.

### Gradle

We will be using gradle because it is relatively new and well supported. The gradle docs explain
how to [organize a project](https://docs.gradle.org/current/userguide/organizing_gradle_projects.html).
We will follow the recommended layout because Gradle's language plugins establish conventions for
discovering and compiling source code that we can take advantage of.

### Testing

We will be using a popular testing framework called [TestNG](https://testng.org/doc/) to test our
code. We will write some tests for our Hello World **Enterprise Edition**™ to ensure that everything
works as expected. Every class (except App.java) will need to have a test class. Unlike CS121 where
you may have spent most of you time in the class that has the `main` method, the App.java class
will not do much except create your other objects. 99% of your program logic will be in classes
outside of main.

### Directory structure

```bash
.
├── README.md
├── app
│   ├── build.gradle
│   └── src
│       ├── main
│       │   └── java
│       │       └── lesson
│       │           ├── App.java
│       │           ├── SayHello.java
│       │           ├── SayWorld.java
│       │           └── Talker.java
│       └── test
│           └── java
│               └── lesson
│                   ├── SayHelloTest.java
│                   └── SayWorldTest.java
├── gradle
│   └── wrapper
│       └── gradle-wrapper.properties
├── gradlew
├── gradlew.bat
└── settings.gradle
```

## Task 1 - Write your tests!

We are going to be practicing TDD all semester! So the first step in any project is to write your
tests! There are two test files stubbed out and ready for you to implement. Look in the
`app/test/java/lesson` directory to find the classes SayHelloTest.java and SayWorldTests.java.
Complete the test methods before you go on to the next task.

## Task 2 - Write your code

After you have completed Task #1 you should have **two** tests that are failing! That is because we
now need to actually implement the classes that provide our application logic. There are  four files
in the `app/src/main/java/lesson` directory. Your job is to complete the SayHello.java and
SayWorld.java classes so they return the appropriate strings.
