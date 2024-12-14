package style

import csstype.PropertiesBuilder
import kotlinx.css.*
import web.cssom.TextDecorationLine
import web.cssom.TextDecorationStyle
import web.cssom.px
import web.dom.document

val bodyContentFontSize = 28.px

val appStyle = document.createElement("style").apply {

    val styles = CssBuilder().apply {
        html {
            scrollBehavior = ScrollBehavior.smooth
        }
        body {
            width = LinearDimension("100%")
            maxWidth = LinearDimension("48rem")
            textAlign = TextAlign.center
            margin = Margin(LinearDimension.auto)
            fontFamily = "Roboto Slab, sans-serif"
            // TODO: Refactor colors
            backgroundColor = Color(backgroundBlack.toString())
            color = Color(white.toString())

            media("screen and (max-width: 768px)") {
                // mobile styles
                width = LinearDimension("85%")
            }
        }
    }

    innerHTML = styles.toString()
}

fun PropertiesBuilder.buildContentLinkStyle(
    textColor: web.cssom.Color,
    textOnHoverColor: web.cssom.Color
) {
    color = textColor
    textDecorationLine = TextDecorationLine.underline
    textUnderlineOffset = 4.px
    textDecorationThickness = 1.5.px
    textDecorationStyle = TextDecorationStyle.wavy
    textDecorationColor = accent
    hover {
        color = textOnHoverColor
        textDecorationColor = hoverOnAccentColor
    }
}

fun PropertiesBuilder.buildContentTextBackgroundStyle() {
    backgroundColor = accent
    paddingLeft = 2.px
    paddingRight = 2.px
    color = backgroundBlack
}

fun PropertiesBuilder.buildContentTextWavyStyle(
    textColor: web.cssom.Color,
    textOnHoverColor: web.cssom.Color
) {
    color = textColor
    textDecorationLine = TextDecorationLine.underline
    textUnderlineOffset = 10.px
    textDecorationStyle = TextDecorationStyle.wavy
    textDecorationColor = accent
    hover {
        color = hoverOnWhiteColor
        textDecorationColor = textOnHoverColor
    }
}
