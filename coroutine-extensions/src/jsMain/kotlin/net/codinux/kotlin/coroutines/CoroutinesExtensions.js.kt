package net.codinux.kotlin.coroutines

import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers


actual val Dispatchers.IOorDefault: CoroutineDispatcher
    get() = Dispatchers.Default