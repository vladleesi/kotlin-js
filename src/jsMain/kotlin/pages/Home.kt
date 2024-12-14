package pages

import emotion.react.css
import react.ChildrenBuilder
import react.FC
import react.dom.html.ReactHTML.a
import react.dom.html.ReactHTML.div
import react.dom.html.ReactHTML.footer
import react.dom.html.ReactHTML.header
import react.dom.html.ReactHTML.img
import react.dom.html.ReactHTML.p
import react.dom.html.ReactHTML.span
import react.router.Outlet
import style.*
import web.cssom.*
import web.cssom.atrule.maxWidth
import web.window.WindowTarget

private const val linkedIn = "https://www.linkedin.com/in/vladkochetov"
private const val github = "https://github.com/vladleesi"
private const val devTo = "https://dev.to/vladleesi"
private const val twitter = "https://twitter.com/vladleesi"

val HomePage = FC {
    header {
        css {
            justifyContent = JustifyContent.spaceBetween
            display = Display.flex
            paddingTop = 1.em

            media(maxWidth(768.px)) {
                flexDirection = FlexDirection.column
                alignItems = AlignItems.flexStart
                gap = 1.em
            }
        }
        span {
            css {
                display = Display.flex
                flexDirection = FlexDirection.column
                alignItems = AlignItems.flexStart
            }
            div {
                css {
                    color = white
                    fontSize = bodyContentFontSize
                }
                +"Vladislav Kochetov"
            }
            div {
                css {
                    color = white
                    fontSize = 16.px
                }
                +"Mobile Software Engineer"
            }
        }
        span {
            css {
                display = Display.flex
                columnGap = 1.em
                paddingTop = 8.px
                alignItems = AlignItems.flexStart
            }
            buildSocialUrl(github, "./github.svg", "GitHub")
            buildSocialUrl(linkedIn, "./linkedin.svg", "LinkedIn")
            buildSocialUrl(devTo, "./dev-to.svg", "dev.to")
            buildSocialUrl(twitter, "./twitter-x.svg", "X (Twitter)")
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
                marginTop = 64.px
                fontSize = bodyContentFontSize
            }
            +"Hi there! I'm "
            span {
                css { buildContentTextBackgroundStyle() }
                +"developing Android applications"
            }
            +" and exploring other interesting little things. My name is Vladislav Kochetov, or just "
            span {
                css {
                    color = accent
                }
                a {
                    css { buildContentTextWavyStyle(textColor = white, textOnHoverColor = hoverOnAccentColor) }
                    href = github
                    target = WindowTarget._blank
                    +"@vladleesi"
                }
            }
            +"."
        }
        div {
            id = "Projects"
            css {
                marginTop = 2.em
                fontSize = bodyContentFontSize
            }
            +"Projects"
        }

        buildProjectBlock(
            project = Project(
                tags = listOf("Kotlin", "Compose Multiplatform", "KMP", "SwiftUI"),
                title = "Braindance",
                description = "Explore games, add favorites, get details, follow release calendar, and read game news. Multiplatform app for Android, iOS, Desktop. Built with KMP & Jetpack Compose.",
                redirectUrl = "https://github.com/vladleesi/braindance-app"
            )
        )
        buildProjectBlock(
            project = Project(
                tags = listOf("Kotlin", "Android SDK"),
                title = "Kutilicious",
                description = "Lightweight library with a set of small Kotlin and Android extensions for a better development experience.",
                redirectUrl = "https://github.com/vladleesi/kutilicious"
            )
        )
        buildProjectBlock(
            project = Project(
                tags = listOf("Kotlin/JS", "HTML", "CSS", "React"),
                title = "Personal website",
                description = "Personal website developed in Kotlin/JS. Why? I don't know, but it was fun.",
                redirectUrl = "https://github.com/vladleesi/vladleesi.github.io"
            )
        )
        buildProjectBlock(
            project = Project(
                tags = listOf(
                    "Kotlin", "Compose Multiplatform", "KMP"
                ),
                title = "Factastic",
                description = "Useless facts every day! Here's an example of a multiplatform app with shared UI and network logic built with Kotlin Multiplatform and Compose Multiplatform for Android, iOS and Desktop.",
                redirectUrl = "https://github.com/vladleesi/factastic"
            )
        )
        buildProjectBlock(
            project = Project(
                tags = listOf("Kotlin", "Compose Multiplatform"),
                title = "Yet Another Calculator (YAC)",
                description = "Behold, here it is – yet another calculator! This marvel of innovation will calculate stuff, just like countless others before it. Built for Android and iOS using Compose Multiplatform.",
                redirectUrl = "https://github.com/vladleesi/yet-another-calculator"
            )
        )
        buildProjectBlock(
            project = Project(
                tags = listOf("Kotlin", "Android SDK"),
                title = "Scanmate",
                description = "A simple QR code scanner with tactile and audio feedback. You can also save and view previously scanned codes.",
                redirectUrl = "https://github.com/vladleesi/scanmate"
            )
        )

        div {
            id = "Contact"
            css {
                marginTop = 2.em
                marginBottom = 1.em
                fontSize = bodyContentFontSize
            }
            +"Contact"
        }

        footer {
            css {
                display = Display.flex
                justifyContent = JustifyContent.spaceBetween
                marginBottom = 2.em
            }
            div {
                div {
                    css {
                        marginBottom = 16.px
                    }
                    +"If you're interested in discussing job opportunities or have any project ideas, please don't hesitate to email me. I'm keen to hear about your project and see how I can help out."
                }
                a {
                    css {
                        buildContentLinkStyle(textColor = white, textOnHoverColor = hoverOnWhiteColor)
                        fontSize = 20.px
                    }
                    href = "mailto:hello@vladleesi.dev"
                    +"hello@vladleesi.dev"
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
                css { buildContentLinkStyle(textColor = white, textOnHoverColor = hoverOnWhiteColor) }
                href = "https://kotlinlang.org/docs/js-overview.html"
                target = WindowTarget._blank
                +"Kotlin/JS"
            }
            +", source code on "
            a {
                css {
                    buildContentLinkStyle(textColor = white, textOnHoverColor = hoverOnWhiteColor)
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

private fun ChildrenBuilder.buildSocialUrl(
    hrefString: String,
    srcString: String,
    altString: String
) {
    a {
        href = hrefString
        target = WindowTarget._blank
        img {
            src = srcString
            alt = altString
            css {
                width = 24.px
                height = 24.px
                hover {
                    filter = brightness(0.75)
                }
            }
        }
    }
}

private fun ChildrenBuilder.buildProjectBlock(project: Project) {
    span {
        div {
            css {
                fontSize = 16.px
                marginTop = 1.em
                color = white
            }
            a {
                css { buildContentLinkStyle(textColor = white, textOnHoverColor = hoverOnWhiteColor) }
                href = project.redirectUrl
                target = WindowTarget._blank
                +project.title
            }
        }
        if (project.description != "") {
            div {
                css {
                    marginTop = 8.px
                    fontSize = 16.px
                    color = white
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
