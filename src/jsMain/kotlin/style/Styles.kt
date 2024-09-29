package style

import csstype.PropertiesBuilder
import kotlinx.css.*
import web.cssom.AlignContent
import web.cssom.TextDecoration
import web.cssom.px
import web.dom.document

val appStyle = document.createElement("style").apply {

    val styles = CssBuilder().apply {
        html {
            scrollBehavior = ScrollBehavior.smooth
        }
        body {
            width = LinearDimension("65%")
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

fun PropertiesBuilder.buildHeaderLinkStyle() {
    color = white
    textDecoration = TextDecoration.underline
    textDecorationColor = accent
    textDecorationThickness = 2.px
    textUnderlineOffset = 3.px
    hover {
        color = hoverOnWhiteColor
    }
}

fun PropertiesBuilder.buildLinkStyle(
    textColor: web.cssom.Color,
    textOnHoverColor: web.cssom.Color
) {
    color = textColor
    textDecoration = TextDecoration.fromFont
    hover {
        color = textOnHoverColor
    }
}

fun PropertiesBuilder.buildBodyLinkStyle() {
    color = white
    textDecoration = TextDecoration.underline
    textDecorationColor = accent
    textDecorationThickness = 1.5.px
    hover {
        color = hoverOnWhiteColor
    }
}

fun PropertiesBuilder.buildContentLinkStyle() {
    color = black
    textDecoration = TextDecoration.underline
    textDecorationColor = accent
    textDecorationThickness = 4.px
    alignContent = AlignContent.center
    hover {
        color = hoverOnBlackColor
    }
}

fun PropertiesBuilder.buildContentTextBackgroundStyle() {
    backgroundColor = accent
    paddingLeft = 2.px
    paddingRight = 2.px
    color = backgroundBlack
}
