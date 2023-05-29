package net.annedawson.plants

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.compose.animation.animateContentSize
import androidx.compose.animation.core.Spring
import androidx.compose.animation.core.spring
import androidx.compose.foundation.background
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ExpandLess
import androidx.compose.material.icons.filled.ExpandMore
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import net.annedawson.plants.data.Plant
import net.annedawson.plants.data.plants
import net.annedawson.plants.ui.theme.PlantsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PlantsTheme {
                PlantsApp()
            }
        }
    }
}


/**
 * Composable that displays an app bar and a list of plants
 */
@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun PlantsApp() {
    Scaffold(
        topBar = {
            PlantsTopAppBar()
        }
    ) {
        LazyColumn(
            modifier =
            Modifier.background(MaterialTheme.colors.background)
        ) {
            items(plants) {
                PlantItem(plant = it)
            }

        }
    }
}
// note plants is a list of Plant - defined in Plant.kt - see imports above


@Composable
fun PlantItem(plant: Plant, modifier: Modifier = Modifier) {
    var expanded by remember { mutableStateOf(false) }
    // expanded is the state which is being observed

    // Card is a surface that can contain a single composable.
    Card(
        elevation = 20.dp,
        modifier = modifier.padding(8.dp)
    )  // card is a medium component in Shape.kt change to 16.dp
    {
        // spring animate the whole column
        Column(modifier = Modifier
            .animateContentSize(
                animationSpec = spring(
                    dampingRatio = Spring.DampingRatioMediumBouncy,
                    stiffness = Spring.StiffnessLow
                )
            )
        ) {
            Row(
                modifier = Modifier // a new instance of Modifier
                    .fillMaxWidth()
                    .padding(8.dp)
                    .background(MaterialTheme.colors.surface) // paler green for list item
            ) {
                PlantImage(plant.imageResourceId)
                PlantItemButton(
                    expanded = expanded,
                    onClick = { expanded = !expanded },
                ) // if I put the Button code below PlantInformation,
                // when it runs, the button is off screen - so not visible
                PlantInformation(plant.name, plant.summary)
            }
            if (expanded) {
                PlantDetails(plant.details)
            }
        }
    }
}

@Composable
private fun PlantItemButton(
    expanded: Boolean,
    onClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    IconButton(onClick = onClick) {
        Icon(
            imageVector = if (expanded) Icons.Filled.ExpandLess else Icons.Filled.ExpandMore,
            tint = MaterialTheme.colors.secondary,
            contentDescription = stringResource(R.string.expand_button_content_description)
        )
    }
}

/**
 * Composable that displays a photo of a plant.
 *
 * @param plantImage is the resource ID for the image of the plant
 * @param modifier modifiers to set to this composable
 */
@Composable
fun PlantImage(@DrawableRes plantImage: Int, modifier: Modifier = Modifier) {
    Image(
        modifier = modifier
            .size(128.dp)
            .padding(8.dp),
            //.aspectRatio(1f)
            //.fillMaxWidth(),
        painter = painterResource(plantImage),
        /*
         * Content Description is not needed here - image is decorative, and setting a null content
         * description allows accessibility services to skip this element during navigation.
         */
        contentDescription = null,
        //contentScale = ContentScale.Fit
        contentScale = ContentScale.Crop
        // try running with contentScale = ContentScale.Fit
        // then contentScale = ContentScale.Crop
        // to see how crop fits the image to the desired size

        // https://developer.android.com/jetpack/compose/graphics/images/customize
    )
}


/**
 * Composable that displays a plant's name and summary
 *
 * @param plantName is the resource ID for the string of the plant's name
 * @param plantSummary is the resource ID for the string of the plant's summary
 * @param modifier modifiers to set to this composable
 */
@Composable
fun PlantInformation(@StringRes plantName: Int, @StringRes plantSummary: Int,modifier: Modifier = Modifier) {
    Column {
        Text(
            text = stringResource(plantName),
            modifier = modifier.padding(top = 8.dp),
            style = MaterialTheme.typography.h2
        )
        Text(
            text = stringResource(plantSummary),
            //color = MaterialTheme.colors.onSurface,  //Grey900 - almost black
            style = MaterialTheme.typography.body1
        )
    }
}

@Composable
fun PlantsTopAppBar(modifier: Modifier = Modifier) {
    Row(modifier = modifier
        .fillMaxWidth()
        .background(color = MaterialTheme.colors.primary),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Image(
            modifier = Modifier
                .size(64.dp)
                .padding(8.dp),
            painter = painterResource(R.drawable.beets),
            contentDescription = null
        )
        Text(
            text = stringResource(R.string.app_name),
            style = MaterialTheme.typography.h1
        )
    }
}

@Composable
fun PlantDetails(@StringRes plantDetails: Int, modifier: Modifier = Modifier) {
    Column(
        modifier = modifier.padding(
            start = 16.dp,
            top = 8.dp,
            bottom = 16.dp,
            end = 16.dp
        )
    ) {
         Text(
            text = stringResource(plantDetails),
            style = MaterialTheme.typography.body1
        )
    }
}
