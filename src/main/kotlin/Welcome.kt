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
            div {
                img {
                    css {
                        width = 80.px
                        height = 80.px
                        float = Float.left
                        borderRadius = 100.px
                    }
                    src = "https://avatars.githubusercontent.com/u/30999008"
                }
            }
            div {
                css {
//                color = Color("#64ffda")
                    color = Color("#000000")
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
                        src = "./ic_mail.png"
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
                        src = "./ic_github_mark.svg"
                    }
                }
                a {
                    css {
                        marginLeft = 8.px
                    }
                    target = AnchorTarget._blank
                    href = "https://www.linkedin.com/in/vladislav-kochetov/"

                    img {
                        css {
                            width = 24.px
                            height = 24.px
                        }
                        src = "./ic_linkedin.svg"
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
                    css {
                        color = Color("#000000")
                    }
                    target = AnchorTarget._blank
                    href = "https://github.com/vladleesi/chronicle"
                    +"chronicle"
                }
            }
            div {
                css {
                    color = Color("#000000")
                    marginLeft = 8.px
                    marginRight = 8.px
                }
                +"•"
            }
            div {
                a {
                    css {
                        color = Color("#000000")
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
                css {
                    color = Color("#000000")
                }
                target = AnchorTarget._blank
                href = "https://medium.com/@vladleesi/motivation-for-learning-the-key-to-success-20b7fba555b9"
                +"Motivation for Learning: The Key to Success"
            }
        }
    }
}

