# Zero-setup reproducible java builds example

This repo is a working example for 
[slides.breuco.de/zero-setup-reproducible-java-builds](https://slides.breuco.de/zero-setup-reproducible-java-builds)

You can easily build the project using `./jdkw-impl.sh ./gradlew build` directly after checkout without needing to 
install java or gradle on your system.

You find three branches in this repo:
1. `master` -> Reflects a development version where java 11 is used
2. `java-13-variant` -> Reflects a branch, where java was properly updated to java 13 and a tests fails, when a specific 
java 13 version (13.0.1) is not used
3. `failing-java-12-variant` -> Reflects a branch, where features of java 12 where used, but it was forgotten to update the
 declaration of the corresponding jdk in the `.jdkw` file

There are CI pipelines for every branch in 
[actions](https://github.com/breucode/zero-setup-reproducible-java-builds-example/actions).

NOTE: Currently, `jdkw-impl.sh` from [this PR](https://github.com/KoskiLabs/jdk-wrapper/pull/35) is used, because the 
current release of [KoskiLabs/jdk-wrapper](https://github.com/KoskiLabs/jdk-wrapper) does not support AdoptOpenJDK. 
When you use [KoskiLabs/jdk-wrapper](https://github.com/KoskiLabs/jdk-wrapper), you would use `jdk-wrapper.sh` instead 
of `jdkw-impl.sh`. I will update this example, as soon as the above mentioned PR is merged and released.