package pages

import emotion.react.css
import react.ChildrenBuilder
import react.VFC
import react.dom.html.ReactHTML.a
import react.dom.html.ReactHTML.div
import react.dom.html.ReactHTML.footer
import react.dom.html.ReactHTML.h1
import react.dom.html.ReactHTML.h3
import react.dom.html.ReactHTML.p
import react.router.Outlet
import style.*
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
            display = Display.grid
            flexDirection = FlexDirection.column
        }
        div {
            css {
                marginTop = 16.px
            }
            h3 {
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
            h1 {
                +"Projects"
            }
        }

        div {
            css {
                display = Display.table
                maxWidth = 768.px
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
                    isMarginNeeded = false
                )
                buildProjectRow(
                    Project(
                        tags = listOf("Kotlin", "Android", "Jetpack Compose", "KMM", "iOS", "SwiftUI"),
                        title = "Braindance",
                        description = "Explore games, add favorites, get details, follow release calendar, and read game news. Multiplatform app for Android, iOS, Desktop. Built with KMM & Jetpack Compose.",
                        redirectUrl = "#/braindance",
                        githubUrl = "https://github.com/vladleesi/braindance-app"
                    ),
                    isMarginNeeded = true
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
                    isMarginNeeded = false
                )
                buildProjectRow(
                    Project(
                        tags = listOf("Kotlin", "Android"),
                        title = "Scanmate",
                        description = "",
                        redirectUrl = "#/scanmate",
                        githubUrl = "https://github.com/vladleesi/scanmate"
                    ),
                    isMarginNeeded = true
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
            +"Copyright © 2023 "
            a {
                css { buildBodyLinkStyle() }
                href = ""
                target = WindowTarget._blank
                +"vladleesi"
            }
            +". All rights reserved."
        }
    }

    Outlet()
}

private fun ChildrenBuilder.buildProjectRow(project: Project, isMarginNeeded: Boolean) {
    div {
        css {
            backgroundColor = sectionBackgroundColor

            padding = 16.px

            val radius = 8.px
            borderBottomLeftRadius = radius
            borderBottomRightRadius = radius
            borderTopLeftRadius = radius
            borderTopRightRadius = radius

            if (isMarginNeeded) {
                marginLeft = 8.px
            }
        }
        div {
            css {
                display = Display.flex
                flexDirection = FlexDirection.row
                fontSize = 12.px
            }
            for (tag in project.tags) {
                div {
                    css {
                        backgroundColor = lightGray
                        marginRight = 2.px

                        val radius = 64.px
                        borderBottomLeftRadius = radius
                        borderBottomRightRadius = radius
                        borderTopLeftRadius = radius
                        borderTopRightRadius = radius
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
                fontSize = 16.px
                marginTop = 16.px
                fontWeight = FontWeight.bold
                fontSize = 14.px
            }
            +project.title
        }
        if (project.description != "") {
            div {
                css {
                    marginTop = 16.px
                    fontSize = 14.px
                }
                +project.description
            }
        }
        div {
            css {
                display = Display.flex
                flexDirection = FlexDirection.row
                marginTop = 32.px
                fontSize = 14.px
                color = gray
            }
            a {
                css { buildContentLinkStyle() }
                href = project.redirectUrl
                +"Website"
            }
            div {
                css {
                    marginLeft = 8.px
                    marginRight = 8.px
                }
                +"•"
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
    val redirectUrl: String,
    val githubUrl: String
)
