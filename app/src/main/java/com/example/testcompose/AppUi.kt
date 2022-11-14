package com.example.testcompose

import AppBarText
import CharacterImageCard
import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.material.Scaffold
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.foundation.lazy.*
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.layout.VerticalAlignmentLine

import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.testcompose.Repository.Model.PostModel
import com.example.testcompose.viewmodel.DateViewModel


@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun AppUi(
    modifier: Modifier = Modifier,
     homeViewModel :DateViewModel= viewModel(modelClass = DateViewModel::class.java)

) {
    val state by homeViewModel.state.collectAsState()

    Scaffold(

        topBar = { TopAppBar(content = { AppBarText(text = "Text")}) }
    ) {
        LazyColumn(verticalArrangement = Arrangement.Center) {



            if(state.isEmpty()){
                item {


                    CircularProgressIndicator(
                        modifier = Modifier
                            .fillMaxSize()
                            .wrapContentSize(align = Alignment.Center)
                    )
                }
            }else{
                items(state) { character: PostModel ->
                    CharacterImageCard(character = character)
                }


            }
        }



    }
}


