package ua.edu.lntu.cw_1
import androidx.compose.foundation.layout.*
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import ua.edu.lntu.cw_1.ui.theme.CW_1Theme
import androidx.compose.ui.Alignment
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CW_1Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting()
                }
            }
        }
    }
}

@Composable
fun Greeting( modifier: Modifier = Modifier.fillMaxSize()) {
Column(modifier = Modifier.padding(13.dp),
    horizontalAlignment = Alignment.CenterHorizontally
)
    {
Column(modifier = modifier.padding(13.dp),
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