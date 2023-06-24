import js.core.jso
import pages.BraindancePage
import pages.Error
import pages.HomePage
import pages.KutiliciousPage
import react.VFC
import react.create
import react.dom.client.createRoot
import react.router.RouterProvider
import react.router.dom.createHashRouter
import style.appStyle
import style.faviconLink
import style.fontLink
import web.dom.document

private val appRouter = createHashRouter(
    routes = arrayOf(
        jso {
            path = "/"
            element = HomePage.create()
            errorElement = Error.create()
        },
        jso {
            path = "/braindance"
            element = BraindancePage.create()
            errorElement = Error.create()
        },
        jso {
            path = "/kutilicious"
            element = KutiliciousPage.create()
            errorElement = Error.create()
        }
    ),
)

private val App = VFC {
    RouterProvider {
        router = appRouter
    }
}

fun main() {
    document.head.appendChild(faviconLink)
    document.head.appendChild(fontLink)
    document.head.appendChild(appStyle)

    val root = document.createElement("div")
        .also(document.body::appendChild)

    createRoot(root)
        .render(App.create())
}
