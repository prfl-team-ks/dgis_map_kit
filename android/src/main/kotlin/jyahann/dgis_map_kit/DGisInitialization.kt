package jyahann.dgis_map_kit

import ru.dgis.sdk.Context
import ru.dgis.sdk.DGis

fun initializeDGis(appContext: android.content.Context,): Context {
    return DGis.initialize(
        appContext,
    )
}
