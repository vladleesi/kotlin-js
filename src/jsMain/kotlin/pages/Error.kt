package pages

import react.FC
import react.dom.html.ReactHTML
import react.router.Outlet

val Error = FC {
    ReactHTML.h1 {
        +"Unknown error"
    }
    Outlet()
}