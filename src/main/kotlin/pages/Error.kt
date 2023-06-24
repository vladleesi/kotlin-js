package pages

import react.VFC
import react.dom.html.ReactHTML

val Error = VFC {
    ReactHTML.h1 {
        +"Unknown error"
    }
}