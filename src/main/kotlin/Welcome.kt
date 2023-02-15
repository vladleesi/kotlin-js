import csstype.*
import emotion.react.css
import react.FC
import react.Props
import react.dom.html.AnchorTarget
import react.dom.html.ReactHTML.a
import react.dom.html.ReactHTML.div
import react.dom.html.ReactHTML.h1
import react.dom.html.ReactHTML.h3
import react.dom.html.ReactHTML.img
import react.useState

external interface WelcomeProps : Props {
    var name: String
}

// TODO:
//  1. Page style
//  2. Effects
//  3. Flex mobile style
//  4. Content

val Welcome = FC<WelcomeProps> { props ->
    var name by useState(props.name)
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
//                height = 42.px
//            backgroundColor = Color("#ffffff")
                alignItems = AlignItems.center
                display = Display.flex
                flexDirection = FlexDirection.row
                maxWidth = 1200.px
            }
//            div {
//                img {
//                    css {
//                        width = 80.px
//                        height = 80.px
//                        float = Float.left
//                        borderRadius = 100.px
//                    }
//                    src = "https://avatars.githubusercontent.com/u/30999008"
//                }
//            }
            div {
                css {
//                color = Color("#64ffda")
//                    float = Float.left
                    marginLeft = 8.px
                }
                h1 {
                    +"Vladislav Kochetov"
                }
            }
            div {
                css {
//                position = Position.absolute
//                top = 10.px
//                right = 10.px
                    marginLeft = 120.px
                }
                a {
                    target = AnchorTarget._blank
                    href = "mailto:vladleesi@outlook.com"

                    img {
                        css {
                            width = 24.px
                            height = 24.px
                        }
                        src = "./Outlook_black.svg"
                    }
                }
                a {
                    css {
                        marginLeft = 8.px
                    }
                    target = AnchorTarget._blank
                    href = "https://github.com/vladleesi"

                    img {
                        css {
                            width = 24.px
                            height = 24.px
                        }
                        src = "./Github_black.svg"
                    }
                }
                a {
                    css {
                        marginLeft = 8.px
                    }
                    target = AnchorTarget._blank
                    href = "https://www.linkedin.com/in/vladislav-kochetov"

                    img {
                        css {
                            width = 24.px
                            height = 24.px
                        }
                        src = "./LinkedIN_black.svg"
                    }
                }
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
//                justifyContent = JustifyContent.center
                flexDirection = FlexDirection.row
            }
            div {
                a {
                    target = AnchorTarget._blank
                    href = "https://github.com/vladleesi/chronicle"
                    +"chronicle"
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
                    css {
//                        marginLeft = 20.px
                    }
                    target = AnchorTarget._blank
                    href = "https://github.com/vladleesi/ultimate-scanner-android"
                    +"scanner"
                }
            }
        }
        div {
            css {
                marginTop = marginSectionTop
            }
            h3 {
                +"Blog"
            }
        }
        div {
            a {
                target = AnchorTarget._blank
                href = "https://medium.com/@vladleesi/motivation-for-learning-the-key-to-success-20b7fba555b9"
                +"Motivation for Learning: The Key to Success"
            }
        }
        div {
            css {
                marginTop = 8.px
            }
            a {
                target = AnchorTarget._blank
                href = "https://medium.com/@vladleesi/how-to-choose-the-right-sport-for-you-7c1f46f8ff54"
                +"How to Choose the Right Sport for You"
            }
        }
        div {
            css {
                marginTop = 8.px
            }
            a {
                target = AnchorTarget._blank
                href = "https://medium.com/@vladleesi/getting-started-with-git-a-beginners-guide-f70b72db0a26"
                +"Getting Started with Git: A Beginner’s Guide"
            }
        }
    }
}

