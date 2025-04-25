
allprojects {
    group = "net.dankito.coroutines"
    version = "1.0.0-SNAPSHOT"

    ext["sourceCodeRepositoryBaseUrl"] = "github.com/dankito/CoroutineExtensions"

    ext["projectDescription"] = "Some additional functionalities missing in core Coroutines library"

    repositories {
        mavenCentral()
        google()
    }
}