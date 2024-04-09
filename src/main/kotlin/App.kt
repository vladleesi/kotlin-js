import js.objects.jso
import pages.Error
import pages.HomePage
import react.FC
import react.create
import react.dom.client.createRoot
import react.router.dom.RouterProvider
import react.router.dom.createBrowserRouter
import style.appStyle
import style.faviconLink
import style.fontLink
import web.dom.document

private val appRouter = createBrowserRouter(
    routes = arrayOf(
        jso {
            path = "/"
            element = HomePage.create()
            errorElement = Error.create()
        }
    )
)

private val App = FC {
    RouterProvider {
        router = appRouter
    }
}

fun main() {
    with(document.head) {
        appendChild(faviconLink)
        appendChild(fontLink)
        appendChild(appStyle)
    }

    val root = document.createElement("root")
        .also(document.body::appendChild)

    createRoot(root)
        .render(App.create())
}
