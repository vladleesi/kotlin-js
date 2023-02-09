import kotlinx.browser.document
import kotlinx.dom.createElement
import react.create
import react.dom.client.createRoot

fun main() {
//    document.bgColor = "#0a192f"
    // Favicon
    val iconLink = document.createElement("link") {
        setAttribute("rel", "icon")
        setAttribute("type", "image/png")
        setAttribute("href", "./favicon.png")
    }
    document.head?.appendChild(iconLink)

    // Mobile style
    val mobileStyle = document.createElement("style") {
        textContent = """
            @media only screen and (max-width: 767px) {
                /* Your mobile styles here */
            }
        """
    }
    document.head?.appendChild(mobileStyle)

    // Fonts
    val styleLink = document.createElement("link") {
        setAttribute("rel", "stylesheet")
        setAttribute("href", "https://fonts.googleapis.com/css2?family=Roboto&display=swap")
    }
    document.head?.appendChild(styleLink)

    val style = document.createElement("style")
    style.innerHTML = """
        body {
            font-family: 'Roboto', sans-serif;
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