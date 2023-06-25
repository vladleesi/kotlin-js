package pages

import emotion.react.css
import react.VFC
import react.dom.html.ReactHTML.a
import react.dom.html.ReactHTML.div
import react.dom.html.ReactHTML.footer
import react.dom.html.ReactHTML.h1
import react.dom.html.ReactHTML.h3
import react.router.Outlet
import web.cssom.*

val HomePage = VFC {

    footer {
        css {
            backgroundColor = Color("#171717")
            margin = 0.px
            padding = 10.px
            display = Display.flex
            height = 3.em
        }
        id = "footer"

        div {
            css {
                flex = Flex.content
                color = Color("#ffffff")
                display = Display.flex
                justifyContent = JustifyContent.center
                alignItems = AlignItems.center
            }
            a {
                css {
                    color = Color("#FFFFFF")
                    textDecoration = TextDecoration.blink
                    hover {
                        color = Color("#D9D9D9")
                    }
                }
                href = "mailto:vladleesi@outlook.com"
                +"vladleesi@outlook.com"
            }
        }

        div {
            css {
                flex = Flex.content
                color = Color("#ffffff")
                display = Display.flex
                justifyContent = JustifyContent.center
                alignItems = AlignItems.center
            }
            div {
                css {
                    marginRight = 8.px
                }
                a {
                    css {
                        color = Color("#FFFFFF")
                        textDecoration = TextDecoration.blink
                        hover {
                            color = Color("#D9D9D9")
                        }
                    }
                    href = "https://github.com/vladleesi"
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
                    css {
                        color = Color("#FFFFFF")
                        textDecoration = TextDecoration.blink
                        hover {
                            color = Color("#D9D9D9")
                        }
                    }
                    href = "https://www.linkedin.com/in/vladkochetov/"
                    +"LinkedIn"
                }
            }
            +"/"
            div {
                css {
                    marginLeft = 8.px
                }
                a {
                    // TODO: Move colors and styles from here
                    css {
                        color = Color("#FFFFFF")
                        textDecoration = TextDecoration.blink
                        hover {
                            color = Color("#D9D9D9")
                        }
                    }
                    href = "https://twitter.com/vladleesi"
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
                    href = "https://github.com/vladleesi/kutilicious"
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
                    href = "https://github.com/vladleesi/braindance-app"
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
                    href = "https://github.com/vladleesi/yet-another-calculator"
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
                    href = "https://github.com/vladleesi/scanmate"
                    +"Scanmate"
                }
            }
        }
    }

    Outlet()
}