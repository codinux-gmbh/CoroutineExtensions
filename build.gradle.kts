
allprojects {
    group = "net.codinux.kotlin"
    version = "1.0.1"

    ext["sourceCodeRepositoryBaseUrl"] = "github.com/codinux-gmbh/CoroutineExtensions"

    ext["projectDescription"] = "Some additional functionalities missing in core Coroutines library"

    repositories {
        mavenCentral()
        google()
    }
}