package ua.edu.lntu.cw_1

import androidx.compose.foundation.layout.*
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.rememberScrollState

import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import ua.edu.lntu.cw_1.ui.theme.CW_1Theme
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.sp
import androidx.compose.foundation.verticalScroll
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CW_1Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize().verticalScroll(rememberScrollState()),
                    color = Color(android.graphics.Color.parseColor("#EDEFE3"))
                ) {
                    Greeting()
                }
            }
        }
    }
}

@Composable
fun Greeting( modifier: Modifier = Modifier) {
Column(modifier = Modifier.fillMaxSize(),
    horizontalAlignment = Alignment.CenterHorizontally
)
    {
Column(modifier = modifier,
    verticalArrangement = Arrangement.Center,
    horizontalAlignment = Alignment.CenterHorizontally)
{
    Image(painter = painterResource(id = R.drawable.bg_f8f8f8_flat_750x_075_f_pad_750x1000_f8f8f8),
        contentDescription = "Photo of author"
    , modifier = Modifier
            .size(150.dp),
        )
Text(text = "Rick Astley",
    fontSize = 36.sp)
    Text(text = "Famous British pop-singer",
        fontSize = 20.sp)
}

    }
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Bottom,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Row(
            modifier = Modifier.padding(bottom = 10.dp),
            horizontalArrangement = Arrangement.Center
        ) {
            Image(
                painter = painterResource(id = R.drawable.email),
                contentDescription = "Email",
                modifier = Modifier.size(20.dp).padding(end = 5.dp)
            )
            Text(
                text = "rickastley228@gmail.com",
                fontSize = 16.sp
            )
        }
        Row(
            modifier = Modifier.padding(bottom = 10.dp),
            horizontalArrangement = Arrangement.Center
        ) {
            Image(
                painter = painterResource(id = R.drawable.phone_font_awesome_svg),
                contentDescription = "Phone",
                modifier = Modifier.size(20.dp).padding(end = 5.dp)
            )
            Text(
                text = "+380111111",
                fontSize = 16.sp
            )
        }
        Row(
            modifier = Modifier,
            horizontalArrangement = Arrangement.Center
        ) {
            Image(
                painter = painterResource(id = R.drawable.phone_font_awesome_svg),
                contentDescription = "Phone",
                modifier = Modifier.size(20.dp).padding(end = 5.dp)
            )
            Text(
                text = "+325232134",
                fontSize = 16.sp
            )
        }
    }
    }


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    CW_1Theme {
        Greeting()
    }
}