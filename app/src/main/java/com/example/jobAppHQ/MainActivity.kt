package com.example.jobAppHQ

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalLifecycleOwner
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.repeatOnLifecycle
import androidx.navigation.compose.rememberNavController
import com.example.jobAppHQ.job.util.Event
import com.example.jobAppHQ.job.util.EventBus
import com.example.jobAppHQ.ui.theme.JobAppHQTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {

            val lifecyclleOwner = LocalLifecycleOwner.current.lifecycle
            LaunchedEffect(key1 = lifecyclleOwner) {
                lifecyclleOwner.repeatOnLifecycle(Lifecycle.State.STARTED) {
                    EventBus.event.collect { event ->
                        when (event) {
                            is Event.Toast -> {
                                Toast.makeText(this@MainActivity, event.message, Toast.LENGTH_SHORT)
                                    .show()
                            }
                        }
                    }
                }
            }


            JobAppHQTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background,
                ) {
                    val authNavController = rememberNavController()
                    Greeting(
                        name = "Shahnawaz Khan",
                    )
                }

            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
        Text(
            text = "Hello $name!",
            fontSize = 35.sp,
            modifier = modifier
        )
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    JobAppHQTheme {
        Greeting("Android")
    }
}