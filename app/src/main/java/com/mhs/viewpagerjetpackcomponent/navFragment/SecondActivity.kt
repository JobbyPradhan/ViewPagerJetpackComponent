package com.mhs.viewpagerjetpackcomponent.navFragment

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.Surface
import com.mhs.viewpagerjetpackcomponent.navigation.StartNavigation
import com.mhs.viewpagerjetpackcomponent.ui.theme.ViewPagerJetpackComponentTheme

class SecondActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ViewPagerJetpackComponentTheme() {
                androidx.compose.material.Surface {
                    StartNavigation()
                }
            }

        }
    }
}