package com.quanticheart.secrets

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.settings_activity.*

class SettingsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.settings_activity)

        val apiKey = BuildConfig.apiKey
        val app = BuildConfig.labelName
        val apiKey2 = BuildConfig.defaultValueSecret

        name.text = apiKey
        key.text = app
        defaultText.text = apiKey2
    }
}