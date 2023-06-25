package style

import csstype.PropertiesBuilder
import web.cssom.*
import web.dom.document

val appStyle = document.createElement("style").apply {
    innerHTML = """
        body {
            width: 100%;
            font-family: 'Quicksand', sans-serif;
            
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

fun PropertiesBuilder.buildFooterStyle() {
    backgroundColor = footerBlack
    margin = 0.px
    padding = 10.px
    display = Display.flex
    height = 3.em
}

fun PropertiesBuilder.buildFooterContentStyle() {
    flex = Flex.content
    color = white
    display = Display.flex
    justifyContent = JustifyContent.center
    alignItems = AlignItems.center
}

fun PropertiesBuilder.buildFooterLinkStyle() {
    color = white
    textDecoration = TextDecoration.blink
    hover {
        color = hoverOnWhiteColor
    }
}

fun PropertiesBuilder.buildBodyLinkStyle() {
    color = black
    textDecoration = TextDecoration.blink
    hover {
        color = hoverOnBlackColor
    }
}
