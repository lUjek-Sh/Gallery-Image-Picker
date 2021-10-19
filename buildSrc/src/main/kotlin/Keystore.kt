@file:Suppress("MayBeConstant")

class Keystore {
    object Properties {
        val storePassword = "STORE_PASSWORD"
        val keyAlias = "KEY_ALIAS"
        val keyPassword = "KEY_PASSWORD"
    }

    object Files {
        object Release {
            val jks = "release.jks"
            val properties = "keystore.properties"
        }
    }
}