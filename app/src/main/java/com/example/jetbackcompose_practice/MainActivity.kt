package com.example.jetbackcompose_practice

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.jetbackcompose_practice.ui.theme.JetbackCompose_PracticeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            getListDetils(DetilsList_Data.Detils_List)
            }
        }
    }


@Composable
fun MainLayout(detils: Detils) {

    Row (modifier = Modifier.padding(all = 8.dp)){
        Image(
            painter = painterResource(R.drawable.fower),
            contentDescription = "Display Profile Image",
            modifier = Modifier
                .size(100.dp)
                .clip(CircleShape)
        )
        Spacer(modifier = Modifier.width(10.dp))
        Column{
            Text(text = "")
            Text(text = detils.FullName,
                color = MaterialTheme.colors.secondary,
                style = MaterialTheme.typography.subtitle2)
            Text(text = detils.Age)
            Text(text = detils.Phone)

            Spacer(modifier = Modifier.height(5.dp))
        }
    }

}

@Composable
fun getListDetils (detilsList: List<Detils>) {
    LazyColumn {
        items(detilsList) { detilList ->
            MainLayout(detilList)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    JetbackCompose_PracticeTheme {
        getListDetils(DetilsList_Data.Detils_List)
    }
}
