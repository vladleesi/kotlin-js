package pages

import emotion.react.css
import react.ChildrenBuilder
import react.FC
import react.dom.html.ReactHTML.a
import react.dom.html.ReactHTML.div
import react.dom.html.ReactHTML.img
import react.dom.html.ReactHTML.p
import react.dom.html.ReactHTML.span
import react.router.Outlet
import react.router.dom.Link
import style.*
import web.cssom.*
import web.window.WindowTarget

val HomePage = FC {
    div {
        css {
            justifyContent = JustifyContent.center
            alignItems = AlignItems.center
            display = Display.grid
            textAlign = TextAlign.start
            flexDirection = FlexDirection.column
            backgroundColor = backgroundBlack
        }

        div {
            css { buildFooterStyle() }

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
            +"Hi there!"
        }
        div {
            css {
                fontSize = 36.px
            }
            +"I'm "
            span {
                css { buildContentTextBackgroundStyle() }
                +"developing Android applications"
            }
            +" and exploring other interesting little things. My name is Vladislav Kochetov, or just "
            span {
                css {
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

        projectTable {
            projectRow {
                buildProjectCell(
                    project = Project(
                        tags = listOf("Kotlin", "Android", "Jetpack Compose", "KMM", "iOS", "SwiftUI"),
                        title = "Braindance",
                        description = "Explore games, add favorites, get details, follow release calendar, and read game news. Multiplatform app for Android, iOS, Desktop. Built with KMM & Jetpack Compose.",
                        redirectUrl = null,
                        githubUrl = "https://github.com/vladleesi/braindance-app"
                    ),
                    isMarginLeftNeeded = false
                )
                buildProjectCell(
                    project = Project(
                        tags = listOf("Kotlin", "Android"),
                        title = "Kutilicious",
                        description = "Lightweight library with a set of small Kotlin and Android extensions for a better development experience.",
                        redirectUrl = "https://vladleesi.dev/kutilicious",
                        githubUrl = "https://github.com/vladleesi/kutilicious"
                    ),
                    isMarginLeftNeeded = true
                )
            }

            projectRow(marginTop = 8.px) {
                buildProjectCell(
                    project = Project(
                        tags = listOf("Kotlin/JS", "React", "HTML", "CSS"),
                        title = "Personal website",
                        description = "Personal website developed in Kotlin/JS. Why? I don't know, but it was fun.",
                        redirectUrl = "/",
                        githubUrl = "https://github.com/vladleesi/vladleesi.github.io"
                    ),
                    isMarginLeftNeeded = false
                )
                buildProjectCell(
                    project = Project(
                        tags = listOf(
                            "Kotlin", "Android", "iOS", "Desktop", "Compose Multiplatform", "Kotlin Multiplatform"
                        ),
                        title = "Factastic",
                        description = "Useless facts every day! Here's an example of a multiplatform app with shared UI and network logic built with Kotlin Multiplatform and Compose Multiplatform for Android, iOS and Desktop.",
                        redirectUrl = null,
                        githubUrl = "https://github.com/vladleesi/factastic"
                    ),
                    isMarginLeftNeeded = true
                )
            }

            projectRow(marginTop = 8.px) {
                buildProjectCell(
                    project = Project(
                        tags = listOf("Kotlin", "Compose Multiplatform", "Android", "iOS"),
                        title = "Yet Another Calculator (YAC)",
                        description = "Behold, here it is – yet another calculator! This marvel of innovation will calculate stuff, just like countless others before it. Built for Android and iOS using Compose Multiplatform.",
                        redirectUrl = null,
                        githubUrl = "https://github.com/vladleesi/yet-another-calculator"
                    ),
                    isMarginLeftNeeded = false
                )
                buildProjectCell(
                    project = Project(
                        tags = listOf("Kotlin", "Android"),
                        title = "Scanmate",
                        description = "A simple QR code scanner with tactile and audio feedback. You can also save and view previously scanned codes.",
                        redirectUrl = null,
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
                fontSize = 14.px
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
                css {
                    buildBodyLinkStyle()
                }
                href = "https://github.com/vladleesi/vladleesi.github.io"
                target = WindowTarget._blank
                +"GitHub"
            }
            +"."
        }
    }

    Outlet()
}

private fun ChildrenBuilder.projectTable(builder: ChildrenBuilder.() -> Unit) {
    div {
        css {
            display = Display.table
            marginTop = 24.px
        }
        builder.invoke(this)
    }
}

private fun ChildrenBuilder.projectRow(marginTop: Margin = 0.px, builder: ChildrenBuilder.() -> Unit) {
    div {
        css {
            this.display = Display.flex
            this.flex = Flex.content
            this.flexDirection = FlexDirection.row
            this.marginTop = marginTop
        }
        builder.invoke(this)
    }
}

private fun ChildrenBuilder.buildProjectCell(project: Project, isMarginLeftNeeded: Boolean) {
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
                if (project.redirectUrl != null) {
                    Link {
                        css { buildContentLinkStyle() }
                        to = project.redirectUrl
                        +project.title
                    }
                } else {
                    css {
                        color = black
                        alignContent = AlignContent.center
                    }
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
                css { buildContentLinkStyle() }
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
    val redirectUrl: String?,
    val githubUrl: String
)
