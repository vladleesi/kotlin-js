package pages

import react.FC
import react.dom.html.ReactHTML

val Error = FC {
    ReactHTML.h1 {
        +"Unknown error"
    }
}