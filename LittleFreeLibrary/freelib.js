
const library = [
{
    title: "Corduroy",
    author: "Don Freeman",
    publisher: "Viking Books",
    year: "1968",
    jacketColor: "firebrick"
},
{
    title: "Life of Pi",
    author: "Yaan Martel",
    publisher: "Knobf Canada",
    year: "2001",
    jacketColor: "dodgerblue"
},
{
    title: "The Hitchikers Guide To The Galaxy",
    author: "Douglas Adams",
    publisher: "Del Rey",
    year: "1995",
    jacketColor: "limegreen"
},
{
    title: "The Invisible Man",
    author: "H.G. Wells",
    publisher: "Atria Books",
    year: "2014",
    jacketColor: "burlywood"
}
];
function displayBook1(){
    document.getElementById("bookDisplay").style.background = library[0].jacketColor;
    document.getElementById("bookTitle").innerHTML = library[0].title;
    document.getElementById("bookAuthor").innerHTML = library[0].author;
    document.getElementById("bookPublisher").innerHTML = library[0].publisher;
    document.getElementById("bookYear").innerHTML = library[0].year;
}
function displayBook2(){
    document.getElementById("bookDisplay").style.background = library[1].jacketColor;
    document.getElementById("bookTitle").innerHTML = library[1].title;
    document.getElementById("bookAuthor").innerHTML = library[1].author;
    document.getElementById("bookPublisher").innerHTML = library[1].publisher;
    document.getElementById("bookYear").innerHTML = library[1].year;
}
function displayBook3(){
    document.getElementById("bookDisplay").style.background = library[2].jacketColor;
    document.getElementById("bookTitle").innerHTML = library[2].title;
    document.getElementById("bookAuthor").innerHTML = library[2].author;
    document.getElementById("bookPublisher").innerHTML = library[2].publisher;
    document.getElementById("bookYear").innerHTML = library[2].year;
}
function displayBook4(){
    document.getElementById("bookDisplay").style.background = library[3].jacketColor;
    document.getElementById("bookTitle").innerHTML = library[3].title;
    document.getElementById("bookAuthor").innerHTML = library[3].author;
    document.getElementById("bookPublisher").innerHTML = library[3].publisher;
    document.getElementById("bookYear").innerHTML = library[3].year;
} 