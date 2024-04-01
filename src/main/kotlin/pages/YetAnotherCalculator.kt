package pages

import emotion.react.css
import react.FC
import react.dom.html.ReactHTML.div
import react.dom.html.ReactHTML.h2
import react.router.Outlet
import web.cssom.AlignItems
import web.cssom.Display
import web.cssom.FlexDirection
import web.cssom.JustifyContent

val YetAnotherCalculatorPage = FC {
    div {
        css {
            justifyContent = JustifyContent.center
            alignItems = AlignItems.center
            display = Display.grid
            flexDirection = FlexDirection.column
        }
        h2 {
            +"The YAC page is under construction.."
        }
    }
    Outlet()
}