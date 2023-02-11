import kotlinx.browser.document
import kotlinx.dom.createElement
import react.create
import react.dom.client.createRoot

fun main() {
    // Favicon
    val iconLink = document.createElement("link") {
        setAttribute("rel", "icon")
        setAttribute("type", "image/svg")
        setAttribute("href", "./favicon.svg")
    }
    document.head?.appendChild(iconLink)

    val style = document.createElement("style")
    style.innerHTML = """
        body {
            width: 100%;
            font-family: 'Arial', 'Helvetica Neue', Helvetica, sans-serif;
            color: #333333;
        }
    """
    document.head?.appendChild(style)

    // Body
    val container = document.createElement("div")
    document.body?.appendChild(container)

    val welcome = Welcome.create {
        name = "Kotlin/JS"
    }
    createRoot(container).render(Welcome.create())
}
