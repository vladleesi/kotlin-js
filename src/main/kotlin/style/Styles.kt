package style

import csstype.PropertiesBuilder
import kotlinx.css.*
import kotlinx.css.Color
import kotlinx.css.Margin
import kotlinx.css.TextAlign
import web.cssom.*
import web.cssom.Display
import web.cssom.JustifyContent
import web.cssom.px
import web.dom.document

val appStyle = document.createElement("style").apply {

    val styles = CssBuilder().apply {
        body {
            width = LinearDimension("65%")
            textAlign = TextAlign.center
            margin = Margin(LinearDimension.auto)
            fontFamily = "Roboto Slab, sans-serif"
            // TODO: Refactor colors
            backgroundColor = Color(backgroundBlack.toString())
            color = Color(white.toString())

            media("screen and (max-width: 767px)") {
                // mobile styles
            }
        }
    }

    innerHTML = styles.toString()
}

fun PropertiesBuilder.buildFooterStyle() {
    display = Display.flex
    alignItems = AlignItems.center
    justifyContent = JustifyContent.spaceBetween
    marginTop = 32.px
}

fun PropertiesBuilder.buildFooterLinkStyle() {
    color = white
    textDecoration = TextDecoration.underline
    textDecorationColor = accent
    textDecorationThickness = 1.5.px
    hover {
        color = hoverOnWhiteColor
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
