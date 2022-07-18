package project.jh.sync.initializers

import android.content.Context
import androidx.startup.AppInitializer
import androidx.startup.Initializer

/**
 * Created by jihye
 * Date: 2022/07/19
 */
object Sync {
    fun initialize(context: Context) {
        AppInitializer.getInstance(context)
            .initializeComponent(SyncInitializer::class.java)
    }
}

private const val SyncWorkName = "SnsSyncWork"

class SyncInitializer : Initializer<Sync> {
    override fun create(context: Context): Sync {
        TODO("Not yet implemented")
    }

    override fun dependencies(): MutableList<Class<out Initializer<*>>> {
        TODO("Not yet implemented")
    }
}