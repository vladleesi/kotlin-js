package pages

import emotion.react.css
import react.ChildrenBuilder
import react.FC
import react.dom.html.ReactHTML
import react.dom.html.ReactHTML.a
import react.dom.html.ReactHTML.div
import react.dom.html.ReactHTML.footer
import react.dom.html.ReactHTML.header
import react.dom.html.ReactHTML.img
import react.dom.html.ReactHTML.li
import react.dom.html.ReactHTML.nav
import react.dom.html.ReactHTML.p
import react.dom.html.ReactHTML.span
import react.dom.html.ReactHTML.ul
import react.router.Outlet
import style.*
import web.cssom.*
import web.cssom.None.Companion.none
import web.window.WindowTarget

val HomePage = FC {

    header {
        css {
            justifyContent = JustifyContent.spaceBetween
            alignItems = AlignItems.center
            display = Display.flex
            width = 100.pct
            paddingTop = 1.em
            fontSize = 20.px
        }
        a {
//            css { buildHeaderLinkStyle() }
//            href = "/"
            +"@vladleesi"
        }
        nav {
            ul {
                css {
                    display = Display.flex
                    columnGap = 1.em
                    listStyleType = none
                }
                li {

                    a {
                        css { buildHeaderLinkStyle() }
                        href = "#Welcome"
                        +"Welcome"
                    }
                }
                li {
                    a {
                        css { buildHeaderLinkStyle() }
                        href = "#Projects"
                        +"Projects"
                    }
                }
                li {
                    a {
                        css { buildHeaderLinkStyle() }
                        href = "#Contact"
                        +"Contact"
                    }
                }
            }
        }
    }

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
            css {
                marginTop = 40.px
                fontSize = 36.px
                textAlign = TextAlign.center
            }
            +"Site Under Construction"
        }


        img {
            css {
                width = 20.pct
                marginTop = 3.em
            }
            id = "Welcome"
            src = "https://avatars.githubusercontent.com/vladleesi"
            alt = "Some handsome guy"
        }

        div {
            css {
                marginTop = 1.em
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
            id = "Projects"
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
                        tags = listOf("Kotlin", "Compose Multiplatform", "KMP", "SwiftUI"),
                        title = "Braindance",
                        description = "Explore games, add favorites, get details, follow release calendar, and read game news. Multiplatform app for Android, iOS, Desktop. Built with KMM & Jetpack Compose.",
                        redirectUrl = "https://github.com/vladleesi/braindance-app"
                    )
                )
                buildProjectCell(
                    project = Project(
                        tags = listOf("Kotlin", "Android SDK"),
                        title = "Kutilicious",
                        description = "Lightweight library with a set of small Kotlin and Android extensions for a better development experience.",
                        redirectUrl = "https://github.com/vladleesi/kutilicious"
                    )
                )
            }

            projectRow {
                buildProjectCell(
                    project = Project(
                        tags = listOf("Kotlin/JS", "HTML", "CSS", "React"),
                        title = "Personal website",
                        description = "Personal website developed in Kotlin/JS. Why? I don't know, but it was fun.",
                        redirectUrl = "https://github.com/vladleesi/vladleesi.github.io"
                    )
                )
                buildProjectCell(
                    project = Project(
                        tags = listOf(
                            "Kotlin", "Compose Multiplatform", "KMP"
                        ),
                        title = "Factastic",
                        description = "Useless facts every day! Here's an example of a multiplatform app with shared UI and network logic built with Kotlin Multiplatform and Compose Multiplatform for Android, iOS and Desktop.",
                        redirectUrl = "https://github.com/vladleesi/factastic"
                    )
                )
            }

            projectRow {
                buildProjectCell(
                    project = Project(
                        tags = listOf("Kotlin", "Compose Multiplatform"),
                        title = "Yet Another Calculator (YAC)",
                        description = "Behold, here it is – yet another calculator! This marvel of innovation will calculate stuff, just like countless others before it. Built for Android and iOS using Compose Multiplatform.",
                        redirectUrl = "https://github.com/vladleesi/yet-another-calculator"
                    )
                )
                buildProjectCell(
                    project = Project(
                        tags = listOf("Kotlin", "Android SDK"),
                        title = "Scanmate",
                        description = "A simple QR code scanner with tactile and audio feedback. You can also save and view previously scanned codes.",
                        redirectUrl = "https://github.com/vladleesi/scanmate"
                    )
                )
            }
        }

        div {
            id = "Contact"
            css {
                marginTop = 64.px
                fontSize = 36.px
            }
            +"Contact"
        }

        footer {
            css {
                display = Display.flex
                justifyContent = JustifyContent.spaceBetween
                marginTop = 2.em
                marginBottom = 2.em
            }
            div {
                div {
                    css {
                        maxWidth = 400.px
                        marginBottom = 24.px
                    }
                    +"If you're interested in discussing job opportunities or have any project ideas, please don't hesitate to email me. I'm keen to hear about your project and see how I can help out."
                }
                a {
                    css {
                        buildHeaderLinkStyle()
                        fontSize = 24.px
                    }
                    href = "mailto:hello@vladleesi.dev"
                    +"hello@vladleesi.dev"
                }
            }

            div {
                +"Also you can find me here"
                div {
                    css {
                        display = Display.flex
                        justifyContent = JustifyContent.spaceBetween
                        marginTop = 1.em
                        fontSize = 18.px
                    }
                    div {
                        div {
                            a {
                                css { buildHeaderLinkStyle() }
                                href = "https://dev.to/vladleesi"
                                target = WindowTarget._blank
                                +"Dev.to"
                            }
                        }
                        div {
                            css {
                                marginTop = 0.5.em
                            }
                            a {
                                css { buildHeaderLinkStyle() }
                                href = "https://github.com/vladleesi"
                                target = WindowTarget._blank
                                +"GitHub"
                            }
                        }
                    }
                    div {
                        div {
                            a {
                                css { buildHeaderLinkStyle() }
                                href = "https://twitter.com/vladleesi"
                                target = WindowTarget._blank
                                +"Twitter"
                            }
                        }
                        div {
                            css {
                                marginTop = 0.5.em
                            }
                            a {
                                css { buildHeaderLinkStyle() }
                                href = "https://www.linkedin.com/in/vladkochetov/"
                                target = WindowTarget._blank
                                +"LinkedIn"
                            }
                        }
                    }
                }
            }
        }
    }

    div {
        css {
            justifyContent = JustifyContent.center
            alignItems = AlignItems.center
            display = Display.flex
            marginTop = 3.em
            marginBottom = 1.em
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
    ReactHTML.table {
        css {
            display = Display.table
            width = 100.pct
            borderCollapse = BorderCollapse.separate
            borderSpacing = 0.2.em
            marginTop = 1.em
            tableLayout = TableLayout.fixed
        }
        builder.invoke(this)
    }
}

private fun ChildrenBuilder.projectRow(builder: ChildrenBuilder.() -> Unit) {
    ReactHTML.tr {
        builder.invoke(this)
    }
}

private fun ChildrenBuilder.buildProjectCell(project: Project) {
    ReactHTML.td {
        css {
            backgroundColor = white
            padding = 0.75.em
            display = Display.tableCell
            verticalAlign = VerticalAlign.top
        }
        div {
            css {
                display = Display.flex
                flexFlow = FlexFlow.row
            }
            for (tag in project.tags) {
                div {
                    css {
                        backgroundColor = backgroundBlack
                        marginRight = 0.125.rem
                    }
                    div {
                        css {
                            paddingLeft = 0.5.em
                            paddingRight = 0.5.em
                            paddingTop = 0.25.em
                            paddingBottom = 0.25.em
                            fontSize = 0.9.rem
                        }
                        +tag
                    }
                }
            }
        }
        div {
            css {
                fontSize = 20.px
                fontWeight = FontWeight.bold
                marginTop = 1.em
                color = backgroundBlack
            }
            a {
                css { buildContentLinkStyle() }
                href = project.redirectUrl
                target = WindowTarget._blank
                +project.title
            }
        }
        if (project.description != "") {
            div {
                css {
                    marginTop = 1.em
                    fontSize = 1.em
                    color = backgroundBlack
                }
                +project.description
            }
        }
    }
}

private data class Project(
    val tags: List<String>,
    val title: String,
    val description: String,
    val redirectUrl: String
)
