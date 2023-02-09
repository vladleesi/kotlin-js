import csstype.*
import emotion.react.css
import react.FC
import react.Props
import react.dom.html.ReactHTML.a
import react.dom.html.ReactHTML.div
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
    div {
        css {
            justifyContent = JustifyContent.center
            alignItems = AlignItems.center
//            display = Display.flex
            flexDirection = FlexDirection.column
        }
        div {
            css {
                height = 42.px
//            backgroundColor = Color("#ffffff")
            }
            div {
                css {
//                color = Color("#64ffda")
                    color = Color("#000000")
                    float = Float.left
                }
                img {
                    css {
                        width = 42.px
                        height = 42.px
                        float = Float.left
                        borderRadius = 50.px
                    }
                    src = "https://avatars.githubusercontent.com/u/30999008"
                }
                +"Vladislav Kochetov"
            }
            div {
//            css {
//                position = Position.absolute
//                top = 10.px
//                right = 10.px
//            }
                a {
                    css {
                        color = Color("#000000")
                    }
                    href = "https://github.com/vladleesi"
                    +"github.com/vladleesi"
                }
            }
        }
        div {
            css {
                marginTop = 20.px
            }
            +"I'm incredible software engineer with 5 years of experience."
        }
        div {
            css {
                marginTop = 50.px
            }
            +"Projects"
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
                    href = "https://github.com/vladleesi/chronicle"
                    +"chronicle"
                }
            }
            div {
                a {
                    css {
                        color = Color("#000000")
                        marginLeft = 20.px
                    }
                    href = "https://github.com/vladleesi/ultimate-scanner-android"
                    +"scanner"
                }
            }
        }
    }
}

