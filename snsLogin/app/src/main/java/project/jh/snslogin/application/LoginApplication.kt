package project.jh.snslogin.application

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

/**
 * Created by jihye
 * Date: 2022/06/23
 */
@HiltAndroidApp
class LoginApplication : Application() {
    override fun onCreate() {
        super.onCreate()
    }
}