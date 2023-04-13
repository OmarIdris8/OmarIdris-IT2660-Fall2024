
const books = [
    {
        "title": "Corduroy",
        "author": "Don Freeman",
        "publisher": "Viking Books",
        "year": "1968",
        "jacketColor": "firebrick"
    },
    {
        "title": "Life of Pi",
        "author": "Yaan Martel",
        "publisher": "Knobf Canada",
        "year": "2001",
        "jacketColor": "dodgerblue"
    },
    {
        "title": "The Hitchikers Guide To The Galaxy",
        "author": "Douglas Adams",
        "publisher": "Del Rey",
        "year": "1995",
        "jacketColor": "limegreen"
    },
    {
        "title": "The Invisible Man",
        "author": "H.G. Wells",
        "publisher": "Atria Books",
        "year": "2014",
        "jacketColor": "burlywood"
    }
    ];
    
    const allBooks = JSON.stringify(books);
    const library = JSON.parse(allBooks);
    
    function displayBook1(){
        $("#bookDisplay").css ("background", library[0].jacketColor);
        $("#bookTitle").text (library[0].title);
        $("#bookAuthor").text (library[0].author);
        $("#bookPublisher").text (library[0].publisher);
        $("#bookYear").text (library[0].year);
    }
    function displayBook2(){
        $("#bookDisplay").css ("background", library[1].jacketColor);
        $("#bookTitle").text (library[1].title);
        $("#bookAuthor").text (library[1].author);
        $("#bookPublisher").text (library[1].publisher);
        $("#bookYear").text (library[1].year);
    }
    function displayBook3(){
        $("#bookDisplay").css ("background", library[2].jacketColor);
        $("#bookTitle").text (library[2].title);
        $("#bookAuthor").text (library[2].author);
        $("#bookPublisher").text (library[2].publisher);
        $("#bookYear").text (library[2].year);
    }
    function displayBook4(){
        $("#bookDisplay").css ("background", library[3].jacketColor);
        $("#bookTitle").text (library[3].title);
        $("#bookAuthor").text (library[3].author);
        $("#bookPublisher").text (library[3].publisher);
        $("#bookYear").text (library[3].year);
    } 

    $(document).ready(function(){
        $("#book1button").click(function(){
            $(displayBook1());   
        });
        $("#book2button").click(function(){
            $(displayBook2());
        });
        $("#book3button").click(function(){
            $(displayBook3());
        });
        $("#book4button").click(function(){
            $(displayBook4());
        });
    });