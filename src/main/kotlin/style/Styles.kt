package style

import web.dom.document

val fontLink = document.createElement("link").apply {
    setAttribute("rel", "stylesheet")
    setAttribute("href", "https://fonts.googleapis.com/css2?family=Quicksand:wght@500;700&display=swap")
}

val faviconLink = document.createElement("link").apply {
    setAttribute("rel", "icon")
    setAttribute("type", "image/svg")
    setAttribute("href", "./favicon.svg")
}

val appStyle = document.createElement("style").apply {
    innerHTML = """
        body {
            width: 100%;
            font-family: 'Quicksand', sans-serif;
            
            margin-top: 0px;
            margin-bottom: 0px;
            margin-right: 0px;
            margin-left: 0px;
            
            /* Styles for mobile screens */
            @media screen and (max-width: 767px) {
                
            }
        
            /* Styles for desktop screens */
            @media screen and (min-width: 768px) {
                
            }
        }
    """
}