package com.mhs.viewpagerjetpackcomponent.viewpager

import android.content.Context
import android.content.Intent
import android.widget.Toast
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.google.accompanist.pager.ExperimentalPagerApi
import com.google.accompanist.pager.HorizontalPager
import com.google.accompanist.pager.HorizontalPagerIndicator
import com.google.accompanist.pager.rememberPagerState
import com.mhs.viewpagerjetpackcomponent.R
import com.mhs.viewpagerjetpackcomponent.navFragment.SecondActivity

@OptIn(ExperimentalPagerApi::class, ExperimentalAnimationApi::class)
@Composable
fun OnBoardingScreen(context:Context){
    val pageState = rememberPagerState()

    Column {
        HorizontalPager(count = dataList.size,
            state = pageState,
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f)) {page ->
            PageUi(pager = dataList[page])
        }
        HorizontalPagerIndicator(pagerState = pageState,
        modifier = Modifier
            .align(Alignment.CenterHorizontally)
            .padding(20.dp),
        activeColor = colorResource(id = R.color.purple_500)
        )
        AnimatedVisibility(visible = pageState.currentPage == 2) {
            Button(onClick = {
                val intent = Intent(context,SecondActivity::class.java)
                context.startActivity(intent)
            },modifier = Modifier.fillMaxWidth()) {
                Text(text = "Getting Started")

            }
        }
    }

}

@Composable
fun PageUi(pager: Pager){
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        androidx.compose.foundation.Image(painter = painterResource(id = pager.image),
            contentDescription = pager.des,
        modifier = Modifier.size(200.dp)
        )
        Spacer(modifier = Modifier.height(20.dp))
        Text(text = pager.des)
    }
}