package com.hussein.koininjection

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.compose.viewModel
import com.hussein.koininjection.ui.theme.KoinInjectionTheme
import com.hussein.koininjection.ui.theme.MyApi
import org.koin.android.ext.android.inject
import org.koin.android.scope.AndroidScopeComponent
import org.koin.androidx.scope.activityRetainedScope
import org.koin.androidx.scope.activityScope
import org.koin.androidx.viewmodel.ext.android.getViewModel
import org.koin.core.qualifier.named
import org.koin.core.scope.Scope

class MainActivity : ComponentActivity(),AndroidScopeComponent {

    //private val viewModel by viewModel<MainViewModel>()

    //Lazy injection for API code
    //private val api by inject<MyApi>()

    override val scope: Scope by activityScope()
    private val hello by inject<String>(named("Hello"))

    private val bye by inject<String>(named("Bye"))


    // override val scope: Scope by activityRetainedScope() //This View model scope


    //private val hello by inject<String>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        print(hello)
        print(bye)
        setContent {
            KoinInjectionTheme {
                //Call View model by koin
                val viewMainModel = getViewModel<MainViewModel>()
                viewMainModel.doNetworkCall()
            }
        }
    }

}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    KoinInjectionTheme {
    }
}