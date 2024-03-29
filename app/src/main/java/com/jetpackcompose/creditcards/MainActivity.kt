package com.jetpackcompose.creditcards

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.jetpackcompose.creditcards.ui.theme.CreditCardsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CreditCardsTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background

                ) {
                    DisplayCards()
                }
            }
        }
    }
}

@Composable
fun DisplayCards(){
    val cards= listOf(
        CardInfo(
            "1234  5678  1234 235",
            "ALAA MAHER ELKHTEEB",
            R.drawable.mastercard_logo,
            R.drawable.background1
        ),

                CardInfo(
                "1234  5678  1234 235",
        "ALAA MAHER ELKHTEEB",
        R.drawable.old_visa_logo,
        R.drawable.background2
    ),
        CardInfo(
            "1234  5678  1234 235",
            "ALAA MAHER ELKHTEEB",
            R.drawable.mastercard_logo,
            R.drawable.background3
        ),
        CardInfo(
            "1234  5678  1234 235",
            "ALAA MAHER ELKHTEEB",
            R.drawable.mastercard_logo,
            R.drawable.background4
        )
    )
    
    
    LazyColumn(modifier = Modifier
        .fillMaxHeight()
        .padding(16.dp), verticalArrangement = Arrangement.spacedBy(16.dp) ){

        items(cards){
            card ->
            CreditCard(cardInfo = card)

        }


    }
}

