package pages

import emotion.react.css
import react.ChildrenBuilder
import react.FC
import react.dom.html.ReactHTML.a
import react.dom.html.ReactHTML.b
import react.dom.html.ReactHTML.div
import react.dom.html.ReactHTML.img
import react.dom.html.ReactHTML.p
import react.dom.html.ReactHTML.span
import react.router.Outlet
import style.*
import web.cssom.*
import web.window.WindowTarget

val HomePage = FC {
    val maxContentWidth = 768.px

    div {
        css {
            justifyContent = JustifyContent.center
            alignItems = AlignItems.center
            display = Display.grid
            flexDirection = FlexDirection.column
            backgroundColor = backgroundBlack
        }

        div {
            css { buildFooterStyle(maxWidthValue = maxContentWidth) }

            span {
                a {
                    css { buildFooterLinkStyle() }
                    href = "mailto:hello@vladleesi.dev"

                    img {
                        css {
                            height = 18.px
                            verticalAlign = VerticalAlign.middle
                            marginRight = 6.px
                        }
                        src = "./email.svg"
                    }
                    +"hello@vladleesi.dev"
                }
            }

            span {
                span {
                    css {
                        marginRight = 8.px
                    }
                    a {
                        css { buildFooterLinkStyle() }
                        href = "https://dev.to/vladleesi"
                        target = WindowTarget._blank
                        +"dev.to"
                    }
                }
                +"/"
                span {
                    css {
                        marginLeft = 8.px
                        marginRight = 8.px
                    }
                    a {
                        css { buildFooterLinkStyle() }
                        href = "https://github.com/vladleesi"
                        target = WindowTarget._blank
                        +"github"
                    }
                }
                +"/"
                span {
                    css {
                        marginLeft = 8.px
                        marginRight = 8.px
                    }
                    a {
                        css { buildFooterLinkStyle() }
                        href = "https://twitter.com/vladleesi"
                        target = WindowTarget._blank
                        +"twitter"
                    }
                }
                +"/"
                span {
                    css {
                        marginLeft = 8.px
                    }
                    a {
                        css { buildFooterLinkStyle() }
                        href = "https://www.linkedin.com/in/vladkochetov/"
                        target = WindowTarget._blank
                        +"linkedin"
                    }
                }
            }
        }

        div {
            css {
                marginTop = 72.px
                fontSize = 36.px
            }
            +"Site Under Construction"
        }

        div {
            css {
                marginTop = 72.px
                fontSize = 36.px
            }
            +"Hi there! \uD83D\uDC4B"
        }
        div {
            css {
                fontSize = 36.px
                maxWidth = maxContentWidth
            }
            +"I'm "
            span {
                css { buildContentTextBackgroundStyle() }
                +"developing Android applications"
            }
            +" and exploring other interesting little things. My name is Vladislav Kochetov, or just "
            span {
                css {
//                    buildContentTextBackgroundStyle()
                    color = accent
                }
                +"@vladleesi"
            }
            +"."
        }
        div {
            css {
                marginTop = 64.px
                fontSize = 36.px
            }
            +"Projects"
        }

        div {
            css {
                display = Display.table
                maxWidth = maxContentWidth
                marginTop = 24.px
            }
            div {
                css {
                    display = Display.flex
                    flex = Flex.content
                    flexDirection = FlexDirection.row
                }
                buildProjectRow(
                    project = Project(
                        tags = listOf("Kotlin", "Android"),
                        title = "Kutilicious",
                        description = "Lightweight library with a set of small Kotlin and Android extensions for a better development experience.",
                        redirectUrl = "#/kutilicious",
                        githubUrl = "https://github.com/vladleesi/kutilicious"
                    ),
                    isMarginLeftNeeded = false
                )
                buildProjectRow(
                    Project(
                        tags = listOf("Kotlin", "Android", "Jetpack Compose", "KMM", "iOS", "SwiftUI"),
                        title = "Braindance",
                        description = "Explore games, add favorites, get details, follow release calendar, and read game news. Multiplatform app for Android, iOS, Desktop. Built with KMM & Jetpack Compose.",
                        redirectUrl = "#/braindance",
                        githubUrl = "https://github.com/vladleesi/braindance-app"
                    ),
                    isMarginLeftNeeded = true
                )
            }
            div {
                css {
                    display = Display.flex
                    flex = Flex.content
                    flexDirection = FlexDirection.row
                    marginTop = 8.px
                }
                buildProjectRow(
                    Project(
                        tags = listOf(
                            "Kotlin",
                            "Android",
                            "iOS",
                            "Desktop",
                            "Compose Multiplatform",
                            "Kotlin Multiplatform"
                        ),
                        title = "Factastic",
                        description = "Useless facts every day! Here's an example of a multiplatform app with shared UI and network logic built with Kotlin Multiplatform and Compose Multiplatform for Android, iOS and Desktop.",
                        redirectUrl = "#/factastic",
                        githubUrl = "https://github.com/vladleesi/factastic"
                    ),
                    isMarginLeftNeeded = false
                )
            }
            div {
                css {
                    display = Display.flex
                    flex = Flex.content
                    flexDirection = FlexDirection.row
                    marginTop = 8.px
                }
                buildProjectRow(
                    project = Project(
                        tags = listOf("Kotlin", "Compose Multiplatform", "Android", "iOS"),
                        title = "Yet Another Calculator (YAC)",
                        description = "Behold, here it is – yet another calculator! This marvel of innovation will calculate stuff, just like countless others before it. Built for Android and iOS using Compose Multiplatform.",
                        redirectUrl = "#/yet-another-calculator",
                        githubUrl = "https://github.com/vladleesi/yet-another-calculator"
                    ),
                    isMarginLeftNeeded = false
                )
                buildProjectRow(
                    Project(
                        tags = listOf("Kotlin", "Android"),
                        title = "Scanmate",
                        description = "Simple QR-Code scanner with haptic and sound feedback.",
                        redirectUrl = "#/scanmate",
                        githubUrl = "https://github.com/vladleesi/scanmate"
                    ),
                    isMarginLeftNeeded = true
                )
            }
        }
    }

    div {
        css {
            justifyContent = JustifyContent.center
            alignItems = AlignItems.center
            display = Display.flex
            marginTop = 48.px
        }
        p {
            css {
                fontSize = 12.px
            }
            +"Built on "
            a {
                css { buildBodyLinkStyle() }
                href = "https://kotlinlang.org/docs/js-overview.html"
                target = WindowTarget._blank
                +"Kotlin/JS"
            }
            +", source code on "
            a {
                css { buildBodyLinkStyle() }
                href = "https://github.com/vladleesi/vladleesi.github.io"
                target = WindowTarget._blank
                +"GitHub"
            }
            +"."
        }
    }

    Outlet()
}

