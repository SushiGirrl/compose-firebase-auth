package com.example.auth.ui

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.google.firebase.auth.FirebaseAuth

@Composable
fun Failure(){
    Box(Modifier
        .fillMaxSize(),
        contentAlignment = Alignment.Center
    ){
        Text("Failure 🚀");
    }
}

@Preview
@Composable
fun FailurePreview(){
    Failure()
}