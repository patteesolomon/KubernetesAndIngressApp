# This is a Kotlin Multiplatform project targeting Android, iOS, Server.

* `/composeApp` is for code that will be shared across your Compose Multiplatform applications.
  It contains several subfolders:
  - `commonMain` is for code that’s common for all targets.
  - Other folders are for Kotlin code that will be compiled for only the platform indicated in the folder name.
    For example, if you want to use Apple’s CoreCrypto for the iOS part of your Kotlin app,
    `iosMain` would be the right folder for such calls.

* `/iosApp` contains iOS applications. Even if you’re sharing your UI with Compose Multiplatform, 
  you need this entry point for your iOS app. This is also where you should add SwiftUI code for your project.

* `/server` is for the Ktor server application.

* `/shared` is for the code that will be shared between all targets in the project.
  The most important subfolder is `commonMain`. If preferred, you can add code to the platform-specific folders here too.

  # Instructions on how to Build/Run IOTCC

## WELCOME TO RAINBOW PREBUILD

1. Download/Install the latest Android Studio
here link - > https://developer.android.com/studio
agree to the terms and just download it. 
Extract it to the folder you want it to go.
Then.. Run 'studio' inside the 
`folderName/android-studio/bin/studio`<- this file
it should be a .exe if you're using windows.
Open Android Studio..
You may have to install Java dependencies first. 
You will need Java_11 and greater.
At base folder where `../IOTCC/server/src/main/kotlin/org/example/project/` The "server" folder project..
IF a .env file does NOT EXIST THERE
make one.
and put these values in it..

`KEYPWD = <YOUR KEY>
USERNAME = <username>
USERROUTEID = <your id>`

2. GOTO THE GET_OVER_HERE.md and download one of the links for to your compression liking.

3. Make a new folder some where else. 
open the folder you downloaded from mediafire. extract that file into your new folder. Open that project file outside the file base using Android Studio.
4. WHEN IT ASKS TO DO AN UPGRADE OF ANYTHING OR UPGRADE. Do it NOW. then AFTER you may proceed.

5. Up at the top of Android studio:
6. Run the sych settings button and if that works.
7. Run the build. And if that works..
8. Run the program hitting the play button.
9. If this stuff doesn't work..
10. Then use the new Branch and follow those instructions.
11. Those instructions will be more specifically based on multiplat and config.
   
   # Kotlin

Learn more about [Kotlin Multiplatform](https://www.jetbrains.com/help/kotlin-multiplatform-dev/get-started.html)…