private fun ChildrenBuilder.buildProjectRow(project: Project, isMarginLeftNeeded: Boolean) {
    div {
        css {
            backgroundColor = white
            padding = 12.px

            if (isMarginLeftNeeded) {
                marginLeft = 8.px
            }
        }
        div {
            css {
                display = Display.flex
                flexDirection = FlexDirection.row
                fontSize = 14.px
            }
            for (tag in project.tags) {
                div {
                    css {
                        backgroundColor = backgroundBlack
                        marginRight = 2.px
                    }
                    div {
                        css {
                            marginLeft = 8.px
                            marginRight = 8.px
                            marginTop = 4.px
                            marginBottom = 4.px
                        }
                        +tag
                    }
                }
            }
        }
        div {
            css {
                fontSize = 20.px
                marginTop = 16.px
                fontWeight = FontWeight.bold
                color = backgroundBlack
            }
            a {
                css { buildContentLinkStyle() }
                href = project.redirectUrl
                b {
                    +project.title
                }
            }
        }
        if (project.description != "") {
            div {
                css {
                    marginTop = 16.px
                    fontSize = 16.px
                    color = backgroundBlack
                }
                +project.description
            }
        }
        div {
            css {
                display = Display.flex
                flexDirection = FlexDirection.row
                marginTop = 16.px
                fontSize = 14.px
                color = gray
            }
            a {
                css {
                    buildContentLinkStyle()
                    color = lightGray
                }
                href = project.githubUrl
                target = WindowTarget._blank
                +"GitHub"
            }
        }
    }
}

private data class Project(
    val tags: List<String>,
    val title: String,
    val description: String,
    val redirectUrl: String,
    val githubUrl: String
)
