package net.dankito.kotlin.coroutines

import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.IO


actual val Dispatchers.IOorDefault: CoroutineDispatcher
    get() = Dispatchers.IO