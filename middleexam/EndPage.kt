import androidx.compose.material3.Button
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import org.w3c.dom.Text

@Composable
fun EndPage() {
    var examOverText by remember { mutableStateOf("")
    }
    Button(onClick = {
        examOverText = "考试结束"
    }) {
        Text(text = "Exam Over")
    }

    if (examOverText.isNotEmpty()) {
        Text(text = examOverText)
    }
}