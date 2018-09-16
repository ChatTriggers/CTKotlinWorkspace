## ChatTriggers Kotlin Workspace

This repository serves as a base for creating a 
[ChatTriggers](https://github.com/ChatTriggers/ct.js) module in Kotlin. It utilizes
the kotlin2js compiler provided by the Kotlin team, which works fantastically.
It compiles into simple js files, which can then be moved into a module folder.
Modules created with Kotlin do depend on the kotlin.js file, which will be provided
by a module named "Kotlin", so you should add that as a dependency in your
module metadata.

The example provided shows how the registering works with this system, and should
be easy to follow if you are coming from creating modules in JS.

![Image showcasing the Example in action](https://i.imgur.com/da4Hfbu.png)

Eventually, I will create a gradle tool in this repository to automatically
generate a module folder, metadata, and optionally move it into a specified location
(your modules folder).

All of the external types that ChatTriggers provides can be found in the `glue.kt`
file. This file was generated using the 
[ExternalTypeGenerator](https://github.com/ChatTriggers/ExternalTypeGenerator).
I will try to keep it somewhat updated here, but there are no guarantees there, so
if you need to update it, clone the ExternalTypeGenerator and generate one yourself.
From there you can feel free to submit a pull request here updating it, which would
be appreciated.