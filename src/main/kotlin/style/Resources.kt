package style

import web.dom.document


val fontLink = document.createElement("link").apply {
    setAttribute("rel", "stylesheet")
    setAttribute("href", "https://fonts.googleapis.com/css2?family=Manrope:wght@400;500;600;700&display=swap")
}

val faviconLink = document.createElement("link").apply {
    setAttribute("rel", "icon")
    setAttribute("type", "image/svg")
    setAttribute("href", "./favicon.svg")
}
