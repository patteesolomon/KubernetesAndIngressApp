This is a Kotlin Multiplatform project targeting Android, iOS, Server.

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

1. download the latest Android Studio
here link - > https://developer.android.com/studio
agree to the terms and just download it. 
Extract it to the folder you want it to go.
Then.. Run 'studio' inside the 
`folderName/android-studio/bin/studio`<- this file
it should be a .exe if you're using windows.
Open Android Studio..
You may have to install Java dependencies first. 
You will need Java_11 and greater.

2. Make a new folder some where else. 
open the folder you git pulled into from the 
file tab in the context menu.

3. hit the build hammer tool at the top right 
area and watch the build run.

4. If it succeeds then you can run the app.

5. IF it does not then try syncing settings first.

# Instructions on how to run IOTCC

Learn more about [Kotlin Multiplatform](https://www.jetbrains.com/help/kotlin-multiplatform-dev/get-started.html)…