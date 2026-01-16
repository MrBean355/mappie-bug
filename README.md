# Mappie Bug Demo

This project aims to serve as a minimal reproduction example of a bug I encountered in our Android app.

It surfaced when upgrading Mappie from `2.2.21-1.6.1` to `2.2.21-2.0.0` without changing the mapper or model classes. It affects both version `2.3.3`
and `2.3.4` of KSP. Kotlin remained on `2.2.21`.

Compilation fails when mapping a Kotlin class to a Java one, using the implicit mapper. For example, implicitly mapping a Kotlin class's `user`
property to a Java equivalent. See the [demo file](app/src/main/java/com/github/mrbean355/mappiebug/Demo.kt) for sample code.

> Caused by: [CIRCULAR REFERENCE: com.android.tools.r8.internal.tw: Space characters in SimpleName 'com/github/mrbean355/mappiebug/TestMapper$KotlinUserTo@FlexibleNullability JavaUserMapper' are not allowed prior to DEX version 040]

The issue is resolved when creating an explicit mapper for the nested class, instead of using the implicit one. Is this the best practice?

## Replication Steps

Build this project and compilation will fail: `./gradlew clean assembleDebug`.
