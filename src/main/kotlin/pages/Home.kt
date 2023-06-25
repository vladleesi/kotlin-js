package pages

import emotion.react.css
import react.VFC
import react.dom.html.ReactHTML.a
import react.dom.html.ReactHTML.div
import react.dom.html.ReactHTML.footer
import react.dom.html.ReactHTML.h1
import react.dom.html.ReactHTML.h3
import react.router.Outlet
import style.buildBodyLinkStyle
import style.buildFooterContentStyle
import style.buildFooterLinkStyle
import style.buildFooterStyle
import web.cssom.*
import web.window.WindowTarget

val HomePage = VFC {

    footer {
        css { buildFooterStyle() }
        id = "footer"

        div {
            css { buildFooterContentStyle() }
            a {
                css { buildFooterLinkStyle() }
                href = "mailto:vladleesi@outlook.com"
                +"vladleesi@outlook.com"
            }
        }

        div {
            css { buildFooterContentStyle() }
            div {
                css {
                    marginRight = 8.px
                }
                a {
                    css { buildFooterLinkStyle() }
                    href = "https://github.com/vladleesi"
                    target = WindowTarget._blank
                    +"GitHub"
                }
            }
            +"/"
            div {
                css {
                    marginLeft = 8.px
                    marginRight = 8.px
                }
                a {
                    css { buildFooterLinkStyle() }
                    href = "https://www.linkedin.com/in/vladkochetov/"
                    target = WindowTarget._blank
                    +"LinkedIn"
                }
            }
            +"/"
            div {
                css {
                    marginLeft = 8.px
                }
                a {
                    css { buildFooterLinkStyle() }
                    href = "https://twitter.com/vladleesi"
                    target = WindowTarget._blank
                    +"Twitter"
                }
            }
        }
    }

    val marginSectionTop = 32.px
    div {
        css {
            justifyContent = JustifyContent.center
            alignItems = AlignItems.center
            display = Display.flex
            flexDirection = FlexDirection.column
        }
        div {
            css {
                marginTop = 16.px
            }
            h1 {
                +"Vladislav Kochetov"
            }
        }
        div {
            css {
                marginTop = 20.px
            }
            h1 {
                +"The site is under construction.."
            }
        }
        div {
            css {
                marginTop = marginSectionTop
            }
            h3 {
                +"Projects"
            }
        }

        div {
            css {
                display = Display.flex
                flexDirection = FlexDirection.row
            }
            div {
                a {
                    css { buildBodyLinkStyle() }
                    href = "https://github.com/vladleesi/kutilicious"
                    target = WindowTarget._blank
                    +"Kutilicious"
                }
            }
            div {
                css {
                    marginLeft = 8.px
                    marginRight = 8.px
                }
                +"•"
            }
            div {
                a {
                    css { buildBodyLinkStyle() }
                    href = "https://github.com/vladleesi/braindance-app"
                    target = WindowTarget._blank
                    +"Braindance"
                }
            }
            div {
                css {
                    marginLeft = 8.px
                    marginRight = 8.px
                }
                +"•"
            }
            div {
                a {
                    css { buildBodyLinkStyle() }
                    href = "https://github.com/vladleesi/yet-another-calculator"
                    target = WindowTarget._blank
                    +"Yet Another Calculator"
                }
            }
            div {
                css {
                    marginLeft = 8.px
                    marginRight = 8.px
                }
                +"•"
            }
            div {
                a {
                    css { buildBodyLinkStyle() }
                    href = "https://github.com/vladleesi/scanmate"
                    target = WindowTarget._blank
                    +"Scanmate"
                }
            }
        }
    }

    Outlet()
}
