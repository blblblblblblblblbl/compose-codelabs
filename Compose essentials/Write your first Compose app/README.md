new for me

var shouldShowOnboarding by remember { mutableStateOf(true) }
shouldShowOnboarding is using a by keyword instead of the =. This is a property delegate that saves you from typing .value every time.
@Preview(
    showBackground = true,
    widthDp = 320,
    uiMode = UI_MODE_NIGHT_YES,
    name = "Dark"
)

LazyColumn doesn't recycle its children like RecyclerView. It emits new Composables as you scroll through it and is still performant,
as emitting Composables is relatively cheap compared to instantiating Android Views. So it's more effective then recycle view.

Instead of using remember you can use rememberSaveable. This will save each state surviving configuration changes (such as rotations) and process death.

simple padding animation 
val extraPadding by animateDpAsState(if (expanded.value) 48.dp else 0.dp)

For this, you can modify a predefined style by using the copy function. Make the number extra bold:
Text(
                    text = name,
                    style = MaterialTheme.typography.headlineMedium.copy(
                        fontWeight = FontWeight.ExtraBold
                    )
                )
