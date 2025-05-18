# CoroutineExtensions
[![Maven Central](https://maven-badges.herokuapp.com/maven-central/net.codinux.kotlin/coroutine-extensions/badge.svg)](https://maven-badges.herokuapp.com/maven-central/net.codinux.kotlin/coroutine-extensions)
[![License](https://img.shields.io/badge/License-Apache_2.0-blue.svg)](https://opensource.org/licenses/Apache-2.0)

Small library with extensions to Coroutines missing in coroutines-core.


## Setup

### Gradle

```
implementation("net.codinux.kotlin:coroutine-extensions:1.0.1")
```

### Maven

```xml
<dependency>
   <groupId>net.codinux.web</groupId>
   <artifactId>coroutine-extensions-jvm</artifactId>
   <version>1.0.1</version>
</dependency>
```


## Usage

### Dispatchers Extensions

In Kotlin Multiplatform projects, you often want to use `Dispatchers.IO` in common code for tasks like network calls, which is not possible as JS has no Dispatchers.IO.

So I created `Dispatchers.IOorDefault` which runs on `Dispatchers.IO` on all platforms but JS and on `Dispatchers.Default` on JS and WASM.

```kotlin
suspend fun fetchFromNetwork() = withContext(Dispatchers.IOorDefault) {
    // runs on Dispatchers.IO on all platforms but JS and WASM, for these runs on Dispatchers.Default
}
```


## License
```
Copyright 2025 codinux GmbH & Co.KG

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

   https://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
```