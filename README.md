# capnproto-java: Cap'n Proto for Java

This is an experimental pure Java implementation of Cap'n Proto.

It doesn't do much yet. An attempt to use SBT as the build system and integration with `make` is currently underway.

To get started with SBT, visit https://github.com/paulp/sbt-extras or to run direct, try `curl -s https://raw.githubusercontent.com/paulp/sbt-extras/master/sbt > ~/bin/sbt && chmod 0755 ~/bin/sbt`

When you first build the project, try running `sbt update gen-idea`. This will bootstrap SBT and generate IntelliJ project files for those who wish to develop in an IDE.

When running `make`, the supporting Java code will be built, and the sample schema will be run through the code generator as well to produce the Java binding. You can find the generated code in `/examples/src/main/generated/Addressbook.java`

