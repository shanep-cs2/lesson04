# lesson04 - Warmup

## Learning Objectives

- Use Objects
- Demonstrate inheritance
- Introduce build systems
- Introduce unit testing and Test Driven Development (TDD)
- Introduce the project structure for the labs

## Overview

This assignment is intended to serve as a warm up assignment. It may have been a long time since you
have written any code in Java, so we will get warmed up by writing Hello World **enterprise
edition**™! We are no longer satisfied with a simple hello world, we must make it as complex as
possible, that way we will ensure job security for years to come!

This assignment will introduce you to how **all** of our assignments will be structured this
semester. We will also introduce [Test Driven Development
(TDD)](https://en.wikipedia.org/wiki/Test-driven_development) where we will write all of our **tests
first** before we write our code.

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

Let's formally introduce a build system so we an build, run, and debug our code just like you would 
do in industry.

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

- [TestNG Assert](https://www.javadoc.io/doc/org.testng/testng/7.4.0/org/testng/Assert.html)

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

## Task 0 - Get your code to compile

The starter code does not build out of the box. So the first step is to write a little code as
possible to get everything building. We will just stub out methods and classes at this point and not
worry about implementation.

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

## Task 3 - Complete the Retrospective

Once you have completed all the tasks open the file **Retrospective.md** and complete each section
with a TODO comment. 

## Important Notes

Generally speaking unless you are directed to in an assignment you are not permitted to change the
build system (gradle) move the files around or rename classes. Your instructor needs the directory
structure and file names to be consistent from student to student in order to get grades back in a
timely manner. If you do make changes that impact grading you will be awarded 0 points.

## Trouble shooting

If you get `command 'XXX' not found error`, mostly it's caused by the Java Language server failing
to activate. More information can be found on the [redhat-developer tool
wiki](https://github.com/redhat-developer/vscode-java/wiki/Troubleshooting). You can clean the
workspace directory in the following way:

- Open the command palette (F1)
- select Java: Clean the Java Language Server Workspace
- select Restart and delete from the confirmation prompt

