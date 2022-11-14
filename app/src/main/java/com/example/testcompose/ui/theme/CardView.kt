
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color


import androidx.compose.ui.unit.dp
import com.example.testcompose.Repository.Model.PostModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlin.random.Random

@Composable
fun CharacterImageCard(

    character: PostModel) {

    val appcolor= remember {
   mutableStateOf(Color.Green)
    }


    Card(
        shape = MaterialTheme.shapes.medium,
        modifier = Modifier.padding(16.dp)
    ) {


        Box {



            Surface(

                modifier = Modifier.align(Alignment.BottomCenter),
                contentColor = MaterialTheme.colors.surface
            ) {
                Box(modifier =Modifier.background(appcolor.value).clickable {
                                                                            appcolor.value= Color(
                                                                                Random.nextFloat(),
                                                                                Random.nextFloat(),
                                                                                Random.nextFloat(),
                                                                                alpha = 1f
                                                                            )
                },


                ) {
                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(4.dp)
                    ) {

                        Text(text = "Real name: ${character.title}")
                        Text(text = "Actor name: ${character.body}")



                    }
                }



            }


        }


    }


}

@Composable
fun AppBarText(text: String){
    Text(text = text)
}