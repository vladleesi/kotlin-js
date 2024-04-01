package style

import csstype.PropertiesBuilder
import web.cssom.*
import web.dom.document

val appStyle = document.createElement("style").apply {
    innerHTML = """
        body {
            width: 100%;
            font-family: 'Roboto Slab', sans-serif;
            
            background-color: $backgroundBlack;
            color: $white;
            
            margin-top: 0px;
            margin-bottom: 0px;
            margin-right: 0px;
            margin-left: 0px;
            
            /* Styles for mobile screens */
            @media screen and (max-width: 767px) {
                
            }
        
            /* Styles for desktop screens */
            @media screen and (min-width: 768px) {
                
            }
        }
    """
}

fun PropertiesBuilder.buildFooterStyle(maxWidthValue: MaxWidth) {
    display = Display.flex
    alignItems = AlignItems.center
    justifyContent = JustifyContent.spaceBetween
    maxWidth = maxWidthValue
    marginTop = 32.px
}

fun PropertiesBuilder.buildFooterLinkStyle() {
    color = white
    textDecoration = TextDecoration.blink
    hover {
        color = hoverOnWhiteColor
    }
}

fun PropertiesBuilder.buildBodyLinkStyle() {
    color = white
    textDecoration = TextDecoration.blink
    hover {
        color = hoverOnWhiteColor
    }
}

fun PropertiesBuilder.buildContentLinkStyle() {
    color = black
    textDecoration = TextDecoration.blink
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
